package baekJoon;

import java.util.Scanner;

public class n1592 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int[] arr = new int[N];
		// �ð� �����̸� L+ -> +L��° 
		// �ݽð� �����̸� L- -> -L��°
		// M�� ���� ����� ������ ���� ����
		int idx = 0;
		arr[idx] = 1;
		while(true) {
			if(arr[idx] == M) break;
			
			if(arr[idx] % 2 == 0) {
				idx -= L;
				if(idx < 0) {
					idx = N + idx;
				}
				arr[idx]++;
			}else {
				idx += L;
				if(idx >= N) {
					idx = idx - N;
				}
				arr[idx]++;
			}
			answer++;
		}
		
		System.out.println(answer);
	}

}
