package success;

import java.util.Scanner;

public class Q_10808 {
	public static void main(String[] args) {
		int[] show = new int[26];
		String input;
		int al;
		int dif;
		
		Scanner sc = new Scanner(System.in);
		input= sc.next();
		for(int i=0;i<input.length();i++) {
			al =(int)input.charAt(i);
			dif = 123-al; 
			show[26-dif]++;
		}
		for(int i=0;i<show.length;i++) {
			System.out.print(show[i] + " ");
	
		}
		sc.close();
	}
}
