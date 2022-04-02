import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Argo_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //초기화
        String str = br.readLine();
        char ch = str.charAt(0);
        int sum = 0;

        //대문로 변환
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);

        //반복문으로 검사
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i) == ch){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
