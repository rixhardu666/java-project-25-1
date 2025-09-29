import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        int[] lotto = new int[6];  // 로또 번호를 저장할 배열
        Random random = new Random();  // 랜덤 객체 생성

        // 로또 번호 생성
        for (int i = 0; i < 6;) {  // i는 0부터 5까지 총 6개의 번호를 생성함
            int num = random.nextInt(45) + 1;  // 1부터 45까지의 랜덤 번호 생성
            boolean isDuplicate = false;  // 중복 체크를 위한 변수

            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {  // 이미 있는 번호라면
                    isDuplicate = true;
                    break;
                }
            }

            // 중복이 아니면 배열에 추가
            if (!isDuplicate) {
                lotto[i] = num;
                i++;  // 다음 번호로 이동
            }
        }

        // 로또 번호 출력
        System.out.println("로또 번호 생성기");
        System.out.print("선택된 번호: ");
        for (int j = 0; j < 6; j++) {
            System.out.print(lotto[j] + " ");
        }
        System.out.println("\n항상 행복만 하세요.");
    }
}



