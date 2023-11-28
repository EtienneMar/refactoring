package refactoring.extract.interfaces;

import refactoring.extract.interfaces.automatique.IListeTableau;

public class ListeTableau implements IListeTableau{
	@Override
	public boolean add(Object o) {return true;}
	@Override
	public boolean isEmpty() {return true;}
	@Override
	public Object get(int i) {return null;}
	private void secretLT(){}
	public static void staticLT() {}
	int nbLT;
}