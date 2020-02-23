package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
	
	public String toMayus(String s) throws RemoteException;
	public String toMinus(String s) throws RemoteException;
	public int sumar(int a,int b) throws RemoteException;
	public int restar(int a,int b) throws RemoteException;
	public int multiplicar(int a,int b) throws RemoteException;
	public double dividir(double a,double b) throws RemoteException;
	


}
