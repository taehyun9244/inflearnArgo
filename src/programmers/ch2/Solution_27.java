package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 삼각형의 완성조건 (1)
 * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다.
 * 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
 */
public class Solution_27 {

    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if (sides[0] + sides[1] <= sides[2]) {
            answer = 2;
        } else answer = 1;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_27 solution_27 = new Solution_27();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] sides = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_27.solution(sides));

    }
}
