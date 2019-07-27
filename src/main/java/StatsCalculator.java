public class StatsCalculator {
    public String process(int[] sequence) {
        int minimumValue = sequence[0];
        int maximumValue = sequence[0];
        float sumOfValues = sequence[0];

        for (int i = 1; i < sequence.length; i++) {
            if(sequence[i] < minimumValue){
                minimumValue = sequence[i];
            }

            if(sequence[i] > maximumValue){
                maximumValue = sequence[i];
            }

            sumOfValues += sequence[i];
        }
        return "o) minimum value = " + minimumValue + "\n" +
                "    o) maximum value = " + maximumValue + "\n" +
                "    o) number of elements in the sequence = " + sequence.length + "\n" +
                "    o) average value = " + sumOfValues / sequence.length;
    }
}
