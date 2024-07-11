package strings;

public class MutableStrings {
    public static void main(String[] args) {

        StringBuilder message = new StringBuilder();
        message.append("My name is Mariana");
        message.append(10);
        message.append(78.99474);

        System.out.println(message);

        // Suitable for multithreaded application because the methods are synchronised
        StringBuffer buf = new StringBuffer();
    }
}
