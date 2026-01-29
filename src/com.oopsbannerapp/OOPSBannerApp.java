/**
 * OOPSBannerApp UC7 - Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a Character PatternMap class to encapsulate
 * character-to-pattern mappings. The application retrives and displays the "OOPS"
 * banner using these mappings. This approach enhances code organiztion and modularity.
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "   ***    ",
                " **   **  ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "   ***    "
        });

        charMaps[1] = new CharacterPatternMap('P', new String[]{
                "******    ",
                "**    **  ",
                "**     ** ",
                "**    **  ",
                "******    ",
                "**        ",
                "**        ",
                "**        ",
                "**        "
        });

        charMaps[2] = new CharacterPatternMap('S', new String[]{
                "    ***** ",
                "  **      ",
                " **       ",
                "   **     ",
                "     ***   ",
                "       **  ",
                "        ** ",
                "       **  ",
                "  *****    "
        });

        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          ",
                "          "
        });

        return charMaps;
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int row = 0; row < charMaps[0].pattern.length; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[row]).append(" ");
            }
            System.out.println(line);
        }
    }

    public static void main(String args[]){
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}