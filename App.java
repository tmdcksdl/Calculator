package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 정수를 입력해주세요.(0 포함) : ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 정수를 입력해주세요.(0 포함) : ");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호(+, -, *, /)를 입력해주세요. : ");
            char operator = scanner.next().charAt(0);
            scanner.nextLine();

            if (num2 == 0 && operator == '/') {
                System.out.println("나눗셈 연산에서 분모(num2)에 0이 입력될 수 없습니다.");
                continue;
            }

            int result = calculator.calculate(num1, num2, operator);

            System.out.println("결과 : " + result);

            // 더 진행할지, 그만할지 물어보기.
            System.out.print("계속 계산하겠습니까?(exit 입력 시 종료됩니다.) : ");
            String exit = scanner.nextLine();

            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
