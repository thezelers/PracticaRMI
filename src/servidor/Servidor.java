package servidor;

import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
	
	public static void main(String[] args) {
		Registry reg = null;
		
		try {
			reg = LocateRegistry.createRegistry(420);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RMIAcctionsServer serverRMI = new RMIAcctionsServer();
		
		try {
			reg.rebind("useless", (RMIInterface) UnicastRemoteObject.exportObject(serverRMI, 0));
			System.out.println("Server Iniciado");
		} catch (AccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
