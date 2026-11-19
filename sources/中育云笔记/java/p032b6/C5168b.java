package p032b6;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import p114d6.AbstractC8992b;
import p114d6.AbstractC8993c;
import p114d6.AbstractC8996f;

/* renamed from: b6.b */
/* loaded from: classes5.dex */
public class C5168b extends SSLSocketFactory {

    /* renamed from: i */
    public static final X509HostnameVerifier f3000i = new BrowserCompatHostnameVerifier();

    /* renamed from: j */
    public static final X509HostnameVerifier f3001j = new StrictHostnameVerifier();

    /* renamed from: k */
    public static final String f3002k = C5168b.class.getSimpleName();

    /* renamed from: l */
    public static volatile C5168b f3003l = null;

    /* renamed from: a */
    public SSLContext f3004a = null;

    /* renamed from: b */
    public SSLSocket f3005b = null;

    /* renamed from: c */
    public Context f3006c;

    /* renamed from: d */
    public String[] f3007d;

    /* renamed from: e */
    public X509TrustManager f3008e;

    /* renamed from: f */
    public String[] f3009f;

    /* renamed from: g */
    public String[] f3010g;

    /* renamed from: h */
    public String[] f3011h;

    public C5168b(Context context, SecureRandom secureRandom) throws KeyManagementException {
        m2684c(context);
        m2685d(AbstractC5167a.m2679f());
        C5171e c5171eM2688a = AbstractC5170d.m2688a(context);
        this.f3008e = c5171eM2688a;
        this.f3004a.init(null, new X509TrustManager[]{c5171eM2688a}, secureRandom);
    }

    /* renamed from: b */
    public static C5168b m2682b(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC8992b.m17550b(context);
        if (f3003l == null) {
            synchronized (C5168b.class) {
                try {
                    if (f3003l == null) {
                        f3003l = new C5168b(context, null);
                    }
                } finally {
                }
            }
        }
        if (f3003l.f3006c == null && context != null) {
            f3003l.m2684c(context);
        }
        AbstractC8996f.m17561b(f3002k, "getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f3003l;
    }

    /* renamed from: a */
    public final void m2683a(Socket socket) {
        boolean z10;
        boolean zM2681h = false;
        if (AbstractC8993c.m17551a(this.f3011h)) {
            z10 = false;
        } else {
            AbstractC8996f.m17564e(f3002k, "set protocols");
            AbstractC5167a.m2678e((SSLSocket) socket, this.f3011h);
            z10 = true;
        }
        if (!AbstractC8993c.m17551a(this.f3010g) || !AbstractC8993c.m17551a(this.f3009f)) {
            AbstractC8996f.m17564e(f3002k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            AbstractC5167a.m2677d(sSLSocket);
            zM2681h = !AbstractC8993c.m17551a(this.f3010g) ? AbstractC5167a.m2681h(sSLSocket, this.f3010g) : AbstractC5167a.m2675b(sSLSocket, this.f3009f);
        }
        if (!z10) {
            AbstractC8996f.m17564e(f3002k, "set default protocols");
            AbstractC5167a.m2677d((SSLSocket) socket);
        }
        if (zM2681h) {
            return;
        }
        AbstractC8996f.m17564e(f3002k, "set default cipher suites");
        AbstractC5167a.m2676c((SSLSocket) socket);
    }

    /* renamed from: c */
    public void m2684c(Context context) {
        this.f3006c = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        AbstractC8996f.m17564e(f3002k, "createSocket: host , port");
        Socket socketCreateSocket = this.f3004a.getSocketFactory().createSocket(str, i10);
        if (socketCreateSocket instanceof SSLSocket) {
            m2683a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f3005b = sSLSocket;
            this.f3007d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }

    /* renamed from: d */
    public void m2685d(SSLContext sSLContext) {
        this.f3004a = sSLContext;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.f3007d;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) {
        return createSocket(str, i10);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) {
        return createSocket(inetAddress.getHostAddress(), i10);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        AbstractC8996f.m17564e(f3002k, "createSocket s host port autoClose");
        Socket socketCreateSocket = this.f3004a.getSocketFactory().createSocket(socket, str, i10, z10);
        if (socketCreateSocket instanceof SSLSocket) {
            m2683a(socketCreateSocket);
            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
            this.f3005b = sSLSocket;
            this.f3007d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return socketCreateSocket;
    }
}
