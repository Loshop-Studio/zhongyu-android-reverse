package androidx.databinding;

import java.util.List;

/* loaded from: classes.dex */
public interface ObservableList<T> extends List<T> {

    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public abstract void onChanged(T t3);

        public abstract void onItemRangeChanged(T t3, int i4, int i5);

        public abstract void onItemRangeInserted(T t3, int i4, int i5);

        public abstract void onItemRangeMoved(T t3, int i4, int i5, int i6);

        public abstract void onItemRangeRemoved(T t3, int i4, int i5);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
