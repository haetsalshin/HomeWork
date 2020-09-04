package com.biz.money;

import java.util.Random;

public class MoneyEx_01 {
	
	public static void main(String[] args) {
		
		
		int[] moneys =  {50000,10000,5000,1000,500,100,50,10};
		
		Random rnd = new Random();
		
		int pureMoney = rnd.nextInt();
		
		if(pureMoney > 0) {
		System.out.println("현재 순수금액 : " +pureMoney);
		int moneySize = moneys.length;
		for(int i=0; i < moneySize; i++) {
			
			
			
			int share = pureMoney / moneys[i];
			int remainder = pureMoney - (moneys[i] * share);
			
			
			System.out.printf("현재 %d 금액으로 나눈 후 몫 : %d , 나머지 : %d \n"
					, moneys[i], share, remainder );
			
			pureMoney -= share * moneys[i];
			
			
		}
		}
		
	}
	
	

}
