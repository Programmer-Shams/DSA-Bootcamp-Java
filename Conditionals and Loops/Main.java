public class Main {
    public static void main(String[] args) {
        int salary = 120000;
        if (salary < 20000) {
            salary = salary + 1000;
        } else {
            salary = salary + 5000;
        }
        System.out.println(salary);

        // multiple if statment
        if (salary < 20000) {
            salary = salary + 1000;
        } else if (salary < 10000) {
            salary = salary + 5000;
        } else if (salary < 5000) {
            salary = salary + 1000;
        }

        System.out.println(salary);
    }

}
