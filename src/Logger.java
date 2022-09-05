public class Logger {
    public Logger() {
    }

    public static void out(boolean is_verify, int value) {
        String answer = "Число " + value + " ";
        System.out.println();
        if (is_verify) {
            System.out.println(answer + "является числом Нивена");
            return;
        }
        System.out.println(answer + "не является числом Нивена");
    }

    public static void error(Exception e) {
        System.out.println();
        System.out.println("Ошибка: " + e);
    }

    public static void input() {
        System.out.print("Введите число от -999999999 до 999999999: ");
    }

}
