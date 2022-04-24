package bakery;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Bakery {
		public static void main(String[] args) {
			
			      BreadMaker maker = new BreadMaker();
//			//싱글톤 패턴이라 new를 쓰지않는다. !
			      BreadPlate plate = BreadPlate.getInstance();
//			//스케줄링하기위해 쓰레드 객체 생성
			      Thread makerThread = new Thread(maker);
			      
			      String[] btns = {"빵 먹기", "나가기"};
			      
			      
			      ImageIcon icon = new ImageIcon("src/img/giphy.gif");
			      
			      makerThread.start();
			      
			      int choice = 0;
			      while(true) {
//									//버튼 만드는 거 
			         choice = JOptionPane.showOptionDialog(null, "", "빵집", JOptionPane.DEFAULT_OPTION,              
			        //기본적으로 나오는 이미지 없애는거			//문자열 배열을 options에 전달한다. 
			            JOptionPane.PLAIN_MESSAGE, icon, btns, null);
			         
			         
			         
			         if(choice == 0) {
			            plate.eatBread();
			            
			         }else {
			        	 //빵만들기 스레드 종료하기
			        	 
			        	 maker.setExit(true);
						
			            break;
			         }
			      }
			   }

			
			
			
			
			
			
			
		
			
			
		}

