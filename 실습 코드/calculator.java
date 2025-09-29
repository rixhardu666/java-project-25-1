//3번 계산기
import java.util.*;

public class calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연산 입력 : ");
		char op = sc.next().charAt(0);
		
		System.out.println("피연산자 두 개를 입력하세요:");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if (op == '+') {
			System.out.println(num1 +  " + " + num2 + " = " + (num1+num2));
		}else if( op == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}else if(op == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
		}else if(op == '/') {
			if(num2 == 0) {
				System.out.println("나눌 수 없습니다.");
			}else
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
		}
	}
}