package programmers.ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 문자열 정렬하기 (1)
 * 문제 설명
 * 문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 */

//TODO 다시풀기 문자열 정렬 오름차순 해야됨
public class Solution_47 {

    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();

        String replaceNum = my_string.replaceAll("[^0-9]","");
        System.out.println("replaceString = " + replaceNum);

        String[] split = replaceNum.split("");

        for (int i = 0; i < my_string.length(); i++) {
            answer.add(Integer.valueOf(split[i]));
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_47 solution_47 = new Solution_47();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        System.out.println(solution_47.solution(my_string));
    }
}
