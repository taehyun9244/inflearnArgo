//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//
//문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//found7, time: study; Yduts; emit, 7Dnuof -> YES


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Argo_8 {
    public String solution(String s){
        String answer = "NO";
        s = s.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println("s = " + s);
        String tmp = new StringBuilder(s).reverse().toString();
        if (tmp.equals(s)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Argo_8 Argo_8 = new Argo_8();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(Argo_8.solution(str));
    }
}
