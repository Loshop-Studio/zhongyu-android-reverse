package p325rc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.v */
/* loaded from: classes6.dex */
public abstract class AbstractC10976v {
    /* renamed from: a */
    public static List m24122a(List builder) {
        AbstractC9979u.m20294g(builder, "builder");
        return ((ListBuilder) builder).m20122r();
    }

    /* renamed from: b */
    public static final Object[] m24123b(Object[] objArr, boolean z10) {
        AbstractC9979u.m20294g(objArr, "<this>");
        if (z10 && AbstractC9979u.m20289b(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC9979u.m20293f(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    /* renamed from: c */
    public static List m24124c() {
        return new ListBuilder(0, 1, null);
    }

    /* renamed from: d */
    public static List m24125d(int i10) {
        return new ListBuilder(i10);
    }

    /* renamed from: e */
    public static List m24126e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC9979u.m20293f(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* renamed from: f */
    public static Object[] m24127f(int i10, Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
