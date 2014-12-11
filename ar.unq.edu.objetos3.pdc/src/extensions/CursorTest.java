package extensions;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import extensions.Cursor;

import org.junit.Before;
import org.junit.Test;


public class CursorTest {
	private Cursor cursor;
	List<Integer> acts;
	Integer one = Integer.valueOf(1);
	Integer two = Integer.valueOf(2);
	
	@Before
	public void setUp() throws Exception {
		acts = new ArrayList<Integer>();
		acts.add(one);
		acts.add(two);
		cursor = new Cursor(acts);
	}

	@Test
	public void testCursorHasNext() {
		assertTrue(cursor.hasNext());
	}
	
	@Test 
	public void testCursorNextReturnTheNextObject(){
		assertEquals(cursor.next(),Integer.valueOf(2));
	}
	
	@Test
	public void testCursorHasntNext(){
		cursor.next();
		assertFalse(cursor.hasNext());
	}
	
	@Test
	public void testCursorCurrent(){
		assertEquals(Integer.valueOf(1), cursor.current());
	}

	@Test
	public void testCursorOutOfIndex(){
		cursor.next();
		try{ 
			cursor.next(); 
		} catch(Exception e) {
			assertEquals(e.getMessage(),"Out of index");
			assertEquals(Integer.valueOf(2),cursor.current());
		}
	}
	
}
