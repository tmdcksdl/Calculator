package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    // 속성
    private Queue<Integer> queue = new LinkedList<>();

    // 생성자
    Calculator (Queue<Integer> resultQueue) {
        this.queue = resultQueue;
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

    Queue<Integer> getQueue () {
        return queue;
    }

    void setQueue (int result) {
        queue.add(result);
    }
}
