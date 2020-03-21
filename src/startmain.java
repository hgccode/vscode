
public class startmain {

    int add(final int a, final int b) {
        return a + b;
    }

    int sqrt(final int a, final int b) {
        return a * b;
    }

    public static void main(final String[] args) {

        final int a = 2, b = 3;
        final startmain main_simple = new startmain();
        main_simple.add(a, b);
        System.out.println();
        main_simple.sqrt(a, b);
    }
}
