public class Main {
    public static void main(String[] args) {
        BmiService amount = new BmiService();
        float mass = (float) 80.5;
        float height = (float) 1.80;
        float bmi = amount.calculate(mass, height);

        System.out.println("Ваш индекс массы тела " + String.format("%.2f", bmi));
        System.out.println("made by Dad, enjoy!");
    }
}
