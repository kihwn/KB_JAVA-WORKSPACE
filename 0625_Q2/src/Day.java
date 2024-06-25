public class Day {
    static int totalTime=0;
    String work = "";
    int time = 0;
    String place = "";

    void print(String work, int time, String place){
        System.out.println(work+"를 "+time+" 시간 동안 "+place+"에서 했다.");
        System.out.println("총 시간은 "+totalTime+"입니다");
    }

}


