package constructor.scoped.BigInteger;

import constructor.RandomConstructor;
import formatter.scoped.impl.BigInteger.BigIntegerFormatter;
import lombok.NonNull;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:14
 * @description :
 **/
public class RandomBigIntegerConstructor extends RandomConstructor {
    private static final int DEFAULT_MAX_BIT_LEN = 1000;

    public RandomBigIntegerConstructor(@NonNull Random random) {
        super(random);
    }

    public RandomBigIntegerConstructor() {
        super();
    }

    /**
     * @return 一个随机生成的[0, 2^1000)范围内的BigInteger
     */
    @Override
    public BigIntegerFormatter random() {
        return BigIntegerFormatter.convertToFormatter(
                new BigInteger(DEFAULT_MAX_BIT_LEN, getRandom())
        );
    }
}
