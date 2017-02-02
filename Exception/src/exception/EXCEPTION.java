package exception;

public class EXCEPTION {

	public static void main(String[] args) throws Exception { //JVM으로 바로가기 때문에 그냥 오류 발생
		//상속을 받더라도 JVM이 따로 처리한다. 런타임, Exception이 처리하는 방법이 다르다.
		//나중에 확인할 것 임.
		// //대안이 있을 때 try/catch문을 쓴다.
		// try {
		// int converterNumber = Integer.parseInt("NUMBER");
		// } catch (Exception e) {
		// //No exception of type Exception can be thrown; an exception type
		// must be a subclass of Throwable
		// //이유: Exception이라는 class가 존재하기 때문에, 내가 만든 클래스 이름을 EXCEPTION이라고 명시해야함.
		// System.out.println(e.getMessage()+"\n정상종료.");
		// //For input string: "NUMBER"
		// }

		convertStringToNumber(); // 틀린 예제.
		//2. try/catch문 or throws Exception으로 던질 수 있음.

	}


	public static void convertStringToNumber() throws Exception{
		int convertNumber = Integer.parseInt("NUMBER"); 
		//1.여기서 발생 된 error가 처리가되지않고 그대로 trhows됨.
		//Java의 error는 위에서부터 아래로 읽으면 됨.
		//at exception.EXCEPTION.convertStringToNumber(EXCEPTION.java:26)
		//numberFormatException은 RunTimeException의 일종. 따라서 throws x 적어봤자 try/catch를 권고도하지 않기 때문에
//		적을 필요가 없다.-> Exception할 때 하는 것.
		//그래서 throws NumberFormatException을 하면 x throws Exception o
		
		
		
	}

}
