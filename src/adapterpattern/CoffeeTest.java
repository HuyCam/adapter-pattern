package adapterpattern;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class CoffeeTest {
	@Test
	void test() {
		CoffeeTouchscreenAdapter machine = new CoffeeTouchscreenAdapter();
		assertEquals("A is selected", machine.chooseFirstSelection());
	}

}
