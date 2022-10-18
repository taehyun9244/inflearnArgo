package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 피자 나눠 먹기 (3)
 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
 * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
 * n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 * 10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
 */
public class Solution_15 {

    public int solution(int slice, int n) {
        int answer = 0;
        if ((n%slice) >=1) {
            answer = (n/slice) + 1;
        } else if (n%slice == 0) {
            answer = n/slice;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_15 solution_15 = new Solution_15();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int slice = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_15.solution(slice, n));
    }
}
