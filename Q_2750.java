package success;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q_2750 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amount = Integer.parseInt(br.readLine());
		
		int bs[] = new int [amount];
		
		for(int i=0;i<amount;i++) {
			bs[i]=Integer.parseInt(br.readLine());
		}

		Arrays.sort(bs); // 자바 내부 정렬 클래스
		for(int i=0;i<amount;i++) {
			System.out.println(bs[i]);
		}
	}
}
