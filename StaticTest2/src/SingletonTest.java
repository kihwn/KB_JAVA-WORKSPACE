public class SingletonTest {
    //1) private인 생성자가 필요하다
    private SingletonTest(){} //외부로부터 객체 만드는 거 방해목적

    //2) static 멤버 변수 - 생성된 객체 주소를 저장해야 한다.
    private static SingletonTest instance = null;

    //3) static 멤버 함수 - 생성된 개체를 외부로 전달한다
    public static SingletonTest getInstance(){
        if(instance == null){
            instance = new SingletonTest();
        }
        return instance;
    }

    public int[]x = {1,2,3,4,5};


}
