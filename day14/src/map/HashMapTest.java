package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	   public static void main(String[] args) {
		   
		   							//value = ArrayList타입의 Integer
		   //KEY를 student타입으로, Value를 ArrayList 타입으로 설정하여 HashMap을 선언한다.
	      HashMap<Student, ArrayList<Integer>> studentMap = new HashMap<>();
	      //key값인 Student타입 객체 선언
	      Student std1 = new Student(1, "한동석");
	      Student std2 = new Student(2, "홍길동");
	      Student std3 = new Student(1, "이순신");
	      
	      //asList(T ...) : Arrays라는 클래스에 있다. 배열을 리스트로 변경시켜주는 메소드, 배열을 전달하지 않고 여러 개의 값을 전달해도 List로 리턴해준다.
	    //배열을 전달하는거는 매번 배열을 생성해야해서 불편하다.
	      Integer[] arData = {100, 90, 70};
	      //value값
	    //그래서 가변인자로 전달한다.
	      ArrayList<Integer> std1Scores = new ArrayList<>(Arrays.asList(arData));
	      ArrayList<Integer> std2Scores = new ArrayList<>(Arrays.asList(20, 50, 60));
	      ArrayList<Integer> std3Scores = new ArrayList<>(Arrays.asList(20, 50, 60));
	      
	      //HasyMap에 학생2명의 정보와 각 시험점수를 넣어준다.  (1번과 2번학생만 넣었음)
	      studentMap.put(std1, std1Scores);
	      studentMap.put(std2, std2Scores);
	      
	      //equals와 hashCode를 재정의 한 후 직접 확인한다.
//	      System.out.println(std1.equals(std3));
//	      System.out.println(std1.hashCode() == std2.hashCode());
//	      System.out.println(std1.hashCode() == std3.hashCode());
//	      System.out.println(studentMap.containsKey(std3));
	      
	      //학생의 이름 변경		(key값을 분리해야하기때문에 KeySet()메소드 사용, 순서를 부여해주기위해 iterator()사용)
	      //학생의 이름을 변경하기 위해서는 HashMap 에서 Key에 해당하는 작업이기 때문에 Key만 분리하여 작업한다. 
	      Iterator<Student> iter = studentMap.keySet().iterator();
	      while(iter.hasNext()) {	//다음값이 없을때까지 반복
	         Student std = iter.next();		//std객체에 HashMap에 있는 키값을 넣는다.
	         if(std.getNum() == std3.getNum()) { 	//HashMap안에있는 키값의 번호와 3번학생 번호가 같다면?
	            std.setName(std3.getName());		// 그 키 값의 이름을 3번학생 이름으로 변경
//	            System.out.println(std.getName());
	         }
	      }
	      
	      //학생 1번의 점수를 수정한다.
//	      studentMap.put(std3, std3Scores);	//std1번과 3번의 번호가 같으니까 값을 넣으면 수정이 된다. 
//	      System.out.println(studentMap);
	      
	      //빠른 for문
//	      int[] datas = {3,4,5};
//	      for (int data  : datas) {
//			System.out.println(data);
//		}
//	      
	      
	      //학생별 점수와 평균 점수, 총 점(values())
	      //학생의 수만큼 배열 선언
	      int[] arTotal = new int[studentMap.size()];			//학생별 총점을 담을 배열 선언 .배열의 길이는 학생수만큼이니까 studentMap.size :쌍으로 나온다.
	      double[] arAvg = new double[studentMap.size()];		//학생별 평균점수 담을 배열 선언
	      //전체점수
	      int total = 0;
	      //전체 평균 
	      double avg = 0.0;
	      //인덱스번호
	      int idx = 0;
	      //studentMap 의 value값(ArrayList타입) 을 담을 객체 scores선언
	      //HashMap에서 점수에 대한 작업을 해야 하므로 KEY는 필요없다. 따라서 Value를 분리하여 Collection에 담아준다 Collection은 여러개의 ArrayList를 담고있다. 
	      Collection<ArrayList<Integer>> scores = studentMap.values();
	      //향상된 for문 , value값이 담긴 scores의 값을 scoreList에 반복(scores값이 없어질때까지)하여 담는다.
	      for(ArrayList<Integer> scoreList : scores) {	//각 학생의 점수들을 scoreList에 담아준다. 
	    	  //scoreList의 값을 int타입인 score에 담는다 (값이 한개씩 담김)
	         for(int score : scoreList) {	//각 학생의 점수들에서 각점수를 분리한다. 
	        	 //arTotal[] 학생별 총점을 담을 배열 에 score를 누적하여 담음 
	            arTotal[idx] += score; 	//idx번째 방에학생의 점수를 누계한다. 
	            total += score;			//전체 점수에 학생의 점수를 누계한다. 
	            System.out.print(score + "\t");
	         }
	         //학생 별 평균 점수 구하기 
	         arAvg[idx] = (double)arTotal[idx] / scoreList.size();
	         arAvg[idx] = Double.parseDouble(String.format("%.2f", arAvg[idx]));
	         //전체 평균 구하기
	         avg =(double)total /  (scoreList.size() * studentMap.keySet().size());
	         avg = Double.parseDouble(String.format("%.2f", avg));
	         
	         System.out.println(arAvg[idx] + "\t" + arTotal[idx]);
	         //학생 한 명의 연산이 모두 끝나면 다음학생으로 넘어가야하기 때문에 idx를 1 증가시켜준다.
	         idx++;
	      }
	      
	      //전체 학생의 평균 점수보다 높은 학생을 찾아낸다(우수 학생으로 출력)
	      
	      //value로 key값을 가져오기 위해 한쌍을 가져오는 entrySet()을 쓴다. iterator는 순서를 부여하기 위해 쓴다. 
	      //점수로 학생의 이름을 가져와야 하기 때문에 KEY와 Value 모두 필요하다. 이 때 , entrySet()을 사용하여 한 쌍씩 , 모든 쌍을 가져온다.
	      //이 때 각 쌍은 Entry타입이다. 
	      Iterator<Entry<Student, ArrayList<Integer>>> iterator = studentMap.entrySet().iterator();
	      String msg = "";
	      String names = "";
	      while(iterator.hasNext()) {
	    	  //iterator에 담겨있는 값을 entry객체에 옮겨담음 
	    	  //한 쌍씩 가져와서 entry에 담는다. 
	         Entry<Student, ArrayList<Integer>> entry = iterator.next();
	         //학생의 총점
	         int stdTotal = 0;
	         //학생의 평균 
	         double stdAvg = 0.0;
	         //entry에 있는 value를 score에 넣고, 그 score를 stdTotal에 넣어서 총점을 구한다. 
	         //전체학생의 점수를 int score에 넣는다. 그 score를 다시 stdTotal에 넣는다.
	         for(int score : entry.getValue()) {	//학생의 점수를 하나씩 score에 담고 stdTotal에 누계한다. 
	            stdTotal += score;
	         }
	         //총점을 value의 길이 만큼나눈 값을 double로 형변환하여 stdAvg에 담아준다. 
	         //학생의 평균 점수 
	         stdAvg = (double)stdTotal / entry.getValue().size();
	         msg = "우수 장학생 명단\n";
	         //전체학생의 평균점수인 avg보다 학생의 평균점수인 stdAvg가 더 크다면 우수학생으로 출력하기 위해 이름 받아오기
	         if(stdAvg > avg) {
	            names = entry.getKey().getName() + "\n";
	         }
	      }
	      if(!names.equals("")) {		//평균점수보다 높은 학생이 한명이라도 있다면 
	         System.out.print(msg + names);
	      }else {
	         System.out.println("우수 장학생이 없습니다.");
	      }

	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
//	      double totalAverage =0.0;
//	      
//	      int sum=0;
//	      double avg = 0.0;
//	      for (ArrayList<Integer> score : scores) {
//	    	  System.out.println( score);
//	    	  
//	    	  sum=0;
//	    	  avg = 0;
//	    	  
//	    	  
//	    	  for (int i = 0; i < score.size(); i++) {
//	    		  sum+=score.get(i);	//총점
//	    		  avg = sum/score.size();	//평균
//	    	  }
//	    	  System.out.println("총점: "+sum+"평균"+avg);
//	    	  //전체 학생의 평균 점수보다 높은 학생을 찾아낸다(우수 학생으로 출력)
//	    	  //먼저 전체학생의 평균점수를 구해야함.
//	    	  int total = 0;
//	    	  
//	    	  for (int i = 0; i < scores.size(); i++) {
//				total +=avg;
//				totalAverage = total/scores.size();
//				
//			}
//	    	  
//	    	  
//		}
//	      System.out.println("전체 학생의 평균점수 :"+totalAverage );
//	    
	    
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	   }

	
}

