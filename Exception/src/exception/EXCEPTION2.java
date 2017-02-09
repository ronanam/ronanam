package exception;

public class EXCEPTION2 {

	public static void main(String[] args) /*throws Exception*/ {
		try {
			convertStringFormatToNumber(null);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("문자를 다시 생성합니다."); //대안
//			try {
//				convertStringFormatToNumber("123456");//대안을 적어주기.
//			} catch (Exception e1) {
//				e1.printStackTrace();
//			} 
		}

	}

	public static void convertStringFormatToNumber(String str) throws Exception {
		if (str == null) {
			throw new Exception("파라미터를 작성해 주세요.");
		}
		int number = Integer.parseInt("Number");
	}
	/**
	 * Exception in thread "main" java.lang.Exception: 파라미터를 작성해 주세요. at
	 * exception.EXCEPTION2.convertStringFormatToNumber(EXCEPTION2.java:12) at
	 * exception.EXCEPTION2.main(EXCEPTION2.java:6)
	 */
	
	
	
}
