package constructor.scoped.Float;

import constructor.DataSetConstructor;
import formatter.scoped.impl.Float.FloatFormatter;
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
public class DataSetFloatConstructor extends DataSetConstructor<Float> {
    public DataSetFloatConstructor(@NonNull Random random, @NonNull NonNullElementList<Float> data) {
        super(random, data);
    }

    public DataSetFloatConstructor(@NonNull NonNullElementList<Float> data) {
        super(data);
    }

    public DataSetFloatConstructor(@NonNull Random random, @NonNull List<Float> data) {
        super(random, data);
    }

    public DataSetFloatConstructor(@NonNull List<Float> data) {
        super(data);
    }

    public DataSetFloatConstructor(@NonNull Random random) {
        super(random);
    }

    public DataSetFloatConstructor() {
        super();
    }

    @Override
    public FloatFormatter random() {
        List<Float> list = data.getData();
        ListUtil.assertNonEmpty(list, "DataSet contains at least one element");

        return FloatFormatter.convertToFormatter(
                list.get(getRandom().nextInt(list.size()))
        );
    }
}
