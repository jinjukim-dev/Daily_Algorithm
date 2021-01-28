package step8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex_10871 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i=0; i<n; i++) { 
			int a = sc.nextInt();
			
			if(x > a) {
				System.out.print(a +" ");
			}
			
		}
		

	}

}
