public class Child extends Parent {
    int aa;

    public Child(){
        super();//부모의 디폴트 생성자를 강제로 호출중이다.
                //우리가 코딩을 하지 않아도 시스템이 자동으로 인식한다.
        System.out.println("child default constructor");
    }

    public Child(int aa){
        super();
        this.aa = aa;
        System.out.println("child parameter 1 constructor");
    }

    public Child(int x, int y, int z, int aa){
        super(x, y, z); //부모 생성자를 선택해서 생성할 수 있다.
        this.aa=aa;
        System.out.println("child parameter 4 constructor");
    }

    @Override
    public void output() {
        System.out.println("x = "+this.getX());
        System.out.println("y = "+this.getY());
        System.out.println("z = "+this.getZ());
        System.out.println("aa = "+this.aa);
    }
}
