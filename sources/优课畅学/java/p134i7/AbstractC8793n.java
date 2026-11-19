package p134i7;

import java.lang.reflect.Array;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.n */
/* loaded from: classes5.dex */
public abstract class AbstractC8793n {
    /* renamed from: a */
    public static final Object[] m14604a(Object[] reference, int i10) throws NegativeArraySizeException {
        AbstractC9133u.m16133g(reference, "reference");
        Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i10);
        AbstractC9133u.m16131e(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    /* renamed from: b */
    public static int m14605b(Object[] objArr) {
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: c */
    public static final void m14606c(int i10, int i11) {
        if (i10 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is greater than size (" + i11 + ").");
    }
}
