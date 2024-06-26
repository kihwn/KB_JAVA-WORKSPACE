class Man extends Person{
    int power;
    Man(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }
    void run(){
        System.out.println(name+"이 "+power+" 속력으로 달리고있습니다.");
    }

    @Override
    public String toString() {
        return "Man{name='"+name+"', age="+age+", power="+power+"}";
    }
}
