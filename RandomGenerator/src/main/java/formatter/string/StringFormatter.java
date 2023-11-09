package formatter.string;

import formatter.Formatter;
import lombok.Data;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/7 19:21
 * @description :
 */
@Data
public class StringFormatter implements Formatter {
    public static StringFormatter convertToFormatter(String data) {
        return new StringFormatter(data);
    }

    @NonNull
    private String value;

    public StringFormatter(@NonNull String value) {
        this.value = value;
    }

    @Override
    public String format() {
        return value;
    }
}
