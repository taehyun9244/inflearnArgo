package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 가운데 글자 가져오기
 문제 설명
 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */

//TODO 가운데 글자
public class Solution_21 {
    public String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 0) {
            answer += String.valueOf(s.indexOf(s.length() / 2));
            System.out.println("answer = " + answer);
            answer += String.valueOf(s.indexOf((s.length() / 2) - 1));
            System.out.println("answer = " + answer);
        } else
            answer += String.valueOf(s.indexOf(s.length() / 2));
            System.out.println("answer = " + answer);

        return answer;
    }



    public static void main(String[] args) throws IOException {
        Solution_21 solution_21 = new Solution_21();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
        String s = "abcde";
        System.out.println(solution_21.solution(s));
    }

}


