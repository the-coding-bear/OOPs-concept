package oops;

 abstract public class MyClass {

     //complete method
    public void cal(){
        System.out.println("calculating results");
    }

    //abstract method
    abstract public void launchRocket();
}


class Start{
    public static void main(String[] args) {
//        MyChild myChild = new MyChild();
//        myChild.launchRocket();
//        myChild.cal();
        MyClass ob = new MyChild();
        ob.cal();
        ob.launchRocket();
    }
}