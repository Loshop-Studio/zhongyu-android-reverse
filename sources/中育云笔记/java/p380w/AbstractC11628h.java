package p380w;

import coil3.AbstractC5455d;
import coil3.C5454c;
import java.util.List;
import p325rc.AbstractC10978w;
import p396x.AbstractC11750f;
import p396x.C11749e;

/* renamed from: w.h */
/* loaded from: classes3.dex */
public abstract class AbstractC11628h {

    /* renamed from: a */
    public static final C5454c.c f27612a = new C5454c.c(AbstractC10978w.m24136n());

    /* renamed from: b */
    public static final C5454c.c f27613b = new C5454c.c(AbstractC11750f.m26001a(4096, 4096));

    /* renamed from: c */
    public static final C5454c.c f27614c = new C5454c.c(Boolean.FALSE);

    /* renamed from: d */
    public static final C5454c.c f27615d = new C5454c.c(Boolean.TRUE);

    /* renamed from: a */
    public static final boolean m25719a(C11634n c11634n) {
        return ((Boolean) AbstractC5455d.m3054b(c11634n, f27614c)).booleanValue();
    }

    /* renamed from: b */
    public static final boolean m25720b(C11627g c11627g) {
        return ((Boolean) AbstractC5455d.m3053a(c11627g, f27615d)).booleanValue();
    }

    /* renamed from: c */
    public static final C11749e m25721c(C11627g c11627g) {
        return (C11749e) AbstractC5455d.m3053a(c11627g, f27613b);
    }

    /* renamed from: d */
    public static final C11749e m25722d(C11634n c11634n) {
        return (C11749e) AbstractC5455d.m3054b(c11634n, f27613b);
    }

    /* renamed from: e */
    public static final List m25723e(C11627g c11627g) {
        return (List) AbstractC5455d.m3053a(c11627g, f27612a);
    }
}
