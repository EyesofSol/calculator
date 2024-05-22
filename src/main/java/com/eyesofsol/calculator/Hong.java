package com.eyesofsol.calculator;

import java.util.Scanner;

public class Hong {
    public void power(){
        Scanner sc = new Scanner(System.in);
        System.out.print("밑을 입력해주세요.(정수로^^): ");
        int n1 = sc.nextInt();
        System.out.print("지수를 입력해주세요.(정수로^^): ");
        int n2 = sc.nextInt();

        double result = n1;
        if(n2 > 0){
            for(int i = 1 ; i < n2 ; i++){
                result *= n1;
            }
            System.out.println(n1 + "의 " + n2 + "제곱은 " + (int)result + "입니다.");
        }
        else if(n2 == 0){
            result = 1;
            System.out.println(n1 + "의 " + n2 + "제곱은 " + (int)result + "입니다.");
        } else{
            result = 1.0;
            for(int i = 0 ; i > n2 ; i--) {
                result /= n1;
            }
            System.out.println(n1 + "의 " + n2 + "제곱은 " + result + "입니다.");
        }
    }
}
