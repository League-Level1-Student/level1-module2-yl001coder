package _99_extra._05_minion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import _99_extra._05_minion.MinionTest.Minion;

public class MinionTestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MinionTestRunner test = new MinionTestRunner();

		
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
	

}

