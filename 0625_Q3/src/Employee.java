public class Employee {
    static int nums = 0;
    static int totalAge = 0;
    static int averAge = 0;

    String name = "";
    int age=0;
    String gen = "남";


    void print(){
        System.out.println("직원의 이름은 "+name+"이고, 나이는 "+age+", 성별은 "+gen+"입니다.");
        System.out.println("회사의 직원 수는 "+nums+", 직원의 평균 나이는 "+averAge+"입니다.");
    }


}
