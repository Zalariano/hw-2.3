import java.util.Objects;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void doService() {
        super.doService();
        this.checkEngine();
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
