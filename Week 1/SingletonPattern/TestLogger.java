public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Message: Logger 1");
        logger2.log("Message: Logger 2");

        if (logger1 == logger2) {
            System.out.println("Only one instance of Logger exists");
        } else {
            System.out.println("Multiple instances of Logger exist");
        }
    }
}