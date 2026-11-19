package kotlinx.coroutines.internal;

import p128o2.C2919l;
import p128o2.C2920m;

/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: classes.dex */
public final class C2793h {

    /* renamed from: a */
    private static final boolean f10761a;

    static {
        Object objM9989a;
        try {
            C2919l.a aVar = C2919l.f11409a;
            objM9989a = C2919l.m9989a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            C2919l.a aVar2 = C2919l.f11409a;
            objM9989a = C2919l.m9989a(C2920m.m9993a(th));
        }
        f10761a = C2919l.m9992d(objM9989a);
    }

    /* renamed from: a */
    public static final boolean m9297a() {
        return f10761a;
    }
}
