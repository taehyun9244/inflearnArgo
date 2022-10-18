package programmers.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 양꼬치
 * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
 * 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
 * 0 < n < 1,000
 * n / 10 ≤ k < 1,000
 * 서비스로 받은 음료수는 모두 마십니다.
 */
public class Solution_13 {
    public int solution(int n, int k) {
        int answer = 0;
        int sheep = n * 12000;

        if (n/10 >= 1 && k >=1) {
            int drink = k - (n / 10);
            answer = sheep + (drink * 2000);
        } else if(0 < n && n < 10) {
            answer = sheep + (k * 2000);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_13 solution_13 = new Solution_13();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        System.out.println(solution_13.solution(n, k));

    }
}
