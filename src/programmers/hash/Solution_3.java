package programmers.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 전화번호 목록
 */
public class Solution_3 {

    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], 1);
        }
        System.out.println("map = " + map);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 1; j < phone_book[i].length(); j++) {
                if (map.containsKey(phone_book[i].substring(0, j)));
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        Solution_3 solution_3 = new Solution_3();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String [] phone_book = new String[Integer.parseInt(br.readLine())];
        String [] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution_3.solution(phone_book));
    }
}


// (1) sort를 이용해서 문제 해결
//    public boolean solution(String[] phone_book) {
//        Arrays.sort(phone_book);
//
//        for (int i = 0; i < phone_book.length -1; i++) {
//            if (phone_book[i +1].startsWith(phone_book[i])) {
//                return false;
//            }
//        }
//
//        return true;
//    }