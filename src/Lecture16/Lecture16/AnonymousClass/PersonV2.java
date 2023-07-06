package Lecture16.Lecture16.AnonymousClass;

public class PersonV2 extends Person{
    public PersonV2(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "v2 : " + super.getName();
    }
}
