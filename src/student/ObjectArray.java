package student;
import java.util.Scanner;
class ObjectArray{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        // Student s1 = new Student ("joe", 20);
        //s1.print();
        // int [] array = new int [10];
        Student[] students = new Student[3];
        for (int i = 0; i < students.length; i++)
        {
            System.out.println("please enter the name");
            String name = input.next();
            System.out.println("Please enter age");
            int age = input.nextInt();
            students[i] = new Student(name, age);
         
        }
        for (int i = 0; i<students.length ; i++)
            students[i].print();
    }
}