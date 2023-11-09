package formatter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/5 20:37
 * @description : Separation for {@link MultiElementFormatter#format()}
 * @see MultiElementFormatter
 */
@ToString
@EqualsAndHashCode
public class Separator {
    @NonNull
    @Getter
    private final String word;

    public Separator(@NonNull String word) {
        this.word = word;
    }
}
