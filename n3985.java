package practice;

import java.util.Arrays;
import java.util.Scanner;

public class n3985 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int N = sc.nextInt();
		
		int[] ans = new int[L + 1];
		int[] ansR = new int[N + 1];
		int[] expect = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			expect[i] = end - start + 1;
			for(int j = start; j <= end; j++) {
				if(ans[j] == 0) {
					ans[j] = i;
				}
			}
		}
		int max = 0; int maxIdx = 0;
		int max1 = 0; int maxEidx = 0;
		for(int i = 1; i <= N; i++) {
			if(max1 < expect[i]) {
				max1 = expect[i];
				maxEidx = i;
			}
		}
		
		for(int i = 1; i <= L; i++) {
			ansR[ans[i]]++;
		}
		
		for(int i = 1; i <= N; i++) {
			if(max < ansR[i]) {
				max = ansR[i];
				maxIdx = i;
			}
		}
		
		System.out.println(maxEidx);
		System.out.println(maxIdx);
	}

}
