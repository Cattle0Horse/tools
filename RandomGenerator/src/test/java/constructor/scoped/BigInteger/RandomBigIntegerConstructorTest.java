package constructor.scoped.BigInteger;

import formatter.scoped.impl.BigInteger.BigIntegerFormatter;
import org.junit.jupiter.api.Test;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 17:23
 * @description : to test {@link RandomBigIntegerConstructor} API
 */
class RandomBigIntegerConstructorTest {
    @Test
    void random() {
        RandomBigIntegerConstructor constructor = new RandomBigIntegerConstructor();
        BigIntegerFormatter element = constructor.random();
        System.out.println("element.toString().length() = " + element.toString().length());
        System.out.println("element.toString() = " + element);
    }
}