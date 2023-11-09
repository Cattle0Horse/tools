package constructor;

import lombok.NonNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/6 11:11
 * @description : flyweight factory of random class
 */
public final class RandomFactory {
    private RandomFactory() {
        throw new AssertionError("No random.constructor.RandomFactory instances for you!");
    }
    public static final Random RANDOM = new Random();
    private static final Map<Integer, Random> HASH = new HashMap<>();

    public static Random getRandom() {
        return RANDOM;
    }

    public static Random getRandom(@NonNull Integer key) {
        if (HASH.containsKey(key)) {
            return HASH.get(key);
        }
        Random random = new Random(key);
        HASH.put(key, random);
        return random;
    }
}
