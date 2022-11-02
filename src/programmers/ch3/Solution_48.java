package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 인덱스 바꾸기
 * 문제 설명
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
 * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_48 {

    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        char num1Ch = Character.highSurrogate(my_string.indexOf(num1));
        char num2Ch = Character.highSurrogate(my_string.indexOf(num2));

        StringBuilder sb = new StringBuilder(my_string);
        sb.setCharAt(num1, num2Ch);
        sb.setCharAt(num2, num1Ch);

        answer = sb.toString();

        return answer;

    }

    public static void main(String[] args) throws IOException {
        Solution_48 solution_48 = new Solution_48();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(solution_48.solution(my_string, num1, num2));
    }
}
