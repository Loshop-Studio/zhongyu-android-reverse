package p151r5;

import io.reactivex.internal.util.AbstractC5729a;

/* renamed from: r5.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6465b {

    /* renamed from: a */
    public static final C6468e f10640a;

    static {
        try {
            C6468e c6468e = AbstractC6464a.f10639a;
            if (c6468e == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            f10640a = c6468e;
        } catch (Throwable th) {
            throw AbstractC5729a.m5089a(th);
        }
    }

    /* renamed from: a */
    public static C6468e m6127a() {
        C6468e c6468e = f10640a;
        if (c6468e != null) {
            return c6468e;
        }
        throw new NullPointerException("scheduler == null");
    }
}
