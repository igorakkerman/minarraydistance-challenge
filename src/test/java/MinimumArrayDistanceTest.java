import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumArrayDistanceTest {

    @Test
    void example() {
        assertThat(new MinimumArrayDistance().of(new int[]{ 0, 4, 4, 8, 6, 4, 13, 2 }))
            .isZero();
    }

    @Test
    void dist1() {
        assertThat(new MinimumArrayDistance().of(new int[]{ 0, 3, 4, 7, 5, 8, 11, 1 }))
            .isEqualTo(1);
    }

    @Test
    void dist2() {
        assertThat(new MinimumArrayDistance().of(new int[]{ 3, 7, 5, 9, 11, 1 }))
            .isEqualTo(2);
    }

    @Test
    void single() {
        assertThat(new MinimumArrayDistance().of(new int[]{ 0 }))
            .isZero();
    }

    @Test
    void extremeMinMaxDist1() {
        assertThat(new MinimumArrayDistance().of(new int[]{ Integer.MIN_VALUE, 3, 4, 7, 5, 8, Integer.MAX_VALUE, 1 }))
            .isEqualTo(1);
    }

    @Test
    void extremeMinMaxDistMaxDistMaxIntMinusMinInt() {
        assertThat(new MinimumArrayDistance().of(new int[]{ Integer.MIN_VALUE, Integer.MAX_VALUE }))
            .isEqualTo((long) Integer.MAX_VALUE - Integer.MIN_VALUE)
            .isEqualTo(4294967295L);
    }
}
