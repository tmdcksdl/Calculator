package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
    }
}
