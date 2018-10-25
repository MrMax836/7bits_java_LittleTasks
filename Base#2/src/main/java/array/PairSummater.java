package array;

/**
 * Class for sum couple of integer
 */
public class PairSummater implements IArraySummater {
    private int maxValue;
    private int minValue;

    /**
     * Default constructor.
     */
    public PairSummater() {
        this.maxValue = 0;
        this.minValue = 0;
    }
    /**
     * Function that summing nearby couples.
     * @throws ArraySummaterException - custom exception
     * @param arr - array of int.
     */
    public int sum(final int[] arr) throws ArraySummaterException {
        int arrLength = arr.length;
        try {
            if (arrLength % 2 != 0) {
                throw new ArraySummaterException("Exception");
            }
        } catch (ArraySummaterException e) {
            // TODO
            System.out.println("Throw ArraySummater Exception");
        }
        int currentMax = 0;
        int currentMin = 0;
        for (int i = 0; i <= arrLength / 2; i += 2) {
            int temp = arr[i] + arr[i + 1];
            if (currentMax == 0) {
                currentMax = temp;
            }
            if (currentMin > temp) {
                currentMin = temp;
            }
            if (currentMax < temp) {
                currentMax = temp;
            }
        }
        this.maxValue = currentMax;
        this.minValue = currentMin;
        return this.maxValue;
    }

    public int getMax() {
        return this.maxValue;
    }

    public int getMin() {
        return this.minValue;
    }
}
