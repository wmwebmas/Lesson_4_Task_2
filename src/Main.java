public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        float index = service.calculate(90, 180);
        System.out.println("Ваш индекс массы тела состовляет: " + index);
    }
}
