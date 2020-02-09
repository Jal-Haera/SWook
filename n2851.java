package baekJoon;

import java.util.Scanner;

public class n2851 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		// 먹다가 멈추면 끝
		// (arr[0] + arr[1])|이부분을 기점으로 100인지 확인|+ arr[2]
		for (int i = 0; i < 10; i++) { 
			int ssum = sum + arr[i]; 
			if (ssum >= 100) { 
				if (ssum - 100 <= 100 - sum) { 
					System.out.println(ssum); 
				}else { 
					System.out.println(sum); 
				} 
				return; 
			} 
			sum = ssum; 
		} 
		System.out.println(sum); 
	}

}
	
