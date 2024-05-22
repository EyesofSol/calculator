package com.eyesofsol.calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag){
            System.out.println("\n====================================");
            System.out.print("1.더하기\n2.빼기\n3.곱하기\n4.나누기" +
                    "\n5.나머지 구하기\n6.제곱 구하기\n7.평균 구하기\n8.나가기" +
                    "\n위의 보기 중 실행할 것을 고르세요(숫자로 입력): ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch(input){
                case 1,2:
                    Kim kim = new Kim();
                    kim.plusMinus();
                    break;
                case 3:
                    Bae bae = new Bae();
                    bae.multiple();
                    break;
                case 4:
                    Lee lee = new Lee();
                    lee.divide();
                    break;
                case 5:
                    Lee lee2 = new Lee();
                    lee2.rest();
                    break;
                case 6:
                    Hong hong = new Hong();
                    hong.power();
                    break;
                case 7:
                    Hong hong2 = new Hong();
                    hong2.calculateAverage();
                    break;
                default:
                    System.out.println("나감~~^^");
                    flag = false;
            }
        }
    }
}
