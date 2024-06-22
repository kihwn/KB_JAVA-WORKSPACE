import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiaryDto {

    private String id="";
    private String pw="";
    private int date=0;
    private String title="";
    private String content="";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public DiaryDto(String id, String pw, int date, String title, String content) {
        this.id = id;
        this.pw = pw;
        this.date = date;
        this.title = title;
        this.content = content;
    }

    public boolean login(List<User>users,String id, String pw){
        for (User user:users){
            if (user.getId().equals(id)&&user.getPw().equals(pw)){
                return true;
            }
        }
        return false;

    }

    public void writeDiary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("날짜를 입력하세요 (ex.20240621)");
        this.date = scanner.nextInt();

        System.out.println("제목을 입력하세요: ");
        this.title = scanner.nextLine();

        System.out.println("내용을 입력하세요: ");
        this.content = scanner.nextLine();
    }

}
