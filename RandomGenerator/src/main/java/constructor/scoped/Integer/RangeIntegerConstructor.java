package constructor.scoped.Integer;

import constructor.scoped.Range;
import constructor.scoped.RangeConstructor;
import formatter.scoped.impl.Integer.IntegerFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:47
 * @description :
 */
public class RangeIntegerConstructor extends RangeConstructor<Integer> {
    public RangeIntegerConstructor(@NonNull Random random, @NonNull Range<Integer> range) {
        super(random, range);
    }

    public RangeIntegerConstructor(@NonNull Range<Integer> range) {
        super(range);
    }

    @Override
    public IntegerFormatter random() {
        return IntegerFormatter.convertToFormatter(getRandom().nextInt(
                range.getLeft(), range.getRight()
        ));
    }
}
