import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

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
		Result result = JUnitCore.runClasses(AllTests.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	}

}
