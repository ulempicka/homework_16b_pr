package cards;

import java.util.Arrays;

public class SetPerColor {

    private final int[] numbers;
    private final String[] figures;

    SetPerColor(int[] numbers, String[] figures) {
        this.numbers = numbers;
        this.figures = figures;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String[] getFigures() {
        return figures;
    }

    @Override
    public String toString() {
        return "SetPerColor{" +
                "numbers=" + Arrays.toString(numbers) +
                ", figures=" + Arrays.toString(figures) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetPerColor that = (SetPerColor) o;
        return Arrays.equals(numbers, that.numbers) &&
                Arrays.equals(figures, that.figures);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(numbers);
        result = 31 * result + Arrays.hashCode(figures);
        return result;
    }
}
