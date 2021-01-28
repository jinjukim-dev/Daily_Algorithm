package step8;

import java.util.Scanner;

public class Ex_2675 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			
			int r = sc.nextInt();
			String s = sc.next();
			String p = "";
			
			for(int j=0; j<s.length(); j++) {
				char cs = s.charAt(j);
				
				for(int z=0; z<r; z++) {
					p += cs;
				}
			}
					
			System.out.println(p);
					
		}
	
	}

}

/*
 * next() 문자 또는 문자열을 공백 기준으로 한문자씩 받음
 * nextLine() 한 라인전제를 받음
 */
