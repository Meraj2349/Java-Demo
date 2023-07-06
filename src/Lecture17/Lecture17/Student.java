package Lecture17.Lecture17;

public class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
       
        return this.id == ((Student) obj).id;
    }
}
