package oops;

public class Dog extends Animal {


    public Dog(){
        //first line
        super();
        System.out.println("work");

    }
    int age = 5;
    int x=8;
    public  void  speak(){
        System.out.println(super.x);
        System.out.println(this.x);
    }
}
