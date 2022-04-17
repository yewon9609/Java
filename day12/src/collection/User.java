package collection;

public class User {
	//접근자는 모두 private으로 한다.
	//이름
private static String name;	
	
	//아이디
private static String id;
	//비밀번호
private static String pw;
	//휴대폰 번호
private static String phoneNum;

public User() {;}


public static String getName() {
	return name;
}

public static void setName(String name) {
	User.name = name;
}

public static String getId() {
	return id;
}

public static void setId(String id) {
	User.id = id;
}

public static String getPw() {
	return pw;
}

public static void setPw(String pw) {
	User.pw = pw;
}

public static String getPhoneNum() {
	return phoneNum;
}

public static void setPhoneNum(String phoneNum) {
	User.phoneNum = phoneNum;
}


@Override
public String toString() {
	return "사용자 이름: "+getName()+"\n아이디: "+getId()+"\n비밀번호 : "+getPw()+"\n핸드폰번호:"+getPhoneNum();
}





















}
