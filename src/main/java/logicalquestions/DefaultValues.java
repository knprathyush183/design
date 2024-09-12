package logicalquestions;

public class DefaultValues {
    public static void main(String[] args) {
        add(20.0, 10.0);
        add(20.0f, 10.0f);
        add(10, 10);
        add(10L, 10L);
    }

    public static void add(float x, float y) {
        System.out.println("Float " + (x+y));
    }

    public static void add(double x, double y) {
        System.out.println("Double " + (x+y));
    }

    public static void add(int x, int y) {
        System.out.println("Int " + (x+y));
    }

    public static void add(long x, long y) {
        System.out.println("Long " + (x+y));
    }
}
