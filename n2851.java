package baekJoon;

import java.util.Scanner;

public class n2851 {
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		// �Դٰ� ���߸� ��
		// (arr[0] + arr[1])|�̺κ��� �������� 100���� Ȯ��|+ arr[2]
		for (int i = 0; i < 10; i++) { 
			int ssum = sum + arr[i]; 
			if (ssum >= 100) { 
				if (ssum - 100 <= 100 - sum) { 
					System.out.println(ssum); 
				}else { 
					System.out.println(sum); 
				} 
				return; 
			} 
			sum = ssum; 
		} 
		System.out.println(sum); 
	}

}
	
