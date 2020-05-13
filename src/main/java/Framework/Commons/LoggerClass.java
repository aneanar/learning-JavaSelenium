package Framework.Commons;


import org.apache.log4j.Logger;


public class LoggerClass {

    private static Logger log4j=  Logger.getLogger("LoggerClass");

    public static void info(String message) {
        log4j.info(message);

    }
    public static void error(String message) {
        log4j.error(message);

    }
    public static void warning(String message) {
        log4j.warn(message);

    }
    public static void debugg(String message) {
        log4j.debug(message);

    }
}
