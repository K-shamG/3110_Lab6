import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestSuite;

public class TestMovieListWithEmptyList {
	private MovieList movieList = null;
	
	@Before
	public void setUp() {
		movieList = new MovieList();
	}
	
	@Test
	public void testSize() {
		assertEquals("Size of empty movie list should be 0.", 0, movieList.size());
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(new TestSuite(TestMovieListWithEmptyList.class));
	}
}
