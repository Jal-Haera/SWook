package practice;

import java.util.Scanner;

public class n2991 {
	static int A,B,C,D;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt(); B = sc.nextInt();
		C = sc.nextInt(); D = sc.nextInt();
		
		int P = sc.nextInt();
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		// 우체부, 우유배달원, 신문배달원의 도착시간 주어짐.
		// [반복]
		// 개 한마리는 A분 공격적, B분 조용
		// 또 다른 개 : C분 공격적, D분 조용
		
		System.out.println(attack(P));
		System.out.println(attack(M));
		System.out.println(attack(N));
	}
	
	static int attack(int arrive) {
		int hit = 0;
		// 첫번째 개
		int term1 = arrive % (A + B);
		if(term1 > 0 && term1 <= A) hit++;
		
		// 두번째 개
		int term2 = arrive % (C + D);
		if(term2 > 0 && term2 <= C) hit++;
		
		return hit;
	}

}
