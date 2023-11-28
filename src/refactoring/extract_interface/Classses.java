package refactoring.extract_interface;
class ListeTableau {
    public boolean add(Object o) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object get(int i) {
        return null;
    }

    private void secretLT() {
    }

    public static void staticLT() {
    }

    int nbLT;
}

class ListeChainee {
    public boolean add(Object o) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object get(int i) {
        return null;
    }

    public Object peek() {
        return null;
    }

    public Object poll() {
        return null;
    }

    private void secretLC() {
    }
}

class QueueDoubleEntree {
    public boolean add(Object o) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object peek() {
        return null;
    }

    public Object poll() {
        return null;
    }

    private void secretQDE() {
    }
}

class QueueAvecPriorite {
    public boolean add(Object o) {
        return true;
    }

    public boolean isEmpty() {
        return true;
    }

    public Object peek() {
        return null;
    }

    public Object poll() {
        return null;
    }

    public Object comparator() {
        return null;
    }

    private void secretQAP() {
    }
}

// liste et LinkedList sont des implémentations de List

interface List {
    boolean add(Object o);

    boolean isEmpty();

    Object get(int i);
}

interface Queue implements List {
    Object peek();

    Object poll();
}