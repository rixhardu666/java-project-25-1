//5번 선형 보간법 활용하여 그림 그리기
import java.util.Scanner;

public class drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("그림 그리기 프로그램");

        // 프로그램은 종료될 때까지 반복
        while (true) {
            // 메뉴 출력
            System.out.println("1. 직선 그리기");
            System.out.println("2. 정사각형 그리기");
            System.out.print("원하는 그림을 선택하세요(1-2, 종료 0) : ");
            int userInput = sc.nextInt();

            // 종료 옵션 선택 시 프로그램 종료
            if (userInput == 0) {
                System.out.println("프로그램을 종료합니다. 언제나 행복하세요.");
                break;
            }

            // 직선 그리기 선택
            if (userInput == 1) {
                System.out.println("첫 번째 점의 좌표 (x, y): ");
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                System.out.println("두 번째 점의 좌표 (x, y): ");
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();

                // 직선 그리기 함수 호출
                drawLine(x1, y1, x2, y2);
            } 
            // 정사각형 그리기 선택
            else if (userInput == 2) {
                System.out.println("첫 번째 점의 좌표 (x, y): ");
                int x1 = sc.nextInt();
                int y1 = sc.nextInt();

                System.out.println("두 번째 점의 좌표 (x, y): ");
                int x2 = sc.nextInt();
                int y2 = sc.nextInt();

                // 정사각형 그리기 함수 호출
                drawSquare(x1, y1, x2, y2);
            } 
            // 잘못된 입력 처리
            else {
                System.out.println("입력은 1 혹은 2, 종료는 0을 선택하세요.");
            }
        }//유저 선택 while문 끝
    }//메인문 끝

    // 직선 그리기 함수
    public static void drawLine(int x1, int y1, int x2, int y2) {
        // 5x5 필드 초기화
        int[][] field = new int[5][5];

        // x, y 차이 계산
        int dx = Math.abs(x2 - x1); // absolute value 절댓값 계산
        int dy = Math.abs(y2 - y1);
        
        // 더 긴 축을 기준으로 steps 계산
        int steps = Math.max(dx, dy);

        // 선형 보간법으로 각 점 계산
        for (int i = 0; i <= steps; i++) {
            int x = Math.round(x1 + (x2 - x1) * i / (float) steps); // round: 버리거나 올리기
            int y = Math.round(y1 + (y2 - y1) * i / (float) steps);

            // 필드 범위를 벗어나지 않게 처리
            if (x >= 0 && x < 5 && y >= 0 && y < 5) {
                field[y][x] = 1;  // 직선상의 점은 *으로 표시
            }
        }

        // 결과 출력
        printField(field);
    }

    // 정사각형 그리기 함수
    public static void drawSquare(int x1, int y1, int x2, int y2) {
        // 5x5 필드 초기화
        int[][] field = new int[5][5];

        // 정사각형을 그리기 위해 각 점을 다루기
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                // 필드 범위를 벗어나지 않게 처리
                if (i >= 0 && i < 5 && j >= 0 && j < 5) {
                    field[j][i] = 1;  // 정사각형의 점은 *으로 표시
                }
            }
        }// 정사각형 처리 for 문 끝

        // 결과 출력
        printField(field);
    }//정사각형 그리기 함수 끝

    // 5x5 필드 출력 함수
    public static void printField(int[][] field) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (field[i][j] == 1) {
                    System.out.print("*");  // * 출력
                } else {
                    System.out.print("_");  // _ 출력
                }
            }
            System.out.println();  // 한 줄이 끝날 때마다 줄 바꿈
        }//필드 출력 for 문 끝
    }//printField 함수 끝
}

