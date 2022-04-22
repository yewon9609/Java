package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//1.	1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer>number = new ArrayList<>();
//		IntStream.range(0, 10).forEach(num->number.add(num+1));
//		System.out.println(number);
		
		//2.	1~100까지 중 짝수만 ArrayList에 담고 출력
//		ArrayList<Integer>number2 = new ArrayList<>();
//		IntStream.range(1, 101).filter(n->n%2==0).forEach(n->number2.add(n));
//		System.out.println(number2);
		
		//3.	A~F까지 ArrayList에 담고 출력
//		ArrayList<Character>alpha= new ArrayList<>();
//		65~70
//		IntStream.range(64,70).forEach(c-> alpha.add((char)(c+1))); 
//		System.out.println(alpha);
		
		//4.	A~F까지 중 D제외하고 ArrayList에 담은 후 출력
//		ArrayList<Character> alpha2 = new ArrayList<>();
//		IntStream.range(0, 100).map(c->c+65).filter(c->c<=70 && c!=68).forEach(c->alpha2.add((char)c));
//		System.out.println(alpha2);
		
		//5.	5개의 정수를 입력받은 후 ArrayList에 담고 최대값과 최소값 출력(구글링)
//		Integer[]nums = new Integer[5];
//		int count=0;
//		System.out.println("~5개의 정수를입력해주세요~");
//		for (int i = 0; i < nums.length; i++) {
//			System.out.println(count+1+"번째 정수를 입력해주세요 : ");
//			nums[i]=sc.nextInt();
//		}
//		ArrayList<Integer>numbers = new ArrayList<>(Arrays.asList(nums));
//		int max = Collections.max(numbers);
//		System.out.print("최대값: "+max+"\t");
//		int min = Collections.min(numbers);
//		System.out.print("최소값: "+min);
//		
		
		
		//6.	 문자열을 5개 입력받고 모두 소문자로 변경
//		System.out.println("~문자열을 5개 입력해주세요~");
//	ArrayList<String> string = new ArrayList<>();
//		int count = 0 ;
//		String msg = "";
//		for (int i = 0; i < 5; i++) {
//			System.out.println(count+1+"번째 문자열 입력: ");
//			msg = sc.nextLine();
//			string.add(msg);
//			count++;
//		}
//		string.stream().map(c->c.toLowerCase()).forEach(c->System.out.print(c+ " "));
		
		//7.	Apple, banana, Melon 중 첫반째 문자가 대문자인 문자열 출력
//		ArrayList<String> fruit = new ArrayList<>(Arrays.asList("Apple","banana","Melon"));
//		fruit.stream().filter(c->c.charAt(0)>=65&& c.charAt(0)<=90).forEach(c->System.out.print(c+" "));
		
		
		
		//8.	한글을 정수로 변환 
//		ArrayList<String> hangle= new ArrayList<>(Arrays.asList("공일이삼사오육칠팔구"));
//		hangle.stream().map()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
