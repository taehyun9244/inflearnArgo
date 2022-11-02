package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 개미 군단
 * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력
 * 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
 * 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
 * 최소한의 병력을 구성
 */
public class Solution_44 {
        public int solution(int hp) {
            int answer = 0;
            int first = (int) Math.floor(hp / 5);
            int second = (int) Math.floor((hp - first * 5) / 3);
            int third = hp - first * 5 - second * 3;

            answer = first + second + third;
            return answer;
        }

    public static void main(String[] args) throws IOException {
        Solution_44 solution_44 = new Solution_44();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hp = Integer.parseInt(br.readLine());
        System.out.println(solution_44.solution(hp));
    }
}
