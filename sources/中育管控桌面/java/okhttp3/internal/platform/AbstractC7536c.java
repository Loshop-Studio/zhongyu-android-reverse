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
import p058f5.C6356a0;
import p165u5.AbstractC7777c;
import p165u5.C7775a;
import p165u5.C7776b;
import p165u5.InterfaceC7779e;

/* renamed from: okhttp3.internal.platform.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7536c {

    /* renamed from: a */
    public static final a f9994a;

    /* renamed from: b */
    public static volatile AbstractC7536c f9995b;

    /* renamed from: c */
    public static final Logger f9996c;

    /* renamed from: okhttp3.internal.platform.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final List m8928b(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.f9716c) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj2 = arrayList.get(i6);
                i6++;
                arrayList2.add(((Protocol) obj2).toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m8929c(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            Buffer buffer = new Buffer();
            for (String str : m8928b(protocols)) {
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }

        /* renamed from: d */
        public final AbstractC7536c m8930d() {
            return C7537d.f9997a.m8933a();
        }

        /* renamed from: e */
        public final AbstractC7536c m8931e() {
            return AbstractC7536c.f9995b;
        }

        /* renamed from: f */
        public final boolean m8932f() {
            return C7537d.f9997a.m8935c();
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f9994a = aVar;
        f9995b = aVar.m8930d();
        f9996c = Logger.getLogger(C6356a0.class.getName());
    }

    /* renamed from: d */
    public void m8924d(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
    }

    /* renamed from: e */
    public AbstractC7777c mo8907e(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        return new C7775a(mo8908f(trustManager));
    }

    /* renamed from: f */
    public InterfaceC7779e mo8908f(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        return new C7776b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: g */
    public abstract void mo8909g(SSLSocket sSLSocket, String str, List list);

    /* renamed from: h */
    public void mo8918h(Socket socket, InetSocketAddress address, int i6) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i6);
    }

    /* renamed from: i */
    public abstract String mo8910i(SSLSocket sSLSocket);

    /* renamed from: j */
    public Object mo8911j(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (f9996c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: k */
    public abstract boolean mo8912k(String str);

    /* renamed from: l */
    public void mo8919l(String message, int i6, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        f9996c.log(i6 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    /* renamed from: m */
    public void mo8913m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo8919l(message, 5, (Throwable) obj);
    }

    /* renamed from: n */
    public SSLContext mo8914n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    /* renamed from: o */
    public SSLSocketFactory m8925o(X509TrustManager trustManager) throws KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            SSLContext sSLContextMo8914n = mo8914n();
            sSLContextMo8914n.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextMo8914n.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e6) {
            throw new AssertionError("No System TLS: " + e6, e6);
        }
    }

    /* renamed from: p */
    public X509TrustManager m8926p() throws NoSuchAlgorithmException, KeyStoreException {
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
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
