import java.util.Map;

class SqueakyClean {
    
    private static final Map<Character, Character> LEET_MAP = Map.of(
        '4', 'a',
        '3', 'e',
        '0', 'o',
        '1', 'l',
        '7', 't'
    );
    
    static String clean(String identifier) {
        char[] charArray = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        boolean capitalizeNext = false;
 
        for (char ch : charArray) {
            if (!Character.isLetterOrDigit(ch) && ch != '-' && !Character.isWhitespace(ch))
                continue;

            if (Character.isDigit(ch))
                ch = LEET_MAP.getOrDefault(ch, ch);

            if (ch == '-') {
                capitalizeNext = true;
            } else if (Character.isWhitespace(ch)) {
                builder.append('_');
            } else if (capitalizeNext) {
                builder.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                builder.append(ch);
            }
        }
        
        identifier = builder.toString();
        return identifier;
    }
}
