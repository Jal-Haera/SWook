package practice;

import java.util.Scanner;

/**
 * SWEA
 * 4615. 재미있는 오셸로 게임
 * @param args
 */

public class n4615 {
	static int[][] map;
	static int N;
	static int dx[] = {0,1,1,1,0,-1,-1,-1};
	static int dy[] = {-1,-1,0,1,1,1,0,-1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int TC = 1; TC <= T; TC++) {
			N = sc.nextInt();
			int M = sc.nextInt();
			// 1 2 1 : 1, 2 에 흑돌 놓기
			// 1 1 2 : 1, 1 에 백돌 놓기	
			map = new int[N + 1][N + 1];
			map[N/2][N/2] = 2;
			map[N/2+1][N/2+1] = 2;
			map[N/2+1][N/2] = 1;
			map[N/2][N/2+1] = 1;

			for(int m = 0; m < M; m++) {
				putDol(sc.nextInt(), sc.nextInt(), sc.nextInt());
			}
			
			countDol(TC);
		}
	}
	
	static void putDol(int x, int y, int dol) {
		switch(dol) {
		case 1:
			map[y][x] = 1;
			for(int k = 0; k < 8; k++) {
				eat(x, y, 1, k);
			}
			break;
		case 2:
			map[y][x] = 2;
			for(int k = 0; k < 8; k++) {
				eat(x, y, 2, k);
			}
			break;
		default:
			break;	
		}
	}
	
	static boolean eat(int x, int y, int dol, int dir) {
			int nx = x + dx[dir];
			int ny = y + dy[dir];
			if(nx <= N && nx > 0 && ny <= N && ny > 0) {
				if(map[ny][nx] == dol) {
					return true;
				}
				if(map[ny][nx] != dol && map[ny][nx] != 0) {
					int temp = map[ny][nx];
					map[ny][nx] = dol;				
					boolean bl = eat(nx, ny, dol, dir);	
					if(!bl) map[ny][nx] = temp; 
					else return true;
				}	
			}
			return false;
	}

	static void countDol(int TC) {
		int black = 0;
		int white = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				if(map[i][j] == 1) black++;
				if(map[i][j] == 2) white++;
			}
		}
		System.out.printf("#%d %d %d\n", TC, black, white);
	}
}
