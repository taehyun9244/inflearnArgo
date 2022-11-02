package programmers.ch3;

import java.util.Scanner;

/**
 * 숨어있는 숫자의 덧셈 (1)
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */

//TODO 다시 풀어보기 별찍기 풀었지만 한번 더 보기
public class Solution_46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {	//행을 세는 카운터 변수 i
            for (int j = 0; j < i + 1; j++) {	//별을 찍을 횟수를 정하는 for문과 카운터 변수 j
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
