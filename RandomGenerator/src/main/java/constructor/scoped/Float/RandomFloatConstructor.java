package constructor.scoped.Float;

import constructor.RandomConstructor;
import formatter.scoped.impl.Float.FloatFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * For example: <pre>{@code
 *      RandomFloatConstructor constructor = new RandomFloatConstructor();
 *      FloatFormatter element = constructor.random();
 * }</pre>
 * It will get an element of type {@link FloatFormatter} in the range [-2<sup>31</sup>,2<sup>31</sup>)
 *
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:29
 * @description : {@link RandomConstructor}的一个实现类，调用{@link #random()}将生成一个伪随机、均匀分布的{@link FloatFormatter}类型值
 * （所有的2<sup>32</sup>个 {@code int} 类型的值等可能性），它通过{@link FloatFormatter#convertToFormatter(Float)}转化
 * 为可格式化的类型{@link FloatFormatter}.
 * @see #random()
 * @see FloatFormatter
 * @see RandomConstructor
 */
public class RandomFloatConstructor extends RandomConstructor {
    public RandomFloatConstructor(@NonNull Random random) {
        super(random);
    }

    public RandomFloatConstructor() {
        super();
    }

    @Override
    public FloatFormatter random() {
        return FloatFormatter.convertToFormatter(getRandom().nextFloat());
    }
}
