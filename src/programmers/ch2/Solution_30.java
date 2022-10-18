package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 배열 뒤집기
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_30 {

    public List<Integer> solution(int[] num_list) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }

        Collections.reverse(answer);
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_30 solution_30 = new Solution_30();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] num_list = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_30.solution(num_list));

    }
}
