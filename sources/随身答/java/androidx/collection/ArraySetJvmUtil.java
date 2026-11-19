package androidx.collection;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    public static <T> T[] resizeForToArray(T[] tArr, int i9) {
        if (tArr.length < i9) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i9));
        }
        if (tArr.length > i9) {
            tArr[i9] = null;
        }
        return tArr;
    }
}
