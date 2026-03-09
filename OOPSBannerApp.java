public class OOPSBannerApp
{
    static class CharacterPatternMap
    {
        Character character;
        String[] pattern;
        
        public CharacterPatternMap(Character ch,String[] patt)
        {
            character = ch;
            pattern = patt;
        }
        public Character getCharacter()
        {
            return character;
        }
        public String[] getPattern()
        {
            return pattern;
        }
    }
    public static CharacterPatternMap[] createCharacterPatternMaps()
    {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[3];
        charMaps[0] = new CharacterPatternMap('O', new String[]
        {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        charMaps[1] = new CharacterPatternMap('P', new String[]
        {
            "*****   ",
            "**   ** ",
            "**    **",
            "**   ** ",
            "*****   ",
            "**      ",
            "**      "
        });
        charMaps[2] = new CharacterPatternMap('S', new String[]
        {
            "  ***** ",
            "***   **",
            "  **    ",
            "   ***  ",
            "     ***",
            "**   ** ",
            " ****   "
        });
        return charMaps;
    }
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps)
    {
        for(CharacterPatternMap map : charMaps)
        {
            if(map.getCharacter() == ch)
            {
                return map.getPattern();
            }
        }
        return charMaps[charMaps.length-1].getPattern();
    }
    public static void printMessage(String message, CharacterPatternMap[] charMaps)
    {
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < message.length(); j++)
            {
                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, charMaps);
                System.out.print(pattern[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args)
    {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}