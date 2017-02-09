package com.ktds.ronanam;

import com.ktds.ronanam.exceptions.MissingValueException;
import com.ktds.ronanam.exceptions.MissmatchValueException;

public class Student {

	//어떤 data가 넘어올지 모르기 때문에 앱이 죽지 않도록 예외처리 해주는 것임.
	public void start() throws MissingValueException {
		// //멀티캐치: 동시에 예외를 잡아내겠다. (1.8)
		// try {
		// registNewStudent();
		// } catch (MissmatchValueException | MissingValueException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// (1.6이하)
//		try {
//			registNewStudent();
//		} catch (MissmatchValueException e) {
//			e.printStackTrace();
//		} finally{
//			//try, catch가 끝나면 여기로 오게 되어 있다.
//			//즉, 마무리작업을 써주면 된다.
//			System.out.println("잘 처리 되었습니다.");
//		}
		
		//예외가 던져지기 전에 이것만큼은 해주고 던져줘~!
		try {
			registNewStudent();
		} finally{
			//try, catch가 끝나면 여기로 오게 되어 있다.
			//즉, 마무리작업을 써주면 된다.
			System.out.println("잘 처리 되었습니다.");
		}
//		} catch (MissingValueException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		/*
		 * e.printStackTrace()가 실행 시킨 것. 프로그램이 죽은게 아니야.
		 * com.ktds.ronanam.exceptions.MissingValueException: 이름은 필수 입력값 입니다. at
		 * com.ktds.ronanam.Student.registNewStudent(Student.java:37) at
		 * com.ktds.ronanam.Student.start(Student.java:19) at
		 * com.ktds.ronanam.Student.main(Student.java:61) 정상적으로 수행되었습니다.
		 */
		//디버그해서 보는게 좋은 방법. e.printStackTrace() 사용 x
		System.out.println("정상적으로 수행되었습니다.");

	}

	public void registNewStudent() throws MissingValueException{
//		String name = null;
		String name = "";
		// String school = "ktds";
		String school = "송규동";
	
		if (name == null) {
			throw new MissingValueException("이름은 필수 입력값 입니다.");
			// 내가 던진 코드를 여기서 try/catch로 처리해 주는건 바보 짓.
			/*
			 * Exception in thread "main"
			 * com.ktds.ronanam.exceptions.MissingValueException: 이름은 필수 입력값
			 * 입니다. at com.ktds.ronanam.Student.main(Student.java:13)
			 */

			// System.out.println("name은 필수 입력값 입니다.");
		} // throws되는 순간 밑의 코드는 dead code임. JVM에게 보고해버리고 죽음.
		
		//thorws하지 않아도 아무 오류 x : RuntimeException이기 때문에~
		if (!school.equals("ktds")) {
			throw new MissmatchValueException("학교 이름이 잘못 되었습니다.");
		}//근데 이렇게 되어 버리면 아무데서도 해결하지 못하고 JVM으로 가버려서 프로그램이 죽어버린다. 그러면 x
		//꼭 try/catch문 걸어주면 된다.

		// } else {
		// System.out.println(name);
		// System.out.println(school);
		// }
		// 런타임이라서 빨간줄이 나오지 않음. 빨간줄이 나오면 Exception임(throws를 않하면 전달을 못해서 던지는 쪽에서 꼭
		// 써줘야함.)
		// 런타임은 throws를 써주지 않아도 JVM으로 흘러간다. 그래서 쓸 필요 x

	}

	
	public static void main(String[] args) /*throws MissingValueException*/ { // MissingValueException으로
																			// 던져준다.
		//throws MissingValueException 메인에서 throws해주는건 사실상 의미가 x
//		그전에 try/catch로 다 막아줘야함.
		try {
			new Student().start();
		} catch (MissingValueException e) {
			//missingValue로 잡고 -> runtime으로 묶어서 다시 던짐.
			throw new RuntimeException(e.getMessage(),e); //catch로 잡은 것을 한번 더 래핑해서 던짐. 웹에서만 쓰는 기술 "래핑"
		}

		// registNewStudent -> start -> main 으로 throws
	}
}
