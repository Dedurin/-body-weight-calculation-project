public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myIndexBody = service.calculateBmi(1.75, 90);
        String bmiString = String.format("%.2f", myIndexBody);

        System.out.println("Индекс массы тела (BMI),(ИМТ) =  : "  + bmiString);
    }
}