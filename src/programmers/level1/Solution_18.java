package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 제일 작은 수 제거하기
 문제 설명
 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */

//TODO 제일 작수 제거
public class Solution_18 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, i + 1);
            answer.add(arr[i]);
            if (arr[i] == min) {
                answer.remove(arr[i]);

            } else if (answer.size() == 0) {
                answer.add(-1);
                return answer;
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_18 solution_18 = new Solution_18();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int [] arr = new int[Integer.parseInt(br.readLine())];
        int [] arr = {4,3,2,1};
        System.out.println(solution_18.solution(arr));
    }
}


