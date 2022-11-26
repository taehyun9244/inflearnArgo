package programmers.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 전화번호 목록
 */
public class Solution_3 {

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_3 solution_3 = new Solution_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] phone_book = new String[Integer.parseInt(br.readLine())];
        System.out.println(solution_3.solution(phone_book));
    }
}
