package com.biz.config;

public class Line {
	
	public static  String D_LINE="";
	public static  String S_LINE="";
	
	static {
		for(int i = 0; i < 80; i++) {
			D_LINE += "=";
			S_LINE += "-";
		}
		
	}

}
