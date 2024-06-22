import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("abc", "1234"));
        users.add(new User("def", "5678"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디를 입력하세요: ");
        String id = scanner.nextLine();

        System.out.println("패스워드를 입력하세요: ");
        String pw = scanner.nextLine();

        DiaryDto diary = new DiaryDto(id, pw, 0, "", "");

        if (diary.login(users, id, pw)) {
            System.out.println("로그인되었습니다");
            diary.writeDiary();
            System.out.println("일기 기록:");
            System.out.println("날짜: " + diary.getDate());
            System.out.println("제목: " + diary.getTitle());
            System.out.println("내용: " + diary.getContent());
        } else {
            System.out.println("로그인 실패");
        }

        scanner.close();
    }
}




