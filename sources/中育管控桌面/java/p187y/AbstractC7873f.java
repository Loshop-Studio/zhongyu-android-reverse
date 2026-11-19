package p187y;

import coil3.AbstractC4559d;
import coil3.C4550c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import p194z.AbstractC7924f;
import p194z.C7923e;

/* renamed from: y.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7873f {

    /* renamed from: a */
    public static final C4550c.c f10575a = new C4550c.c(CollectionsKt.emptyList());

    /* renamed from: b */
    public static final C4550c.c f10576b = new C4550c.c(AbstractC7924f.m9721a(4096, 4096));

    /* renamed from: c */
    public static final C4550c.c f10577c = new C4550c.c(Boolean.FALSE);

    /* renamed from: d */
    public static final C4550c.c f10578d = new C4550c.c(Boolean.TRUE);

    /* renamed from: a */
    public static final boolean m9637a(C7880m c7880m) {
        return ((Boolean) AbstractC4559d.m1787b(c7880m, f10577c)).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m9638b(C7872e c7872e) {
        return ((Boolean) AbstractC4559d.m1786a(c7872e, f10578d)).booleanValue();
    }

    /* renamed from: c */
    public static final C7923e m9639c(C7872e c7872e) {
        return (C7923e) AbstractC4559d.m1786a(c7872e, f10576b);
    }

    /* renamed from: d */
    public static final C7923e m9640d(C7880m c7880m) {
        return (C7923e) AbstractC4559d.m1787b(c7880m, f10576b);
    }

    /* renamed from: e */
    public static final List m9641e(C7872e c7872e) {
        return (List) AbstractC4559d.m1786a(c7872e, f10575a);
    }
}
