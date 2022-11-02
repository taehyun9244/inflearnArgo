package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 배열의 유사도
 * 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 * ["a", "b", "c"]	["com", "b", "d", "p", "c"]	 2
 * ["n", "omg"]	["m", "dot"]  0
 */

/*
 * 문자열에서 ==를 이용하면 같은 객체인지 비교하고 문자열을 비교하지 않기에 equals함수 이용
 */
public class Solution_33 {

    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    answer += 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_33 solution_33 = new Solution_33();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] s1 = new String[Integer.parseInt(br.readLine())];
        String [] s2 = new String[Integer.parseInt(br.readLine())];
        System.out.println(solution_33.solution(s1, s2));

    }
}
