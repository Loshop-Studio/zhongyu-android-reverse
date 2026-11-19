package anetwork.channel.unified;

import anetwork.channel.entity.C5121g;
import anetwork.channel.interceptor.Callback;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anetwork.channel.unified.j */
/* loaded from: classes3.dex */
class C5132j {

    /* renamed from: a */
    public final C5121g f2960a;

    /* renamed from: b */
    public Callback f2961b;

    /* renamed from: c */
    public final String f2962c;

    /* renamed from: d */
    public volatile AtomicBoolean f2963d = new AtomicBoolean();

    /* renamed from: e */
    public volatile IUnifiedTask f2964e = null;

    /* renamed from: f */
    public volatile Future f2965f = null;

    public C5132j(C5121g c5121g, Callback callback) {
        this.f2960a = c5121g;
        this.f2962c = c5121g.f2907e;
        this.f2961b = callback;
    }

    /* renamed from: a */
    public void m2648a() {
        Future future = this.f2965f;
        if (future != null) {
            future.cancel(true);
            this.f2965f = null;
        }
    }

    /* renamed from: b */
    public void m2649b() {
        if (this.f2964e != null) {
            this.f2964e.cancel();
            this.f2964e = null;
        }
    }
}
