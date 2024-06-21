import java.util.ArrayList;
import java.util.List;

class Person{
    String name;
    int age;
    public Person(){
        name="";
        age=0;
    }
    public Person(String name, int age){
        this.name=name;

    }
}
public class Main {
    public static void main(String[] args) {
        List list = new ArrayList(); // 자바 4일 때의 컬렉션 클래스
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List personList = new ArrayList();
        personList.add(new Person());
        personList.add(new Person("깜꼬",3));


        for (int i = 0; i < personList.size(); i++) {
            Person p1 = (Person)personList.get(i); //get 함수는 object를 타입을 반환하고
            //p1은 person 타입이라 형이 다르다.
        }

        List<Integer> nList = new ArrayList<Integer>();

        nList.add(10);
        // 이것의 문제가 많아 등장한 것이 '제너릭'
        System.out.println(nList.indexOf(30));
        int pos = personList.indexOf(new Person("김우정",2));

        System.out.println(pos+"번 째에 있다");
        System.out.println((new Person("홍길동",0)).hashCode());

    }
}