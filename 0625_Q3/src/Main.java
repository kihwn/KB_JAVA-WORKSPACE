public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "깜꼬";
        employee1.age = 3;
        employee1.nums++;
        employee1.totalAge += employee1.age;
        employee1.averAge = employee1.totalAge/employee1.nums;

        employee1.print();


        Employee employee2 = new Employee();
        employee2.name = "이도";
        employee2.age = 25;
        employee2.nums++;
        employee2.totalAge += employee2.age;
        employee2.averAge = employee2.totalAge/employee2.nums;

        employee2.print();
    }
}