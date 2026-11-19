package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p258t9.InterfaceC10129e;
import p269u9.C10226f;
import p269u9.C10230j;
import p269u9.C10231k;
import p269u9.C10232l;
import p269u9.C10233m;
import p269u9.C10235o;
import p269u9.InterfaceC10234n;
import p302x9.AbstractC10588c;
import p302x9.InterfaceC10590e;

/* renamed from: okhttp3.internal.platform.b */
/* loaded from: classes5.dex */
public final class C9569b extends AbstractC9570c implements InterfaceC10129e {

    /* renamed from: f */
    public static final a f19209f = new a(null);

    /* renamed from: g */
    public static final String f19210g = "OkHttp";

    /* renamed from: h */
    public static final boolean f19211h;

    /* renamed from: d */
    public Context f19212d;

    /* renamed from: e */
    public final List f19213e;

    /* renamed from: okhttp3.internal.platform.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AbstractC9570c m18101a() {
            if (m18102b()) {
                return new C9569b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m18102b() {
            return C9569b.f19211h;
        }

        public a() {
        }
    }

    /* renamed from: okhttp3.internal.platform.b$b */
    public static final class b implements InterfaceC10590e {

        /* renamed from: a */
        public final X509TrustManager f19214a;

        /* renamed from: b */
        public final Method f19215b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            AbstractC9133u.m16133g(trustManager, "trustManager");
            AbstractC9133u.m16133g(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f19214a = trustManager;
            this.f19215b = findByIssuerAndSignatureMethod;
        }

        @Override // p302x9.InterfaceC10590e
        /* renamed from: a */
        public X509Certificate mo18103a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9133u.m16133g(cert, "cert");
            try {
                Object objInvoke = this.f19215b.invoke(this.f19214a, cert);
                AbstractC9133u.m16131e(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC9133u.m16128b(this.f19214a, bVar.f19214a) && AbstractC9133u.m16128b(this.f19215b, bVar.f19215b);
        }

        public int hashCode() {
            return (this.f19214a.hashCode() * 31) + this.f19215b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f19214a + ", findByIssuerAndSignatureMethod=" + this.f19215b + ')';
        }
    }

    static {
        f19211h = AbstractC9570c.f19216a.m18113f() && Build.VERSION.SDK_INT < 29;
    }

    public C9569b() {
        List listM14775r = AbstractC8809v.m14775r(C10235o.a.m19147b(C10235o.f20423j, null, 1, null), new C10233m(C10230j.f20407f.m19134d()), new C10233m(C10232l.f20418a.m19144b()), new C10233m(C10231k.f20415a.m19139a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM14775r) {
            if (((InterfaceC10234n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f19213e = arrayList;
    }

    @Override // p258t9.InterfaceC10129e
    /* renamed from: a */
    public Context mo18086a() {
        return this.f19212d;
    }

    @Override // p258t9.InterfaceC10129e
    /* renamed from: b */
    public void mo18087b(Context context) {
        this.f19212d = context;
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: e */
    public AbstractC10588c mo18088e(X509TrustManager trustManager) {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        C10226f c10226fM19123a = C10226f.f20400d.m19123a(trustManager);
        return c10226fM19123a != null ? c10226fM19123a : super.mo18088e(trustManager);
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: f */
    public InterfaceC10590e mo18089f(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            AbstractC9133u.m16130d(declaredMethod);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo18089f(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: g */
    public void mo18090g(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        Iterator it = this.f19213e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC10234n) next).mo19117a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC10234n interfaceC10234n = (InterfaceC10234n) next;
        if (interfaceC10234n != null) {
            interfaceC10234n.mo19119c(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: h */
    public void mo18099h(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC9133u.m16133g(socket, "socket");
        AbstractC9133u.m16133g(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: i */
    public String mo18091i(SSLSocket sslSocket) {
        Object next;
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        Iterator it = this.f19213e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC10234n) next).mo19117a(sslSocket)) {
                break;
            }
        }
        InterfaceC10234n interfaceC10234n = (InterfaceC10234n) next;
        if (interfaceC10234n != null) {
            return interfaceC10234n.mo19118b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: k */
    public boolean mo18093k(String hostname) {
        AbstractC9133u.m16133g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: l */
    public void mo18100l(String message, int i10, Throwable th) {
        AbstractC9133u.m16133g(message, "message");
        if (i10 == 5) {
            Log.w(f19210g, message, th);
        } else {
            Log.i(f19210g, message, th);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: n */
    public SSLContext mo18095n() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo18095n();
    }
}
