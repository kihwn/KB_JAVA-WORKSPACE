class Superman extends Man {
    int sky;

    Superman(String name, int age, int power, int sky){
        super(name, age, power);
        this.sky = sky;
    }

    @Override
    void run(){
        System.out.println(name + "이 하늘을 " + power + "속력으로 " + sky+" 상공을 날고 있습니다.");
    }

    void space(){
        System.out.println(name + "이 하늘을  " + sky+" 상공의 우주를 날고 있습니다.");
    }

    @Override
    public String toString() {
        return "Superman{name='" + name + "', age=" + age + ", power=" + power + ", sky=" + sky + "}";
    }
}
