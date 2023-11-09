package constructor.scoped.BigInteger;

import constructor.scoped.Range;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 17:41
 * @description :
 */
class RangeBigIntegerConstructorTest {

    @Test
    void random() {
        BigInteger left = BigInteger.valueOf(1);
        BigInteger right = new BigInteger("123456789999999999999999");
        Range<BigInteger> range = new Range<>(left, right);
        RangeBigIntegerConstructor constructor = new RangeBigIntegerConstructor(range);
        System.out.println("Test toString() method");
        System.out.println("constructor.toString() = " + constructor.toString());
        System.out.println("---------------------------------------------");

        System.out.println("Test Random() method");
        System.out.println("constructor.random() = " + constructor.random());
    }
}