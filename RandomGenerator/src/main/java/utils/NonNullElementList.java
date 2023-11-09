package utils;

import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Cattle_Horse
 * @date : 2023/11/9 13:18
 * @description : 确定无空元素的列表
 */
@ToString
public class NonNullElementList<T> {
    @NonNull
    @Getter
    private final List<T> data;

    public NonNullElementList(@NonNull List<T> elements) {
        this.data = new ArrayList<>();
        ListUtil.addNonNullElements(this.data, elements);
    }

    public NonNullElementList() {
        this.data = new ArrayList<>();
    }

    public void add(@NonNull T element) {
        data.add(element);
    }

    public void add(int index, @NonNull T element) {
        data.add(index, element);
    }

    public void set(int index, @NonNull T element) {
        data.set(index, element);
    }

    public void addAll(@NonNull List<T> elements) {
        ListUtil.addNonNullElements(data, elements);
    }

    public boolean remove(@NonNull T element) {
        return data.remove(element);
    }

    public void clear() {
        data.clear();
    }

    public int size() {
        return data.size();
    }

    public void setData(@NonNull List<T> data) {
        this.data.clear();
        this.addAll(data);
    }
}
