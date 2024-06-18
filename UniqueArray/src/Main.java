import java.util.ArrayList;

public class Main {
    public static int find(ArrayList<Integer>arr, int limit, int key){
        //반환 값이 int의 경우, 배열의 인덱스라고 생각해서 -1이 오류값

        for (int i=0; i<limit; i++){
            if(arr.get(i)==key){
                return i; // 찾았으면 위치 값 반환, 함수는 종료된다.
            }
        }
        return -1;

    }

    public static int[]getArr(int[]arr){
        ArrayList<Integer>result = new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            if (find(result, arr[i],i)==-1)
                result.add(arr[i]);
        }
        return arr;
    }

    public static void printArr (int[]arr){
        for (int i=0; i<arr.length; i++){
            if (arr[i]!=-1){System.out.println(arr[i]);}

        }
    }

    public static void main(String[] args) {

        list = UniqueArraay.getUniqueList

    }
}
