package logicalquestions.abstraction;

public class TestClass {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        System.out.println(b.multiplyTwoInt(2, 3));
        AbsClassA a = new ClassB();
        System.out.println(a.addTwoInt(2,3));
    }
}
