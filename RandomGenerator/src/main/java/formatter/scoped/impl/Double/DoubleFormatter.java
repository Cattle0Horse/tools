package formatter.scoped.impl.Double;

import formatter.scoped.ScopedFormatter;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:58
 * @description :
 */
public class DoubleFormatter extends ScopedFormatter<Double> {
    public static DoubleFormatter convertToFormatter(Double data) {
        return new DoubleFormatter(data);
    }

    public DoubleFormatter(@NonNull Double data) {
        super(data);
    }

    @Override
    public String format() {
        return data.toString();
    }
}