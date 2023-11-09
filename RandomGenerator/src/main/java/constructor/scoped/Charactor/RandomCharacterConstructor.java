package constructor.scoped.Charactor;

import constructor.RandomConstructor;
import formatter.scoped.impl.Character.CharacterFormatter;
import lombok.NonNull;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class RandomCharacterConstructor extends RandomConstructor {
    public RandomCharacterConstructor(@NonNull Random random) {
        super(random);
    }

    public RandomCharacterConstructor() {
        super();
    }

    @Override
    public CharacterFormatter random() {
        return CharacterFormatter.convertToFormatter((char) getRandom().nextInt(Character.MIN_VALUE, Character.MAX_VALUE + 1));
    }
}
