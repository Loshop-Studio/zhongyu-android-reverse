package p266u8;

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
import p172l8.C8923v;
import p276v8.C9777e;
import p296x8.AbstractC9917c;
import p296x8.C9915a;
import p296x8.C9916b;
import p296x8.InterfaceC9919e;

/* renamed from: u8.j */
/* loaded from: classes5.dex */
public class C9734j {

    /* renamed from: a */
    public static final a f17200a;

    /* renamed from: b */
    public static volatile C9734j f17201b;

    /* renamed from: c */
    public static final Logger f17202c;

    /* renamed from: u8.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List m16266b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj2 = arrayList.get(i9);
                i9++;
                arrayList2.add(((Protocol) obj2).getProtocol());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m16267c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m16266b(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        /* renamed from: d */
        public final C9734j m16268d() {
            C9777e.f17388a.m16567b();
            C9734j c9734jM16230a = C9725a.f17170e.m16230a();
            if (c9734jM16230a != null) {
                return c9734jM16230a;
            }
            C9734j c9734jM16237a = C9726b.f17173f.m16237a();
            Intrinsics.checkNotNull(c9734jM16237a);
            return c9734jM16237a;
        }

        /* renamed from: e */
        public final C9734j m16269e() {
            C9733i c9733iM16260a;
            C9727c c9727cM16243a;
            C9728d c9728dM16248b;
            if (m16274j() && (c9728dM16248b = C9728d.f17182e.m16248b()) != null) {
                return c9728dM16248b;
            }
            if (m16273i() && (c9727cM16243a = C9727c.f17179e.m16243a()) != null) {
                return c9727cM16243a;
            }
            if (m16275k() && (c9733iM16260a = C9733i.f17197e.m16260a()) != null) {
                return c9733iM16260a;
            }
            C9732h c9732hM16257a = C9732h.f17195d.m16257a();
            if (c9732hM16257a != null) {
                return c9732hM16257a;
            }
            C9734j c9734jM16253a = C9729e.f17186i.m16253a();
            return c9734jM16253a != null ? c9734jM16253a : new C9734j();
        }

        /* renamed from: f */
        public final C9734j m16270f() {
            return m16272h() ? m16268d() : m16269e();
        }

        /* renamed from: g */
        public final C9734j m16271g() {
            return C9734j.f17201b;
        }

        /* renamed from: h */
        public final boolean m16272h() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean m16273i() {
            return Intrinsics.areEqual("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        public final boolean m16274j() {
            return Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        public final boolean m16275k() {
            return Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f17200a = aVar;
        f17201b = aVar.m16270f();
        f17202c = Logger.getLogger(C8923v.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m16263k(C9734j c9734j, String str, int i9, Throwable th, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i10 & 2) != 0) {
            i9 = 4;
        }
        if ((i10 & 4) != 0) {
            th = null;
        }
        c9734j.m16264j(str, i9, th);
    }

    /* renamed from: b */
    public void mo16250b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC9917c mo16226c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C9915a(mo16233d(trustManager));
    }

    /* renamed from: d */
    public InterfaceC9919e mo16233d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C9916b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo16227e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo16234f(Socket socket, InetSocketAddress address, int i9) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i9);
    }

    /* renamed from: g */
    public String mo16228g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo16235h(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f17202c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo16229i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m16264j(String message, int i9, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f17202c.log(i9 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: l */
    public void mo16236l(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m16264j(message, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo16241m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory mo16246n(X509TrustManager trustManager) throws KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo16241m = mo16241m();
            sSLContextMo16241m.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo16241m.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo16242o() throws NoSuchAlgorithmException, KeyStoreException {
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
