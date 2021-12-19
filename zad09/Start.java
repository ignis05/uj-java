import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

class Graph {
  public static class Edge {
    public int node1;
    public int node2;
    public int weight;
    public int stroke;

    public Edge(int node1, int node2, int weight) {
      this.node1 = node1;
      this.node2 = node2;
      this.weight = weight;
    }

    public int getWeight() {
      return weight;
    }

    public static Edge fromString(String str) {
      var arr = str.split(" ");
      return new Edge(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }
  }

  public static class Node {
    public int column;
    public int row;
    public int x;
    public int y;
    public int stroke;

    public Node(int column, int row) {
      this.column = column;
      this.row = row;
    }

    public int getColumn() {
      return column;
    }

    public int getRow() {
      return row;
    }

    public String getCordsStr() {
      return "[" + column + "," + row + "]";
    }

    @Override
    public String toString() {
      return this.getClass().getName() + getCordsStr();
    }

    public static Node fromString(String str) {
      var arr = str.split(" ");
      return new Node(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
    }
  }

  public Node[] nodes;
  public Edge[] edges;

  public void scaleGraph(int canvasWidth, int canvasHeight) {
    int smallerDimention = canvasWidth < canvasHeight ? canvasWidth : canvasHeight;

    // scale nodes
    int minCol = Arrays.stream(nodes).min(Comparator.comparing(Node::getColumn)).orElseThrow(NoSuchElementException::new).column;
    int maxCol = Arrays.stream(nodes).max(Comparator.comparing(Node::getColumn)).orElseThrow(NoSuchElementException::new).column;
    int minRow = Arrays.stream(nodes).min(Comparator.comparing(Node::getRow)).orElseThrow(NoSuchElementException::new).row;
    int maxRow = Arrays.stream(nodes).max(Comparator.comparing(Node::getRow)).orElseThrow(NoSuchElementException::new).row;
    double xOffset = canvasWidth * 0.1;
    double yOffset = canvasHeight * 0.1;
    int colCount = maxCol - minCol;
    int rowCount = maxRow - minRow;
    double xTick = (canvasWidth - xOffset) / colCount;
    double yTick = (canvasHeight - yOffset) / rowCount;
    // use smaller ticks for both axes to keep proportions
    if (xTick > yTick)
      xTick = yTick;
    if (yTick > xTick)
      yTick = xTick;
    double xMargin = (canvasWidth - (xTick * colCount)) / 2;
    double yMargin = (canvasHeight - (yTick * rowCount)) / 2;

    for (var node : nodes) {
      node.x = (int) Math.round(xMargin + ((node.column - minCol) * xTick));
      node.y = canvasHeight - (int) (Math.round(yMargin + (node.row - minRow) * yTick));
      node.stroke = 1 + Math.round(smallerDimention / 25);
    }

    // scale edges
    int minWeight = Arrays.stream(edges).min(Comparator.comparing(Edge::getWeight)).orElseThrow(NoSuchElementException::new).weight;
    for (var edge : edges) {
      edge.stroke = Math.round((edge.weight / minWeight) * (smallerDimention / 200));
    }
  }
}

class Header extends JPanel {
  GraphDrawer gd;
  JButton button;
  JFileChooser picker;
  JLabel label;

  public void pickFile() {
    if (picker.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
      File file = picker.getSelectedFile();
      this.label.setText(file.getName());
      List<String> content;
      // read file
      try {
        content = Files.readAllLines(Paths.get(file.getAbsolutePath()));
      } catch (IOException e) {
        e.printStackTrace();
        return;
      }
      System.out.println(content);
      parseInput(content);
    }
  }

  private void parseInput(List<String> input) {
    var graph = new Graph();
    int nodeCount = Integer.parseInt(input.remove(0));
    graph.nodes = new Graph.Node[nodeCount];
    for (int i = 0; i < nodeCount; i++) {
      graph.nodes[i] = Graph.Node.fromString(input.remove(0));
    }
    int edgeCount = Integer.parseInt(input.remove(0));
    graph.edges = new Graph.Edge[edgeCount];
    for (int i = 0; i < edgeCount; i++) {
      graph.edges[i] = Graph.Edge.fromString(input.remove(0));
    }
    gd.drawGraph(graph);
  }

  public Header(GraphDrawer gd) {
    this.gd = gd;

    picker = new JFileChooser(Paths.get("").toAbsolutePath().toFile());

    button = new JButton("Load");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        pickFile();
      }
    });
    this.add(BorderLayout.WEST, button);

    label = new JLabel("No file selected");
    this.add(BorderLayout.WEST, label);
  }
}

class GraphDrawer extends JPanel {
  Graph graph;
  boolean debugdraw = false;

  public void setDebugDraw(boolean debugdraw) {
    this.debugdraw = debugdraw;
  }

  public void drawGraph(Graph graph) {
    System.out.println("drawing graph");
    this.graph = graph;
    this.repaint();
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    if (this.graph == null)
      return;

    Graphics2D g2d = (Graphics2D) g;
    int width = this.getWidth();
    int height = this.getHeight();

    RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    g2d.setRenderingHints(rh);

    graph.scaleGraph(width, height);

    // draw edges
    for (var edge : graph.edges) {
      var node1 = graph.nodes[edge.node1 - 1];
      var node2 = graph.nodes[edge.node2 - 1];
      g2d.setColor(new Color(0, 0, 0));
      g2d.setStroke(new BasicStroke(edge.stroke));
      g2d.drawLine(node1.x, node1.y, node2.x, node2.y);
      if (debugdraw) {
        g2d.setColor(new Color(255, 0, 0));
        g2d.drawString("w=" + edge.weight + ",s=" + edge.stroke + "px", (node1.x + node2.x) / 2, (node1.y + node2.y) / 2);
      }
    }

    // draw nodes
    for (var node : graph.nodes) {
      g2d.setStroke(new BasicStroke(node.stroke / 2));
      g2d.setColor(new Color(255, 255, 255));
      g2d.fillOval(node.x - (node.stroke / 2), node.y - (node.stroke / 2), node.stroke, node.stroke);
      g2d.setColor(new Color(0, 0, 0));
      g2d.drawOval(node.x - (node.stroke / 2), node.y - (node.stroke / 2), node.stroke, node.stroke);
      if (debugdraw) {
        g2d.setColor(new Color(255, 0, 0));
        g2d.drawString(node.getCordsStr(), node.x, node.y);
      }
    }
  }
}

class Window {
  private JFrame window;

  public Window(boolean debugdraw) {
    window = new JFrame("window");
    window.setSize(500, 500);

    var gd = new GraphDrawer();
    gd.setBorder(BorderFactory.createLineBorder(Color.black));
    gd.setDebugDraw(debugdraw);
    window.getContentPane().add(BorderLayout.CENTER, gd);

    var header = new Header(gd);
    window.getContentPane().add(BorderLayout.NORTH, header);
  }

  public void show() {
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

class Start {
  public static void main(String[] args) {
    var window = new Window(false);
    window.show();
  }
}
