package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 수박수박수박수박수박수?
 문제 설명
 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 */
public class Solution_22 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            if (i == 0 || i % 2 ==0) {
                answer += "수";
            }else answer += "박";
        }

        return answer;
    }



    public static void main(String[] args) throws IOException {
        Solution_22 solution_22 = new Solution_22();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_22.solution(n));
    }
}


