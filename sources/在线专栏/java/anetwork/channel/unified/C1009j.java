package anetwork.channel.unified;

import anetwork.channel.entity.C0998g;
import anetwork.channel.interceptor.Callback;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anetwork.channel.unified.j */
/* loaded from: classes.dex */
class C1009j {

    /* renamed from: a */
    public final C0998g f5682a;

    /* renamed from: b */
    public Callback f5683b;

    /* renamed from: c */
    public final String f5684c;

    /* renamed from: d */
    public volatile AtomicBoolean f5685d = new AtomicBoolean();

    /* renamed from: e */
    public volatile IUnifiedTask f5686e = null;

    /* renamed from: f */
    public volatile Future f5687f = null;

    public C1009j(C0998g c0998g, Callback callback) {
        this.f5682a = c0998g;
        this.f5684c = c0998g.f5629e;
        this.f5683b = callback;
    }

    /* renamed from: a */
    public void m4757a() {
        Future future = this.f5687f;
        if (future != null) {
            future.cancel(true);
            this.f5687f = null;
        }
    }

    /* renamed from: b */
    public void m4758b() {
        if (this.f5686e != null) {
            this.f5686e.cancel();
            this.f5686e = null;
        }
    }
}
