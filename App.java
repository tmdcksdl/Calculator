package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        while (true) {
            // 연산 시작 전에 진행할지, 그만할지 물어보고 진행.
            System.out.print("continue(진행) / exit(종료) : ");
            String exit = scanner.nextLine();

            if (exit.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("첫 번째 정수를 입력해주세요.(0 포함) : ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 정수를 입력해주세요.(0 포함) : ");
            int num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("사칙연산 기호(+, -, *, /)를 입력해주세요. : ");
            char operator = scanner.next().charAt(0);

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(num2)에 0이 입력될 수 없습니다.");
                    continue;
                }

                result = num1 / num2;
            } else {
                System.out.println("잘못된 사칙연산 기호 입니다.");
                continue;
            }

            System.out.println("결과 : " + result);
        }

    }
}
