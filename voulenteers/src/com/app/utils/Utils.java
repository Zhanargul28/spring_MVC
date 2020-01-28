package com.app.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.app.core.Voulenteers;

import cust_excs.AccountHandlingException;

public class Utils{
	public static LocalDate limYr;
	static {
		limYr = LocalDate.of(1970, 01, 01);
	}
	public static Voulenteers validateInputs(int id,String name,String dOB,ArrayList<Voulenteers> vls) throws AccountHandlingException
	{
		LocalDate date=validateDate(dOB);
		return new Voulenteers(id, name,validateNameDob(name,date, vls), date);
	}
	
	// convert & validate date
	public static LocalDate validateDate(String date) throws AccountHandlingException {
		// convert string -- date (parse)
		LocalDate dt = LocalDate.parse(date);
		// chk if dt > end of yr
		if (dt.isBefore(limYr))
			throw new AccountHandlingException("Invalid Date!!!!");
		return dt;
	}
	public static Boolean validateNameDob(String Name,LocalDate date, List<Voulenteers> vls) throws AccountHandlingException {
		// convert string -- date (parse)
		for(Voulenteers v:vls)
			if(v.getDOB().equals(date)&& v.getName().equals(Name))
				throw new AccountHandlingException("Duplicate Account!!!!");
		return true;
	}
	
}
