public class Main {
    static int count=0; //생성자에서 초기화를 하면 안된다.
    int x=0; //인스턴스 변수.

    public Main(){
        count++; //모든 객체가 이 메모리를 공유한다
        x++; //객체마다 새로 만들어진다, 객체마다 만들어지는 변수이다.
    }
    public static void main(String[] args) {
        System.out.println(Main.count); // static 변수는 클래스 변수이므로 클래스 명으로 접근 가능하다.
        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
        Main m4 = new Main();
        System.out.println(m1.x);
        System.out.println(m2.x);
        System.out.println(m3.x);
        System.out.println(m4.x);
        System.out.println(m1.count);
        System.out.println(m2.count);
        System.out.println(m3.count);
        System.out.println(m4.count);

    }
}