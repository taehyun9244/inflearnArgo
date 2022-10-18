//설명
// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//문자열의 길이는 100을 넘지 않는다.
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

//t e a c h e r m o d e -> e
//1 0 1 2 1 0 1 2 2 1 0 // e의 위치를 뽑고, 각각 돌면서 가장 가까운 e와의 위치 계산 index - e의 index = 0에 가까운

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Argo_10 {
    public String solution(String array, String s){
        String newArray = array.toLowerCase();
        String newStr = s.toLowerCase();

        char c = newStr.charAt(0);



        return null;
    }


    public static void main(String[] args) throws IOException {
        Argo_10 Argo_10 = new Argo_10();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String array = st.nextToken();
        String str = st.nextToken();
        System.out.println(Argo_10.solution(array,str));
    }
}
