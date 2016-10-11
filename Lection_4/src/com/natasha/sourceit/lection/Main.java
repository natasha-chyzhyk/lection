package com.natasha.sourceit.lection;

public class Main {

    public static void main(String[] args) {
        char c = 105;
        int i = 105;
        char c2 = (char)i;
        i = c;

        System.out.println(c);
        System.out.println(c2);

        //В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.

        int n = 456;
        int i1 = n/100;
        n -= i1 * 100;// n = n - i1 * 100;
        int i2 = n/ 10;
        int i3 = n % 10;

        System.out.println(i1 + i2 + i3);

        // -=  +=   *=  /=

        //System.out.println((int) n / 10);
//        System.out.println(Math.round(n / 10));

        //int i = 0;
        ///
//        i += 1;
//        i = i + 1;          // getAccountById(i) + getAccountById(i += 1)
//        int c =  0 + i + 3;// i += 1 + i += 1;
//        i += 3;


        //          0             1
        //      ((i = 0) + (i = 0 + 1)); i = i + 1 = 1 + 1;
//        int r = i++ + ++i;
//        System.out.println(r);
//        System.out.println(i);

        //(0) + 1  (1 + 1) -> i = 2
//        int r = i++ + ++i;
//        System.out.println(r);
//        System.out.println(i);

        //i=0;
        //      ((i = 0) + (i = 0 + 1)); i = i + 1 = 1 + 1;
        //  (0) + 1    (1) + 1  -> i = 2
//        r = i++ + i++; //0 + 1
//        System.out.println(r);
//        System.out.println(i);

        /*
        int sum = getAccountById(i) + getAccountById(++i);
        int sum = getAccountById(i++) + getAccountById(i);
 --------------------
        int acc1 = getAccountById(i);
        i += 1;
        int acc2 = getAccountById(i);
        int sum = acc1 + acc2;



         int a = 7, b = 8, c = 9;

        int result = 3 + Math.max(a, Math.max(b,c));
        int[] ar= {1, 5, 60};

        result = 3 + Math.max(Math.max(b,ar[2]), ar[0]);

        int t = -32;
        t++;

        // -2
        // -1 0 1 2

        //----------Оператор условия

        //-----------------if, else

        int a = 99;
        int b = 19;
        if (a > b) {
            System.out.println(">");
        } else if(a == b){
            System.out.println("=");
        } else {
            System.out.println("<");
        }

        if (a > b) {
            System.out.println(">");
        } else {
            if(a == b){
                System.out.println("=");
            } else {
                if(a == b){
                    System.out.println("=");
                } else {
                    System.out.println("<");
                }
            }
        }

        //------------Тернарный оператор
        int a = 99;
        int b = 19;

        int result;
        if(a > b) {
            result = a;
        } else {
            result = b;
        }
        result = a > b ? a : b;



        int a = 99;
        int b = 19;
        int c = 89;

        int result;
        if(a > b && a > c) {
            result = a;
        } else if(b > a && b > c) {
            result = b;
        } else {
            result = c;
        }

        result = (a > b && a > c) ? a : ((b > a && b > c) ? b : c);

        result = Math.max(a, Math.max(b, c));

        //-----------Оператор выбора

         int i = 0;
        switch (i) {
            case 0:
                System.out.println("a");
                System.out.println("b");

            case 50:
                System.out.println("9");

            default:
                System.out.println("d");

        }
        }
    }
}
