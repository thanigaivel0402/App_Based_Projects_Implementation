package UseCase;

/**
 * UC3: Refactor Banner Logic into Functions
 * <p>
 * This program renders the "OOPS" banner by refactoring
 * banner-building logic into reusable static methods.
 * <p>
 * Output remains same as UC2.
 *
 * @author Thanigaivel
 * @version 3.0
 */
class PrintOOPS {

    public static void main(String[] args) {

        String[] banner = buildPattern();

        printPattern(banner);
    }

    static String[] buildPattern() {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        return banner;
    }


    static void printPattern(String[] pattern) {
        for (String line : pattern) {
            System.out.println(line);
        }
    }

    // Encapsulated pattern for letter O
    static String[] getOPattern() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Encapsulated pattern for letter P
    static String[] getPPattern() {
        return new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Encapsulated pattern for letter S
    static String[] getSPattern() {
        return new String[]{
                " ****",
                "*    ",
                " ****",
                "    *",
                "    *",
                "*   *",
                " ****"
        };
    }
}