import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class Airline implements Serializable {
    private List<Aircraft> aircraftList = new ArrayList<>();

    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public int getTotalPassengerCapacity() {
        return aircraftList.stream().mapToInt(Aircraft::getPassengerCapacity).sum();
    }

    public double getTotalCargoCapacity() {
        return aircraftList.stream().mapToDouble(Aircraft::getCargoCapacity).sum();
    }

    // Метод для сериализации авиакомпании в файл
    public void serialize(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(this);
            System.out.println("Сериализация авиакомпании завершена");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Метод для десериализации авиакомпании из файла
    public static Airline deserialize(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            Airline airline = (Airline) inputStream.readObject();
            System.out.println("Десериализация авиакомпании завершена");
            return airline;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}