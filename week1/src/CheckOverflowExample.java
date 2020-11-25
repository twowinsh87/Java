
/**
 * 산술연산 전에 오버플로우를 탐지
 */
public class CheckOverflowExample {
    public static void main(String[] args) {

        try {
            //예외발생
            int result = safeAdd(2000000000, 2000000000);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("스택 오버플로우 발생 exception msg: " + e);
        }
    }

    public static int safeAdd(int left, int right) {
        if ((right > 0)) {
            if (left > (Integer.MAX_VALUE - right)) {
                //error 처리
                throw new ArithmeticException("오버플로 발생");
            }
        } else { // right <= 0
            if (left < (Integer.MIN_VALUE-right)) {
                throw new ArithmeticException("오버플로 발생");
            }
        }
        return left + right;
    }
}
