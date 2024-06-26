import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Parent(10,20,30);

        System.out.println("----- child 생성 ------");
        Child c1 = new Child();
        Child c2 = new Child(4);
        Child c3 = new Child(1,2,3,4);

        p1.output();

        /*업캐스팅은 자식 타입이 부모 타입으로 올라가면서 형전환이 된다.
        이 때 부모 타입 변수는 자식 타입 객체의 부모 영역만을 보고 있다.
        언제나 접근 가능하다.
        다운 캐스팅은 부모 타입이 자식 타입으로 내려가면서 형전환이 되는 경우인데
        원칙이 불가능. 그러나 원상 복구(자식 -> 부모 -> 자식)일 경우에만 강제 형전환을 허용한다.
        대표적인 예
        boolean equals(Object ab) 함수 오버라이딩시 발생
        제너릭 이전에 List list = new ArrayList();
        list.add(객체) ㅁdd가 업캐스팅을 한다.
        Object ab= list.get(0); 이 때가 다운 캐스팅이 필요하다.
        */

        List list = new ArrayList();
        list.add(new Child(1,1,1,1));
        list.add(new Child(2,2,2,2));
        list.add(new Child(3,3,3,3));
        list.add(new Child(4,4,4,4));

        for (int i=0; i<list.size(); i++) {
            Child temp = (Child)list.get(i);
            temp.output();;
        }


    }
}