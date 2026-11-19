package p160d.p162f.p164b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: d.f.b.b */
/* loaded from: classes.dex */
public final class C1009b {

    /* renamed from: a */
    public static final Object[] f5483a = new Object[0];

    /* renamed from: a */
    public static final Object[] m2803a(Collection<?> collection) {
        Object[] objArr = f5483a;
        C1011d.m2809e(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                C1011d.m2808d(objArrCopyOf, "Arrays.copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                C1011d.m2808d(objArrCopyOf2, "Arrays.copyOf(result, size)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public static final Object[] m2804b(Collection<?> collection, Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        C1011d.m2809e(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Objects.requireNonNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i3 = 2147483645;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                C1011d.m2808d(objArrCopyOf, "Arrays.copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                C1011d.m2808d(objArrCopyOf2, "Arrays.copyOf(result, size)");
                return objArrCopyOf2;
            }
            i = i2;
        }
    }
}
