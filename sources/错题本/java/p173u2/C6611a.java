package p173u2;

import io.reactivex.internal.operators.observable.C5707c;

/* renamed from: u2.a */
/* loaded from: classes3.dex */
public final class C6611a {

    /* renamed from: b */
    public static volatile C6611a f11041b;

    /* renamed from: a */
    public volatile C5707c f11042a;

    /* renamed from: a */
    public static C6611a m6254a() {
        if (f11041b == null) {
            synchronized (C6611a.class) {
                try {
                    if (f11041b == null) {
                        C6611a c6611a = new C6611a();
                        c6611a.f11042a = new C5707c();
                        f11041b = c6611a;
                    }
                } finally {
                }
            }
        }
        return f11041b;
    }
}
