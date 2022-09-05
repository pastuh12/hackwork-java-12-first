import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Logger.input();
        try{
            Numeral numeral = new Numeral(in.nextInt());
            Niven niven = new Niven(numeral.splitToDigits());

            niven.isVerify();
        }
        catch (Exception e) {
            Logger.error(e);
        }
    }
}