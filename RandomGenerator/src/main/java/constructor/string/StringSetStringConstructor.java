package constructor.string;

import constructor.DataSetConstructor;
import formatter.string.StringFormatter;
import lombok.NonNull;
import utils.ListUtil;
import utils.NonNullElementList;

import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/8 13:51
 * @description :
 */
public class StringSetStringConstructor extends DataSetConstructor<String> {
    public StringSetStringConstructor(@NonNull Random random, @NonNull NonNullElementList<String> data) {
        super(random, data);
    }

    public StringSetStringConstructor(@NonNull NonNullElementList<String> data) {
        super(data);
    }

    public StringSetStringConstructor(@NonNull Random random, @NonNull List<String> data) {
        super(random, data);
    }

    public StringSetStringConstructor(@NonNull List<String> data) {
        super(data);
    }

    public StringSetStringConstructor(@NonNull Random random) {
        super(random);
    }

    public StringSetStringConstructor() {
        super();
    }

    @Override
    public StringFormatter random() {
        List<String> list = data.getData();
        ListUtil.assertNonEmpty(list, "DataSet contains at least one element");
        return StringFormatter.convertToFormatter(list.get(getRandom().nextInt(list.size())));
    }
}
