package Exception;

public class NegativeNumException extends Exception {
	public NegativeNumException(int num) {
		System.out.println("잘못된 수를 입력하였습니다. 다시 입력해주세요.");
	}
}