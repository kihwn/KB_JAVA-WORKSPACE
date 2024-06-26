public class MyArray {
    int []buffer;
    //객체지향 배열
    //기본생성자
    public MyArray() {                 //MyArray a = new MyArray();
        buffer = new int[10];
    }

    public MyArray(int size) { //MyArray a = new MyArray(20);
        if( size<10)
            size=10;
        buffer = new int[size];
    }

    public MyArray(int size, int initvalue) {  //MyArray a = new MyArray(20, 5);
        if( size<10)
            size=10;
        buffer = new int[size];
        for(int i=0; i<size; i++)   buffer[i]=initvalue;
    }

    public int get(int i){
        if(i<0 || i>=buffer.length)
            return -1;
        else
            return buffer[i];
    }

    public void set(int i, int value) {
        if(i<0 || i>=buffer.length)
            return;

        buffer[i]=value;
    }

    public int size(){
        return buffer.length;
    }
}







