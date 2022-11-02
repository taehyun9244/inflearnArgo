package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 두 정수 사이의 합
 문제 설명
 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 */
public class Solution_14 {
    public long solution(int a, int b) {
        long answer = 0;




        return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_14 solution_14 = new Solution_14();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(solution_14.solution(a, b));

    }
}
