import java.util.Scanner;

/**
 * BMI
 */

/*
 * [Description]
 * Write function bmi that calculates body mass index (bmi = weight / height2).
 */

public class BMI {
    static String bmiCalculator(double height, double weight) {
        double bmiResult = weight * (height / weight);

        if (bmiResult <= 18.5) {
            return "Under Weight";
        }
        else if (bmiResult <= 25.0) {
            return "Normal Weight";
        }
        else if (bmiResult <= 30.0) {
            return "Heavy Weight";
        }

        return "Obese";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        String bmi = bmiCalculator(height, weight);
        System.out.println(bmi);

        sc.close();
    }
}