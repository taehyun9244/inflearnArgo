package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 문자열 다루기 기본
 문제 설명
 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
 */
public class Solution_25 {
    public boolean solution(String s) {
        boolean answer = true;
        return answer;

}



    public static void main(String[] args) throws IOException {
        Solution_25 solution_25 = new Solution_25();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution_25.solution(s));
    }
}


