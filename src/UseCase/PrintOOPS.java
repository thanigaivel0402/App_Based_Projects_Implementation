package UseCase;

/**
 * UC2: Render OOPS as Banner
 *
 * This program prints the word "OOPS" in a banner format
 * using spaces and '*' characters.
 *
 * Height  : 7 lines
 * Width   : 9 characters per letter
 *
 * @author Thanigaivel
 * @version 2.0
 */

public class PrintOOPS {
    public static void main(String[] args) {
        String[] banner = {
                String.join("  ",
                        " *** ", " *** ", "**** ", " ****"),
                String.join("  ",
                        "*   *", "*   *", "*   *", "*    "),
                String.join("  ",
                        "*   *", "*   *", "**** ", " ****"),
                String.join("  ",
                        "*   *", "*   *", "*    ", "    *"),
                String.join("  ",
                        "*   *", "*   *", "*    ", "    *"),
                String.join("  ",
                        "*   *", "*   *", "*    ", "*   *"),
                String.join("  ",
                        " *** ", " *** ", "*    ", " ****")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
