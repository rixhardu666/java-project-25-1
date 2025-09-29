
public class Prime {

	public static void main(String[] args) {
		int num = 29;
		boolean flag = false;
		for (int i = 2; i < num; ++i) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.print("소수입니다");
		}else {
			System.out.print("소수가 아닙니다");
		}
	}

}
