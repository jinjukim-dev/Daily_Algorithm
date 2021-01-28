package step8;

import java.util.Scanner;

public class Ex_10809 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(char c = 'a'; c<= 'z'; c++) {
			System.out.print(s.indexOf(c)+" ");
		}
		
		/*int[] result = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			
			int iChar = s.charAt(i) - 97; //한자씩 추출
			System.out.print("몇번째 알파벳 : "+iChar+" ");
		}*/
		
		/*
		 * String str = "Hello Hello";
		 * int a = str.indexOf("H"); a = 0
		 * int b = str.indexOf("H", 2) b = 6
		 */
		
	}

}
