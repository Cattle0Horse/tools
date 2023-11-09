package utils;

import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 13:45
 * @description :
 */
public class Assert {
    private Assert() {
        throw new AssertionError("No random.constructor.utils.Assert instances for you!");
    }

    public static void isTrue(boolean flag, @NonNull String message) {
        if (!flag) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isFalse(boolean flag, @NonNull String message) {
        if (flag) {
            throw new IllegalArgumentException(message);
        }
    }

    public static void isTrue(boolean flag) {
        if (!flag) {
            throw new IllegalArgumentException("Assert flag is true, but a false is passed");
        }
    }

    public static void isFalse(boolean flag) {
        if (flag) {
            throw new IllegalArgumentException("Assert flag is false, but a false is passed");
        }
    }
}
