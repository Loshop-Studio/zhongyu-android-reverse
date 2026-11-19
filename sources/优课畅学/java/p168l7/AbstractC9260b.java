package p168l7;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* renamed from: l7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9260b {
    /* renamed from: b */
    public static Comparator m16975b(final InterfaceC10570l... selectors) {
        AbstractC9133u.m16133g(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: l7.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC9260b.m16976c(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: c */
    public static final int m16976c(InterfaceC10570l[] interfaceC10570lArr, Object obj, Object obj2) {
        return m16978e(obj, obj2, interfaceC10570lArr);
    }

    /* renamed from: d */
    public static int m16977d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: e */
    public static final int m16978e(Object obj, Object obj2, InterfaceC10570l[] interfaceC10570lArr) {
        for (InterfaceC10570l interfaceC10570l : interfaceC10570lArr) {
            int iM16977d = m16977d((Comparable) interfaceC10570l.invoke(obj), (Comparable) interfaceC10570l.invoke(obj2));
            if (iM16977d != 0) {
                return iM16977d;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static Comparator m16979f() {
        C9262d c9262d = C9262d.f18262a;
        AbstractC9133u.m16131e(c9262d, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c9262d;
    }
}
