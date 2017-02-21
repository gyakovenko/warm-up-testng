package com.sqa.gy.helpers;

public class DataArray {

	Object[][] data = new Object[3][3];

	public DataArray(Object[][] data) {
		super();
		this.data = data;
	}

	public String displayData() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < this.data.length; i++) {
			for (int j = 0; j < this.data[i].length; j++) {
				builder.append(this.data[i][j] + "\n");
			}
			builder.append("\n");
		}
		return builder.toString();
	}

	public Object[][] getData() {
		return this.data;
	}

	public void setData(Object[][] data) {
		this.data = data;
	}
}
