package com.shopperStack.genricUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class javaUtility {
	public int generateRandomNumber()
	{
		Random r = new Random();
		int num =r.nextInt(1000);
		return num;
		
	}
	public String getLocalDate()
	{
		String date = LocalDate.now().toString().replace("-", "");
		return date;
	}
	public String getLocalDateTime()
	{
		String datetime = LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
		return datetime;
	}

}
