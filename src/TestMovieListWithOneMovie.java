import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMovieListWithOneMovie {
	private MovieList movieList = null;
	private Movie starWars = null;
	
	@Before
	public void setUp() {
		starWars = new Movie("Star Wars");
		movieList = new MovieList();
		movieList.add(starWars);
	}

	@Test
	public void testSize() {
		assertEquals("Size of one item list should be 1.", 1, movieList.size());
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	}
}
