package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 서울에서 김서방 찾기
 문제 설명
 String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
 seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 */
public class Solution_15 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은"+ " " + i + "에 있다";
            }
        }
        return answer;
    }



    public static void main(String[] args) throws IOException {
        Solution_15 solution_15 = new Solution_15();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] seoul = new String[Integer.parseInt(br.readLine())];
        System.out.println(solution_15.solution(seoul));

    }
}
