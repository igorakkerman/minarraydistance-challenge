import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class MinimumArrayDistance {

    // - store the values in a hash map
    // - iterate through all integers, starting from minimum value
    // - if integer number that it is a value
    // - find next integer number that is a value, measure the distance
    // - continue, remembering the minimum distance

    public long of(int[] A) {

        if (A.length == 1)
            return 0;

        Set<Integer> values = new HashSet<>();
        for (int value : A) {
            if (values.contains(value))
                return 0;

            values.add(value);
        }

        int min = stream(A).reduce(Integer.MAX_VALUE, Math :: min);
        int max = stream(A).reduce(Integer.MIN_VALUE, Math :: max);
        int i;
        int j;
        long result = Long.MAX_VALUE;
        int start = min;

        while (start <= max) {
            for (i = start; i <= max; i++) {
                if (values.contains(i))
                    break;
            }

            if (i == max)
                break;

            for (j = i + 1; j <= max; j++)
                if (values.contains(j))
                    break;

            if (j == max && ! values.contains(max))
                break;

            result = Math.min(result, (long) j - i);

            start = j;
        }

        return result;
    }
}
