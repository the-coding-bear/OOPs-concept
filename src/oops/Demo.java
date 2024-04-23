package oops;

public class Demo {
    public static void main(String[] args) {

        //now creating object of student
        Student st1;
        st1 = new Student();

        st1.studentName="Akanksha";
        st1.studentId=123;
        st1.studentCity="DELHI";

        st1.study();
        st1.showFullDetails();


        Student st2 = new Student(23,"akku","delhi");

        st2.study();
        st2.study(111);
        st2.showFullDetails();

        Dog d1 = new Dog();
        d1.eating();
        System.out.println(d1.color);

        Cat c1 = new Cat();
        System.out.println(c1.age);
    }
}
