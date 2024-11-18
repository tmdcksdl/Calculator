package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CalculatorLv2 {

    // 속성 (필드)
    // 클래스 멤버 변수, 선언만 하고 초기화는 하지 않은 상태.
    // 계산기의 사칙연산 결과를 저장하는 queue, 해당 클래스 내에서만 사용 가능. 여러 메서드에 사용 가능.
    private Queue<Integer> queue;

    // 생성자 (조립설명서)
    CalculatorLv2 (Queue<Integer> queue) {
        this.queue = queue;  // 생성자를 통해 초기화! resultQueue가 할당된다.
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