package Lecture16.Lecture16.AnonymousClass;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Rakib");
        PersonV2 p2 = new PersonV2("Rakib");

        Person p3 = new Person("Rakib"){
            @Override
            public String getName() {
                return "v3 : " + super.getName();
            }
        };

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
    }
}
