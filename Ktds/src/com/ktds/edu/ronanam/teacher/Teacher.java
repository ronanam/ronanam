package com.ktds.edu.ronanam.teacher;

import com.ktds.edu.ronanam.student.Student;

public class Teacher {

	public void teach(String subject, Student student){
		System.out.printf("%s를 가르칩니다.\n",subject);
		student.study(subject);
	}
}
