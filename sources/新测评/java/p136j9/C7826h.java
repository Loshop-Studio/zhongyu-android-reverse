package p136j9;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: j9.h */
/* loaded from: classes5.dex */
public class C7826h extends C7828j {

    /* renamed from: d */
    public static final a f13555d = new a(null);

    /* renamed from: e */
    public static final boolean f13556e;

    /* renamed from: j9.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7826h m13277a() {
            if (m13278b()) {
                return new C7826h();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m13278b() {
            return C7826h.f13556e;
        }

        public a() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt.toIntOrNull(property) : null;
        boolean z9 = false;
        if (intOrNull == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z9 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (intOrNull.intValue() >= 9) {
            z9 = true;
        }
        f13556e = z9;
    }

    @Override // p136j9.C7828j
    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) C7828j.f13560a.m13286b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // p136j9.C7828j
    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
