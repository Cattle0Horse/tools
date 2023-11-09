package constructor.string;

import constructor.DataSetConstructor;
import formatter.string.StringFormatter;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import utils.NonNullElementList;

import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/8 13:46
 * @description :
 */
public class CharacterSetStringConstructor extends DataSetConstructor<Character> {
    @NonNull
    @Getter
    @Setter
    private Integer length;

    public CharacterSetStringConstructor(@NonNull Random random, @NonNull Integer length, @NonNull NonNullElementList<Character> data) {
        super(random, data);
        this.length = length;
    }

    public CharacterSetStringConstructor(@NonNull Integer length, @NonNull NonNullElementList<Character> data) {
        super(data);
        this.length = length;
    }

    public CharacterSetStringConstructor(@NonNull Random random, @NonNull Integer length, @NonNull List<Character> data) {
        super(random, data);
        this.length = length;
    }

    public CharacterSetStringConstructor(@NonNull Integer length, @NonNull List<Character> data) {
        super(data);
        this.length = length;
    }

    public CharacterSetStringConstructor(@NonNull Random random, @NonNull Integer length) {
        super(random);
        this.length = length;
    }

    public CharacterSetStringConstructor(@NonNull Integer length) {
        super();
        this.length = length;
    }

    @Override
    public StringFormatter random() {
        Random random = getRandom();
        List<Character> dataSet = data.getData();
        int m = dataSet.size();
        StringBuilder str = new StringBuilder();
        // to avoid unboxing multiple times in a loop
        for (int i = 0, n = length; i < n; ++i) {
            str.append(dataSet.get(random.nextInt(m)));
        }
        return StringFormatter.convertToFormatter(str.toString());
    }
}
