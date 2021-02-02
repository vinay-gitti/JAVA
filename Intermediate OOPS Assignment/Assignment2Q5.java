package JavaFiles;

class Rectangle5 extends Shape5 {
    @Override
    public String draw() {return "Rectangle";}
}

class Line5 extends Shape5{
    @Override
    public String draw() {return "Line";}
}

class Cube5 extends Shape5 {
    @Override
    public String draw() {return "Cube";}
}
abstract class Shape5 {
    abstract public String draw();
}
public class Assignment2Q5{
    public static void main(String[] args) {
    	Shape5 shape1=new Cube5();
    	Shape5 shape2=new Line5();
    	Shape5 shape3=new Rectangle5();
    	System.out.println(shape1.draw());
    	System.out.println(shape2.draw());
    	System.out.println(shape3.draw());
    }
}