package p147k9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p136j9.C7821c;
import p136j9.C7828j;
import p147k9.C7914l;

/* renamed from: k9.i */
/* loaded from: classes5.dex */
public final class C7911i implements InterfaceC7915m {

    /* renamed from: a */
    public static final b f13793a = new b(null);

    /* renamed from: b */
    public static final C7914l.a f13794b = new a();

    /* renamed from: k9.i$a */
    public static final class a implements C7914l.a {
        @Override // p147k9.C7914l.a
        /* renamed from: a */
        public boolean mo13544a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            C7821c.f13539e.m13264b();
            return false;
        }

        @Override // p147k9.C7914l.a
        /* renamed from: b */
        public InterfaceC7915m mo13545b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C7911i();
        }
    }

    /* renamed from: k9.i$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7914l.a m13547a() {
            return C7911i.f13794b;
        }

        public b() {
        }
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: a */
    public boolean mo13526a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: b */
    public String mo13527b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: c */
    public void mo13528c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo13526a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) C7828j.f13560a.m13286b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p147k9.InterfaceC7915m
    public boolean isSupported() {
        return C7821c.f13539e.m13264b();
    }
}
