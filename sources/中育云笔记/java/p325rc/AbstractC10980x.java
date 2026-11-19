package p325rc;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: rc.x */
/* loaded from: classes6.dex */
public abstract class AbstractC10980x extends AbstractC10978w {
    /* renamed from: x */
    public static int m24153x(Iterable iterable, int i10) {
        AbstractC9979u.m20294g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    /* renamed from: y */
    public static final Integer m24154y(Iterable iterable) {
        AbstractC9979u.m20294g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
