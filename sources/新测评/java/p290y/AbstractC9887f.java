package p290y;

import coil3.AbstractC5178d;
import coil3.C5169c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import p300z.AbstractC9959f;
import p300z.C9958e;

/* renamed from: y.f */
/* loaded from: classes3.dex */
public abstract class AbstractC9887f {

    /* renamed from: a */
    public static final C5169c.c f17602a = new C5169c.c(CollectionsKt.emptyList());

    /* renamed from: b */
    public static final C5169c.c f17603b = new C5169c.c(AbstractC9959f.m16773a(4096, 4096));

    /* renamed from: c */
    public static final C5169c.c f17604c = new C5169c.c(Boolean.FALSE);

    /* renamed from: d */
    public static final C5169c.c f17605d = new C5169c.c(Boolean.TRUE);

    /* renamed from: a */
    public static final boolean m16682a(C9892k c9892k) {
        return ((Boolean) AbstractC5178d.m2960b(c9892k, f17604c)).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m16683b(C9886e c9886e) {
        return ((Boolean) AbstractC5178d.m2959a(c9886e, f17605d)).booleanValue();
    }

    /* renamed from: c */
    public static final C9958e m16684c(C9886e c9886e) {
        return (C9958e) AbstractC5178d.m2959a(c9886e, f17603b);
    }

    /* renamed from: d */
    public static final C9958e m16685d(C9892k c9892k) {
        return (C9958e) AbstractC5178d.m2960b(c9892k, f17603b);
    }

    /* renamed from: e */
    public static final List m16686e(C9886e c9886e) {
        return (List) AbstractC5178d.m2959a(c9886e, f17602a);
    }
}
