package refactoring.extract.interfaces.manuelles;

public interface IQueueDoubleEntree {

    boolean add(Object o);

    boolean isEmpty();

    Object peek();

    Object poll();

}