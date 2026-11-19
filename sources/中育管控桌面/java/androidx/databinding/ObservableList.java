package androidx.databinding;

import java.util.List;

/* loaded from: classes2.dex */
public interface ObservableList<T> extends List<T> {

    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t6);

        public abstract void onItemRangeChanged(T t6, int i6, int i7);

        public abstract void onItemRangeInserted(T t6, int i6, int i7);

        public abstract void onItemRangeMoved(T t6, int i6, int i7, int i8);

        public abstract void onItemRangeRemoved(T t6, int i6, int i7);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
