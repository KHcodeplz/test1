package com.common.secure;

import java.nio.charset.Charset;
import java.security.*;
import java.util.Base64;

public class EncryptUtil {

	private String algorithm;
	
	public EncryptUtil() {
		// default algorithm instance : SHA-256
		this.algorithm = "SHA-256";
	}
	
	public EncryptUtil(String algorithm) {
		this.algorithm = algorithm;
	}
	
	public String encrypt(String input) {
		String result = null;
		
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			
			byte[] bytes_Input = input.getBytes(Charset.forName("UTF-8"));
			
			md.update(bytes_Input);
			
			result = Base64.getEncoder().encodeToString(md.digest());
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
