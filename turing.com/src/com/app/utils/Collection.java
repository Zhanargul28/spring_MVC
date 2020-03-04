package com.app.utils;
import customer_exceptions.AccountHandlingException;
import java.util.ArrayList;
import com.app.core.Developers;
public class Collection {
	public static ArrayList<Developers> populatedata() throws AccountHandlingException {
		ArrayList <Developers> l = new ArrayList <>();
		Developers dev = new Developers("terry_tao@gmail.com", "qwerty", "terence", "tao", "USA", "USA", "+1-111-111-11-11", "USD", "Fullstack", 
				   "Great", 20, 0);
		l.add(dev);
		dev = new Developers("alberto_einstein@gmail.com", "qwerty", "albert", "einstein", "Germany", "USA", "+1-111-111-11-12", "USD", "WebFrontend", 
				   "Great", 100, 20);
		l.add(dev);
		dev = new Developers("erwin_sch@gmail.com", "qwerty", "erwin", "schrödinger", "Austria", "Austria", "+1-111-111-11-13", "EUR", "Fullstack", 
				   "Great", 200, 5);
		l.add(dev);
		return l;
	}
}

