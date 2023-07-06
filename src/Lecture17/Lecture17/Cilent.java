package Lecture17.Lecture17;

import java.util.ArrayList;

public class Cilent {
    public static void main(String[] args) {
        Object o = new Object();


//        for(String s : args){
//            System.out.println(s);
//        }

//        Student rakib = new Student(Integer.parseInt(args[0]), args[1]);

        // java  Client 112 rakib

        Student rakib = new Student(12,"rakib");
        Student rakib2 = new Student(12,"rakib");

        System.out.println(rakib.equals(rakib2));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(12,"rakib"));
        students.add(new Student(12,"rakib"));
    }
}
