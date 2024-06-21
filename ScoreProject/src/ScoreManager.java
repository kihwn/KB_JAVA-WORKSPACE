import java.util.Random;
import java.util.Scanner;

public class ScoreManager {
    ScoreDto[]array = new ScoreDto[10];
    int count = 0;


    //10개 저장할 공간 확보
    public ScoreManager(){
        for (int i=0; i<10; i++){
            array[i] = new ScoreDto();
        }
    }

    public void append(String name, int kor, int eng, int mat){
        array[count].setName(name);
        array[count].setKor(kor);
        array[count].setEng(eng);
        array[count].setMat(mat);


    }

    public void output(){
        for (int i=0; i<10; i++){
            array[i].output();
        }
    }

    public void start(){
        System.out.println("1.추가");
        System.out.println("2.목록");
        System.out.println("0.종료");
        System.out.println("선택 : ");
        sel = sc.nextInt();
        switch(sel){
             case 1:
             {
                 appendMain();
                 break; }
            case 2:


        }
    }

    public void appendMain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println("국어 : ");
        int kor = sc.nextInt();
        System.out.println("영어 : ");
        int eng = sc.nextInt();
        System.out.println("수학 : ");
        int mat = sc.nextInt();
        append(name,kor,eng,mat);
        sc.close();
    }
}
