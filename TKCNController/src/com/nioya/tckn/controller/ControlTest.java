package com.nioya.tckn.controller;

import java.net.MalformedURLException;

public class ControlTest {

	public static void main(String[] args){
		System.out.println("Starting");
		TCKNController tcknController = null;
		try {
			tcknController = new TCKNController();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tcknController != null){
			boolean result = tcknController.checkTCKNVality("TCKN","NAME","SURNAME", "BIRTHYEAR");
			if(result){
				System.out.println("Result: VALID");
			}else{
				System.out.println("Result: INVALID");
			}			
		}


		
		

	}
	

	


}
