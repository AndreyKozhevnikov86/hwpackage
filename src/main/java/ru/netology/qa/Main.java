public class Main {

    public static void main(String[] args) {
        MonthService service = new MonthService();
        int expenses = 3000;
        int income = 10000;
        int treshhold = 20000;
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= treshhold) {
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses);
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
