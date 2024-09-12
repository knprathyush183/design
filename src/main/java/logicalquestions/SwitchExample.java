package logicalquestions;

public class SwitchExample {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1 :
                System.out.println("1 entered");
            case 2:
                System.out.println("2 entered");
                break;
            default:
                System.out.println("Default");
        }
    }

    // Continue cannot be used with switch statement
}
