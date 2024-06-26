public class Person {
    String name ="";
    int age=0;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void eat(){
        System.out.println("냠냠 맛있다. ");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}


