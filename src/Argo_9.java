//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//
//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Argo_9 {
    public String solution(String s){
        s = s.replaceAll("[^0-9]","");
        System.out.println("s = " + s);
        while (s.charAt(0) == '0'){
            s = s.substring(1);
        }
        return s;
    }

    public static void main(String[] args) throws IOException {
        Argo_9 Argo_9 = new Argo_9();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Argo_9.solution(str));
    }
}
