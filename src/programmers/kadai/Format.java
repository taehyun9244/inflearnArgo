package programmers.kadai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * format('abbccccaabc') // -> abcabc を返却
 * format('bbitaaa') // -> bita を返却 인접 알파벳 삭제 중복 삭제가 아닌, 인접 알파벳
 */
public class Format {
    public String solution(String str) {
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        char prev = 0;
        int k = 0;

        for (char c: chars)
        {
            if (prev != c)
            {
                chars[k++] = c;
                prev = c;
            }
        }

        return new String(chars).substring(0, k);
    }


    public static void main(String[] args) throws IOException {
        Format format = new Format();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(format.solution(str));
    }
}
