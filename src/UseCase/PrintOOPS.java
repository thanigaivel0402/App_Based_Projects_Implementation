package UseCase;

/**
 * UC4: Store Character Pattern in a Class
 * <p>
 * This program demonstrates encapsulation of banner
 * character data using an inner class and renders
 * the "OOPS" banner using reusable OOPS principles.
 * <p>
 * Output remains unchanged from UC2 and UC3.
 *
 * @author Thanigaivel
 * @version 4.0
 */

public class PrintOOPS {

    static class CharacterPatternMap {

        private final char character;

        private final String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static String[] buildBanner(CharacterPatternMap[] characters) {

        String[] banner = new String[7];

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (int col = 0; col < characters.length; col++) {
                line.append(characters[col].getPattern()[row]);

                if (col < characters.length - 1) {
                    line.append("  ");
                }
            }
            banner[row] = line.toString();
        }
        return banner;
    }

    static void printBanner(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        // Create character pattern objects
        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        CharacterPatternMap[] bannerChars = getCharacterPatternMaps(o);

        // Build and print banner
        String[] banner = buildBanner(bannerChars);
        printBanner(banner);
    }

    private static CharacterPatternMap[] getCharacterPatternMaps(CharacterPatternMap o) {
        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ",
                "*    "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " ****",
                "    *",
                "    *",
                "*   *",
                " ****"
        });

        // Array of objects (O, O, P, S)
        CharacterPatternMap[] bannerChars = {
                o, o, p, s
        };
        return bannerChars;
    }
}
