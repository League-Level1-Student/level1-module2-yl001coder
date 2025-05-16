package _99_extra._04_tea_party;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TeaPartyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	/**
	    	 * Jane Austen is a woman, so say “Hello Ms. Austen”. 
	    	 * George Orwell is a man, so say “Hello Mr. Orwell”. 
	    	 * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
	    	 * 
	    	 **/
		TeaPartyTest test = new TeaPartyTest();
		test.testIsWomanNotKnighted();
		test.testIsManKnighted();
		test.testIsManNotKnighted();
		test.testIsWomanNotKnighted();
	
}
@Test
public void testIsWomanNotKnighted() {
	TeaParty teaParty = new TeaParty();
	assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
}

@Test
public void testIsManNotKnighted() {
	TeaParty teaParty = new TeaParty();
	assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
}

@Test
public void testIsManKnighted() {
	TeaParty teaParty = new TeaParty();
	assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
}

@Test
public void testIsWomanKnighted() {
	TeaParty teaParty = new TeaParty();
	assertEquals("Hello Lady Laura", teaParty.welcome("Laura", true, true));
}
}
