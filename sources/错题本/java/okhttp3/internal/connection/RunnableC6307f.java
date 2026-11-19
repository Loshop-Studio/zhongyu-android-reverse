package okhttp3.internal.connection;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.AbstractC5806u;
import okhttp3.InterfaceC6294f;
import p024c0.C3210g;
import p185v7.C6685n;

/* renamed from: okhttp3.internal.connection.f */
/* loaded from: classes4.dex */
public final class RunnableC6307f implements Runnable {

    /* renamed from: a */
    public final InterfaceC6294f f10144a;

    /* renamed from: b */
    public volatile AtomicInteger f10145b = new AtomicInteger(0);

    /* renamed from: c */
    public final /* synthetic */ C6310i f10146c;

    public RunnableC6307f(C6310i c6310i, InterfaceC6294f interfaceC6294f) {
        this.f10146c = c6310i;
        this.f10144a = interfaceC6294f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3210g c3210g;
        String strConcat = "OkHttp ".concat(this.f10146c.f10150b.f10075a.m5973g());
        C6310i c6310i = this.f10146c;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            c6310i.f10152d.enter();
            boolean z8 = false;
            try {
                try {
                } catch (Throwable th) {
                    c6310i.f10149a.f10324a.m2154d(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f10144a.mo116j(c6310i.m5916j());
                c3210g = c6310i.f10149a.f10324a;
            } catch (IOException e4) {
                e = e4;
                z8 = true;
                if (z8) {
                    C6685n c6685n = C6685n.f11276a;
                    C6685n c6685n2 = C6685n.f11276a;
                    String str = "Callback failure for " + C6310i.m5910c(c6310i);
                    c6685n2.getClass();
                    C6685n.m6380i(str, 4, e);
                } else {
                    this.f10144a.mo110d(c6310i, e);
                }
                c3210g = c6310i.f10149a.f10324a;
                c3210g.m2154d(this);
            } catch (Throwable th3) {
                th = th3;
                z8 = true;
                c6310i.cancel();
                if (!z8) {
                    IOException iOException = new IOException("canceled due to " + th);
                    AbstractC5806u.m5266e(iOException, th);
                    this.f10144a.mo110d(c6310i, iOException);
                }
                throw th;
            }
            c3210g.m2154d(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
