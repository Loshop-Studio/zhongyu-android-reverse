package p186w;

import java.util.concurrent.Callable;

/* renamed from: w.a */
/* loaded from: classes2.dex */
public final class CallableC6686a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C6689d f11278a;

    public CallableC6686a(C6689d c6689d) {
        this.f11278a = c6689d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f11278a) {
            try {
                C6689d c6689d = this.f11278a;
                if (c6689d.f11294i == null) {
                    return null;
                }
                c6689d.m6395p();
                if (this.f11278a.m6390g()) {
                    this.f11278a.m6394n();
                    this.f11278a.f11296k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
