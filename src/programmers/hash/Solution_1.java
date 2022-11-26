package programmers.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 완주하지 못한 선수
 * 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */
public class Solution_1 {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer>  map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) +1);
        }
        System.out.println("map = " + map);

        for (String player : completion) {
            map.put(player, map.get(player) -1);
        }
        System.out.println("map = " + map);

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }

    // 1. keySet의 방법
//        for (String key : map.keySet()) {
//            if (map.get(key) != 0) {
//                answer = key;
//                break;
//            }
//        }


        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_1 solution_1 = new Solution_1();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String [] participant = new String[Integer.parseInt(br.readLine())];
        String [] participant = {"leo", "kiki", "eden"};
//        String [] completion = new String[Integer.parseInt(br.readLine())];
        String [] completion = {"eden", "kiki"};
        System.out.println(solution_1.solution(participant, completion));
    }
}
