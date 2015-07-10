import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.After;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@RunWith(JUnitParamsRunner.class)
public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    //TODO: Modify parametersForTestMain for each HackerRank problem.
    private HackerRankTestCase[] parametersForTestMain() {
        return new HackerRankTestCase[]{
                new HackerRankTestCase(2, 3, 5),
                new HackerRankTestCase(1, 1, 2),
                new HackerRankTestCase(1000, 1000, 2000)
        };
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(4);//HackerRank Java Timeout

    @Before
    public void SetUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @Parameters
    public void testMain(HackerRankTestCase testCase) {
        final String[] emptyArguments = {};
        Solution testSolution = new Solution();

        ByteArrayInputStream inputStream = new ByteArrayInputStream((testCase.getInput()).getBytes());
        System.setIn(inputStream);

        testSolution.main(emptyArguments);
        assertEquals(testCase.getExpectedOutput(), outContent.toString());
    }

    @After
    public void BreakDown() {
        System.setIn(System.in);
        System.setOut(System.out);
    }
}
