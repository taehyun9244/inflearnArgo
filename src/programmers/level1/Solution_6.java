package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 자연수 뒤집어 배열로 만들기
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */
public class Solution_6 {
    //숫자 -> 문자배열 -> 숫자배열
    public List<Integer> solution(long n) {
        List<Integer> answer = new ArrayList<>();
        String str = String.valueOf(n);
        String[] split = str.split("");

        for (int i = split.length -1; i >= 0; i--) {
            answer.add(Integer.valueOf(split[i]));
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_6 solution_6 = new Solution_6();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.println(solution_6.solution(n));

    }
}
