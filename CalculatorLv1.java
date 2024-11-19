package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {

        // 무한 반복을 수행하기 위해 while 반복문의 조건을 true로 설정
        while (true) {
            // 사용자로부터 콘솔 입력을 받을 수 있도록 Scanner 객체 생성
            Scanner scanner = new Scanner(System.in);

            // 첫 번째 정수 입력 받기 전 안내 문구 출력
            System.out.print("첫 번째 정수 입력(0 포함) : ");
            // 사용자로부터 입력 받은 양의 정수를 firstNumber 변수에 할당
            int firstNumber = scanner.nextInt();

            // 두 번째 정수 입력 받기 전 안내 문구 출력
            System.out.print("두 번째 정수 입력(0 포함) : ");
            // 사용자로부터 입력 받은 양의 정수를 secondNumber 변수에 할당
            int secondNumber = scanner.nextInt();

            // 사칙연산 기호(+, -, *, /) 입력 받기 전 문구
            System.out.println("사칙연산 기호(+, -, *, /) 입력 : ");
            // 사용자로부터 입력 받은 문자열에서 가장 첫 번째 문자(연산 기호)를 operator 변수에 할당
            char operator = scanner.next().charAt(0);

            // 사칙연산의 결과를 저장할 정수형 변수 result 생성
            int result = 0;

            // 입력 받은 양의 정수와 사칙연산 기호를 사용해서 if 조건문을 통해 계산을 수행하고 결과를 result 변수에 저장
            if (operator == '+') {
                result = firstNumber + secondNumber;
            } else if (operator == '-') {
                result = firstNumber - secondNumber;
            } else if (operator == '*') {
                result = firstNumber * secondNumber;
            } else if (operator == '/') {
                // 나눗셈 연산에서 분모에 0이 입력될 경우 오류가 발생하여 내용을 정제하여 출력
                if (secondNumber == 0) {
                    System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = firstNumber / secondNumber;
            } else {
                System.out.println("잘못된 사칙연산 기호입니다. 다시 입력해주세요.");
            }

            // 사칙연산 결과 출력
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);

            // 프로그램 종료 부분에서 바로 넘어가는 문제 해결
            scanner.nextLine();

            // 종료를 물어보는 안내 문구 출력
            System.out.print("프로그램을 종료하시겠습니까? (no-계속 진행 | exit-종료) : ");
            // 사용자로부터 입력 받은 문자열을 answer 변수에 할당
            String answer = scanner.nextLine();

            // if 조건문을 사용해서 프로그램 종료하거나 계속 진행할지 결정
            if (answer.equals("exit")) {
                // 프로그램 종료 안내문 출력
                System.out.println("프로그램을 종료합니다.");
                // break문을 사용해서 반복문을 종료하고 프로그램을 종료
                break;
            }
        }
    }



}
