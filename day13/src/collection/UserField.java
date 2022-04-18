package collection;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	//회원을 저장할 자료구조 선언
	public ArrayList<User> users = new ArrayList<>();
	
	//암호 키
private static final int key = 3;
	
	//아이디 중복검사
	//boolean 보다 User타입으로 리턴하는 것이 좋다.
	public User checkId(String id) {
		User user=null;
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				user=users.get(i);
				break;
			}
		}
		return user;
	}
	
	
	//회원가입 (이름, 아이디, 비밀번호, 휴대폰 번호)
	public void join(User user){
		user.setPw(encrypt(user.getPw()));
		users.add(user);
	}
		
	
	//로그인(아이디랑 비밀번호를 받아서 암호화 된 비밀번호끼리 비교)
	//사용자한테 입력받은거를 암호화 시켜야한다.
	public boolean login(String id, String pw) {
		User user=checkId(id);
		if(user!=null) {
			if(user.getPw().equals(encrypt(pw))) {
				return true;
			}
		}
		return false;
	}
	
	//암호화 
	public String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw +=(char)(pw.charAt(i)*3);
		}
		return en_pw;
	}
	
	//복호화
	public String decrypt(String pw) {
		String de_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			de_pw +=(char)(pw.charAt(i)/3);
		}
		return de_pw;
	}
	
	
	//비밀번호 찾기 (이름과 핸드폰 번호로 찾기, SMS로 임시 비밀번호 전송)
	//임시 비밀번호는 숫자, 문자의 랜덤한 조합으로 6자리를 전송한다.
	
	public boolean FindPw(String name, String phoneNumber) {
		for (int i = 0; i < users.size(); i++) {
			boolean checkName = users.get(i).getName().equals(name);
			boolean checkPhoneNumber = users.get(i).getPhoneNum().equals(phoneNumber);
			
			if(checkName && checkPhoneNumber) {
				//문자 발송
													// 암호화된 비밀번호를 복호화 시켜서 전달해줌
				sendSMS(phoneNumber, decrypt(users.get(i).getPw()));
				return true;
			}
					}
		return false;
	}
				
		
		//SMS
										//외부에서 누구한테 보낼껀지, 찾은 비밀번호
		public void sendSMS(String phoneNumber, String pw){
				 String api_key = "NCSJOHDTLBSBELEH";
				    String api_secret = "FS2OGUYNFI6W2ZZ0WVY9LZLALLDRXOOS";
				    Message coolsms = new Message(api_key, api_secret);

				    // 4 params(to, from, type, text) are mandatory. must be filled
				    HashMap<String, String> params = new HashMap<String, String>();
				    params.put("to", phoneNumber);
				    params.put("from", "");
				    params.put("type", "SMS");
				    params.put("text", pw);
				    params.put("app_version", "test app 2.2"); // application name and version

				    try {
				      JSONObject obj = (JSONObject) coolsms.send(params);
				      System.out.println(obj.toString());
				    } catch (CoolsmsException e) {
				      System.out.println(e.getMessage());
				      System.out.println(e.getCode());
				    }	
			
		
		}
	
	}
	
	
	
	
	
	
//		if(user.getName().equals(name)) { //이름이 있다면
//			if(user.getPhoneNum().equals(phoneNumber)) { //핸드폰 번호 맞는지 검사
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

