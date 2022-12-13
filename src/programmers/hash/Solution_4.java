package programmers.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 전화번호 목록
 */
public class Solution_4 {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            System.out.println("type = " + type);
            map.put(type, map.getOrDefault(type, 0) +1);
            System.out.println("map = " + map);
        }

        Iterator<Integer> iter = map.values().iterator();
        while (iter.hasNext()) {
            answer *= iter.next();
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_4 solution_3 = new Solution_4();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String [][] clothes = new String[br.read()][br.read()];
        String [][] clothes = { {"yellow_hat", "headgear"},
                                {"blue_sunglasses", "eyewear"},
                                {"green_turban", "headgear"}};
        System.out.println(solution_3.solution(clothes));
    }
}