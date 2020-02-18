package com.app.utils;
import static com.app.utils.Utils.*;
import cust_excs.AccountHandlingException;
import java.util.ArrayList;
import com.app.core.Voulenteers;
public class Collection {
	public static ArrayList<Voulenteers> populatedata() throws AccountHandlingException {
		ArrayList <Voulenteers> l=new ArrayList <>();
		l.add(validateInputs(1,"abc1","1989-11-25",l));
		l.add(validateInputs(2,"abc2","1998-01-24",l));
		l.add(validateInputs(3,"abc3","2000-12-25",l));
		l.add(validateInputs(4,"abc4","2001-12-20",l));
		l.add(validateInputs(5,"abc5","2002-02-11",l));
		return l;
	}
}