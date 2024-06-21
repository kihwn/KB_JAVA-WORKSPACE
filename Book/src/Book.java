public class Book {
    public String title;
    public String author;
    public int isbn;

    public void setTitle(String title){

        this.title = title;

    }

    public void setAuthor(String author){
        this.author = author;

    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public void setBook(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }


    public String getTitle(){
        return title;

    }
    public String getAuthor(){
        return author;
    }

    public int getIsbn(){
        return isbn;
    }
    public void displayInformation(){
        System.out.println("책의 제목은 "+title+"입니다.");
        System.out.println("책의 저자는 "+author+"입니다.");
        System.out.println("책의 국제 표준 도서 번호는 "+isbn+"입니다.");
    }
}
