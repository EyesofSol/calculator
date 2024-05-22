package com.eyesofsol.calculator;

import java.util.Scanner;

public class Kim {
    public void plusMinus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 :");
        int n1 = sc.nextInt();

        System.out.print("+, -: ");
        String operator = sc.next();

        System.out.print("두번째 정수 입력 :");
        int n2 = sc.nextInt();
        int n3 = n1 + n2;

        switch (operator) {
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
        System.out.println(n1 + " " + operator + " " + n2 + " = " + n3);
    }

    public void plusMinus2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 문자 입력: ");
        String str1 = sc.nextLine();
        char ch1 = str1.charAt(0);

        System.out.print("+, -: ");
        String operator = sc.nextLine();

        System.out.print("두번째 문자 입력: ");
        String str2 = sc.nextLine();
        char ch2 = str2.charAt(0);

        int sum = (int) (ch1 + ch2);
        System.out.println(ch1 + " " + operator + " " + ch2 + " = " + sum);

        switch (operator) {
            case "+":
                sum = ch1 + ch2;
                break;
            case "-":
                sum = ch1 - ch2;
                break;
            default:
                System.out.println("기호 입력이 잘못됬습니다.");
                break;
        }
    }

    public void Calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 문자 입력: ");
        String fn1 = sc.nextLine();
        char ch1 = fn1.charAt(0);

        System.out.print("+, -, *, /: ");
        String operator = sc.nextLine();

        System.out.print("두번째 문자 입력: ");
        String fn2 = sc.nextLine();
        char ch2 = fn2.charAt(0);

        int sum = (int) (ch1 + ch2);
        System.out.println(ch1 + " " + operator + " " +  ch2 + " = " + sum);

        switch(operator) {
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