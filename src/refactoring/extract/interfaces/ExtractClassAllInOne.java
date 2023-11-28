package refactoring.extract.interfaces;

import refactoring.extract.interfaces.automatique.TestExtractAllInOne;

public class ExtractClassAllInOne implements TestExtractAllInOne {
	public class ListeTableau{
		public boolean add(Object o) {return true;}
		public boolean isEmpty() {return true;}
		public Object get(int i) {return null;}
		private void secretLT(){}
		public static void staticLT() {}
		int nbLT;
	}
	public class ListeChainee{
		public boolean add(Object o) {return true;}
		public boolean isEmpty() {return true;}
		public Object get(int i) {return null;}
		public Object peek() {return null;}
		public Object poll() {return null;}
		private void secretLC(){}
	}
	public class QueueDoubleEntree{
		public boolean add(Object o) {return true;}
		public boolean isEmpty() {return true;}
		public Object peek() {return null;}
		public Object poll() {return null;}
		private void secretQDE(){}
	}
	public class QueueAvecPriorite{
		public boolean add(Object o) {return true;}
		public boolean isEmpty() {return true;}
		public Object peek() {return null;}
		public Object poll() {return null;}
		public Object comparator() {return null;}
		private void secretQAP(){}
	}
}
