package array;

/**
 * Class for sum all elements of array
 */
public class SimpleSummater implements IArraySummater {
    private int summ;

    /**
     * Default constructor
     */
    public SimpleSummater() {
        this.summ = 0;
    }

    /**
     * @throws ArraySummaterException - custom exception
     * @param arr - array of int.
     */
    public int sum(final int[] arr) throws ArraySummaterException {
        try {
            if (arr == null) {
                throw new ArraySummaterException("Exception");
            }
            int arrLength = arr.length;
            for (int i = 0; i < arrLength; i++) {
                this.summ += arr[i];
            }
        } catch (ArraySummaterException e) {
            System.out.println("Catch exception");
        }
        return this.summ;
    }
}
