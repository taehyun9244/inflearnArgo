package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 문자열 내 p와 y의 개수
 */
public class Solution_7 {
    boolean solution(String s) {
        boolean answer = true;
        String[] split = s.toLowerCase().split("");
        int p = 0 ;
        int y = 0 ;

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("p")) {
                p += 1;
            } else if (split[i].equals("y")) {
                y += 1;
            }
        }

        if (p == y) {
            answer = true;
        } else answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_7 solution_7 = new Solution_7();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution_7.solution(s));
    }
}
