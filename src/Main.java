public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();

        double weightKg = 60.00;

        double growthM = 1.7;

        double index = service.calculate(weightKg, growthM);
        System.out.println(index);
    }
}

