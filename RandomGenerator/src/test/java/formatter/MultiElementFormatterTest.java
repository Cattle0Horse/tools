package formatter;

import formatter.string.StringFormatter;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 11:45
 * @description :
 */
class MultiElementFormatterTest {
    @Test
    void add() {
        MultiElementFormatter list = new MultiElementFormatter();
        list.add(StringFormatter.convertToFormatter("Hello"));
        list.add(StringFormatter.convertToFormatter("World"));
        list.add(StringFormatter.convertToFormatter("!!!"));
        System.out.println(list.format());
        list.setSeparator(new Separator("\n"));
        System.out.println(list.format());
    }

    @Test
    void addAll() {
        MultiElementFormatter list = new MultiElementFormatter();
        list.addAll(List.of());
        System.out.println(list.format());
        list.addAll(List.of(
                StringFormatter.convertToFormatter("Hello"),
                StringFormatter.convertToFormatter("World"),
                StringFormatter.convertToFormatter("-----"),
                StringFormatter.convertToFormatter("Hello")
        ));
        System.out.println(list.format());
    }

    @Test
    void remove() {
        MultiElementFormatter list = new MultiElementFormatter();
        list.addAll(List.of(
                StringFormatter.convertToFormatter("Hello"),
                StringFormatter.convertToFormatter("World"),
                StringFormatter.convertToFormatter("-----"),
                StringFormatter.convertToFormatter("Hello")
        ));
        System.out.println(list.remove(StringFormatter.convertToFormatter("Hello")));
        System.out.println(list.remove(StringFormatter.convertToFormatter("Hello")));
        System.out.println(list.remove(StringFormatter.convertToFormatter("Hello")));
        System.out.println(list.format());
    }

    @Test
    void testToString() {
        MultiElementFormatter list = new MultiElementFormatter();
        System.out.println(list);
        list.addAll(List.of(
                StringFormatter.convertToFormatter("Hello"),
                StringFormatter.convertToFormatter("World"),
                StringFormatter.convertToFormatter("-----"),
                StringFormatter.convertToFormatter("Hello")
        ));
        System.out.println(list);
    }
}