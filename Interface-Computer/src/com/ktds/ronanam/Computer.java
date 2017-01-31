package com.ktds.ronanam;

/**
 * computer interface 구현 
 * <pre>입력, 계산, 저장</pre>
 * @author ronanam (uigte92@naver.com)
 *
 */
public interface Computer {
//	어차피 추상적인 존재라서, abstract을 skip해도 된다.
//	public abstract void input();
	
//	sub class is a superclass 관계 성립
	public void input();
	public void compute();
	public void save();
//	public void faceTime(); 기존의 구현한 클래스들에 다시 추가를 해줘야 함. 만약 클래스가 300000~~ 많다면 곤란

}
