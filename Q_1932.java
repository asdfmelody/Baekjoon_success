package success;

import java.util.Scanner;

public class Q_1932 {
private static int inputs[][];
private static int biggests[][];

//동적 프로그래밍 - 정수 삼각형
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		n= sc.nextInt(); // 삼각형 크기 받아오기
		
		inputs = new int[n][n];
		biggests = new int[n][n];
		
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {
				inputs[i][k]=sc.nextInt(); // 값 받아오기
			}
		}
		
		for(int i=0;i<n;i++) {
			biggests[n-1][i] = inputs[n-1][i]; //아랫단 똑같이 맞추기
		}
		
		for(int i=n-1;i>=1;i--) { //아랫단부터 더 큰거랑 더하기
			for(int k=0;k<=i-1;k++) { 
				int bigger = biggests[i][k] > biggests[i][k+1] ? biggests[i][k] : biggests[i][k+1];
				biggests[i-1][k] = bigger + inputs[i-1][k];
			}
		}

		System.out.print(biggests[0][0]);
		
		sc.close();
		
	}

}
