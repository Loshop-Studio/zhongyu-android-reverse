package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ListenerUtil {
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T getListener(View view, int i6) {
        return (T) view.getTag(i6);
    }

    public static <T> T trackListener(View view, T t6, int i6) {
        T t7 = (T) view.getTag(i6);
        view.setTag(i6, t6);
        return t7;
    }
}
