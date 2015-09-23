package com.edupsousa.sqlizer.util;

import java.util.LinkedHashMap;

public interface GetSqlInterface {

	public String getSql(LinkedHashMap<String, String> fields);
	
}
