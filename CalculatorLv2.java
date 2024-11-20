package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CalculatorLv2 {

    // 속성 (필드)
    // 클래스 멤버 변수, 선언만 하고 초기화는 하지 않은 상태.
    // 계산기의 사칙연산 결과를 저장하는 queue, 해당 클래스 내에서만 사용 가능. 여러 메서드에 사용 가능.
    private Queue<Integer> queue;

    // 생성자 (조립설명서)
    CalculatorLv2 () {
        this.queue = new LinkedList<>();  // 생성자를 통해 초기화!
    }

    // 메서드
    // 사칙연산을 수행하는 메서드
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

    // 사칙연산 결과를 큐에 저장하게 하는 메서드 -> setter
    public void addQueue (int result) {
        this.queue.add(result);
    }

    // 멤버 변수 큐의 값을 가져올 수 있는 메서드 -> getter
    public Queue<Integer> checkQueue () {
        return this.queue;
    }

    // 큐에 가장 먼저 저장된 데이터 삭제하는 메서드 -> setter
    public void pollQueue () {
        this.queue.poll();
    }
}
