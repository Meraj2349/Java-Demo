package Lecture16.Lecture16.FunctionalInterface;

//import com.sun.deploy.util.StringUtils;

public class Main {
    public static void main(String[] args) {

        PersonV1 p1 = new PersonV1();

//        Person pV2 = new Person(){
//            @Override
//            public String getName() {
//                return "Raihan";
//            }
//        };
//
//        System.out.println(pV2.getName());


//        Person pV2 = () -> {return "Raihan";};
//        System.out.println(pV2.getName());

//        StrConcat<String> concat = (a, b) -> {return a + b; };
//        System.out.println(concat.conc("hello ", "universe"));

        StrConcat<String> concat = String::concat;
        System.out.println(concat.conc("hello ", "universe"));

//        StrConcat<Integer> concat1 = (a, b) -> {return a + b;};
//        System.out.println(concat1.conc(10, 15));

        StrConcat<Integer> concat1 = Integer::sum;
        System.out.println(concat1.conc(10, 15));
    }
}
