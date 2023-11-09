package constructor;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;
import utils.NonNullElementList;

import java.util.List;
import java.util.Random;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 13:10
 * @description :
 */
@ToString
public abstract class DataSetConstructor<T> extends Constructor {
    @NonNull
    @Getter
    protected NonNullElementList<T> data;

    public DataSetConstructor(@NonNull Random random, @NonNull NonNullElementList<T> data) {
        super(random);
        this.data = data;
    }

    public DataSetConstructor(@NonNull NonNullElementList<T> data) {
        super();
        this.data = data;
    }

    public DataSetConstructor(@NonNull Random random, @NonNull List<T> data) {
        super(random);
        this.data = new NonNullElementList<>(data);
    }

    public DataSetConstructor(@NonNull List<T> data) {
        super();
        this.data = new NonNullElementList<>(data);
    }

    public DataSetConstructor(@NonNull Random random) {
        super(random);
        this.data = new NonNullElementList<>();
    }

    public DataSetConstructor() {
        super();
        this.data = new NonNullElementList<>();
    }

    public void add(@NonNull T element) {
        data.add(element);
    }

    public void add(int index, @NonNull T element) {
        data.add(index, element);
    }

    public void addAll(@NonNull List<T> elements) {
        data.addAll(elements);
    }

    public boolean remove(@NonNull T element) {
        return data.remove(element);
    }

    public void clear() {
        data.clear();
    }

    public int size(){
        return data.size();
    }

    public void setData(@NonNull List<T> data) {
        this.data.setData(data);
    }

    public void setData(@NonNull NonNullElementList<T> data) {
        this.data = data;
    }
}
