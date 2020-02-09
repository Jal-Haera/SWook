package baekJoon;

import java.util.Scanner;

public class n11399 {
	static int[] arr, brr;
	static boolean[] check;
	static int N, answer, min;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[N];
		brr = new int[N];
		check = new boolean[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		min = 987654321;
		dfs(0);

		System.out.println(min);
	}
	static void dfs(int idx) {
		int cnt = 0;
		for(int i = 0; i < N; i++) {
			if(check[i]) cnt++;
		}
		if(cnt == N) {
			//answer += brr[idx] * (N - idx);
			if(answer < min) 
				min = answer;
		
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!check[i]) {
				check[i] = true;
				brr[idx] = arr[i];
				answer += brr[idx] * (N - idx);
				dfs(idx + 1);
				answer -= brr[idx] * (N - idx);
				check[i] = false;
			}
		}
		
		
	}

}
