import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    void callRemoteMethod(Aircraft aircraft) throws RemoteException;
}
