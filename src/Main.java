public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int Weight = 75;
        int Height = 180;
        double BMI = service.calculate(Weight,Height);
        System.out.println("Ваш индекс массы тела " + BMI);
    }
}