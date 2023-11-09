package constructor.scoped.Charactor;

import constructor.scoped.Range;
import constructor.scoped.RangeConstructor;
import formatter.scoped.impl.Character.CharacterFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class RangeCharacterConstructor extends RangeConstructor<Character> {
    public RangeCharacterConstructor(@NonNull Random random, @NonNull Range<Character> range) {
        super(random, range);
    }

    public RangeCharacterConstructor(@NonNull Range<Character> range) {
        super(range);
    }

    @Override
    public CharacterFormatter random() {
        return CharacterFormatter.convertToFormatter((char) getRandom().nextInt(
                range.getLeft(), range.getRight()
        ));
    }
}
