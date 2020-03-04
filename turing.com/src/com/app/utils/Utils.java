package com.app.utils;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Developers;

public class Utils {
	public static List<Developers> filterByRole(String role, ArrayList<Developers> devArray){
		ArrayList<Developers> filteredArray = new ArrayList <>();
		for(Developers dev : devArray)
			if (dev.getPreferredRole().equals(role)){
				filteredArray.add(dev);
			}
		return filteredArray;
	}
	public static List<Developers> filterByRoleExperience(String role, Integer experience, ArrayList<Developers> devArray){
		ArrayList<Developers> filteredArray = new ArrayList <>();
		for(Developers dev : devArray)
			if (dev.getPreferredRole().equals(role) && dev.getYearsOfExperience() > experience){
				filteredArray.add(dev);
			}
		return filteredArray;
	}
}
