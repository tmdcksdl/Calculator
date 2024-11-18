package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 사용자로부터 콘솔 입력을 받을 수 있도록 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        // 지역 변수
        Queue<Integer> resultQueue = new LinkedList<>();

        // calculatorLv2 생성자를 통해 인스턴스화
        // 객체를 생성할 때 생성자를 통해 resultQueue 전달한다.
        CalculatorLv2 calculatorLv2 = new CalculatorLv2(resultQueue);

        // 첫 번째 정수 입력 받기 전 안내 문구 출력
        System.out.print("첫 번째 정수 입력(0 포함) : ");
        // 사용자로부터 입력 받은 양의 정수를 firstNumber 변수에 할당
        int firstNumber = scanner.nextInt();

        // 두 번째 정수 입력 받기 전 안내 문구 출력
        System.out.print("두 번째 정수 입력(0 포함) : ");
        // 사용자로부터 입력 받은 양의 정수를 secondNumber 변수에 할당
        int secondNumber = scanner.nextInt();

        // 사칙연산 기호(+, -, *, /) 입력 받기 전 문구
        System.out.print("사칙연산 기호(+, -, *, /) 입력 : ");
        // 사용자로부터 입력 받은 문자열에서 가장 첫 번째 문자(연산 기호)를 operator 변수에 할당
        char operator = scanner.next().charAt(0);

        // 입력 받은 양의 정수와 사칙연산 기호를 사용해서 if 조건문을 통해 계산을 수행하고 결과를 result 변수에 저장
        // operator 메서드를 이용해서 한 문장으로 줄일 수 있다. 코드 가독성을 높이기 위해 사용한다.
        int result = calculatorLv2.operate(firstNumber, secondNumber, operator);

        System.out.println("연산 결과 : " + result);
    }
}
