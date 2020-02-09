package baekJoon;

import java.util.Scanner;

public class n2798 {
	static int[] arr;
	static int max = 0, answer = 0;
	static int M, N;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt = 0;
		dfs(cnt, 0);
		System.out.println(max);
	}
	
	static void dfs(int cnt, int idx){
		if(cnt == 3) {
			if(max < answer && answer <= M) {
				max = answer;
			}
			return;
		}
		for(int i = idx; i < N; i++) {
			answer += arr[i];
			dfs(cnt + 1, i + 1);
			answer -= arr[i];
		}
	}

}
