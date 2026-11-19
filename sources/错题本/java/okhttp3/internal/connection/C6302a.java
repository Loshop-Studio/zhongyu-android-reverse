package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6301i0;
import okhttp3.C6338z;
import okhttp3.InterfaceC6331s;
import okhttp3.InterfaceC6332t;
import p161s7.C6570e;

/* renamed from: okhttp3.internal.connection.a */
/* loaded from: classes4.dex */
public final class C6302a implements InterfaceC6332t {

    /* renamed from: a */
    public static final C6302a f10117a = new C6302a();

    @Override // okhttp3.InterfaceC6332t
    public final C6301i0 intercept(InterfaceC6331s interfaceC6331s) throws IOException {
        C6570e c6570e = (C6570e) interfaceC6331s;
        C6310i c6310i = c6570e.f10965a;
        synchronized (c6310i) {
            try {
                if (!c6310i.f10161m) {
                    throw new IllegalStateException("released");
                }
                if (c6310i.f10160l) {
                    throw new IllegalStateException("Check failed.");
                }
                if (c6310i.f10159k) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C6306e c6306e = c6310i.f10155g;
        AbstractC5830k.m5327d(c6306e);
        C6338z c6338z = c6310i.f10149a;
        try {
            C6305d c6305d = new C6305d(c6310i, c6306e, c6306e.m5907a(c6338z.f10329f, c6570e.f10970f, !AbstractC5830k.m5325b(c6570e.f10969e.f10076b, "GET"), c6570e.f10971g, c6570e.f10972h).m5929j(c6338z, c6570e));
            c6310i.f10158j = c6305d;
            c6310i.f10163o = c6305d;
            synchronized (c6310i) {
                c6310i.f10159k = true;
                c6310i.f10160l = true;
            }
            if (c6310i.f10162n) {
                throw new IOException("Canceled");
            }
            return C6570e.m6213a(c6570e, 0, c6305d, null, 61).m6214b(c6570e.f10969e);
        } catch (IOException e) {
            c6306e.m5909c(e);
            throw new RouteException(e);
        } catch (RouteException e4) {
            c6306e.m5909c(e4.getLastConnectException());
            throw e4;
        }
    }
}
