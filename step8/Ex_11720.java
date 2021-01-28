package step8;

import java.util.Scanner;

public class Ex_11720 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tot = 0;
		String str = sc.next();
		
		for(int i=0; i<n; i++) {
			tot += str.charAt(i) - '0';
		}
		
		System.out.println(tot);
		
		
	}

}

/* str.charAt(i) 문장중에 인덱스 위치에 해당되는 문자 추출 
 * str.charAt(i) - '0' 아스키 코드 이용해서 숫자로 인식
 */
