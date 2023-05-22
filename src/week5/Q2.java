package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n >= 0){
            if (n % 5 == 0){
                System.out.println(n / 5 + count);
                break;
            }
            if (n < 3){
                System.out.println("-1");
                break;
            }
            n -= 3;
            count++;
        }
    }
}
