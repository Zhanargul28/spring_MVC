package com.app.utils;
import static com.app.utils.Utils.*;
import cust_excs.AccountHandlingException;
import java.util.ArrayList;
import com.app.core.Voulenteers;
public class Collection {
	public static ArrayList<Voulenteers> populatedata() throws AccountHandlingException {
		ArrayList <Voulenteers> l=new ArrayList <>();
		l.add(validateInputs(1,"abc1","1981-12-25",l));
		l.add(validateInputs(2,"abc2","1981-12-25",l));
		l.add(validateInputs(3,"abc3","1981-12-25",l));
		l.add(validateInputs(4,"abc4","1981-12-25",l));
		l.add(validateInputs(5,"abc5","1981-12-25",l));
		return l;
	}
}
