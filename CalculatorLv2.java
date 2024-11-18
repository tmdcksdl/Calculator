package calculator;

public class CalculatorLv2 {

    // 속성(필드)


    // 생성자
    CalculatorLv2 () {

    }

    // 메서드
    public int operate (int firstNumber, int secondNumber, char operator) {
        int result = 0;

        switch (operator) {
            case '+' :
                result = firstNumber + secondNumber;
                break;
            case '-' :
                result = firstNumber - secondNumber;
                break;
            case '*' :
                result = firstNumber * secondNumber;
                break;
            case '/' :
                result = firstNumber / secondNumber;
                break;
            default :
                System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
        }
        return result;
    }
}
