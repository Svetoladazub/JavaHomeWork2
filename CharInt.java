package HomeWork;

public class CharInt {
    public static void main(String[] args) {
        char a = '0';
        int a1 = (int) a;
        System.out.println((int) a);

        char b = '0';
        int b2 = Integer.parseInt(String.valueOf(b));
        System.out.println(b2);
        System.out.println(b2 + 1);

        char c = '0';
        int c3 = Character.getNumericValue(c);
        System.out.println(c3);
        System.out.println(c3 / 2);

    }
}
