package se;

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
import je.C9742v;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okhttp3.Protocol;
import okio.Buffer;
import org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory;
import p325rc.AbstractC10980x;
import p351te.C11282e;
import ve.AbstractC11618c;
import ve.C11616a;
import ve.C11617b;
import ve.InterfaceC11620e;

/* renamed from: se.j */
/* loaded from: classes6.dex */
public class C11192j {

    /* renamed from: a */
    public static final a f26882a;

    /* renamed from: b */
    public static volatile C11192j f26883b;

    /* renamed from: c */
    public static final Logger f26884c;

    /* renamed from: se.j$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public final List m24894b(List protocols) {
            AbstractC9979u.m20294g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                arrayList2.add(((Protocol) obj2).toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m24895c(List protocols) {
            AbstractC9979u.m20294g(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m24894b(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        /* renamed from: d */
        public final C11192j m24896d() {
            C11282e.f27092a.m25224b();
            C11192j c11192jM24858a = C11183a.f26852e.m24858a();
            if (c11192jM24858a != null) {
                return c11192jM24858a;
            }
            C11192j c11192jM24865a = C11184b.f26855f.m24865a();
            AbstractC9979u.m20291d(c11192jM24865a);
            return c11192jM24865a;
        }

        /* renamed from: e */
        public final C11192j m24897e() {
            C11191i c11191iM24888a;
            C11185c c11185cM24871a;
            C11186d c11186dM24876b;
            if (m24902j() && (c11186dM24876b = C11186d.f26864e.m24876b()) != null) {
                return c11186dM24876b;
            }
            if (m24901i() && (c11185cM24871a = C11185c.f26861e.m24871a()) != null) {
                return c11185cM24871a;
            }
            if (m24903k() && (c11191iM24888a = C11191i.f26879e.m24888a()) != null) {
                return c11191iM24888a;
            }
            C11190h c11190hM24885a = C11190h.f26877d.m24885a();
            if (c11190hM24885a != null) {
                return c11190hM24885a;
            }
            C11192j c11192jM24881a = C11187e.f26868i.m24881a();
            return c11192jM24881a != null ? c11192jM24881a : new C11192j();
        }

        /* renamed from: f */
        public final C11192j m24898f() {
            return m24900h() ? m24896d() : m24897e();
        }

        /* renamed from: g */
        public final C11192j m24899g() {
            return C11192j.f26883b;
        }

        /* renamed from: h */
        public final boolean m24900h() {
            return AbstractC9979u.m20289b("Dalvik", System.getProperty("java.vm.name"));
        }

        /* renamed from: i */
        public final boolean m24901i() {
            return AbstractC9979u.m20289b("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        public final boolean m24902j() {
            return AbstractC9979u.m20289b("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        public final boolean m24903k() {
            return AbstractC9979u.m20289b("OpenJSSE", Security.getProviders()[0].getName());
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f26882a = aVar;
        f26883b = aVar.m24898f();
        f26884c = Logger.getLogger(C9742v.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m24891k(C11192j c11192j, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        c11192j.m24892j(str, i10, th);
    }

    /* renamed from: b */
    public void mo24878b(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC11618c mo24854c(X509TrustManager trustManager) {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        return new C11616a(mo24861d(trustManager));
    }

    /* renamed from: d */
    public InterfaceC11620e mo24861d(X509TrustManager trustManager) {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        AbstractC9979u.m20293f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C11617b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo24862f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC9979u.m20294g(socket, "socket");
        AbstractC9979u.m20294g(address, "address");
        socket.connect(address, i10);
    }

    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo24863h(String closer) {
        AbstractC9979u.m20294g(closer, "closer");
        if (f26884c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo24857i(String hostname) {
        AbstractC9979u.m20294g(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m24892j(String message, int i10, Throwable th) {
        AbstractC9979u.m20294g(message, "message");
        f26884c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: l */
    public void mo24864l(String message, Object obj) {
        AbstractC9979u.m20294g(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        m24892j(message, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo24869m() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance(SSLSocketFactoryFactory.DEFAULT_PROTOCOL);
        AbstractC9979u.m20293f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory mo24874n(X509TrustManager trustManager) throws KeyManagementException {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo24869m = mo24869m();
            sSLContextMo24869m.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo24869m.getSocketFactory();
            AbstractC9979u.m20293f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo24870o() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC9979u.m20291d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC9979u.m20292e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC9979u.m20293f(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC9979u.m20293f(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
