import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int maxNumber = 100;
		int randomNumber = random.nextInt(maxNumber)+1;
		
		while(true) {
			System.out.println("1부터 " + maxNumber + "까지의 숫자 중 하나를 선택하세요: ");
			int userNumber = scanner.nextInt();
			if (userNumber == randomNumber) {
				System.out.println("숫자를 맞추었습니다");
				break;
			}else if (userNumber > randomNumber) {
				System.out.println("입력한 숫자가 큽니다");
			}else {
				System.out.println("입력한 숫자가 작습니다");
			}
			
		}
	}

}
