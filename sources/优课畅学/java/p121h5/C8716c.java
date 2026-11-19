package p121h5;

import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* renamed from: h5.c */
/* loaded from: classes5.dex */
public final class C8716c {

    /* renamed from: a */
    public static long f16340a;

    /* renamed from: b */
    public static final C8716c f16341b = new C8716c();

    /* renamed from: a */
    public final void m14220a(InterfaceC10559a callback) {
        AbstractC9133u.m16134h(callback, "callback");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f16340a > 1000) {
            f16340a = jCurrentTimeMillis;
            callback.invoke();
        }
    }
}
