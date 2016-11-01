import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

import junit.framework.TestCase;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	TestMovieListWithEmptyList.class, 
	TestMovieListWithOneMovie.class, 
	TestMovieListWithTwoMovies.class
})

public class AllTests extends TestCase{
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
	    for (Failure failure : result.getFailures()) {
	      System.out.println(failure.toString());
	    }
	}
	
}