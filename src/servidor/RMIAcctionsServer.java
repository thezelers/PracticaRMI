package servidor;

import java.rmi.RemoteException;

public class RMIAcctionsServer implements RMIInterface {

	@Override
	public String toMayus(String s) throws RemoteException {
		return s.toUpperCase();
	}

	@Override
	public String toMinus(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return s.toLowerCase();
	}

	@Override
	public int sumar(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int restar(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplicar(int a, int b) throws RemoteException {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double dividir(double a, double b) throws RemoteException {
		// TODO Auto-generated method stub
		return a/b;
	}

}
