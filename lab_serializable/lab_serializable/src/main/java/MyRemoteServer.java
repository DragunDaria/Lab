import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteServer extends UnicastRemoteObject implements MyRemoteInterface {
    protected MyRemoteServer() throws RemoteException {
        super();
    }

    @Override
    public void callRemoteMethod(Aircraft aircraft) throws RemoteException {
        // Здесь можно выполнить необходимую логику с переданным объектом aircraft
        System.out.println("Вызван удаленный метод на сервере с объектом " + aircraft.getModel());
    }

    public static void main(String[] args) {
        try {
                // Создание реестра RMI на порту 1099
            java.rmi.registry.LocateRegistry.createRegistry(1099);

                // Создание и регистрация удаленного объекта
            MyRemoteInterface remoteObject = new MyRemoteServer();
            java.rmi.Naming.rebind("MyRemoteServer", remoteObject);

            System.out.println("Сервер RMI запущен");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

