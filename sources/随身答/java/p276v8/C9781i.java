package p276v8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p266u8.C9727c;
import p266u8.C9734j;
import p276v8.C9784l;

/* renamed from: v8.i */
/* loaded from: classes5.dex */
public final class C9781i implements InterfaceC9785m {

    /* renamed from: a */
    public static final b f17400a = new b(null);

    /* renamed from: b */
    public static final C9784l.a f17401b = new a();

    /* renamed from: v8.i$a */
    public static final class a implements C9784l.a {
        @Override // p276v8.C9784l.a
        /* renamed from: a */
        public boolean mo16577a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            C9727c.f17179e.m16244b();
            return false;
        }

        @Override // p276v8.C9784l.a
        /* renamed from: b */
        public InterfaceC9785m mo16578b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C9781i();
        }
    }

    /* renamed from: v8.i$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9784l.a m16580a() {
            return C9781i.f17401b;
        }

        public b() {
        }
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: a */
    public boolean mo16559a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: b */
    public String mo16560b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: c */
    public void mo16561c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo16559a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C9734j.f17200a.m16266b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p276v8.InterfaceC9785m
    public boolean isSupported() {
        return C9727c.f17179e.m16244b();
    }
}
