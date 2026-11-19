package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.AbstractC6297g0;
import okhttp3.C6289c0;
import okhttp3.C6299h0;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p161s7.InterfaceC6568c;

/* renamed from: okhttp3.internal.connection.d */
/* loaded from: classes4.dex */
public final class C6305d {

    /* renamed from: a */
    public final C6310i f10129a;

    /* renamed from: b */
    public final C6306e f10130b;

    /* renamed from: c */
    public final InterfaceC6568c f10131c;

    /* renamed from: d */
    public boolean f10132d;

    /* renamed from: e */
    public boolean f10133e;

    /* renamed from: f */
    public final C6312k f10134f;

    public C6305d(C6310i c6310i, C6306e finder, InterfaceC6568c interfaceC6568c) {
        AbstractC5830k.m5330g(finder, "finder");
        this.f10129a = c6310i;
        this.f10130b = finder;
        this.f10131c = interfaceC6568c;
        this.f10134f = interfaceC6568c.mo6205c();
    }

    /* renamed from: a */
    public final IOException m5903a(boolean z8, boolean z9, IOException iOException) {
        if (iOException != null) {
            m5906d(iOException);
        }
        return this.f10129a.m5917k(this, z9, z8, iOException);
    }

    /* renamed from: b */
    public final C6303b m5904b(C6289c0 request, boolean z8) {
        AbstractC5830k.m5330g(request, "request");
        this.f10132d = z8;
        AbstractC6297g0 abstractC6297g0 = request.f10078d;
        AbstractC5830k.m5327d(abstractC6297g0);
        long jContentLength = abstractC6297g0.contentLength();
        return new C6303b(this, this.f10131c.mo6207e(request, jContentLength), jContentLength);
    }

    /* renamed from: c */
    public final C6299h0 m5905c(boolean z8) throws IOException {
        try {
            C6299h0 c6299h0Mo6209g = this.f10131c.mo6209g(z8);
            if (c6299h0Mo6209g == null) {
                return c6299h0Mo6209g;
            }
            c6299h0Mo6209g.f10103m = this;
            return c6299h0Mo6209g;
        } catch (IOException e) {
            m5906d(e);
            throw e;
        }
    }

    /* renamed from: d */
    public final void m5906d(IOException iOException) {
        this.f10133e = true;
        this.f10130b.m5909c(iOException);
        C6312k c6312kMo6205c = this.f10131c.mo6205c();
        C6310i c6310i = this.f10129a;
        synchronized (c6312kMo6205c) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(c6312kMo6205c.f10171g != null) || (iOException instanceof ConnectionShutdownException)) {
                        c6312kMo6205c.f10174j = true;
                        if (c6312kMo6205c.f10177m == 0) {
                            C6312k.m5920d(c6310i.f10149a, c6312kMo6205c.f10166b, iOException);
                            c6312kMo6205c.f10176l++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i = c6312kMo6205c.f10178n + 1;
                    c6312kMo6205c.f10178n = i;
                    if (i > 1) {
                        c6312kMo6205c.f10174j = true;
                        c6312kMo6205c.f10176l++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !c6310i.f10162n) {
                    c6312kMo6205c.f10174j = true;
                    c6312kMo6205c.f10176l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
