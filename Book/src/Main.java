public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.setTitle("어린왕자");
        book1.setAuthor("생텍쥐페리");
        book1.setIsbn(1234);
        book1.displayInformation();

        book2.setBook("사피엔스","유발하라리",0000);

        book2.displayInformation();

    }
}