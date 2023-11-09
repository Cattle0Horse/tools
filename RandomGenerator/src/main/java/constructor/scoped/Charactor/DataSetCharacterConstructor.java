package constructor.scoped.Charactor;

import constructor.DataSetConstructor;
import formatter.scoped.impl.Character.CharacterFormatter;
import lombok.NonNull;
import utils.ListUtil;
import utils.NonNullElementList;

import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date   : 2023/11/9 17:15
 * @description :
 **/
public class DataSetCharacterConstructor extends DataSetConstructor<Character> {
    public DataSetCharacterConstructor(@NonNull Random random, @NonNull NonNullElementList<Character> data) {
        super(random, data);
    }

    public DataSetCharacterConstructor(@NonNull NonNullElementList<Character> data) {
        super(data);
    }

    public DataSetCharacterConstructor(@NonNull Random random, @NonNull List<Character> data) {
        super(random, data);
    }

    public DataSetCharacterConstructor(@NonNull List<Character> data) {
        super(data);
    }

    public DataSetCharacterConstructor(@NonNull Random random) {
        super(random);
    }

    public DataSetCharacterConstructor() {
        super();
    }

    @Override
    public CharacterFormatter random() {
        List<Character> list = data.getData();
        ListUtil.assertNonEmpty(list, "DataSet contains at least one element");

        return CharacterFormatter.convertToFormatter(
                list.get(getRandom().nextInt(list.size()))
        );
    }
}
