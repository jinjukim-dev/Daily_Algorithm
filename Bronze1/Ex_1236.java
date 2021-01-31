package Bronze1;

import java.util.*;

public class Ex_1236 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] arr = new char[n][m];
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[m];
		int r = 0;
		int c = 0;
		
		//경비원 여부 배열에 넣기
		for(int i=0; i<n; i++) {
			String str = in.next();
			for(int j=0; j<m; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				
				if(arr[i][j] == 'X') {
					col[j] = true;
					row[i] = true;
				}						
			}
		}

		for(int i=0; i<n; i++) {
			if(!row[i]) {
				r++;
			}
		}
		
		for(int i=0; i<m; i++) {
			if(!col[i]) {
				c++;
			}
		}
		//결과값
		System.out.println(c > r ? c : r);		
	}
}
