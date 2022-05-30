public class MainQA38 {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 88; //масса тела в кг
        float height = 1.88F; // рост в м
        float bodyMassIndex = service.calculate(mass, height);
        System.out.println("Индекс массы тела: " + bodyMassIndex);
    }
}
