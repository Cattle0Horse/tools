package utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 12:26
 * @description : To test {@link ListUtil}
 * @see ListUtil
 */
class ListUtilTest {
    @Test
    void assertNonEmpty() {
        List<Integer> list = new ArrayList<>((List.of(1, 2, 3, 4, 4)));
        try {
            ListUtil.assertNonEmpty(list);
        } catch (IllegalArgumentException e) {
            System.out.println("1: " + e.getMessage());
        }
        list.clear();
        try {
            ListUtil.assertNonEmpty(list, "assert non-empty");
        } catch (IllegalArgumentException e) {
            System.out.println("2: " + e.getMessage());
        }
        try {
            ListUtil.assertNonEmpty(list);
        } catch (IllegalArgumentException e) {
            System.out.println("3: " + e.getMessage());
        }
    }

    @Test
    void addNonNullElements() {
        List<Integer> list = new ArrayList<>();
        try {
            ListUtil.addNonNullElements(list, Arrays.asList(1, 23, 24, 213, 4, null));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}