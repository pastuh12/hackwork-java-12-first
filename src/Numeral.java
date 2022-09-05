public class Numeral {
    int value;

    public Numeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int[] splitToDigits() {
        String stringNumber = Integer.toString(this.value);
        int length = stringNumber.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++){
            digits[i] = Character.getNumericValue(stringNumber.charAt(i));
        }

        return digits;
    }

}

