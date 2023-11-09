package formatter.scoped;

import formatter.Formatter;
import lombok.Data;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 14:09
 * @description :
 */
@Data
public abstract class ScopedFormatter<T extends Comparable<T>> implements Formatter {
    @NonNull
    protected T data;

    public ScopedFormatter(@NonNull T data) {
        this.data = data;
    }
}
