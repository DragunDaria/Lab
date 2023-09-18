import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Aircraft implements Serializable {
    private String model;
    private int passengerCapacity;
    private double cargoCapacity;

    public Aircraft(String model, int passengerCapacity, double cargoCapacity) {
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    // Метод для сериализации самолета в файл
    public void serialize(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
            System.out.println("Сериализация самолета завершена");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации самолета из файла
    public static Aircraft deserialize(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            Aircraft aircraft = (Aircraft) inputStream.readObject();
            System.out.println("Десериализация самолета завершена");
            return aircraft;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}