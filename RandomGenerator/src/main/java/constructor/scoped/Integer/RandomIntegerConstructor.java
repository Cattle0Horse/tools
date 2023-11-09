package constructor.scoped.Integer;

import constructor.RandomConstructor;
import formatter.scoped.impl.Integer.IntegerFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * For example: <pre>{@code
 *      RandomIntegerConstructor constructor = new RandomIntegerConstructor();
 *      IntegerFormatter element = constructor.random();
 * }</pre>
 * It will get an element of type {@link IntegerFormatter} in the range [-2<sup>31</sup>,2<sup>31</sup>)
 *
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:29
 * @description : {@link RandomConstructor}的一个实现类，调用{@link #random()}将生成一个伪随机、均匀分布的{@link IntegerFormatter}类型值
 * （所有的2<sup>32</sup>个 {@code int} 类型的值等可能性），它通过{@link IntegerFormatter#convertToFormatter(Integer)}转化
 * 为可格式化的类型{@link IntegerFormatter}.
 * @see #random()
 * @see IntegerFormatter
 * @see RandomConstructor
 */
public class RandomIntegerConstructor extends RandomConstructor {
    public RandomIntegerConstructor(@NonNull Random random) {
        super(random);
    }

    public RandomIntegerConstructor() {
        super();
    }

    @Override
    public IntegerFormatter random() {
        return IntegerFormatter.convertToFormatter(getRandom().nextInt());
    }
}
