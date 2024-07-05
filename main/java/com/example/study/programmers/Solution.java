package com.example.study.programmers;

import java.util.Scanner;

//문제 설명
//영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.

// 제한사항
//1 ≤ str의 길이 ≤ 20
//str은 알파벳으로 이루어진 문자열입니다.

// 입출력 예시
// 입력 aBcDeFg  출력 AbCdEfG

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        for (int i = 0; i < a.length(); i ++ ){
            b = a.charAt(i);
            if (Character.isUpperCase(b)){
                answer += Character.toLowerCase(b);
            }else {
                answer += Character.toUpperCase(b);
            }
        }
        System.out.println(answer);
    }
}


