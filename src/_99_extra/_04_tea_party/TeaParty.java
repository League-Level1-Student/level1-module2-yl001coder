package _99_extra._04_tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TeaParty {
	String name = "";
	boolean isWoman;
	boolean isKnighted;
	TeaParty() 
	{
		
	}
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
      if(isWoman == true && isKnighted == true)
      {
    	  return "Hello Lady " + name;
      }
      else if(isWoman == true && isKnighted == false)
      {
    	  return "Hello Ms. " + name;
      }
      else if(isWoman == false && isKnighted == true)
      {
    	  return "Hello Sir " + name;
      }
      else if(isWoman == false && isKnighted == false)
      {
    	  return "Hello Mr. " + name;
      }
      else
      {
    	  return "";
      }
}
    }
    
        
