package p004a3;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okio.Buffer;
import p014b3.C2722e;
import p050d3.AbstractC3709c;
import p050d3.C3707a;
import p050d3.C3708b;
import p050d3.InterfaceC3711e;
import p117r2.C4521x;

/* renamed from: a3.k */
/* loaded from: classes2.dex */
public class C0021k {

    /* renamed from: a */
    public static volatile C0021k f37a;

    /* renamed from: b */
    public static final Logger f38b;

    /* renamed from: c */
    public static final a f39c;

    /* renamed from: a3.k$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List m66b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).getProtocol());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m67c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m66b(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        /* renamed from: d */
        public final C0021k m68d() {
            C2722e.f472c.m1516b();
            C0021k c0021kM30a = C0012b.f8f.m30a();
            if (c0021kM30a != null) {
                return c0021kM30a;
            }
            C0021k c0021kM37a = C0013c.f11g.m37a();
            Intrinsics.checkNotNull(c0021kM37a);
            return c0021kM37a;
        }

        /* renamed from: e */
        public final C0021k m69e() {
            C0020j c0020jM60a;
            C0014d c0014dM43a;
            C0015e c0015eM48b;
            if (m74j() && (c0015eM48b = C0015e.f20f.m48b()) != null) {
                return c0015eM48b;
            }
            if (m73i() && (c0014dM43a = C0014d.f17f.m43a()) != null) {
                return c0014dM43a;
            }
            if (m75k() && (c0020jM60a = C0020j.f35f.m60a()) != null) {
                return c0020jM60a;
            }
            C0019i c0019iM57a = C0019i.f33e.m57a();
            if (c0019iM57a != null) {
                return c0019iM57a;
            }
            C0021k c0021kM53a = C0016f.f23i.m53a();
            return c0021kM53a != null ? c0021kM53a : new C0021k();
        }

        /* renamed from: f */
        public final C0021k m70f() {
            return m72h() ? m68d() : m69e();
        }

        /* renamed from: g */
        public final C0021k m71g() {
            return C0021k.f37a;
        }

        /* renamed from: h */
        public final boolean m72h() {
            return Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean m73i() {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return Intrinsics.areEqual("BC", provider.getName());
        }

        /* renamed from: j */
        public final boolean m74j() {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return Intrinsics.areEqual("Conscrypt", provider.getName());
        }

        /* renamed from: k */
        public final boolean m75k() {
            Provider provider = Security.getProviders()[0];
            Intrinsics.checkNotNullExpressionValue(provider, "Security.getProviders()[0]");
            return Intrinsics.areEqual("OpenJSSE", provider.getName());
        }
    }

    static {
        a aVar = new a(null);
        f39c = aVar;
        f37a = aVar.m70f();
        f38b = Logger.getLogger(C4521x.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m63k(C0021k c0021k, String str, int i4, Throwable th, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i5 & 2) != 0) {
            i4 = 4;
        }
        if ((i5 & 4) != 0) {
            th = null;
        }
        c0021k.m64j(str, i4, th);
    }

    /* renamed from: b */
    public void mo50b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC3709c mo26c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C3707a(mo33d(trustManager));
    }

    /* renamed from: d */
    public InterfaceC3711e mo33d(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C3708b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo27e(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo34f(Socket socket, InetSocketAddress address, int i4) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i4);
    }

    /* renamed from: g */
    public String mo28g(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo35h(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f38b.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo29i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m64j(String message, int i4, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f38b.log(i4 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: l */
    public void mo36l(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m64j(message, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo41m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory mo46n(X509TrustManager trustManager) throws KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo41m = mo41m();
            sSLContextMo41m.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo41m.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e4) {
            throw new AssertionError("No System TLS: " + e4, e4);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo42o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(factory, "factory");
        TrustManager[] trustManagers = factory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
