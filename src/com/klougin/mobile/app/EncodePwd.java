package com.klougin.mobile.app;

import org.apache.commons.codec.binary.Base64;

public class EncodePwd {
public static void main(String[] args) {
	String password = "shahnawaz";
	
	//Encoded Part
	String encoded_password= encodePassword(password);
	System.out.println("Encoded password is : " + encoded_password);
	
	//Decoded Part
	System.out.println("Decoded password is : "+ decodePassword(encoded_password));
	
}

public static String encodePassword(String pass) {
	return new String(Base64.encodeBase64(pass.getBytes()));
}
public static String decodePassword(String pass) {
	return new String(Base64.decodeBase64(pass.getBytes()));
}

}
