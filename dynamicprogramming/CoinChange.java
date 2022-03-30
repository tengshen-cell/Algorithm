
public class CoinChange {
    private static int getMinCoinCountHelper(int total, int[] values, int valueCount) {
        int rest = total;
        int count = 0;

        for (int i = 0; i < valueCount; ++i) {
            int currentCount = rest / values[i];
            rest -= currentCount * values[i];
            count += currentCount;
            if (rest == 0) {
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {5, 3};
        int total = 11;
        System.out.println(getMinCoinCountHelper(total, values, 2));
    }
}
