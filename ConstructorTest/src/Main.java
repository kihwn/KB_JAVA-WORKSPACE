//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        MyArray a1 = new MyArray();
//        for(int i=0; i<a1.buffer.length; i++)
//        {
//            System.out.println(a1.buffer[i]);
//        }
        for(int i=0; i<a1.size(); i++)
        {
            System.out.println(a1.get(i));
        }
    }
}



