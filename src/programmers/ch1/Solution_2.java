package programmers.ch1;

/**
 * 두수의 합
 * 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
 * 제한사항
 * -50,000 ≤ num1 ≤ 50,000
 * -50,000 ≤ num2 ≤ 50,000
 */

public class Solution_2 {
    public int solution(int num1, int num2) {
        int answer = -1;
        if (-50000 <= num1 && 50000 >= num1){
            if (-50000 <= num2 && 50000 >= num2){
                answer = num1 +num2;
            }
        }
        return answer;
    }
}
