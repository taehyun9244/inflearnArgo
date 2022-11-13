package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 문자열 내림차순으로 배치하기
 문제 설명
 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 */
public class Solution_24 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(chars));
        return stringBuilder.reverse().toString();
}



    public static void main(String[] args) throws IOException {
        Solution_24 solution_23 = new Solution_24();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(solution_23.solution(s));
    }
}


