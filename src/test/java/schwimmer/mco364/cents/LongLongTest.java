package schwimmer.mco364.cents;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class LongLongTest {
	
	@Test
	public void testConstructorSet() {
		LongLong ll = new LongLong(0, 1, 2);
		assertTrue(ll.get(0));
		assertTrue(ll.get(1));
		assertTrue(ll.get(2));
	}

	@Test
	public void testGetAndSet() {
		LongLong ll = new LongLong();
		
		assertFalse(ll.get(0));
		assertFalse(ll.get(1));
		assertFalse(ll.get(2));
		ll.set(1);
		assertFalse(ll.get(0));
		assertTrue(ll.get(1));
		assertFalse(ll.get(2));
		
	}
	
	@Test
	public void testMask() {
		LongLong ll = new LongLong();
		
		ll.set(0);
		ll.set(1);
		ll.set(2);
		
		assertTrue(ll.get(0));
		assertTrue(ll.get(1));
		assertTrue(ll.get(2));
		
		ll.mask(0, 2);
		
		assertFalse(ll.get(0));
		assertTrue(ll.get(1));
		assertFalse(ll.get(2));
		
	}
	
	@Test
	public void testOrShiftLeft() {
		LongLong l1 = new LongLong(0, 1, 2, 3);
		LongLong l2 = new LongLong(0, 1, 2, 3);
		
		assertFalse(l1.get(4));
		assertFalse(l1.get(5));
		assertFalse(l1.get(6));
		assertFalse(l1.get(7));
		
		l1.orShiftLeft(l2, 4);

		assertTrue(l1.get(0));
		assertTrue(l1.get(1));
		assertTrue(l1.get(2));
		assertTrue(l1.get(3));
		assertTrue(l1.get(4));
		assertTrue(l1.get(5));
		assertTrue(l1.get(6));
		assertTrue(l1.get(7));
		assertFalse(l1.get(8));
	}

}
