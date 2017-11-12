package start;

public class Variables {

    public static void main(String[] args) {

        byte b = 13;
        short s = 123;
        int i = 2233;
        int iNew = 55;
        long l = 12345;

        int plus = i + iNew;
        int minus = iNew - i;
        int mult = iNew * 3;
        int division = i / 5;
        int divLeft = i % 22;

        float f = 13.5f;
        double d = 125.25;

        char c = 'A';

        boolean bool = true;

        System.out.println(b + s);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(division);
        System.out.println(divLeft);

        System.out.println(iNew + c);
        System.out.println(iNew + (int)f);

        System.out.println(f + d);

    }

}
