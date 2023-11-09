package constructor.scoped.BigInteger;

import constructor.scoped.Range;
import constructor.scoped.RangeConstructor;
import formatter.scoped.impl.BigInteger.BigIntegerFormatter;
import lombok.NonNull;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 17:15
 * @description :
 **/
public class RangeBigIntegerConstructor extends RangeConstructor<BigInteger> {
    public RangeBigIntegerConstructor(@NonNull Random random, @NonNull Range<BigInteger> range) {
        super(random, range);
    }

    public RangeBigIntegerConstructor(@NonNull Range<BigInteger> range) {
        super(range);
    }

    /**
     * 参考了<a href="https://www.tutorialspoint.com/how-to-generate-a-random-biginteger-value-in-java">文章</a>
     *
     * @return 一个随机生成的[left, right)范围内的BigInteger
     */
    @Override
    public BigIntegerFormatter random() {
        BigInteger left = range.getLeft(), right = range.getRight().subtract(BigInteger.ONE);
        BigInteger difference = right.subtract(left);
        int len = right.bitLength();
        BigInteger res = new BigInteger(len, getRandom());
        if (res.compareTo(left) < 0) {
            res = res.add(left);
        }
        if (res.compareTo(difference) >= 0) {
            res = res.mod(difference).add(left);
        }
        return BigIntegerFormatter.convertToFormatter(res);
    }
}
