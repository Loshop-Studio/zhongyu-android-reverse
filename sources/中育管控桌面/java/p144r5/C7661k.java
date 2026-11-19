package p144r5;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.AbstractC7536c;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p144r5.C7663m;

/* renamed from: r5.k */
/* loaded from: classes4.dex */
public final class C7661k implements InterfaceC7664n {

    /* renamed from: a */
    public static final b f10108a;

    /* renamed from: b */
    public static final C7663m.a f10109b;

    /* renamed from: c */
    public static final boolean f10110c;

    /* renamed from: r5.k$a */
    public static final class a implements C7663m.a {
        @Override // p144r5.C7663m.a
        /* renamed from: a */
        public boolean mo9099a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            C7661k.f10108a.m9104b();
            return false;
        }

        @Override // p144r5.C7663m.a
        /* renamed from: b */
        public InterfaceC7664n mo9100b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C7661k();
        }
    }

    /* renamed from: r5.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7663m.a m9103a() {
            return C7661k.f10109b;
        }

        /* renamed from: b */
        public final boolean m9104b() {
            return C7661k.f10110c;
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f10108a = bVar;
        f10109b = new a();
        boolean z6 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, bVar.getClass().getClassLoader());
            z6 = true;
        } catch (ClassNotFoundException unused) {
        }
        f10110c = z6;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: a */
    public boolean mo9081a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return false;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: b */
    public String mo9082b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || Intrinsics.areEqual(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: c */
    public void mo9083c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo9081a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) AbstractC7536c.f9994a.m8928b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p144r5.InterfaceC7664n
    public boolean isSupported() {
        return f10110c;
    }
}
