package programmers.hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * 폰켓몬
 */
public class Solution_2 {

    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        int pickPokemon = nums.length / 2;
        for (int n : nums) {
            set.add(n);
        }

        if (set.size() >= pickPokemon) {
            answer = pickPokemon;
        } else answer = set.size();

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Solution_2 solution_1 = new Solution_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int [] nums = new int[Integer.parseInt(br.readLine())];
        int [] nums = {3,1,2,3};
        System.out.println(solution_1.solution(nums));
    }
}
