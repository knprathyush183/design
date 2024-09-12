package logicalquestions.abstraction;

public abstract class AbsClassA {
    abstract int addTwoInt(int x, int y);

    int multiplyTwoInt(int x, int y) {
        return x*y;
    }

    final String addTwoStrings(String a, String b) {
        return a+b;
    }
}
