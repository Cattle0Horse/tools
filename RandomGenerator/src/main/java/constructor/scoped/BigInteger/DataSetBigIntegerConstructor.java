package constructor.scoped.BigInteger;

import constructor.DataSetConstructor;
import formatter.scoped.impl.BigInteger.BigIntegerFormatter;
import lombok.NonNull;
import utils.ListUtil;
import utils.NonNullElementList;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class DataSetBigIntegerConstructor extends DataSetConstructor<BigInteger> {
    public DataSetBigIntegerConstructor(@NonNull Random random, @NonNull NonNullElementList<BigInteger> data) {
        super(random, data);
    }

    public DataSetBigIntegerConstructor(@NonNull NonNullElementList<BigInteger> data) {
        super(data);
    }

    public DataSetBigIntegerConstructor(@NonNull Random random, @NonNull List<BigInteger> data) {
        super(random, data);
    }

    public DataSetBigIntegerConstructor(@NonNull List<BigInteger> data) {
        super(data);
    }

    public DataSetBigIntegerConstructor(@NonNull Random random) {
        super(random);
    }

    public DataSetBigIntegerConstructor() {
        super();
    }

    @Override
    public BigIntegerFormatter random() {
        List<BigInteger> list = data.getData();
        ListUtil.assertNonEmpty(list, "DataSet contains at least one element");

        return BigIntegerFormatter.convertToFormatter(
                list.get(getRandom().nextInt(list.size()))
        );
    }
}
