package com.biz.homework;

public class BookEx_01 {
	
	
	
	public static void main(String[] args) {
		
		BookService bookService = new BookServiceImplV1();
		
		while(true){
			if(!bookService.input()) {
				bookService.selectAll();
				break;
			}
		}
		
		
	}

}
