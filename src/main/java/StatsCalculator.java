public class StatsCalculator {
    public String process(int[] sequence) {
        int minimumValue = sequence[0];
        int maximumValue = sequence[0];
        int sumOfValues = 0;

        return "o) minimum value = " + minimumValue + "\n" +
                "    o) maximum value = " + maximumValue + "\n" +
                "    o) number of elements in the sequence = " + sequence.length + "\n" +
                "    o) average value = " + sumOfValues / sequence.length;
    }
}
