package com.biz.bus;

public class BusEx_01 {
	
	public static void main(String[] args) {
		
		BusService busService = new BusServiceImplV1();
		
		while(true) {
			if(!busService.calc()) {
				
				break;
			}
		}
		busService.list();
	}
	
	
}
