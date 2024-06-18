import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//클래스를 하나 만들고
class MyArray
{
    private MyArray(){} //생성자가 private 라서 외부에서 객체생성을 못한다.
    //정수 배열을 받아가서 최대값 반환하는 함수
    //매개변수가 =>입력  반환값=>출력, 자바는 반드시 하나만 반환할 수 있다
    //함수는 한번에 하나의 기능만 담당하자.
    //최대값을 가져오고 싶다.
    public static int getMax(int []arr){
        //젤첫번째값이 제일 크다고 가정한다
        int max = arr[0];
        //두번째 값부터 max보다 더 크면 가정이 깨진다. 그래서 그값과  max값을 바꿔치기한다
        for(int i=1; i<arr.length; i++)
        {
            if( max < arr[i])
            {
                //max의값을 바꿔치기를 해야 한다.
                max = arr[i];
            }
        }

        return max;
    }

    //최대값의 인덱스를 가져오고 싶다
    public static int getMaxIndex(int []arr){
        //젤첫번째값이 제일 크다고 가정한다
        int max = arr[0];
        int pos = 0;
        //두번째 값부터 max보다 더 크면 가정이 깨진다. 그래서 그값과  max값을 바꿔치기한다
        for(int i=1; i<arr.length; i++)
        {
            if( max < arr[i])
            {
                //max의값을 바꿔치기를 해야 한다.
                max = arr[i];
                pos = i;
            }
        }

        return pos;
    }

    //ArrayList =>배열과 링크드리스트
    public static int find(ArrayList<Integer> list, int key)
    {
        //반환값이 int 의 경우, 배열의 인덱스라고 생각해서 -1이 오류값
        for(int i=0; i<list.size(); i++)
        {
            if( list.get(i) == key)
                return i; // 찾았으면 위치값 반환, 함수는 종료한다
        }
        return -1;
    }

    public static List<Integer> getUniqueList(int []arr)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(find(result, arr[i])==-1) //존재안함
                result.add(arr[i]);
        }
        return result;
    }

}

public class Main {
    public static void main(String[] args) {
        //배열 1.컴퓨터 실행시간에 메모리 변화가 없다.
        // 수행도중에 메모리를 바꾸면 안된다.  => 자바는 배열을 참조의 영역으로 보냈음
        // 자바는 수행도중에 메모리를 확보한다.
        // 2. 인덱스로 접근한다. 중간에 메모리 크기를 바꾸지는 못한다. (자바)
        int []a = new int[5];
        //heap공간에 정수값 저장할 공간 5개를 확보하고 첫시작 번지를 전달한다.
        //만일 힙공간이 부족하면 null을 준다]
        //방번호는 언제나 0 부터 배열의 크기-1까지 만든다
        // a = 100; 100번지의 메모리를 니 마음대로 해도 돼 - 위험, 절대 안된다.
        a[0] = 10;  //무조건 인덱스를 통해야 한다
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        //자바는 아예 초기값을 넣을 경우에는 new int[5]{21,3,4,54,5} = error남
        a = new int[]{91, 25, 18,100,16,78,57,38, 8, 18, 20, 62, 15,16, 47,3,71,51, 82, 98};
        //기본타입 => 참조타입
        //숫자배열
        //System.out.println(Arrays.stream(a).max());
        // %d - decimal(정수) %f실수 %s 문자열 %o 8진수 %x - 16 진수
        // %4d - 앞의 숫자 4는 전체 자리수 그리고 오른쪽으로 부터 채워온다
        // %7.2f - 전체자릿수 7, 소수점이하 자릿수 2 인 경우
        // Arrays.sort(a);
//        for(int i=0; i<a.length; i++)
//        {
//            System.out.printf("%4d", a[i]);
//        }
//        System.out.println();
//        length가 5이면 방은 0부터 시작한다. 0,1,2,3,4
        System.out.printf("maximum %d\n", a[a.length-1]);

        System.out.printf("maximum %d\n", MyArray.getMax(a));
        System.out.printf("maximum Index %d\n", MyArray.getMaxIndex(a));

        //Generic -> 자바 5부터 추가
        //List<저장할데이터타입>
        //List - 추상클래스
        //ArrayList - 클래스
        List<Integer> list = new ArrayList<Integer>();
        list.add(90);
        list.add(80);
        list.add(70);
        list.add(7);

        //list.size(); 데이터 개수를 전달한다
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        list = MyArray.getUniqueList(a);
        for(int i=0; i<list.size(); i++)
        {
            System.out.printf("%4d", list.get(i));
        }
        System.out.println();
        System.out.println("개수 : " + list.size());



        int r = (int)(Math.random()*10)+1;
        System.out.println(r);
    }
}




















