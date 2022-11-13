package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 음양 더하기
 문제 설명
 어떤 정수들이 있습니다.
 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 */
public class Solution_19 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            }else if (signs[i] == false) {
                answer -= absolutes[i];
            }
         }

        return answer;
    }



    public static void main(String[] args) throws IOException {
        Solution_19 solution_18 = new Solution_19();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] absolutes = new int[Integer.parseInt(br.readLine())];
        boolean [] signs = new boolean[absolutes.length];
        System.out.println(solution_18.solution(absolutes, signs));
    }
}


