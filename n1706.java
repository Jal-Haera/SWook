package baekJoon;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class n1706 {
	static String[] srr;
	static int R, C;
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		R = sc.nextInt();
		C = sc.nextInt();
		srr = new String[R+C];
		confirm();
	}

	static void confirm() {
		PriorityQueue<String> pq = new PriorityQueue<>();
		for(int i = 0; i < R; i++) {
			srr[i] = sc.next();
		}
		
		for(int i = 0; i < C; i++) {
			String s = "";
			for(int j = 0; j < R; j++) {
				s += srr[j].charAt(i);
			}
			srr[R + i] = s;
		}
		
		for(int k = 0; k < R + C; k++) {
			String temp = "";
			String dd = ""; 
			for(int m = 0; m < srr[k].length(); m++) {
				dd += srr[k].charAt(m);
				if(srr[k].charAt(m) == '#') {
					if(temp != "") pq.offer(temp);
					dd = "";
					continue;
				}
				if(dd.length() >= 2) { 
					temp = dd;
				}
			}
			srr[k] = temp;
		}
		
		for(int k = 0; k < R + C; k++) {
			if(srr[k] == "") srr[k] = "zzzzzzzz";
			pq.offer(srr[k]);
		}
		
		System.out.println(pq.poll());
	}
	
}
