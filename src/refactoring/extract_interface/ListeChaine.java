package refactoring.extract_interface;

class ListeChainee implements ListChaineInterface {
    @Override
	public boolean add(Object o) {
        return true;
    }

    @Override
	public boolean isEmpty() {
        return true;
    }

    @Override
	public Object get(int i) {
        return null;
    }

    @Override
	public Object peek() {
        return null;
    }

    @Override
	public Object poll() {
        return null;
    }

    private void secretLC() {
    }
}
