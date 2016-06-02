package test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.UUID;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* String userId = UUID.randomUUID().toString();
 System.out.println(userId);*/
 
 StringBuffer sb = new StringBuffer();
	MessageDigest md;
	try {
		md = MessageDigest.getInstance("MD5");
		md.update("123456".getBytes());
		byte byteData[] = md.digest();
		// convert the byte to hex format method 1
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16)
					.substring(1));
		}
		System.out.println(sb.toString());
	} catch (NoSuchAlgorithmException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
