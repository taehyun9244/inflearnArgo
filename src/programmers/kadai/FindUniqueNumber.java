package programmers.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * findUniqueNumber([1, 1, 5])  // -> 5 を返却
 * findUniqueNumber([0, 1, 3, 1, 0])  // -> 3 を返却 중복없는 숫자만
 */
public class FindUniqueNumber {
    public int solution(int[] array) {

        int answer = 0;
        String[] strArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            strArray[i] = String.valueOf(array[i]);
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (String key : strArray)
            map.put(key, map.getOrDefault(key, 0) + 1);

        for (String key : map.keySet()) {
            Integer value = map.get(key);

            if (value == 1) {
                answer += Integer.parseInt(key);
            }
        }
        return answer;
    }


    public static void main(String[] args) throws IOException {
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(br.readLine())];
        System.out.println(findUniqueNumber.solution(array));
    }
}
