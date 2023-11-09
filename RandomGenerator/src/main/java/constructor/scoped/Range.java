package constructor.scoped;

import lombok.Data;
import lombok.NonNull;
import utils.Assert;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 13:43
 * @description :
 */
@Data
public class Range<T extends Comparable<T>> {
    @NonNull
    private T left, right;

    public Range(@NonNull T left, @NonNull T right) {
        Assert.isTrue(left.compareTo(right) < 0, "please make sure left is strictly less than right");
        this.left = left;
        this.right = right;
    }
}
