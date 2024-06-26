public class SupermanUse {
    public static void main(String[] args) {
        Superman superman = new Superman("뇽뇽", 5,100,1000);
        System.out.println(superman.toString());

        superman.eat();
        superman.run();
        superman.space();
    }
}
