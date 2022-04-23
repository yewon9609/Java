package thread.threadtest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MainThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> s = new ArrayList<>(Arrays.asList());
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"번째순서를 입력해주세요 : ");
			s.add(sc.nextInt());
		}
		
	ThreadTask[] t = new ThreadTask[3];
	for (int i = 0; i < t.length; i++) {
		t[i] = new ThreadTask();
	}
	
	Thread t1 = new Thread(t[0], "first");
	Thread t2 = new Thread(t[1], "second");
	Thread t3 = new Thread(t[2], "third");


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
