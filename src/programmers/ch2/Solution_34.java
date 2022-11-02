package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 배열 두배 만들기
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세
 */
public class Solution_34 {

    public List<Integer> solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            answer.add(numbers[i] * 2);
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_34 solution_34 = new Solution_34();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] numbers = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_34.solution(numbers));

    }
}
