package practice;

import java.util.Arrays;
import java.util.Scanner;

public class n2804 {
	static char[][] cross;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int sizeA = A.length();
		int sizeB = B.length();
		// A는 가로 B는 세로로
		// A에서 제일 먼저 등장하는 공유 글자 선택(B도 마찬가지)
		
		cross = new char[sizeB][sizeA];
		for(char[] row: cross) {
            Arrays.fill(row, '.');
        }
		int ansi = 0, ansj = 0;
		gogo:
		for(int i = 0; i < sizeA; i++) {			
			for(int j = 0; j < sizeB; j++) {
				if(A.charAt(i) == B.charAt(j)) {
					ansi = j;
					ansj = i;
					break gogo;
				}
			}
		}
		cross[ansi] = A.toCharArray();
		for(int i = 0; i < sizeB; i++) {
			cross[i][ansj] = B.charAt(i);
		}
		print(sizeA, sizeB);
	}
	
	static void print(int a, int b) {
		for(int i = 0; i < b; i++) {			
			for(int j = 0; j < a; j++) {
				System.out.print(cross[i][j]);
			}
			System.out.println();
		}
		
	}

}
