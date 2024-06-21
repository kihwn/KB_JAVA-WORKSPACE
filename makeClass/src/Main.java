public class Main {
    public static void main(String[] args) {
        TV myTv = new TV();
        myTv.ch = 100;
        myTv.vol = 50;
        myTv.onOff = true;
        System.out.println(myTv);

        TV yourTv = new TV();
        yourTv.ch = 200;
        yourTv.vol = 70;
        yourTv.onOff = false;
        System.out.println(yourTv);

    }
}