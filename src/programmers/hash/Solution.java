//package programmers.hash;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//
//public class Solution {
//
//    public String[] solution(String[] logs) {
//        String[] answer = {};
//        //0001, 0002
//
//
//        for (int i = 0; i < logs.length; i++) {
//            logs[i].replaceAll()
//            System.out.println("logs[i] = " + logs[i]);
//        }
//
//        //"3 95", "5 90", 3" 95"
//
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String number : logs) {
//            map.put(number, map.getOrDefault(number, 0) +1);
//            System.out.println(map);
//        }
//
//
//        return answer;
//
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        Solution solution = new Solution();
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String [] logs = new String[Integer.parseInt(br.readLine())];
//        String [] logs = {"001 3 95", "001 5 90", "002 3 95"};
//        System.out.println(solution.solution(logs));
//    }
//}
