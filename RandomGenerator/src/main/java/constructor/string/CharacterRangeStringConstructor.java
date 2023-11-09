package constructor.string;

import constructor.scoped.Range;
import constructor.scoped.RangeConstructor;
import formatter.string.StringFormatter;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/8 13:52
 * @description :
 */
public class CharacterRangeStringConstructor extends RangeConstructor<Character> {
    @NonNull
    @Getter
    @Setter
    private Integer length;

    public CharacterRangeStringConstructor(@NonNull Random random, @NonNull Integer length, @NonNull Range<Character> range) {
        super(random, range);
        this.length = length;
    }

    public CharacterRangeStringConstructor(@NonNull Integer length, @NonNull Range<Character> range) {
        super(range);
        this.length = length;
    }

    @Override
    public StringFormatter random() {
        Random random = getRandom();
        StringBuilder str = new StringBuilder();
        // to avoid unboxing multiple times in a loop
        int left = range.getLeft(), right = range.getRight();
        for (int i = 0, n = length; i < n; ++i) {
            str.append(random.nextInt(left, right));
        }
        return StringFormatter.convertToFormatter(str.toString());
    }
}
