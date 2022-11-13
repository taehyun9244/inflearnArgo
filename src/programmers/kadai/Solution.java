package programmers.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {

    public int solution(int [] numbers) {
        int answer = 0;
        String[] strArray = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArray[i] = String.valueOf(numbers[i]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String key : strArray)
            map.put(key, map.getOrDefault(key, 0) + 1);

        for (String key : map.keySet()) {
            Integer value = map.get(key);

            if (value > numbers.length / 2) {
                answer += Integer.parseInt(key);
            } else return -1;
        }
        return answer;
    }

        public static void main(String[] args) throws IOException {
            Solution solution = new Solution();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int [] numbers = new int[Integer.parseInt(br.readLine())];
            System.out.println(solution.solution(numbers));
        }
    }
