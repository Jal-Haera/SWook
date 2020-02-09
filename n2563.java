package baekJoon;

import java.util.Scanner;

public class n2563 {
	static boolean[][] map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int xTerm = 0, yTerm = 0;
		map = new boolean[101][101];
		for(int k = 0; k < N; k++) {
			xTerm = sc.nextInt();
			yTerm = sc.nextInt();

			for(int i = xTerm; i < xTerm + 10; i++) {
				for(int j = yTerm; j < yTerm + 10; j++) {
					map[i][j] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(map[i][j]) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
