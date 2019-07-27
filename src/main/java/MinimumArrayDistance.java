import static java.lang.Math.min;
import static java.util.Arrays.sort;

public class MinimumArrayDistance {
    public long of(int[] A) {

        if (A.length <= 1)
            return 0;

        sort(A);

        long minDist = Long.MAX_VALUE;

        for (int i = 1; i < A.length; i ++) {
            long dist = (long) A[i] - A[i - 1];
            if (dist == 0)
                return 0;
            minDist = min(minDist, dist);
        }

        return minDist;
    }
}
