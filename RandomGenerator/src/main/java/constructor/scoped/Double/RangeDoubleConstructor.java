package constructor.scoped.Double;

import constructor.scoped.Range;
import constructor.scoped.RangeConstructor;
import formatter.scoped.impl.Double.DoubleFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class RangeDoubleConstructor extends RangeConstructor<Double> {
    public RangeDoubleConstructor(@NonNull Random random, @NonNull Range<Double> range) {
        super(random, range);
    }

    public RangeDoubleConstructor(@NonNull Range<Double> range) {
        super(range);
    }

    @Override
    public DoubleFormatter random() {
        return DoubleFormatter.convertToFormatter(getRandom().nextDouble(
                range.getLeft(), range.getRight()
        ));
    }
}
