package androidx.collection;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    public static <T> T[] resizeForToArray(T[] tArr, int i6) {
        if (tArr.length < i6) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i6));
        }
        if (tArr.length > i6) {
            tArr[i6] = null;
        }
        return tArr;
    }
}
