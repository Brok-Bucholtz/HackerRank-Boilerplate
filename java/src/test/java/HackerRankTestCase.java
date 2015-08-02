public class HackerRankTestCase {
    String input, expectOutput;

    HackerRankTestCase(String input, String expectOutput) {
        this.input = input;
        this.expectOutput = expectOutput;
    }

    /**
     * Returns a string that will be passed through <code>System.in</code> to <code>Solution.Main</code>.
     *
     * @return  The string used to test the method
     */
    public String getInput(){
        return input;
    }

    /**
     * Returns a string that will be compared the result of <code>System.out</code> from <code>Solution.Main</code>.
     *
     * @return  The string that is expected from the algorithm
     */
    public String getExpectedOutput() {
        return expectOutput;
    }
}
