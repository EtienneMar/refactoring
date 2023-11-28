package refactoring.extract.interfaces;

import refactoring.extract.interfaces.automatique.IListeQueueAvecPriorite;

public class QueueAvecPriorite implements IListeQueueAvecPriorite{
	@Override
	public boolean add(Object o) {return true;}
	@Override
	public boolean isEmpty() {return true;}
	@Override
	public Object peek() {return null;}
	@Override
	public Object poll() {return null;}
	@Override
	public Object comparator() {return null;}
	private void secretQAP(){}
}