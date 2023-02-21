package com.ochoscar.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	//public static ResourceBundle rs = ResourceBundle.getBundle("internationalize/app", Locale.getDefault());
	public static ResourceBundle rs = ResourceBundle.getBundle("internationalize/app", new Locale("en", "US"));
	
	public static void main(String[] args) {
		System.out.println("APP: " + rs.getString("app_title"));
		// Cargar archivo de properties
	}
	
}
