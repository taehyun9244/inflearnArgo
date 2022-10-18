package programmers.ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 가장 큰 수 찾기
 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class Solution_28 {

    public int[] solution(int[] array) {
        int[] answer = {0, 0};

        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index  = i;
            }
        }
        answer[0] = max;
        answer[1] = index;
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_28 solution_28 = new Solution_28();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[Integer.parseInt(br.readLine())];
        System.out.println(solution_28.solution(array));

    }
}
