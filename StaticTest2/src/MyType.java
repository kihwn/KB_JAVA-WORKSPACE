//객체를 만들지 않고도 사용이 가능한 클래스

public class MyType {
    //private멤버 생성자를 붙인다. -> 객체를 만드는 순간 에러가 발생한다.
    private MyType(){}
    public static boolean isCapital(char c){
        if (c>='A'&& c<='Z'){
            return true;
        }
        return false;
    }

    public static boolean isLower(char c){
        if (c>='a'&& c<='z'){
            return true;
        }
        return false;
    }
}
