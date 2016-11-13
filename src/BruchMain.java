
public class BruchMain {

	public static void main(String[] args) {
		
		Bruchrechnung bruch1;
		Bruchrechnung bruch2;
	    bruch1 = new Bruchrechnung(1, 2);
	    bruch2 = new Bruchrechnung(4, 6);
	    /*
	    bruch1.bruchAddition(bruch2);
	    bruch1.bruchString();
		bruch1.bruchString();
		bruch2.bruchString();
		*/
		bruch1.bruchSubtraktion(bruch2);
		bruch1.bruchString();

	}

}
