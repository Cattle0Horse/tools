package formatter;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import utils.NonNullElementList;

import java.util.List;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/5 22:12
 * @description :
 */
public class MultiElementFormatter extends NonNullElementList<Formatter> implements Formatter {
    @NonNull
    @Getter
    @Setter
    private Separator separator;

    public MultiElementFormatter(@NonNull Separator separator, @NonNull List<Formatter> data) {
        super(data);
        this.separator = separator;
    }

    public MultiElementFormatter(@NonNull Separator separator) {
        super();
        this.separator = separator;
    }

    public MultiElementFormatter() {
        super();
        this.separator = SeparatorFactory.SEPARATOR;
    }

    @Override
    public String format() {
        StringBuilder str = new StringBuilder();
        boolean notFirst = false;
        for (Formatter value : getData()) {
            if (notFirst) {
                str.append(separator.getWord());
            } else {
                notFirst = true;
            }
            str.append(value.format());
        }
        return str.toString();
    }
}
