package p014b3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p004a3.C0014d;
import p004a3.C0021k;
import p014b3.C2729l;

/* renamed from: b3.i */
/* loaded from: classes2.dex */
public final class C2726i implements InterfaceC2730m {

    /* renamed from: b */
    public static final b f483b = new b(null);

    /* renamed from: a */
    public static final C2729l.a f482a = new a();

    /* renamed from: b3.i$a */
    public static final class a implements C2729l.a {
        @Override // p014b3.C2729l.a
        /* renamed from: a */
        public boolean mo1526a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return C0014d.f17f.m44b() && (sslSocket instanceof BCSSLSocket);
        }

        @Override // p014b3.C2729l.a
        /* renamed from: b */
        public InterfaceC2730m mo1527b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C2726i();
        }
    }

    /* renamed from: b3.i$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2729l.a m1529a() {
            return C2726i.f482a;
        }
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: a */
    public boolean mo1507a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: b */
    public boolean mo1508b() {
        return C0014d.f17f.m44b();
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: c */
    public String mo1509c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: d */
    public void mo1510d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo1507a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters sslParameters = bCSSLSocket.getParameters();
            Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
            Object[] array = C0021k.f39c.m66b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            sslParameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(sslParameters);
        }
    }
}
