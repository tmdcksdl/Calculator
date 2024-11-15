package calculator;

import java.util.Scanner;

public class CalculatorLv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력해주세요.(0 포함) : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력해주세요.(0 포함) : ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("사칙연산 기호(+, -, *, /)를 입력해주세요.");
        String operator = scanner.nextLine();

        System.out.println(num1 + " " + num2 + " " + operator);
    }
}
