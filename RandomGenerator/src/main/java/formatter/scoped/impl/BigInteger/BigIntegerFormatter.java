package formatter.scoped.impl.BigInteger;

import formatter.scoped.ScopedFormatter;
import lombok.NonNull;

import java.math.BigInteger;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:58
 * @description :
 */
public class BigIntegerFormatter extends ScopedFormatter<BigInteger> {
    public static BigIntegerFormatter convertToFormatter(BigInteger data) {
        return new BigIntegerFormatter(data);
    }

    public BigIntegerFormatter(@NonNull BigInteger data) {
        super(data);
    }

    @Override
    public String format() {
        return data.toString();
    }
}