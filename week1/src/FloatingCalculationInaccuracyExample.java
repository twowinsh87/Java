
/**
 * 실수타입 부정확 계산
 */
public class FloatingCalculationInaccuracyExample {
    public static void main(String[] args) {
        int pizza = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result = pizza - number* pieceUnit;
        System.out.println(result);


        /*
        int pizza = 1;
        int totalPiece = pizza * 10;
        int number = 7;
        int temp = totalPiece - number;

        double result = temp / 10.0;

        System.out.println(result);
         */
    }
}
