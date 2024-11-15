package calculator;

import java.util.ArrayList;

public class Calculator {

    // 속성
    ArrayList<Integer> resultList = new ArrayList<Integer>();

    // 생성자
    Calculator () {

    }
    // 메서드
    public int calculate (int num1, int num2, char operator) {
        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            result = num1 / num2;
        } else {
            System.out.println("잘못된 사칙연산 기호입니다.");
        }
        return result;
    }
}
