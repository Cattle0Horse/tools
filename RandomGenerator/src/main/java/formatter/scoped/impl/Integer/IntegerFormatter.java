package formatter.scoped.impl.Integer;

import formatter.scoped.ScopedFormatter;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:34
 * @description :
 */
public class IntegerFormatter extends ScopedFormatter<Integer> {
    public static IntegerFormatter convertToFormatter(Integer data) {
        return new IntegerFormatter(data);
    }

    public IntegerFormatter(@NonNull Integer data) {
        super(data);
    }

    @Override
    public String format() {
        return data.toString();
    }
}
