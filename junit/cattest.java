// create this file in the same package as cat.java and also it should be junit type

package junit;
import static org.junit.Assert.*;
import org.junit.*;

public class cattest {
	@Test
	public void add_should_return(){
		cat c1 = new cat();
		assertEquals(9,c1.add(4, 5) );
	}
}
