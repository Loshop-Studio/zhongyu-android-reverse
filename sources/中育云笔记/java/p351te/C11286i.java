package p351te;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p351te.C11289l;
import se.C11185c;
import se.C11192j;

/* renamed from: te.i */
/* loaded from: classes6.dex */
public final class C11286i implements InterfaceC11290m {

    /* renamed from: a */
    public static final b f27104a = new b(null);

    /* renamed from: b */
    public static final C11289l.a f27105b = new a();

    /* renamed from: te.i$a */
    public static final class a implements C11289l.a {
        @Override // p351te.C11289l.a
        /* renamed from: a */
        public boolean mo25234a(SSLSocket sslSocket) {
            AbstractC9979u.m20294g(sslSocket, "sslSocket");
            C11185c.f26861e.m24872b();
            return false;
        }

        @Override // p351te.C11289l.a
        /* renamed from: b */
        public InterfaceC11290m mo25235b(SSLSocket sslSocket) {
            AbstractC9979u.m20294g(sslSocket, "sslSocket");
            return new C11286i();
        }
    }

    /* renamed from: te.i$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11289l.a m25237a() {
            return C11286i.f27105b;
        }

        public b() {
        }
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: a */
    public boolean mo25216a(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return false;
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: b */
    public String mo25217b(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : AbstractC9979u.m20289b(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: c */
    public void mo25218c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        if (mo25216a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C11192j.f26882a.m24894b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p351te.InterfaceC11290m
    public boolean isSupported() {
        return C11185c.f26861e.m24872b();
    }
}
