package com.eyesofsol.calculator;

import java.util.Scanner;

public class Lee {
    public void divide () {
        Scanner sc = new Scanner(System.in);

        System.out.print("나누기를 실행할 정수를 입력해주세요");
        int n1 = sc.nextInt();

        System.out.print("몇으로 나눌까요?");
        int n2 = sc.nextInt();

        int n3 = n1 / n2;
        System.out.println("나눈 결과의 몫은 : " + n3);
    }

    public void divide2 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("나누기를 실행할 정수를 입력해주세요");
        int n1 = sc.nextInt();

        System.out.println("몇으로 나눌까요?");
        int n2 = sc.nextInt();

        System.out.println("한번 더 몇으로 나눌까요?");
        int n3 = sc.nextInt();

        int n4 = n1 / n2;
        int n5 = n4 / n3;

        System.out.println("두번 나눈 결과의 몫은 : " + n5);
    }

    public void divide3 () {
        Scanner sc = new Scanner(System.in);

        System.out.println("알파벳을 입력해주세요");
        String str1 = sc.nextLine();

        System.out.println("알파벳을 입력해주세요");
        String str2 = sc.nextLine();

        char ch1 = str1.charAt(0);
        char ch2 = str2.charAt(0);

        int divide = str1.charAt(0)/ str2.charAt(0);

        System.out.println("나눈 값의 몫은 :" + divide);
    }

    public void rest () {
        Scanner sc = new Scanner(System.in);

        System.out.println("나누기를 실행할 정수를 입력해주세요");
        int n1 = sc.nextInt();

        System.out.println("몇으로 나눌까요?");
        int n2 = sc.nextInt();

        int n3 = n1 % n2;
        System.out.println("나눈 결과의 나머지는 : " + n3);
    }
}
