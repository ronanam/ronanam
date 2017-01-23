package com.ktds.edu.ronanam.student;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	int score;
	String food;
	int weight;
	byte check;
	
	public Student(String name, int age, int score, String food, int weight) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.food = food;
		this.weight = weight;
		
		start();
	}
	
	private void start() {
		System.out.println("1. 학생 보기 / 2. 공부하기 / 3. 놀기 / 4. 먹기 / 5. 프로그램 종료");
		check = sc.nextByte();	
		switch (check) {
		case 1: viewStudents(); break;
		case 2: studying(); break;
		case 3: playing(); break;
		case 4: eating(); break;
		case 5: System.out.println("!!!프로그램 종료!!!"); System.exit(-1); break;
		}
		
	}

	public void viewStudents(){
		System.out.printf("이름: %s\n나이: %d\n",name, age);
	}
	
	public void studying(){
		System.out.printf("%s 학생의 현재 점수는 %d점입니다.\n",name,score);
		System.out.println("=================공부 중=================");
		score += 10;
		System.out.printf("%s 학생의 점수가 10점 만큼 올라서 현재 %d점입니다.",name, score);
	}
	
	public void playing(){
		System.out.printf("%s 학생의 현재 점수: %d점 / 몸무게: %dkg입니다.\n",name,score,weight);
		System.out.println("=================노는 중=================");
		score -= 10;
		System.out.printf("%s 학생의 점수와 몸무게가 10점씩 감소해 현재 점수: %d / 몸무게: %dkg 입니다."
				,name, score,weight);
		
	}
	
	public void eating(){
		System.out.printf("%s 학생의 현재 몸무게는 %dkg입니다.");
		System.out.printf("=================%s를 먹는 중=================",food);
		weight += 10;
		System.out.printf("%s 학생의 몸무게는 10증가로 %dkg입니다.",weight);
		
	}

}
