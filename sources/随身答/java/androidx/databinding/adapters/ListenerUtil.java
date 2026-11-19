package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ListenerUtil {
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T getListener(View view, int i9) {
        return (T) view.getTag(i9);
    }

    public static <T> T trackListener(View view, T t9, int i9) {
        T t10 = (T) view.getTag(i9);
        view.setTag(i9, t9);
        return t10;
    }
}
