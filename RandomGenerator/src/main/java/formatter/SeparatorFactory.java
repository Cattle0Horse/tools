package formatter;

import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 15:15
 * @description : flyweight factory of Separator class
 */
public final class SeparatorFactory {
    private SeparatorFactory() {
        throw new AssertionError("No random.formatter.SeparatorFactory instances for you!");
    }

    public static final Separator SEPARATOR = new Separator(" ");
    private static final Map<String, Separator> HASH = new HashMap<>();

    public static Separator getSeparator() {
        return SEPARATOR;
    }

    public static Separator getSeparator(@NonNull String key) {
        if (HASH.containsKey(key)) {
            return HASH.get(key);
        }
        Separator separator = new Separator(key);
        HASH.put(key, separator);
        return separator;
    }
}
