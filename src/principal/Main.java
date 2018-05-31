package principal;

import InterfazGrafica.Login;


public class Main {
	static Hotel hotel = new Hotel();
	static Login frame = new Login(hotel);
	public static void main(String[] args) {

		frame.setVisible(true);

	}

}
