package constructor;

import formatter.Formatter;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/7 13:44
 * @description : Constructor基类，包含{@link Random}的基本构造
 */
public abstract class Constructor {
    @NonNull
    @Getter
    @Setter
    private Random random;

    public Constructor(@NonNull Random random) {
        this.random = random;
    }

    public Constructor() {
        this(RandomFactory.RANDOM);
    }

    /**
     * 随机生成一个 {@link Formatter}
     *
     * @return {@link Formatter}
     */
    public abstract Formatter random();
}
