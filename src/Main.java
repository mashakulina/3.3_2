public class Main {

    public static void main(String[] args) {

        BmiService BmiService = new BmiService();

        double BMI = BmiService.calculate(54.2, 1.54);

        System.out.println("ИМТ = " + BMI + " кг/м2");
    }


}
