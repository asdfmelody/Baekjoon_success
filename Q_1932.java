package success;

import java.util.Scanner;

public class Q_1932 {
private static int inputs[][];
private static int biggests[][];

//���� ���α׷��� - ���� �ﰢ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n;
		n= sc.nextInt(); // �ﰢ�� ũ�� �޾ƿ���
		
		inputs = new int[n][n];
		biggests = new int[n][n];
		
		
		for(int i=0;i<n;i++) {
			for(int k=0;k<=i;k++) {
				inputs[i][k]=sc.nextInt(); // �� �޾ƿ���
			}
		}
		
		for(int i=0;i<n;i++) {
			biggests[n-1][i] = inputs[n-1][i]; //�Ʒ��� �Ȱ��� ���߱�
		}
		
		for(int i=n-1;i>=1;i--) { //�Ʒ��ܺ��� �� ū�Ŷ� ���ϱ�
			for(int k=0;k<=i-1;k++) { 
				int bigger = biggests[i][k] > biggests[i][k+1] ? biggests[i][k] : biggests[i][k+1];
				biggests[i-1][k] = bigger + inputs[i-1][k];
			}
		}

		System.out.print(biggests[0][0]);
		
		sc.close();
		
	}

}
