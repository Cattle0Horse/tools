package constructor.scoped.Double;

import constructor.DataSetConstructor;
import formatter.scoped.impl.Double.DoubleFormatter;
import lombok.NonNull;
import utils.ListUtil;
import utils.NonNullElementList;

import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class DataSetDoubleConstructor extends DataSetConstructor<Double> {
    public DataSetDoubleConstructor(@NonNull Random random, @NonNull NonNullElementList<Double> data) {
        super(random, data);
    }

    public DataSetDoubleConstructor(@NonNull NonNullElementList<Double> data) {
        super(data);
    }

    public DataSetDoubleConstructor(@NonNull Random random, @NonNull List<Double> data) {
        super(random, data);
    }

    public DataSetDoubleConstructor(@NonNull List<Double> data) {
        super(data);
    }

    public DataSetDoubleConstructor(@NonNull Random random) {
        super(random);
    }

    public DataSetDoubleConstructor() {
        super();
    }

    @Override
    public DoubleFormatter random() {
        List<Double> list = data.getData();
        ListUtil.assertNonEmpty(list, "DataSet contains at least one element");

        return DoubleFormatter.convertToFormatter(
                list.get(getRandom().nextInt(list.size()))
        );
    }
}
