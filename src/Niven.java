public class Niven {
    int[] value;

    public Niven(int[] value) {
        this.value = value;
    }

    public void isVerify() {
        int numeral = 0;
        int digitsSum = 0;
        boolean isVerify = false;

        for (int i = 0; i < this.value.length; i++) {
            digitsSum += this.value[i];
        }

        for (int i = 0; i < this.value.length; i++){
            numeral += this.value[i] * Math.pow(10, this.value.length - i - 1);
        }

        if (numeral % digitsSum == 0){
            isVerify = true;
        }

        Logger.out(isVerify, numeral);
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }
}
