public class LogLevels {
    
    public static String message(String logLine) {
        String arrayS[] = logLine.split(" ", 2);
        return arrayS[1].trim();
    }

    public static String logLevel(String logLine) {
        String arrayS[] = logLine.split("[\\[\\]]");
        return arrayS[1].toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
