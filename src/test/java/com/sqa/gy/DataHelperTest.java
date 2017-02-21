package com.sqa.gy;

import org.testng.annotations.*;

import com.sqa.gy.helpers.*;

public class DataHelperTest {

	@DataProvider
	public Object[][][][] dp() {
		return new Object[][][][] {
				new Object[][][] { new Object[][] {
						new Object[] { "An old silent pond...", "A frog jumps into the pond,",
								"splash! Silence again." },
						new Object[] { "Light of the moon", "Moves west, flowers\' shadows", "Creep eastward." },
						new Object[] { "O snail", "Climb Mount Fuji,", "But slowly, slowly!" } } },
				new Object[][][] { new Object[][] {
						new Object[] { "Sugary drinks and decadent sweet desserts",
								"indulgent chocolate and crumbling cookies",
								"lavish ice cream - refreshing on summer days",
								"entice my senses - craving more and more", "nectarous delights of luscious nirvana",
								"tantalize my taste buds calming my soul" },
						new Object[] { "Kiss of death - having a sweet tooth",
								"ignorantly naive to the damage it causes",
								"lusting forbidden vices that were devoured",
								"life is never the same when diagnosed diabetic",
								"erratic disease can be hereditary - constantly",
								"reminded by how my mother suffers from it" } } } };
	}

	@Test(dataProvider = "dp")
	public void testDataHelperInstance(Object[][] data) {
		System.out.println("running testDataHelperInstance...\n");
		DataArray data1 = new DataArray(data);
		System.out.println(data1.displayData());
	}

	@Test(dataProvider = "dp")
	public void testDataHelperStatic(Object[][] data) {
		System.out.println("running testDataHelperStatic...\n");
		System.out.println(DataHelper.displayData(data));
	}

}
