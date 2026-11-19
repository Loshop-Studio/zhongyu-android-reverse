package p004a3;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;

/* renamed from: a3.i */
/* loaded from: classes2.dex */
public class C0019i extends C0021k {

    /* renamed from: d */
    public static final boolean f32d;

    /* renamed from: e */
    public static final a f33e = new a(0 == true ? 1 : 0);

    /* renamed from: a3.i$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0019i m57a() {
            if (m58b()) {
                return new C0019i();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m58b() {
            return C0019i.f32d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property = System.getProperty("java.specification.version");
        Integer intOrNull = property != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(property) : null;
        boolean z3 = true;
        if (intOrNull == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else if (intOrNull.intValue() < 9) {
            z3 = false;
        }
        f32d = z3;
    }

    @Override // p004a3.C0021k
    /* renamed from: e */
    public void mo27e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sslParameters = sslSocket.getSSLParameters();
        List listM66b = C0021k.f39c.m66b(protocols);
        Intrinsics.checkNotNullExpressionValue(sslParameters, "sslParameters");
        Object[] array = listM66b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sslParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sslParameters);
    }

    @Override // p004a3.C0021k
    /* renamed from: g */
    public String mo28g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
