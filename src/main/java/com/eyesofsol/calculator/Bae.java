package com.eyesofsol.calculator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bae {

    public void multiple() {

        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수를 입력해주세요 : ");
        double n1 = sc.nextDouble();

        System.out.println("두 번째 수를 입력해주세요 : ");
        double n2 = sc.nextDouble();


        double result = n1 * n2;

            System.out.println(n1 +" 곱하기 "+n2 +"의 결과는 "+result +"입니다.");


}
}
