package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlin.jvm.internal.f */
/* loaded from: classes.dex */
public final class C2763f {

    /* renamed from: a */
    @NotNull
    private static final Object[] f10729a = new Object[0];

    @NotNull
    /* renamed from: a */
    public static final Object[] m9232a(@NotNull Collection<?> collection) {
        C2769l.m9241e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    objArrCopyOf[i4] = it.next();
                    if (i5 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i6 = 2147483645;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                        C2769l.m9240d(objArrCopyOf, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i5);
                        C2769l.m9240d(objArrCopyOf2, "copyOf(result, size)");
                        return objArrCopyOf2;
                    }
                    i4 = i5;
                }
            }
        }
        return f10729a;
    }

    @NotNull
    /* renamed from: b */
    public static final Object[] m9233b(@NotNull Collection<?> collection, @Nullable Object[] objArr) throws NegativeArraySizeException {
        Object[] objArrCopyOf;
        C2769l.m9241e(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i4 = 0;
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
            int i5 = i4 + 1;
            objArrCopyOf[i4] = it.next();
            if (i5 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    if (i5 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i6 = 2147483645;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                C2769l.m9240d(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i5] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i5);
                C2769l.m9240d(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i4 = i5;
        }
    }
}
