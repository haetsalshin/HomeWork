package com.biz.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImplV1 implements BookService {

	public List<BookVO> bookList;
	public Scanner scan;
	
	public BookServiceImplV1() {
		bookList = new ArrayList<BookVO>();
	}
	public boolean input() {
		scan = new Scanner(System.in);
		BookVO bookVO = new BookVO();
		
		System.out.print("도서코드 (입력종료 : END) >>");
		
		
		String strCode = scan.nextLine();
		if(strCode.equals("END")) {
			return false;
		}
		
		try {
			strCode = String.format("%05d", Integer.valueOf(strCode));
			if(Integer.valueOf(strCode) > 99999) {
				System.out.println("도서코드는 1~99999까지만 가능합니다.");
				System.out.println("다시 입력해주세요");
				return true;
			}
			bookVO.setBookCode(strCode);
		} catch (Exception e) {
			System.out.println("도서코드는 정수 다섯자리 이내 값만 가능합니다.");
			System.out.println("다시 입력해주세요");
			return true;
		}
		
		
		System.out.print("도서명 (입력종료 : END) >>");
		
		
		String strName = scan.nextLine();
		
		if(strName.equals("END")) {
			return false;
		}
		
		if(strName.isEmpty()) {
			System.out.println("도서명은 반드시 입력해야 합니다.");
			System.out.println("다시 입력해주세요");
			return true;
		}else {
			bookVO.setBookName(strName);
		}
		
		bookList.add(bookVO);
		
		
		return true;
	}
	@Override
	public void selectAll() {

		
		
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("도서 목록표");
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		BookVO bookVO = new BookVO();
		for(BookVO vo: bookList) {
			
			System.out.printf("도서코드 : %s\n", vo.getBookCode());
			System.out.printf("도서명 : %s\n", vo.getBookName());
		}
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		
	}
	
	

}
