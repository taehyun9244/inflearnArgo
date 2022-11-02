package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제곱수 판별하기
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 * 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_35 {

    public int solution(int n) {
        int answer = 0;
        int sqrt = (int) Math.sqrt(n);
        if (Math.pow(sqrt, 2) == n) {
            answer = 1;
        } else  answer = 2;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_35 solution_35 = new Solution_35();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        System.out.println(solution_35.solution(n));

    }
}
