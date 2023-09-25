import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            // Получение доступа к удаленному реестру RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Получение удаленного объекта
            MyRemoteInterface remoteObject = (MyRemoteInterface) registry.lookup("MyRemoteServer");

            // Создание объекта Aircraft
            Aircraft aircraft = new Aircraft("Boeing 737", 150, 5000.0);

            // Вызов удаленного метода и передача объекта
            remoteObject.callRemoteMethod(aircraft);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
