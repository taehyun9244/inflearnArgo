package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 x만큼 간격이 있는 n개의 숫자
 문제 설명
 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 제한 조건
 x는 -10000000 이상, 10000000 이하인 정수입니다.
 n은 1000 이하인 자연수입니다.
 입출력 예
 x	n	answer
 2	5	[2,4,6,8,10]
 4	3	[4,8,12]
 -4	2	[-4, -8]

 */
public class Solution_11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < answer.length; i++) {
            answer[i] = answer[i -1] + x;

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_11 solution_11 = new Solution_11();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_11.solution(x, n));

    }
}
