package hust.soict.ict.aims;

import hust.soict.ict.aims.cart.Cart;
import hust.soict.ict.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder=new Cart();
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3=new DigitalVideoDisc("Aladin","Animation",18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.cartInfo();
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.cartInfo();
		anOrder.searchDVD("The Lion King");
		anOrder.searchDVD(2);
		anOrder.searchDVD(1);
	}
}