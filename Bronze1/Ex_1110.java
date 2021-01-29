package Bronze1;

import java.util.*;

public class Ex_1110 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int firstNum = num;
		
		int cycle = 0;
		
		while(true) {
			
			if(num == 0) {
				cycle++;
				break;
			}
			
			int num1 = num / 10;
			int num2 = num % 10;
			
			int sum = num1+num2;
			
			num = num2*10 + sum%10;
			
			if(num == firstNum) {
				cycle++;
				break;
			}
						
			cycle++;
			
		}
		
		System.out.println(cycle);
	}

}
