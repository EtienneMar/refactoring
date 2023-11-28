package refactoring.extract_interface;

class QueueAvecPriorite implements QueueAvecPrioriteInterface {
    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object peek() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object comparator() {
        return null;
    }

    private void secretQAP() {
    }
}
