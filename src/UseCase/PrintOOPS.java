package UseCase;

import java.util.HashMap;
import java.util.Map;

/**
 * UC5: Use Map for Character Patterns and Render via Function
 * <p>
 * This program stores banner character patterns in a HashMap
 * and renders the word "OOPS" using nested loops and StringBuilder.
 * <p>
 * Output is same as UC2, UC3, and UC4.
 *
 * @author Thanigaivel
 * @version 5.0
 */

public class PrintOOPS {

    static Map<Character, String[]> buildCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " ****",
                "    *",
                "    *",
                "*   *",
                " ****"
        });

        return patternMap;
    }


    static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                lineBuilder.append(patternMap.get(ch)[row]);

                if (i < message.length() - 1) {
                    lineBuilder.append("  ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatternMap();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }
}
