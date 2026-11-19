package p364uc;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* renamed from: uc.b */
/* loaded from: classes6.dex */
public abstract class AbstractC11382b {
    /* renamed from: b */
    public static Comparator m25328b(final InterfaceC9540l... selectors) {
        AbstractC9979u.m20294g(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: uc.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return AbstractC11382b.m25329c(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* renamed from: c */
    public static final int m25329c(InterfaceC9540l[] interfaceC9540lArr, Object obj, Object obj2) {
        return m25331e(obj, obj2, interfaceC9540lArr);
    }

    /* renamed from: d */
    public static int m25330d(Comparable comparable, Comparable comparable2) {
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
    public static final int m25331e(Object obj, Object obj2, InterfaceC9540l[] interfaceC9540lArr) {
        for (InterfaceC9540l interfaceC9540l : interfaceC9540lArr) {
            int iM25330d = m25330d((Comparable) interfaceC9540l.invoke(obj), (Comparable) interfaceC9540l.invoke(obj2));
            if (iM25330d != 0) {
                return iM25330d;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static Comparator m25332f() {
        C11384d c11384d = C11384d.f27207c;
        AbstractC9979u.m20292e(c11384d, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return c11384d;
    }

    /* renamed from: g */
    public static Comparator m25333g() {
        C11385e c11385e = C11385e.f27208c;
        AbstractC9979u.m20292e(c11385e, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return c11385e;
    }
}
