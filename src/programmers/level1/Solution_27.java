package programmers.level1;

import programmers.kadai.Solution;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
약수의 개수와 덧셈
문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class Solution_27 {
    public int solution(int left, int right) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_27 solution_27 = new Solution_27();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int left = Integer.parseInt(br.readLine());
        int right = Integer.parseInt(br.readLine());
        System.out.println(solution_27.solution(left, right));

    }
}
