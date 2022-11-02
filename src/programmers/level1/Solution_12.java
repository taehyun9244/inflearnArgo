package programmers.level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 정수 내림차순으로 배치하기
 문제 설명
 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
public class Solution_12 {
    public long solution(long n) {
        List<Long> strExNum = new ArrayList<>();
        String array = "";
        long answer = Long.parseLong(" ");

        String str = String.valueOf(n);
        String[] split = str.split("");
        for (int i = 0; i < split.length; i++) {
            strExNum.add(Long.valueOf(split[i]));
        }
        Collections.sort(strExNum, Collections.reverseOrder());

        for (int j = 0; j < strExNum.size(); j++) {
            array += strExNum.get(j);
        }

        answer = Long.parseLong(array);

        return answer;
    }


    public static void main(String[] args) throws IOException {
        Solution_12 solution_12 = new Solution_12();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        System.out.println(solution_12.solution(n));

    }
}
