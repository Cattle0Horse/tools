package constructor;

import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 14:44
 * @description : It is just an abstracted class that generates data without any restrictions,
 * in order to be the same as {@link DataSetConstructor} and {@link constructor.scoped.RangeConstructor},
 * and also for future expansion and maintenance.
 */
public abstract class RandomConstructor extends Constructor {
    public RandomConstructor(@NonNull Random random) {
        super(random);
    }

    public RandomConstructor() {
        super();
    }
}
