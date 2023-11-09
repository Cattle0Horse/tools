package constructor.scoped.Double;

import constructor.RandomConstructor;
import formatter.scoped.impl.Double.DoubleFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class RandomDoubleConstructor extends RandomConstructor {
    public RandomDoubleConstructor(@NonNull Random random) {
        super(random);
    }

    public RandomDoubleConstructor() {
        super();
    }

    @Override
    public DoubleFormatter random() {
        return DoubleFormatter.convertToFormatter(getRandom().nextDouble());
    }
}
