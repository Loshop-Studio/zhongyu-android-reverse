package p136j9;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okio.Buffer;
import p011a9.C0059v;
import p147k9.C7907e;
import p171m9.AbstractC8573c;
import p171m9.C8571a;
import p171m9.C8572b;
import p171m9.InterfaceC8575e;

/* renamed from: j9.j */
/* loaded from: classes5.dex */
public class C7828j {

    /* renamed from: a */
    public static final a f13560a;

    /* renamed from: b */
    public static volatile C7828j f13561b;

    /* renamed from: c */
    public static final Logger f13562c;

    /* renamed from: j9.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List m13286b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((Protocol) obj2).getProtocol());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m13287c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m13286b(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        /* renamed from: d */
        public final C7828j m13288d() {
            C7907e.f13781a.m13534b();
            C7828j c7828jM13250a = C7819a.f13530e.m13250a();
            if (c7828jM13250a != null) {
                return c7828jM13250a;
            }
            C7828j c7828jM13257a = C7820b.f13533f.m13257a();
            Intrinsics.checkNotNull(c7828jM13257a);
            return c7828jM13257a;
        }

        /* renamed from: e */
        public final C7828j m13289e() {
            C7827i c7827iM13280a;
            C7821c c7821cM13263a;
            C7822d c7822dM13268b;
            if (m13294j() && (c7822dM13268b = C7822d.f13542e.m13268b()) != null) {
                return c7822dM13268b;
            }
            if (m13293i() && (c7821cM13263a = C7821c.f13539e.m13263a()) != null) {
                return c7821cM13263a;
            }
            if (m13295k() && (c7827iM13280a = C7827i.f13557e.m13280a()) != null) {
                return c7827iM13280a;
            }
            C7826h c7826hM13277a = C7826h.f13555d.m13277a();
            if (c7826hM13277a != null) {
                return c7826hM13277a;
            }
            C7828j c7828jM13273a = C7823e.f13546i.m13273a();
            return c7828jM13273a != null ? c7828jM13273a : new C7828j();
        }

        /* renamed from: f */
        public final C7828j m13290f() {
            return m13292h() ? m13288d() : m13289e();
        }

        /* renamed from: g */
        public final C7828j m13291g() {
            return C7828j.f13561b;
        }

        /* renamed from: h */
        public final boolean m13292h() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean m13293i() {
            return Intrinsics.areEqual("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        public final boolean m13294j() {
            return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        public final boolean m13295k() {
            return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f13560a = aVar;
        f13561b = aVar.m13290f();
        f13562c = Logger.getLogger(C0059v.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m13283k(C7828j c7828j, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        c7828j.m13284j(str, i10, th);
    }

    /* renamed from: b */
    public void mo13270b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC8573c mo13246c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C8571a(mo13253d(trustManager));
    }

    /* renamed from: d */
    public InterfaceC8575e mo13253d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C8572b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo13254f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i10);
    }

    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo13255h(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f13562c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo13249i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m13284j(String message, int i10, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f13562c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: l */
    public void mo13256l(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m13284j(message, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo13261m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory mo13266n(X509TrustManager trustManager) throws KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo13261m = mo13261m();
            sSLContextMo13261m.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo13261m.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo13262o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
