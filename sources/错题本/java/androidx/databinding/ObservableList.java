package androidx.databinding;

import java.util.List;

/* loaded from: classes2.dex */
public interface ObservableList<T> extends List<T> {

    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t8);

        public abstract void onItemRangeChanged(T t8, int i, int i8);

        public abstract void onItemRangeInserted(T t8, int i, int i8);

        public abstract void onItemRangeMoved(T t8, int i, int i8, int i9);

        public abstract void onItemRangeRemoved(T t8, int i, int i8);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
