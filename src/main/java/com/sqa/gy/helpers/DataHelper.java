package com.sqa.gy.helpers;

public class DataHelper {

	// Static Method
	public static String displayData(Object[][] data) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				builder.append(data[i][j] + "\n");
			}
			builder.append("\n");
		}
		return builder.toString();
	}

}
