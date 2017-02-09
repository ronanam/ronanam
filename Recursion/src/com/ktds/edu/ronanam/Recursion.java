package com.ktds.edu.ronanam;

public class Recursion {

	// memory 많이 잡아 먹음 사용 잘 x, 파일시스템 탐색시 / disc 탐색(tree구조 탐색)할 시 사용
	public void call(int index) {
		System.out.println("Recursion.call() 호출 중..." + index);
		if (index > 0)
			call(--index);

		// call(); Exception in thread "main" java.lang.StackOverflowError
		// jvm -> 현재 실행중인 method를 stack에 저장
		// Main.main(); <-
		// -> Recursion.call();
		//
		// Main.main(args);
		// -> Recursion.call()
		// -> Recursion.call()
		// -> Recursion.call()
		// 
		// 계속 하다가 jvm이 빌려온 memory가 꽉차게 되고 그때 stackOverFlow error발생
		// 그렇게 때문에, 한정된 memory를 잘 써야한다!

	}
}
