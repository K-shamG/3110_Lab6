import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestMovieListWithEmptyList.class, 
	TestMovieListWithOneMovie.class, 
	TestMovieListWithTwoMovies.class
})

public class AllTests{
	
	public static void main(String[] args) {
		junit.textui.TestRunner.run(AllTests.suite());
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for com.saorsa.nowplaying.tests");
		suite.addTest(new TestSuite(TestMovieListWithEmptyList.class));
		suite.addTest(new TestSuite(TestMovieListWithOneMovie.class));
		suite.addTest(new TestSuite(TestMovieListWithTwoMovies.class));
		return suite;
	}
}