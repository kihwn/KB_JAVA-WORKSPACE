import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //입력 클래스 Scanner -> java 6부터
        //System.in -> 표준 입력 장치 (현재 키보드임)
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        System.out.print("y = ");
        int y = sc.nextInt();

        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x,y,x*y);
    }
}