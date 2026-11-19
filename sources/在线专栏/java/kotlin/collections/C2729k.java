package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.collections.k */
/* loaded from: classes.dex */
public class C2729k {
    @NotNull
    /* renamed from: a */
    public static final <T> Object[] m9134a(@NotNull T[] tArr, boolean z3) {
        C2769l.m9241e(tArr, "<this>");
        if (z3 && C2769l.m9237a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C2769l.m9240d(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @NotNull
    /* renamed from: b */
    public static <T> List<T> m9135b(T t3) {
        List<T> listSingletonList = Collections.singletonList(t3);
        C2769l.m9240d(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
