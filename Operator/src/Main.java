public class Main {
    public static void main(String[] args) {
        // static - 개체 생성 여부와 상관 없이 메모리를 확보한다.
        // 클래스는 객체를 안 만들면 메모리가 없음 . 예외 static을 붙이면 이건 메모리가 확보된다.
        // 자바는 모든 코드가 반드시 클래스 내부에 존재해야 한다.
        System.out.println("Hello");

        int a,b;

        a = 5;
        b = ++a;

        System.out.printf("a=%d,  b=%d\n",a,b);

        //가급적 증감연산자는 단독으로 사용하자
        // 형전환 - casting(자동형전환, 강제형전환)

        byte b1 = 8;
        a = b1;
        System.out.printf("a=%d, b1=%d \n",a,b1);

        b1 = (byte)a; //큰 걸 작은 것에 넣어서 계산
        System.out.printf( "a=%d, b1=%d \n",a,b1);

        a =(int)(4.5+ 6 - 8); // double + int + int   =>  double로 바뀌어서 연산을 수행한다.
    }
}
