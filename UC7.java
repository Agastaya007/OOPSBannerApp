public class UC7 {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char ch, String[] pat) {
            character = ch;
            pattern = pat;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

         CharacterPattern O1 = new CharacterPattern('O', new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[] {
                " ***** ",
                "*    * ",
                "*    * ",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPattern[] word = { O, O, P, S };

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[row]).append("   ");
            }
            System.out.println(line);
        }
    }
}