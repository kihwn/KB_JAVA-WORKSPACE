public class Main {
    public static void main(String[] args) {
        /* String, StringBuilder ,StringBuffer
        String 클래스는 데이터가 딱 필요한 만큼만 메모리를 확보한다.
        String s1 = "a", s1 = "a" + "b"
        */

        String s1="";
        long startTime = System.currentTimeMillis();
        int k=0;
        for (int i=0; i<=300000; i++){
            s1+=(char)('A'+k);
            if (k>=25)
                k=0;
            else
                k++;
        }

        System.out.println(s1);
        long endTime = System.currentTimeMillis();
        System.out.printf("걸린 시간: %d\n",endTime-startTime);
    }
}