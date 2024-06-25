public class Main {
    public static void main(String[] args) {
        Day day1 = new Day();
        Day day2 = new Day();
        Day day3 = new Day();


        day1.time = 2;
        day1.work = "테니스";
        day1.place = "광진구";
        day1.totalTime +=day1.time;

        day1.print(day1.work,day1.time,day1.place);

        day2.time = 5;
        day2.work = "백준";
        day2.place = "도서관";
        day2.totalTime +=day2.time;
        day2.print(day2.work,day2.time,day2.place);


    }
}