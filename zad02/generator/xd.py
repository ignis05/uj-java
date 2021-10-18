import random
import os

# listSize
listSize = 15

lower = ', '.join([str(random.randrange(0, 2)) for i in range(listSize)])
upper = ', '.join([str(random.randrange(2, 4)) for i in range(listSize)])


result = '''
import java.util.List;

public class XD {{
  public static void main(String[] args) {{
    Loops loopTest = new Loops();
    loopTest.setLowerLimits(List.of({0}));
    loopTest.setUpperLimits(List.of({1}));
    System.out.println(loopTest.getResult().toString());
  }}
}}

'''.format(lower, upper)


with open(os.path.join(os.path.dirname(__file__), "XD.java"), 'w') as file:
    file.write(result)
