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


        Student st2 = new Student();

        st2.studentId=456;
        st2.studentName="Shyam";
        st2.studentCity="MUMBAI";

        st2.study();
        st2.showFullDetails();
    }
}
