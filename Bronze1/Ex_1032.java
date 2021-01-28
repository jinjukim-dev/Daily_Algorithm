package Bronze1;

import java.util.*;

public class Ex_1032 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String[] list = new String[t];
		String answer = "";
		boolean isSame = true;
		
		for(int i=0; i<t; i++) {
			list[i] = sc.next();
		}
		
		// 1 case
		for(int i=0; i<list[0].length(); i++) {
			for(int j=0; j<t; j++) {
				
				if(list[0].charAt(i) == list[j].charAt(i)) {
					isSame = true;
				}else {
					isSame = false; //더이상 다음 배열과 비교 x
					break;
				}
			}
			
			if(isSame == false) {
				answer += "?";
			}else {
				answer += list[0].charAt(i);
			}
		}
				
		/* 2 case
			for(int i=0; i<list[0].length(); i++) {
				isSame = true;
				for(int j=0; j<t-1; j++) {				
					if(list[j].charAt(i) != list[j+1].charAt(i)) {
						isSame = false;
						break; //더이상 비교할 필요 x
					}		
				}
				
				if(isSame == false) {	
					answer += "?";
				}else {
					answer += list[0].charAt(i);
				}
			}*/
			
		System.out.println(answer);
	}

}