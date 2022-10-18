package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 짝수 홀수 객수
 * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_24 {

    public int[] solution(int[] num_list) {

        int[] answer = new int[2];
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += 1;
            } else odd += 1;
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_24 solution_24 = new Solution_24();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] new_list = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_24.solution(new_list));

    }
}
