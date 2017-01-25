package com.ktds.edu.ronanam;

import com.ktds.edu.ronanam.student.Student;
import com.ktds.edu.ronanam.teacher.Teacher;

public class Main {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		Student student = new Student();
		
		teacher.teach("Oracle Database",student);
//		The method teach(String) in the type Teacher is not applicable for the arguments (String, Student)
//		student.study("Oracle Database");
	}

}
