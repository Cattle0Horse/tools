package constructor.scoped;

import constructor.Constructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 13:59
 * @description :
 */
@ToString
public abstract class RangeConstructor<T extends Comparable<T>> extends Constructor {
    @NonNull
    @Getter
    @Setter
    protected Range<T> range;

    public RangeConstructor(@NonNull Random random, @NonNull Range<T> range) {
        super(random);
        this.range = range;
    }

    public RangeConstructor(@NonNull Range<T> range) {
        super();
        this.range = range;
    }
}
