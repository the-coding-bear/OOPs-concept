package oops;

public class Parent {
    //overridden method
    protected void m1(){
        System.out.println("i am m1() of parent");
    }
}

//public>protected>default>private

class Child extends Parent{
    //overriding method
    public void m1(){
        System.out.println("i am m1 of child");
    }
}
