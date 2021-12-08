public class BmiService {
    public float calculate(float mass, float height) {
        float bmi = mass / (height * height);
        return bmi;
    }
}
