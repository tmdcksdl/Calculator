package calculator;

public class Calculator {

    // 속성

    // 생성자
    Calculator () {

    }
    // 메서드
    int operate (int num1, int num2, String operator) {
        int result = 0;
        if (operator.charAt(0) == '+') {
            result = num1 + num2;
        } else if (operator.charAt(0) == '-') {
            result = num1 - num2;
        } else if (operator.charAt(0) == '*') {
            result = num1 * num2;
        } else if (operator.charAt(0) == '/') {
            if (num2 == 0){
                System.out.println("나눗셈 연산에서 분모(num2)에 0이 입력될 수 없습니다.");
            }

            result = num1 / num2;
        }
        return result;
    }
}
