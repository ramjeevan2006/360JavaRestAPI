package com.bean;

import java.util.HashMap;
import java.util.Map;
import com.bean.Activity;

public class AppDataBuilder {

	private static Map<Integer, Activity> dataSource = new HashMap<Integer, Activity>();
	public static Map<Integer, Activity> buildBasicData(){
		dataSource.put(1, new Activity(1,"Interact wit Contact", "Interact wit Contact(inbound/initial)", "Finance","Person 1","2 Medium"," 03.10.2016","Opened","Activity opened") );
		return dataSource;
	}
}
