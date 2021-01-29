package Bronze1;

import java.util.*;

public class Ex_1157 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase(); //모두 대문자로 변경해서 str에 저장
		
		int[] arr = new int[26]; //0~25 : 26개 배열
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			arr[c-65]++;
		}
		
		//가장많이 사용된 알파벳 출력
		int max = 0; //최댓값
		char answer = ' '; //출력
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				answer = (char)(i+65);
			}						
		}
		
		//가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			//max값이 그럼 2개있어야함
			if(max == arr[i]) {
				cnt++;
				if(cnt >= 2) {
					answer = '?';
				}
			}
		}
		System.out.println(answer);
	}
}
