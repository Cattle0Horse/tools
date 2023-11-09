package formatter.scoped.impl.Character;

import formatter.scoped.ScopedFormatter;
import lombok.NonNull;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 16:58
 * @description :
 */
public class CharacterFormatter extends ScopedFormatter<Character> {
    public static CharacterFormatter convertToFormatter(Character data) {
        return new CharacterFormatter(data);
    }

    public CharacterFormatter(@NonNull Character data) {
        super(data);
    }

    @Override
    public String format() {
        return data.toString();
    }
}