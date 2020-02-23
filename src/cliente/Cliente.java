package cliente;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import servidor.RMIInterface;

public class Cliente {
	RMIInterface useless = null;

	public static void main(String[] args) {
		Cliente c = new Cliente();
		MainScreen frame = new MainScreen();
		frame.setVisible(true);
		
		
	//c.register();
		
		//Pruebas
		try {
			System.out.println("'Hola' a mayusculas: " + c.toMayus("hola"));
			System.out.println("'Hola' a minusculas: "+c.toMinus("Hola"));
			System.out.println("42 + 6 = "+ c.sumar(42, 6));
			System.out.println("42 - 6 = "+ c.restar(42, 6));
			System.out.println("42 * 6 = "+ c.multiplicar(42, 6));
			System.out.println("42 / 6 = "+ c.dividir(42, 6));

					
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public String toMayus(String s) throws RemoteException {
		return useless.toMayus(s);

	}
	public String toMinus(String s) throws RemoteException {
		return useless.toMinus(s);

	}
	public int sumar(int a,int b) throws RemoteException {
		return useless.sumar(a, b);
		

	}
	public int restar(int a,int b) throws RemoteException {
		return useless.restar(a, b);

	}
	public int multiplicar(int a,int b) throws RemoteException {
		return useless.multiplicar(a, b);

	}
	public double dividir(double a,double b) throws RemoteException {
		return useless.dividir(a, b);
	}
	public void register() {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 420);
			useless = (RMIInterface) registry.lookup("useless");
		} catch (Exception e) {
			System.out.println("!! Error");
		}

	}
	
}