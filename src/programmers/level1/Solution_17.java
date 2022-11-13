package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 나누어 떨어지는 숫자 배열
 문제 설명
 array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 */
public class Solution_17 {
        public int[] solution(int[] arr, int divisor) {

            Arrays.sort(arr);
            List<Integer> array = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0) {
                    array.add(arr[i]);
                }
            }

            if (array.isEmpty()) {
                array.add(-1);
            }

           int [] answer = new int[array.size()];

            for (int i = 0; i < array.size(); i++) {
                answer[i] = array.get(i);
            }
            return answer;
        }

    public static void main(String[] args) throws IOException {
        Solution_17 solution_17 = new Solution_17();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[Integer.parseInt(br.readLine())];
        int divisor = Integer.parseInt(br.readLine());
        System.out.println(solution_17.solution(arr, divisor));

    }
}


//            return Arrays.stream(arr).filter(element -> element % divisor==0).toArray();
