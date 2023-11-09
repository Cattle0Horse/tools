package utils;

import lombok.NonNull;

import java.util.List;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/8 21:04
 * @description : Static tool methods for {@link List}
 * @see List
 */
public class ListUtil {
    private ListUtil() {
        throw new AssertionError("No random.constructor.utils.ListTool instances for you!");
    }

    public static void assertNonEmpty(@NonNull List<?> list) {
        Assert.isFalse(list.isEmpty(), "List contains at least one element");
    }

    public static void assertNonEmpty(@NonNull List<?> list, String message) {
        Assert.isFalse(list.isEmpty(), message);
    }

    public static <T> void addNonNullElement(@NonNull List<T> list, @NonNull T element) {
        list.add(element);
    }

    public static <T> void addNonNullElements(@NonNull List<T> list, @NonNull List<T> elements) {
        for (T element : elements) {
            addNonNullElement(list, element);
        }
    }
}
