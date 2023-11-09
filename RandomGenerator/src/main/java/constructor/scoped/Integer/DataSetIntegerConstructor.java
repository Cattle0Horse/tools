package constructor.scoped.Integer;

import constructor.DataSetConstructor;
import formatter.scoped.impl.Integer.IntegerFormatter;
import lombok.NonNull;
import utils.ListUtil;
import utils.NonNullElementList;

import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:54
 * @description :
 */
public class DataSetIntegerConstructor extends DataSetConstructor<Integer> {
    public DataSetIntegerConstructor(@NonNull Random random, @NonNull NonNullElementList<Integer> data) {
        super(random, data);
    }

    public DataSetIntegerConstructor(@NonNull NonNullElementList<Integer> data) {
        super(data);
    }

    public DataSetIntegerConstructor(@NonNull Random random, @NonNull List<Integer> data) {
        super(random, data);
    }

    public DataSetIntegerConstructor(@NonNull List<Integer> data) {
        super(data);
    }

    public DataSetIntegerConstructor(@NonNull Random random) {
        super(random);
    }

    public DataSetIntegerConstructor() {
        super();
    }

    @Override
    public IntegerFormatter random() {
        List<Integer> list = data.getData();
        ListUtil.assertNonEmpty(list, "DataSet contains at least one element");

        return IntegerFormatter.convertToFormatter(
                list.get(getRandom().nextInt(list.size()))
        );
    }
}
