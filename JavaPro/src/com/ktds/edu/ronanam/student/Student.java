package com.ktds.edu.ronanam.student;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	private String name; //getter / setter 이용
	int age;
	int score;
	String food;
	int weight;
	byte check;


	//shift + alt + s -> generate setter / getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		//this: 인스턴스필드의
		if(name.length() == 3){
			this.name = name;
		}else{
			System.out.println("세 글자의 이름 입력하세요.");
		}
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Student() {
		//default constructor
	}

	//instance변수에 대해 setter를 만든다. data 갱신

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
