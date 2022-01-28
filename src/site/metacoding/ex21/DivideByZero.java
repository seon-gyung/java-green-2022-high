package site.metacoding.ex21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // InputMismatchException

        // 통신, 사용자 입력은 예외 처리!

            try {
                int x = sc.nextInt();
                int result = x / 0;
                System.out.println("받은 값 : " + x);
            } catch (InputMismatchException e) {
                System.out.println("====================");
                System.out.println("문자 넣지마!");
                System.out.println("====================");
                e.printStackTrace();
            } catch (ArithmeticException e) {
                System.out.println("====================");
                System.out.println("0 좀 나누지마!");
                System.out.println("====================");
                e.printStackTrace();
            }
            
        }

}
