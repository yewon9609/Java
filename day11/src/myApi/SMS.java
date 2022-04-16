package myApi;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

//전체 import 단축키 : ctrl+shift+o

public class SMS {
	public static void main(String[] args) {
		
	    String api_key = "NCSJOHDTLBSBELEH";
	    String api_secret = "FS2OGUYNFI6W2ZZ0WVY9LZLALLDRXOOS";
	    Message coolsms = new Message(api_key, api_secret);

	    // 4 params(to, from, type, text) are mandatory. must be filled
	    HashMap<String, String> params = new HashMap<String, String>();
	    params.put("to", "01042872040");
	    params.put("from", "01042872040");
	    params.put("type", "SMS");
	    params.put("text", "예원아 부지런히 살자!");
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
