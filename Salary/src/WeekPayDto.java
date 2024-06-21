//데이터만 저장한다. 접미어 DTO(Data Transfer Object) 또는 Vo를 붙인다.
//Dto - 디비의 데이터를 읽고 쓰고 할 때는 DTo
//Vo - 디비의 데이터를 읽기만 할 때 (데베의 View와 같은 역할)
//프로젝트 할 때 분위기 봐서 따라하면 된다.

import java.util.Objects;

public class WeekPayDto {


    private String name=""; //변수 선언 시 초기화 가능, 그래서 생성자를 많이 안만든다.
    private int work_time = 0; //일한 시간
    private int per_pay=0; //한 시간 당 계약 금액
    private int total_pay=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPer_pay() {
        return per_pay;
    }

    public void setPer_pay(int per_pay) {
        this.per_pay = per_pay;
    }

    public int getWork_time() {
        return work_time;
    }

    public void setWork_time(int work_time) {
        this.work_time = work_time;
    }

    public void setTotal_pay(int total_pay){
        this.total_pay = total_pay;
    }

    public int getTotal_pay() {
        return getTotal_pay();
    }

    public WeekPayDto(){

    }

    public WeekPayDto(String name, int work_time, int per_pay, int total_pay) {
        this.name = name;
        this.work_time = work_time;
        this.per_pay = per_pay;
    }

    public void calculate(){
        this.total_pay=this.work_time*this.per_pay;
    }

    public void print(){
        System.out.printf("%s\t",this.name);
        System.out.printf("%d\t",this.work_time);
        System.out.printf("%d\t",this.per_pay);
        System.out.printf("%d\n",this.total_pay);
    }
    //아니면 toString()함수를 오버라이딩 해도 된다.
    //검색을 위한 equals 함수와 hashCode 오버라이딩을 한다 (시스템이 둘이 같이 오버라이딩하길 권장함)

    @Override
    public boolean equals(Object o) {
        //비교 대상이 나랑 같으면 바로 true임
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;
        //getClass() : 객체 지향 프로그래밍에서 모든 클래스는 자신이 어떤 멤버변수와 함수를 갖고 있는지 정보를 담는 곳이 있음.
        //getClass()를 통해 이 정보들을 받아올 수 있음.


        WeekPayDto that = (WeekPayDto) o; // 다운캐스팅하여
        return name.equals(that.name);//이름만 비교
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }


    // 1. getter/setter 붙이기
}