public class HackerRankTestCase {
    int a, b, expectOutput;//TODO: Modify this for each HackerRank problem

    //TODO: Modify this for each HackerRank problem
    HackerRankTestCase(int a, int b, int expectOutput) {
        this.a = a;
        this.b = b;
        this.expectOutput = expectOutput;
    }

    /**
     * Returns a string that will be passed through <code>System.in</code> to <code>Solution.Main</code>.
     *
     * @return  The string used to test the method
     */
    public String getInput(){
        StringBuilder inputString = new StringBuilder();

        //TODO: Modify this for each HackerRank problem
        inputString.append(a + System.lineSeparator());
        inputString.append(b + System.lineSeparator());


        return inputString.toString();
    }

    /**
     * Returns a string that will be compared the result of <code>System.out</code> from <code>Solution.Main</code>.
     *
     * @return  The string that is expected from the algorithm
     */
    public String getExpectedOutput() {
        StringBuilder outputString = new StringBuilder();

        //TODO: Modify this for each HackerRank problem
        outputString.append(expectOutput + System.lineSeparator());

        return outputString.toString();
    }
}
