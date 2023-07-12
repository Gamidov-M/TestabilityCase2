public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100; // вес в килограммах
        double height = 1.78; //рост в метрах
        int result;
        result = service.calculate (int index);
        System.out.println("Индекс массы тела равен" + result);
    }
}