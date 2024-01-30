public class BmiService {
    public double calculateBmi(double height, double weight) {
        double bmi = weight / (height * height);
        return bmi;
    }
}