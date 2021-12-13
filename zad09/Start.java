import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.*;
import java.util.List;

class Graph {
  public static class Edge {
    public int node1;
    public int node2;
    public int weight;

    public Edge(int node1, int node2, int weight) {
      this.node1 = node1;
      this.node2 = node2;
      this.weight = weight;
    }

    public static Edge fromString(String str) {
      var arr = str.split(" ");
      return new Edge(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
    }
  }

  public static class Node {
    public int column;
    public int row;

    public Node(int column, int row) {
      this.column = column;
      this.row = row;
    }

    public static Node fromString(String str) {
      var arr = str.split(" ");
      return new Node(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
    }
  }

  public Node[] nodes;
  public Edge[] edges;
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

    picker = new JFileChooser();

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
  public void drawGraph(Graph graph) {
    System.out.println("drawing graph");
    this.repaint();
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(new Color(50, 50, 50));

    g2d.drawOval(50, 50, 50, 50);
  }
}

class Window {
  private JFrame window;

  public Window() {
    window = new JFrame("window");
    window.setSize(500, 500);

    var gd = new GraphDrawer();
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
    var window = new Window();
    window.show();
  }
}
