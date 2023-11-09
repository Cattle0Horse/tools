package formatter.unscoped;

import formatter.Formatter;
import lombok.Data;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 14:20
 * @description :
 */
@Data
public abstract class UnscopedFormatter<T extends Unscoped> implements Formatter {
    @NonNull
    private T data;

    public UnscopedFormatter(@NonNull T data) {
        this.data = data;
    }
}
