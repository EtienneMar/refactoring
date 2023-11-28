package refactoring.extract.interfaces.automatique;

public interface IQueueDoubleEntree {

	boolean add(Object o);

	boolean isEmpty();

	Object peek();

	Object poll();

}