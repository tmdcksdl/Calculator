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

        // 무한 반복을 수행하기 위해 while 반복문의 조건을 true로 설정
        while (true) {
            // 첫 번째 정수 입력 받기 전 안내 문구 출력
            System.out.print("첫 번째 정수 입력(0 포함) : ");
            // 사용자로부터 입력 받은 양의 정수를 firstNumber 변수에 할당
            int firstNumber = scanner.nextInt();

            // 두 번째 정수 입력 받기 전 안내 문구 출력
            System.out.print("두 번째 정수 입력(0 포함) : ");
            // 사용자로부터 입력 받은 양의 정수를 secondNumber 변수에 할당
            int secondNumber = scanner.nextInt();
            scanner.nextLine();

            // 사칙연산 기호(+, -, *, /) 입력 받기 전 문구
            System.out.print("사칙연산 기호(+, -, *, /) 입력 : ");
            // 사용자로부터 입력 받은 문자열에서 가장 첫 번째 문자(연산 기호)를 operator 변수에 할당
            char operator = scanner.next().charAt(0);

            // 입력 받은 양의 정수와 사칙연산 기호를 사용해서 if 조건문을 통해 계산을 수행하고 결과를 result 변수에 저장
            // operator 메서드를 이용해서 한 문장으로 줄일 수 있다. 코드 가독성을 높이기 위해 사용한다.
            int result = calculatorLv2.operate(firstNumber, secondNumber, operator);

            // 사칙연산 결과 출력
            System.out.println("연산 결과 : " + result);

            // 사칙연산 결과를 저장할지 물어보는 안내 문구 출력
            System.out.println("결과를 저장하시겠습니까?");
            System.out.print("1. 저장 | 2. 패스 : ");
            // 사용자로부터 입력 받은 정수를 answerNumber 변수에 할당
            int answerNumber = scanner.nextInt();

            // if 조건문을 사용해서 결과를 저장할지 패스할지 결정
            // 결과를 저장한 후 큐에 저장되어 있는 값 출력
            if (answerNumber == 1) {
                calculatorLv2.setQueue(result);
                System.out.println(calculatorLv2.getQueue());
            } else {
                System.out.println(calculatorLv2.getQueue());
            }

            // 큐에 저장된 값을 삭제할지 물어보는 안내 문구 출력
            System.out.println("데이터를 삭제하시겠습니까?");
            System.out.print("1. 삭제 | 2. 패스 : ");
            // 사용자로부터 입력 받은 정수를 answerNumber2 변수에 할당
            int answerNumber2 = scanner.nextInt();

            // if 조건문을 사용해서 큐에 저장된 데이터 삭제할지 말지 결정
            // 데이터를 삭제한 후 큐에 저장되어 있는 값 출력
            if (answerNumber2 == 1) {
                calculatorLv2.pollQueue();
                System.out.println(calculatorLv2.getQueue());
            }


            // 프로그램 종료 부분에서 바로 넘어가는 문제 해결
            scanner.nextLine();

            // 종료를 물어보는 안내 문구 출력
            System.out.print("프로그램을 종료하시겠습니까? (no-계속 진행 | exit-종료) : ");
            // 사용자로부터 입력 받은 문자열을 answer 변수에 할당
            String answer = scanner.nextLine();

            // if 조건문을 사용해서 프로그램 종료하거나 계속 진행할지 결정
            if (answer.equals("exit")) {
                // 프로그램 종료 안내문 출력
                System.out.println("프로그램이 종료됩니다.");
                // break문을 사용해서 반복문을 종료하고 프로그램을 종료
                break;
            }
        }
    }
}
