package com.eyesofsol.calculator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bae {

    public void multiple() {

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수를 입력해주세요 : ");
        int n1 = sc.nextInt();
        System.out.print("두 번째 수를 입력해주세요 : ");
        int n2 = sc.nextInt();

        int result = n1 * n2;
        System.out.println(n1 + " 곱하기 " + n2 + "의 결과는 " + result+ "입니다.");
    }

}
