package oops;

class Student {

    //Data: Data members:instance variable
    int studentId;
    String studentName;
    String studentCity;

    public Student(){
        System.out.println("Creating object: non-p");
    }

    public Student(int st){
        System.out.println("parameterized constructor:(int)");
    }

    public  Student(int i,String n,String c){
        studentId=i;
        studentName=n;
        studentCity=c;
    }

    //Behaviour : member methods : methods: (functions)

    public  void study()
    {
        System.out.println(studentName + " is studying");
    }

    public void study(int f){
        System.out.println(studentId + " is studying");

    }
    public void showFullDetails()
    {
        System.out.println("My name is  "+ studentName);
        System.out.println("My id is "+ studentId);
        System.out.println("My city is "+ studentCity);
    }
}
