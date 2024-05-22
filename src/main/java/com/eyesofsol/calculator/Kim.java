package com.eyesofsol.calculator;

import java.util.Scanner;

public class Kim {
    public static void plusMinus() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 :");
        int n1 = sc.nextInt();

        System.out.print("+, -: ");
        String giho = sc.next();

        System.out.print("두번째 정수 입력 :");
        int n2 = sc.nextInt();
        int n3 = n1 + n2;
        System.out.println(n1 + " " + giho + " " + n2 + " = " + n3);
        switch (giho) {

            case "+":
                n3 = n1 + n2;
                break;
            case "-":
                n3 = n1 - n2;
                break;
            default:
                System.out.println("기호 입력이 잘못됬습니다.");
                break;

        }
    }
        public static void plusMinus2() {
            Scanner sc = new Scanner(System.in);
            System.out.print("첫번째 문자 입력: ");
            String str1 = sc.nextLine();
            char ch1 = str1.charAt(0);

            System.out.print("+, -: ");
            String giho = sc.nextLine();

            System.out.print("두번째 문자 입력: ");
            String str2 = sc.nextLine();
            char ch2 = str2.charAt(0);
            int n1 = (int) (ch1 + ch2);
            System.out.println(ch1 + " " + giho + " " + ch2 + " = " + n1);
            switch (giho) {

                case "+":
                    n1 = ch1 + ch2;
                    break;
                case "-":
                    n1 = ch1 - ch2;
                    break;
                default:
                    System.out.println("기호 입력이 잘못됬습니다.");
                    break;
            }
    }

    public static void Calculator() {
    Scanner sc = new Scanner(System.in);
    System.out.print("첫번째 문자 입력: ");
    String fn1 = sc.nextLine();
    char ch1 = fn1.charAt(0);

    System.out.print("+, -, *, /: ");
    String giho = sc.nextLine();

    System.out.print("두번째 문자 입력: ");
    String fn2 = sc.nextLine();
    char ch2 = fn2.charAt(0);

    int sum = (int) (ch1 + ch2);

    System.out.println(ch1 + " " + giho + " " +  ch2 + " = " + sum);

    switch(giho) {

        case "+":
            sum = ch1 + ch2;
            break;
        case "-":
            sum = ch1 - ch2;
            break;
        case "*":
            sum = ch1 * ch2;
            break;
        case "/":
            sum = ch1 / ch2;
            break;

            default:
            System.out.println("기호 입력이 잘못됬습니다.");
            break;
    }

}

}




