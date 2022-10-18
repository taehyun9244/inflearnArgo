package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 옷가게 할인 받기
 */
public class Solution_29 {

    public double solution(int price) {
        double answer = 0;

        if (price >= 100000 && price <300000) {
            answer = Math.floor(price - (price * 0.05));
        } else if (price >= 300000 &&  price < 500000 ) {
            answer = Math.floor(price - (price * 0.1));
        } else if (price >= 500000) {
            answer = Math.floor(price - (price * 0.2));
        } else answer = price;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_29 solution_29 = new Solution_29();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        System.out.println(solution_29.solution(price));

    }
}
