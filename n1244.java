package practice;

import java.util.Scanner;

public class n1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numSw = sc.nextInt();
		int[] button = new int[numSw + 1];
		for(int i = 1; i <= numSw; i++) {
			button[i] = sc.nextInt();
		}
		int numSt = sc.nextInt();
		// 학생은 인덱스 0부터, 스위치는 1부터
		// 남학생 1 여학생 2
		for(int i = 0; i < numSt; i++) {
			int man = sc.nextInt();
			int swNo = sc.nextInt();
			if(man == 1) {
				for(int k = 1; k <= numSw; k++) {
					if(k % swNo == 0) {
						if(button[k] == 1) {
							button[k] = 0;
						}else {
							button[k] = 1;
						}
					}
				}
			}

			if(man == 2) {
				int j;
				for(j = 1; j <= numSw; j++) {
					if(swNo+j > numSw || swNo-j <= 0) {
						j--;
						break;
					}
					if(button[swNo + j] == button[swNo - j])
						continue;
					if(button[swNo + j] != button[swNo - j])
						j--;
						break;
				}
				
				for(int k = swNo - j; k <= swNo + j; k++) {
					if(button[k] == 1) {
						button[k] = 0;
					}else {
						button[k] = 1;
					}
				}	
			}
		}
		for(int i = 1; i <= numSw; i++) {
			System.out.print(button[i] + " ");
			if(i % 20 == 0) System.out.println();
		}
	
	}

}
