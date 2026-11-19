package okhttp3.internal.platform;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.Protocol;
import okio.Buffer;
import p134i7.AbstractC8811w;
import p136i9.C8897a0;
import p302x9.AbstractC10588c;
import p302x9.C10586a;
import p302x9.C10587b;
import p302x9.InterfaceC10590e;

/* renamed from: okhttp3.internal.platform.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9570c {

    /* renamed from: a */
    public static final a f19216a;

    /* renamed from: b */
    public static volatile AbstractC9570c f19217b;

    /* renamed from: c */
    public static final Logger f19218c;

    /* renamed from: okhttp3.internal.platform.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public final List m18109b(List protocols) {
            AbstractC9133u.m16133g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.f18938c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m18110c(List protocols) {
            AbstractC9133u.m16133g(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m18109b(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        /* renamed from: d */
        public final AbstractC9570c m18111d() {
            return C9571d.f19219a.m18114a();
        }

        /* renamed from: e */
        public final AbstractC9570c m18112e() {
            return AbstractC9570c.f19217b;
        }

        /* renamed from: f */
        public final boolean m18113f() {
            return C9571d.f19219a.m18116c();
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f19216a = aVar;
        f19217b = aVar.m18111d();
        f19218c = Logger.getLogger(C8897a0.class.getName());
    }

    /* renamed from: d */
    public void m18105d(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
    }

    /* renamed from: e */
    public AbstractC10588c mo18088e(X509TrustManager trustManager) {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        return new C10586a(mo18089f(trustManager));
    }

    /* renamed from: f */
    public InterfaceC10590e mo18089f(X509TrustManager trustManager) {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new C10587b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: g */
    public abstract void mo18090g(SSLSocket sSLSocket, String str, List list);

    /* renamed from: h */
    public void mo18099h(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC9133u.m16133g(socket, "socket");
        AbstractC9133u.m16133g(address, "address");
        socket.connect(address, i10);
    }

    /* renamed from: i */
    public abstract String mo18091i(SSLSocket sSLSocket);

    /* renamed from: j */
    public Object mo18092j(String closer) {
        AbstractC9133u.m16133g(closer, "closer");
        if (f19218c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: k */
    public abstract boolean mo18093k(String str);

    /* renamed from: l */
    public void mo18100l(String message, int i10, Throwable th) {
        AbstractC9133u.m16133g(message, "message");
        f19218c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: m */
    public void mo18094m(String message, Object obj) {
        AbstractC9133u.m16133g(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo18100l(message, 5, (Throwable) obj);
    }

    /* renamed from: n */
    public SSLContext mo18095n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        AbstractC9133u.m16132f(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    /* renamed from: o */
    public SSLSocketFactory m18106o(X509TrustManager trustManager) throws KeyManagementException {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo18095n = mo18095n();
            sSLContextMo18095n.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo18095n.getSocketFactory();
            AbstractC9133u.m16132f(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    /* renamed from: p */
    public X509TrustManager m18107p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        AbstractC9133u.m16130d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                AbstractC9133u.m16131e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        AbstractC9133u.m16132f(string, "toString(...)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        AbstractC9133u.m16132f(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
