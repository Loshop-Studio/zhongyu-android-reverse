package p325rc;

import java.lang.reflect.Array;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.n */
/* loaded from: classes6.dex */
public abstract class AbstractC10960n {
    /* renamed from: a */
    public static final Object[] m23980a(Object[] reference, int i10) throws NegativeArraySizeException {
        AbstractC9979u.m20294g(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        AbstractC9979u.m20292e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    /* renamed from: b */
    public static int m23981b(Object[] objArr) {
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: c */
    public static final void m23982c(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
