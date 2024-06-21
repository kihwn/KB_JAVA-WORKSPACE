import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeekPayManager {
    List<WeekPayDto> list = new ArrayList<WeekPayDto>();
    Scanner sc = new Scanner(System.in);

    public void menuDisplay(){
        System.out.println("1. 출력");
        System.out.println("2. 입력");
        System.out.println("3. 검색");
        System.out.println("4. 주급전체 금액 구하기");
        System.out.println("0. 종료");
    }
    //데이터 추가 함수
    void append(){
        System.out.println("이름 : ");
        WeekPayDto dto = new WeekPayDto(); //객체에 대한 주소값만 갖고 있음. 함수가 끝나면 사라짐.
        //따라서 해당 객체는 함수가 끝나면 사라짐.
        dto.setName(sc.next());

        System.out.println("근무시간 : ");
        dto.setWork_time(sc.nextInt());

        System.out.println("시간당 급여 : ");
        dto.setPer_pay(sc.nextInt());

        dto.calculate();
        list.add(dto); //참조를 list가 갖고 있어서 이후에 함수가 끝나도 제거 되지 않는다.
    }

    void output(){
        //Iterable 클래스는 다 이렇게 접근 가능하다.
        /*
            for (변수명 : 이터러블 클래스) {} 이터러블 클래스로부터 하나씩 가져온다.
            readonly
         */
        for (WeekPayDto dto : list){
            dto.print();
        }

    }

    public void start(){
        while(true) {
            menuDisplay();
            System.out.print("선택 : ");
            int sel = sc.nextInt();
            switch (sel) {
                case 1:output();break;
                case 2:append();break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("쫌!");
            }

        }
    }
}
