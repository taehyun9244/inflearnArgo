package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자 반복 출력하기
 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
 */

//TODO 문자 반복 출력하기 풀었지만, 한번 더 보기
public class Solution_39 {

    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }

//    String[] str = my_string.split("");
//        for(int i=0; i<my_string.length(); i++){
//        answer += str[i].repeat(n);
//    }
//        return answer;

    public static void main(String[] args) throws IOException {
        Solution_39 solution_39 = new Solution_39();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int n = Integer.parseInt(br.readLine());
        System.out.println(solution_39.solution(my_string, n));
    }
}
