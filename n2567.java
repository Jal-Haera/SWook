package baekJoon;

import java.util.Scanner;

public class n2567 {
	static int[][] map;
	static int answer = 0;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		map = new int[102][102];
		for(int i = 0; i < N; i++){
			int xTerm = sc.nextInt();
			int yTerm = sc.nextInt();
			fillIn(xTerm, yTerm);
		}
		count();
		System.out.print(answer);
	}
	
	static void fillIn(int xt, int yt) {
		for(int i = xt; i < xt + 10 ; i++) {
			for(int j = yt; j < yt + 10; j++) {
				map[i][j] = 1;
			}
		}
	}
	
	static void count() {
		for(int i = 0; i <= 100 ; i++) {
			for(int j = 0; j <= 100; j++) {
				if(map[i][j] == 1) {
					for(int k = 0; k < 4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if(nx >= 0 && nx <= 101 && ny >= 0 && ny <= 101) {
							if(map[nx][ny] == 0) answer++;
						}
					}
				}
			}
		}
	}

}
