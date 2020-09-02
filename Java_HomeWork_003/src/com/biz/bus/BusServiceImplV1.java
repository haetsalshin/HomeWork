package com.biz.bus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.config.Line;

public class BusServiceImplV1 implements BusService {

	private Scanner scan;
	private List<BusVO> busList;
	
	public BusServiceImplV1() {
		busList = new ArrayList<BusVO>();
	}
	
	@Override
	public boolean calc() {
		scan = new Scanner(System.in);
		
		BusVO busVO = new BusVO();
		
		System.out.print("승객의 나이를 입력하세요 (END:중지) >> ");
		String strAge = scan.nextLine();
		if(strAge.equals("END")) {
			return false;
		}
		
		try {
			int intAge = Integer.valueOf(strAge);
			busVO.setAge(String.valueOf(intAge));
			if( intAge <6) {
				busVO.setPassenger("0");
				System.out.println("만 6세 이하는 0원");
			} else if(intAge <12) {
				busVO.setPassenger("800");
				System.out.println("만 12세 이하는 800원");
			} else if(intAge < 18) {
				busVO.setPassenger("1200");
				System.out.println("만 18세 이하는 1200원");
			} else if(intAge > 65) {
				busVO.setPassenger("0");
				System.out.println("만 65세 이상은 0원");
			} else if(intAge >17 || intAge <66) {
				busVO.setPassenger("1500");
				System.out.println("일반승객은 1500원");
			} else {
				System.out.println("승객의 나이는 0세 이하가 될 수 없습니다.");
				System.out.println("다시 입력해주세요");
				return true;
			}
			
			
			
		} catch (Exception e) {
			System.out.println("나이는 숫자만 입력가능합니다.");
			System.out.println("다시 입력해주세요.");
			return true;
		}
		busList.add(busVO);
		
		return true;
	}

	@Override
	public void list() {
		
		System.out.println(Line.D_LINE);
		System.out.println("광주광역시 버스 요금 계산기 V1");
		System.out.println(Line.D_LINE);
		
		for(BusVO bus : busList) {
			System.out.printf("승객의 나이 : %s \n", bus.getAge());
			System.out.printf("승객의 요금 : %s \n", bus.getPassenger());
			System.out.println(Line.S_LINE);
		}
		System.out.println(Line.D_LINE);
		
	}
	
	
	

}
