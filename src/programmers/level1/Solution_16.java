package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 핸드폰 번호 가리기
 문제 설명
 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 전화번호가 문자열 phone_number로 주어졌을 때,
 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 */
public class Solution_16 {
    public String solution(String phone_number) {
        String answer = "";

        String substring = phone_number.substring(phone_number.length() - 4, phone_number.length());
        for (int i = 0; i < phone_number.length()-4; i++) {
            answer += "*";
        }
        answer += substring;
        return answer;

    }



    public static void main(String[] args) throws IOException {
        Solution_16 solution_16 = new Solution_16();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String phone_number = br.readLine();
        System.out.println(solution_16.solution(phone_number));

    }
}
