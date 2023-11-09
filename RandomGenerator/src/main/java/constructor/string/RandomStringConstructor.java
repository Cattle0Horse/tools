package constructor.string;

import constructor.RandomConstructor;
import formatter.string.StringFormatter;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import utils.StringUtil;

import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/8 13:46
 * @description :
 */
public class RandomStringConstructor extends RandomConstructor {
    @NonNull
    @Getter
    @Setter
    private Integer length;

    public RandomStringConstructor(Random random, Integer length) {
        super(random);
        this.length = length;
    }

    public RandomStringConstructor(Integer length) {
        super();
        this.length = length;
    }

    @Override
    public StringFormatter random() {
        Random random = getRandom();
        int n = length;
        int m = StringUtil.NORMAL_CHARACTERS.length();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            str.append(StringUtil.NORMAL_CHARACTERS.charAt(random.nextInt(m)));
        }
        return StringFormatter.convertToFormatter(str.toString());
    }
}
