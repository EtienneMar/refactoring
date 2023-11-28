package refactoring.extract.interfaces.automatique;

public interface IListeQueueAvecPriorite {

	boolean add(Object o);

	boolean isEmpty();

	Object peek();

	Object poll();

	Object comparator();

}