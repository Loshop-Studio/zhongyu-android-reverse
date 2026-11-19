package p134i7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.u */
/* loaded from: classes5.dex */
public abstract class AbstractC8807u {
    /* renamed from: a */
    public static List m14751a(List builder) {
        AbstractC9133u.m16133g(builder, "builder");
        return ((ListBuilder) builder).m15977m();
    }

    /* renamed from: b */
    public static final Object[] m14752b(Object[] objArr, boolean z10) {
        AbstractC9133u.m16133g(objArr, "<this>");
        if (z10 && AbstractC9133u.m16128b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC9133u.m16132f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* renamed from: c */
    public static List m14753c() {
        return new ListBuilder(0, 1, null);
    }

    /* renamed from: d */
    public static List m14754d(int i10) {
        return new ListBuilder(i10);
    }

    /* renamed from: e */
    public static List m14755e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC9133u.m16132f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* renamed from: f */
    public static Object[] m14756f(int i10, Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
