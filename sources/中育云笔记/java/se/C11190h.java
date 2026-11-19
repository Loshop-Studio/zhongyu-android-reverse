package se;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10818y;

/* renamed from: se.h */
/* loaded from: classes6.dex */
public class C11190h extends C11192j {

    /* renamed from: d */
    public static final a f26877d = new a(null);

    /* renamed from: e */
    public static final boolean f26878e;

    /* renamed from: se.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11190h m24885a() {
            if (m24886b()) {
                return new C11190h();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m24886b() {
            return C11190h.f26878e;
        }

        public a() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM23224q = property != null ? AbstractC10818y.m23224q(property) : null;
        boolean z10 = false;
        if (numM23224q == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM23224q.intValue() >= 9) {
            z10 = true;
        }
        f26878e = z10;
    }

    @Override // se.C11192j
    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C11192j.f26882a.m24894b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // se.C11192j
    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : AbstractC9979u.m20289b(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
