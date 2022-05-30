public class BmiService {

    public float calculate(int bodyWeight, float heightBody) {
        float Index = bodyWeight / (heightBody * heightBody); // количество милей
        return Index;
    }
}
