package programmers.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {

    public String[] solution(String[] logs) {
        String[] answer = {};

        for (int i = 0; i < logs.length; i++) {
            String substring = logs[i].substring(logs[i].indexOf(" "));
            System.out.println("substring = " + substring);
        }

//        int duplicateAnswer = 0;
//        //0001, 0002
//        HashMap<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < logs.length; i++) {
//            map.put(logs[i].substring(4, logs[i].length()), map.getOrDefault(logs[i].substring(4, logs[i].length()), 0) + 1);
//        }
//        System.out.println("map = " + map);
//
//        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry<String, Integer> entry = iter.next();
//            if (entry.getValue() >= 2) {
//                duplicateAnswer ++;
//                System.out.println("entry = " + entry);
//            }
//
//            if (duplicateAnswer >= 5) {
//                String substring = entry.getKey().substring(entry.getKey().lastIndexOf(" "));
//                System.out.println("substring = " + substring);
//            }
//
//        }

        return answer;

    }


    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String [] logs = new String[Integer.parseInt(br.readLine())];
        String[] logs = {"001 3 95", "001 5 90", "002 3 95", "002 5 80", "002 5 90"};
        System.out.println(solution.solution(logs));
    }
}
