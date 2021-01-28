package step8;

import java.util.Scanner;

public class Ex_1157 {
	
	public static void main(String[] args) {
		
		char[] alpa = new char[26];
		int count[] = new int[26];
		
		for(int i=0; i<alpa.length; i++) {
			alpa[i] = (char)(i+65);  //대문자 A-Z 배열에 담기
		}
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		word = word.toUpperCase();  //대문자로 변환
		char cw;
		
		for(int i=0; i<word.length(); i++) {
			
			cw = word.charAt(i);  //한글자씩 뽑아내기
			
			for(int j=0; j<alpa.length; j++) {
				
				if(alpa[j] == cw) {
					count[j] = count[j] + 1; // cw한글자씩 count배열에 담기
				}
			}
			
		}
		
		int max = 0;
		char result = ' ';
		for(int i=0; i<count.length; i++) {
			
			if(max < count[i]) {
				max = count[i];
				result = alpa[i];
				
			}
				
		}
		
		int sum = 0;
		for(int i=0; i<count.length; i++) {
			if(count[i] == max) {
				sum += 1;
			}
			
			if(sum >= 2) result = '?';  //max값이 2개 이상이면 ?출력
		}
		
		System.out.println(result);
		
	}

}