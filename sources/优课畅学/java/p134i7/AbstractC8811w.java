package p134i7;

import java.util.Collection;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: i7.w */
/* loaded from: classes5.dex */
public abstract class AbstractC8811w extends AbstractC8809v {
    /* renamed from: x */
    public static int m14786x(Iterable iterable, int i10) {
        AbstractC9133u.m16133g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }

    /* renamed from: y */
    public static final Integer m14787y(Iterable iterable) {
        AbstractC9133u.m16133g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }
}
