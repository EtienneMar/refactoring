package refactoring.extract_interface;

interface QueueDoubleEntreeInterface {

    boolean add(Object o);

    boolean isEmpty();

    Object peek();

    Object poll();

}