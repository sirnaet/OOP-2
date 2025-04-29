public class BMICalculator {
    public static void main(String[] args) {
        String name;
        double weight;
        double height;

        System.out.print("Enter your name: ");
        name = System.console().readLine();
        System.out.print("Enter your weight in kg: ");
        weight = Double.parseDouble(System.console().readLine());
        System.out.print("Enter your height in meters: ");
        height = Double.parseDouble(System.console().readLine());

        double bmi = calculateBMI(weight, height);
        System.out.println(name+"Your BMI is: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
}