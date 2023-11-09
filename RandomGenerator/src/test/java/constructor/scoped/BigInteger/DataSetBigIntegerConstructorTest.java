package constructor.scoped.BigInteger;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 17:31
 * @description : to test {@link DataSetBigIntegerConstructor} API
 */
class DataSetBigIntegerConstructorTest {

    @Test
    void random() {
        DataSetBigIntegerConstructor constructor = new DataSetBigIntegerConstructor();
        System.out.println("Test toString() method");
        System.out.println("constructor.toString() = " + constructor.toString());
        System.out.println("-------------------------------------------");
        System.out.println("Testing the random() method with an empty dataset");
        try {
            constructor.random();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Successful exception catch");
        }
        System.out.println("-------------------------------------------");
        constructor.add(new BigInteger("1"));
        constructor.add(new BigInteger("3"));
        constructor.add(new BigInteger("100"));
        constructor.add(new BigInteger("9999"));
        System.out.println("constructor.random() = " + constructor.random());
        System.out.println("constructor.toString() = " + constructor.toString());
    }
}