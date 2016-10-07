package newackege;

import java.math.BigDecimal;

/**
 * Created by Stas on 07.10.2016.
 */
public class Main {
    // public/protected/[default]/private
    public String name;

    public static void main(String[] args) {
        int i = 6;
        short s = 3;
        String name = "Basya";
        // type name (= value);

        Car car = new Car();
        System.out.println("car.marka");

        car.marka = "Volvo";
        System.out.println("car.marka");

        car.marka2 = "";

        System.out.println(i/(double)s);
        System.out.printf("%.3f", i / (double) s);
        System.out.println(9%5);
        System.out.println(9.8%5);

        int j = 5;
        Integer j1 = 10; // new Integer(i);
        j = j1; // j1 = j.intValue();


        j = Integer.parseInt("25");
        System.out.println(i);

        j = Integer.parseInt("fdgd");
        System.out.println(i);

        j = Integer.valueOf("25");
        System.out.println(i);

        j = Integer.valueOf("fdgd");
        System.out.println(i);

        BigDecimal b1 = new BigDecimal(9.8);
        BigDecimal b2 = new BigDecimal(5.8);
        b1.divide(b2, 1);
        System.out.println(b1.divide(b2, 1).doubleValue());
        System.out.println(9.8%5);
    }
}
