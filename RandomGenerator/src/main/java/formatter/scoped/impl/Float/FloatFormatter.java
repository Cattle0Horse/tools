package formatter.scoped.impl.Float;

import formatter.scoped.ScopedFormatter;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:58
 * @description :
 */
public class FloatFormatter extends ScopedFormatter<Float> {
    public static FloatFormatter convertToFormatter(Float data) {
        return new FloatFormatter(data);
    }

    public FloatFormatter(@NonNull Float data) {
        super(data);
    }

    @Override
    public String format() {
        return data.toString();
    }
}