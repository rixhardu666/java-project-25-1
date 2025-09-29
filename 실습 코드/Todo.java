import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 사용자 입력을 받기 위한 스캐너 객체 생성
        ArrayList<String> tasks = new ArrayList<>();  // 할 일 목록을 저장할 리스트
        ArrayList<Boolean> isDone = new ArrayList<>(); // 완료 여부를 저장할 리스트

        while (true) {
            // 메뉴 출력
            System.out.println("1. 할 일 추가");
            System.out.println("2. 완료한 항목 체크");
            System.out.println("3. 목록 보기");
            System.out.println("4. 종료");
            System.out.print("메뉴를 선택하세요: ");
            
            int userInput = sc.nextInt();    // 메뉴 번호 입력 받음
            sc.nextLine();  // 개행 문자 제거, 교수님 공지사항 내용

            if (userInput == 1) {  // 할 일 추가
                System.out.print("할 일을 입력하세요: ");
                String task = sc.nextLine();  // 할 일 내용 입력
                tasks.add(task);              // 할 일 목록에 추가
                isDone.add(false);            // 처음에는 완료되지 않은 상태로 추가
                System.out.println("할 일이 추가되었습니다!");

            } else if (userInput == 2) {  // 완료한 항목 체크
                if (tasks.isEmpty()) {
                    System.out.println("등록된 할 일이 없습니다!");
                    continue;
                }

                System.out.println("완료할 항목의 번호를 입력하세요:");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.printf("%d. %s [%s]\n", i + 1, tasks.get(i), isDone.get(i) ? "완료" : "미완료");
                }

                int index = sc.nextInt() - 1;  // 번호를 입력받아 인덱스로 변환
                sc.nextLine();  // 개행 문자 제거

                // 입력한 번호가 범위 안에 있는지 확인하고, 완료되지 않은 경우만 체크
                if (index >= 0 && index < tasks.size() && !isDone.get(index)) {
                    isDone.set(index, true);  // 완료 상태로 변경
                    System.out.println("선택한 항목이 완료 처리되었습니다!");
                } else {
                    System.out.println("잘못된 번호이거나 이미 완료된 항목입니다.");
                }

            } else if (userInput == 3) {  // 목록 보기
                if (tasks.isEmpty()) {
                    System.out.println("할 일이 없습니다!");
                } else {
                    System.out.println("할 일 목록");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.printf("%d. %s [%s]\n", i + 1, tasks.get(i), isDone.get(i) ? "완료" : "미완료");
                    }
                }

            } else if (userInput == 4) {  // 종료
                System.out.println("프로그램을 종료합니다. 늘 행복만 하세요.");
                break;

            } else {  // 잘못된 입력 처리
                System.out.println("잘못된 입력입니다. 1-4사이 정수를 입력하세요.");
            }
        }
    }
}
