package p;

public class Demo {

	public static void main(String[] args) {
		API a = new API();
		a.setUP();
		a.firstStream();
		System.out.println("\n");
		a.mapStream();
		
		a.flatMapStream();
	}

}
