package com.biz.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArraysEx_001 {
	
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		
		Random rnd = new Random();
		
		
		for(int i = 0 ; i <100 ; i++) {
			int arrays = rnd.nextInt(100)+1;
			
			intList.add(arrays);
			System.out.printf("%d ", arrays);
			if ( (i+1 ) % 10 == 0) {
			System.out.println();
			}
		}
		
		// 내가 찾아본 방법
		/*
		 * Collections.sort(intList);
		 * 
		 * System.out.
		 * println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒리스트 오름차순▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒"
		 * );
		 * 
		 * for(int i : intList) { System.out.printf("%d ", i);
		 * 
		 * if((i+1) % 10 == 0) { System.out.println(); }
		 * 
		 * } System.out.println(); System.out.
		 * println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒리스트 내림차순▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒"
		 * );
		 * 
		 * Collections.sort(intList, Collections.reverseOrder()); for(int i : intList) {
		 * System.out.printf("%d ", i);
		 * 
		 * if((i+1) % 10 == 0) { System.out.println(); }
		 * 
		 * }
		 */
		
		
		// 선생님이 올려주신 방법
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		for(int i = 0 ; i < intList.size(); i ++) {
			
			for(int j = i+1; j < intList.size(); j++) {
				if(intList.get(i) > intList.get(j)) {
					System.out.printf("i의 숫자 : %d , ", intList.get(i));
					System.out.printf("j의 숫자 : %d \n", intList.get(j));
					int temp = intList.get(i);
					
					intList.set(i, intList.get(j));
					
					intList.set(j, temp);
					
					System.out.println("숫자 오름 차순 정렬 완료!!");
					
				}
			
			}
			
		}
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
		for(int i = 0; i < intList.size() ; i++) {
			System.out.printf("%d ", intList.get(i));
			if((i+1)% 10 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
