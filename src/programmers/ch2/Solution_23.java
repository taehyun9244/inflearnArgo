package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 아이스 아메리카노
 */
public class Solution_23 {

    public List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();

        int coffee = money / 5500;
        int share = money % 5500;
        answer.add(coffee);
        answer.add(share);
        return answer;

        /**
         * 다른 사람 풀이 참
         */
//        (1)
//        int[] answer = {0, 0};
//        answer[0] = money/5500;
//        answer[1] = money%5500;
//        (2)
//        int[] answer = new int[2];
//        answer[0] = money/5500;
//        answer[1] = money%5500;
    }

    public static void main(String[] args) throws IOException {
        Solution_23 solution_23 = new Solution_23();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        System.out.println(solution_23.solution(money));

    }
}
