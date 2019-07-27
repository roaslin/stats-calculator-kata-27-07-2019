import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StatsCalculatorShould {

    @Test
    public void exist() {

        StatsCalculator statsCalculator = new StatsCalculator();
        assertNotNull(statsCalculator);
    }


    @Test
    @Parameters(method = "sequencesOfNumbers")
    public void print_stats_for_a_sequence_that_contains_number_zero(int[] sequence, String stats) {

        StatsCalculator statsCalculator = new StatsCalculator();
        assertThat(statsCalculator.process(sequence), is(stats));
    }

    public Object sequencesOfNumbers() {

        return new Object[]{
                new Object[]{new int[]{0}, "o) minimum value = 0\n" +
                        "    o) maximum value = 0\n" +
                        "    o) number of elements in the sequence = 1\n" +
                        "    o) average value = 0.0"},
                new Object[]{new int[]{0, 1}, "o) minimum value = 0\n" +
                        "    o) maximum value = 1\n" +
                        "    o) number of elements in the sequence = 2\n" +
                        "    o) average value = 0.5"},
                new Object[]{new int[]{-100, 100, 200}, "o) minimum value = -100\n" +
                        "    o) maximum value = 200\n" +
                        "    o) number of elements in the sequence = 3\n" +
                        "    o) average value = 66.666664"},
                new Object[]{new int[]{6, 9, 15, -2, 92, 11}, "o) minimum value = -2\n" +
                        "    o) maximum value = 92\n" +
                        "    o) number of elements in the sequence = 6\n" +
                        "    o) average value = 21.833334"},

        };
    }
}
