package oops.abstraction;


public class IVechileClient {
	public static void main(String[] args) {
		Suzike s = new Suzike();
		s.start();
		Maruthi m = new Maruthi();
		m.stop();
		m.brak();
	}

}
