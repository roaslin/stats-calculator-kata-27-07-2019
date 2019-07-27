import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class StatsCalculatorShould {

    @Test
    public void exist() {

        StatsCalculator statsCalculator = new StatsCalculator();
        assertNotNull(statsCalculator);
    }


    @Test
    public void print_stats_for_a_sequence_that_contains_number_zero() {

        StatsCalculator statsCalculator = new StatsCalculator();
        assertThat(statsCalculator.process(new int[]{0}), is("o) minimum value = 0\n" +
                "    o) maximum value = 0\n" +
                "    o) number of elements in the sequence = 1\n" +
                "    o) average value = 0"));
    }
}
