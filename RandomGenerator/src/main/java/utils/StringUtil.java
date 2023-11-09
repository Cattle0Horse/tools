package utils;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:12
 * @description :
 */
public final class StringUtil {
    public static final String LOWERCASE_CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBER_CHARACTERS = "0123456789";
    public static final String NORMAL_CHARACTERS = LOWERCASE_CHARACTERS + UPPERCASE_CHARACTERS + NUMBER_CHARACTERS;
    private StringUtil(){
        throw new AssertionError("No random.constructor.utils.StringTool instances for you!");
    }
}
