package com.biz.homework.exec;

import com.biz.homework.service.StudentService;
import com.biz.homework.service.StudentServiceImplV1;

public class StudentEx_01 {
	
	public static void main(String[] args) {
		
		StudentService studentService = new StudentServiceImplV1();
		studentService.loadInfo();
		
		while(true) {
			if(!studentService.input()) {
				
				
				break;
			}
		}
		studentService.list();
		studentService.saveInfo();
	}

}
