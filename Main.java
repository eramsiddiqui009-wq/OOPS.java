import java.util.*;
public class Main{
    public static void main(String args[])
    {
        String name ;
        int rno ;
        double cgpa;
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
            s1.name = "Eram";
            s1.rno = 48;
            s1.cgpa = 8;
            Student s2 = new Student();
            s2.name = "Aayat";
            s2.rno = 34;
            s2.cgpa = 8.5;
            Student s3 = new Student();
            s3.name = "Priya";
            s3.rno = 66;
            s3.cgpa = 5.6;
            System.out.println(s1.name + " " + s1.rno + " " + s1.cgpa);
            System.out.println(s2.name + " " + s2.rno + " " + s2.cgpa);
            System.out.println(s3.name + " " + s3.rno + " " + s3.cgpa);
    }
}