package _99_extra._05_minion;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import static org.junit.Assert.*;

import org.junit.Test;


/*

1. 
Run this MinionTest class. Notice the JUnit tab (by the Package Explorer). It shows a RED bar, because the tests do
not run successfully. Check the Failure Trace below that shows "Minion cannot be resolved to a type". 
This is because there is no Minion class in the package.

2.
 So to make these tests pass, you will first need to create a Minion class with the member variables below:

  			private String name; 
  			private int eyes; 
  			private String color; 
  			private String master;

 3.
  Next, create a constructor, and getters and setters for all the member variables of the Minion class. 
  If they’re done right, all these tests will pass.
  
  To check, run this MinionTest class and the JUnit tab should show a GREEN bar.
    
 */

public class MinionTest {

	public class Minion
	{
		private String name; 
			private int eyes; 
			private String color; 
			private String master;
		Minion(String name, int eyes, String color, String master)
		{
			this.name = name;
			this.eyes = eyes;
			this.color = color;
			this.master = master;
		}
	@Test
	public void testConstructor() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");
		assertEquals("Stuart", stuart.getName());
		assertEquals(1, stuart.getEyes());
		assertEquals("yellow", stuart.getColor());

		Minion dave = new Minion("Dave", 2, "yellow", "");
		assertEquals("Dave", dave.getName());
		assertEquals(2, dave.getEyes());
		assertEquals("yellow", dave.getColor());
	}

	@Test
	public void testSetters() {
		Minion stuart = new Minion("Stuart", 1, "yellow", "");

		stuart.setMaster("T. Rex");
		assertEquals("T. Rex", stuart.getMaster());

		stuart.setMaster("Napoleon");
		assertEquals("Napoleon", stuart.getMaster());
	}
	void setMaster(String master)
	{
		this.master = master;
	}
	public String GetName()
	{
		return name;
	}
	public String getMaster()
	{
		return master;
	}
	public String getColor()
	{
		return color;
	}
	public int getEyes()
	{
		return eyes;
	}
	public String getName()
	{
		return name;
	}

}
}



