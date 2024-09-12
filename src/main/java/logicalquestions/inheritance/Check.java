package logicalquestions.inheritance;

public class Check {
    public static void main(String[] args) {
        float f = 10.23f;
        // Varibles and methods follow different behaviour
        // Methods follow the object created using constructor
        // Variables follow type of object
        C2 c2 = new C2();
        System.out.println(c2.x);
        c2.f1();
        c2.f2();

        C1 c1 = new C1();
        System.out.println(c1.x);
        c1.f1();

        C3 c3 = new C3();
        c3.f1();

        C1 c12 = new C2();
        System.out.println(c12.x);
        c12.f1();
        ((C2) c12).f2();
    }
}
