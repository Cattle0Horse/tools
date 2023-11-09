package constructor.scoped.Float;

import constructor.scoped.Range;
import constructor.scoped.RangeConstructor;
import formatter.scoped.impl.Float.FloatFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:16
 * @description :
 **/
public class RangeFloatConstructor extends RangeConstructor<Float> {
    public RangeFloatConstructor(@NonNull Random random, @NonNull Range<Float> range) {
        super(random, range);
    }

    public RangeFloatConstructor(@NonNull Range<Float> range) {
        super(range);
    }

    @Override
    public FloatFormatter random() {
        return FloatFormatter.convertToFormatter(getRandom().nextFloat(
                range.getLeft(), range.getRight()
        ));
    }
}
