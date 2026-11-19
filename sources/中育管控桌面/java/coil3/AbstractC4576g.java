package coil3;

import coil3.C4550c;
import coil3.RealImageLoader;
import p110n.InterfaceC7431n;

/* renamed from: coil3.g */
/* loaded from: classes3.dex */
public abstract class AbstractC4576g {

    /* renamed from: a */
    public static final C4550c.c f1700a = new C4550c.c(4);

    /* renamed from: b */
    public static final C4550c.c f1701b = new C4550c.c(InterfaceC7431n.f9488c);

    /* renamed from: c */
    public static final C4550c.c f1702c = new C4550c.c(Boolean.TRUE);

    /* renamed from: d */
    public static final C4550c.c f1703d = new C4550c.c(Double.valueOf(1.0d));

    /* renamed from: a */
    public static final InterfaceC7431n m1888a(RealImageLoader.C4547a c4547a) {
        return (InterfaceC7431n) AbstractC4559d.m1788c(c4547a.m1663c().m9613f(), f1701b);
    }

    /* renamed from: b */
    public static final int m1889b(RealImageLoader.C4547a c4547a) {
        return ((Number) AbstractC4559d.m1788c(c4547a.m1663c().m9613f(), f1700a)).intValue();
    }

    /* renamed from: c */
    public static final boolean m1890c(RealImageLoader.C4547a c4547a) {
        return ((Boolean) AbstractC4559d.m1788c(c4547a.m1663c().m9613f(), f1702c)).booleanValue();
    }

    /* renamed from: d */
    public static final double m1891d(RealImageLoader.C4547a c4547a) {
        return ((Number) AbstractC4559d.m1788c(c4547a.m1663c().m9613f(), f1703d)).doubleValue();
    }
}
