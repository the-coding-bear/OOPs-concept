package oops;

public interface Shape {

    public static final int i =34;

    public abstract void calculateArea(int r);

}

class Circle implements Shape{
    public void calculateArea(int r){
        System.out.println("Area of Circle is " + (Math.PI*r*r));
    }

    public static void main(String[] args) {
        Shape c1 = new Circle();
        c1.calculateArea(2);
    }
}
