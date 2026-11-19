package se;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
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
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;
import p351te.C11281d;
import p351te.C11285h;
import p351te.C11286i;
import p351te.C11287j;
import p351te.C11288k;
import p351te.C11289l;
import p351te.C11291n;
import p351te.InterfaceC11290m;
import ve.AbstractC11618c;
import ve.InterfaceC11620e;

/* renamed from: se.b */
/* loaded from: classes6.dex */
public final class C11184b extends C11192j {

    /* renamed from: f */
    public static final a f26855f = new a(null);

    /* renamed from: g */
    public static final boolean f26856g;

    /* renamed from: d */
    public final List f26857d;

    /* renamed from: e */
    public final C11287j f26858e;

    /* renamed from: se.b$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11192j m24865a() {
            if (m24866b()) {
                return new C11184b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m24866b() {
            return C11184b.f26856g;
        }

        public a() {
        }
    }

    /* renamed from: se.b$b */
    public static final class b implements InterfaceC11620e {

        /* renamed from: a */
        public final X509TrustManager f26859a;

        /* renamed from: b */
        public final Method f26860b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            AbstractC9979u.m20294g(trustManager, "trustManager");
            AbstractC9979u.m20294g(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f26859a = trustManager;
            this.f26860b = findByIssuerAndSignatureMethod;
        }

        @Override // ve.InterfaceC11620e
        /* renamed from: a */
        public X509Certificate mo24867a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            AbstractC9979u.m20294g(cert, "cert");
            try {
                Object objInvoke = this.f26860b.invoke(this.f26859a, cert);
                AbstractC9979u.m20292e(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
            return AbstractC9979u.m20289b(this.f26859a, bVar.f26859a) && AbstractC9979u.m20289b(this.f26860b, bVar.f26860b);
        }

        public int hashCode() {
            return (this.f26859a.hashCode() * 31) + this.f26860b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f26859a + ", findByIssuerAndSignatureMethod=" + this.f26860b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (C11192j.f26882a.m24900h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f26856g = z10;
    }

    public C11184b() {
        List listM24140r = AbstractC10978w.m24140r(C11291n.a.m25244b(C11291n.f27114j, null, 1, null), new C11289l(C11285h.f27096f.m25233d()), new C11289l(C11288k.f27110a.m25242a()), new C11289l(C11286i.f27104a.m25237a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM24140r) {
            if (((InterfaceC11290m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f26857d = arrayList;
        this.f26858e = C11287j.f27106d.m25240a();
    }

    @Override // se.C11192j
    /* renamed from: c */
    public AbstractC11618c mo24854c(X509TrustManager trustManager) {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        C11281d c11281dM25222a = C11281d.f27089d.m25222a(trustManager);
        return c11281dM25222a != null ? c11281dM25222a : super.mo24854c(trustManager);
    }

    @Override // se.C11192j
    /* renamed from: d */
    public InterfaceC11620e mo24861d(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            AbstractC9979u.m20293f(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo24861d(trustManager);
        }
    }

    @Override // se.C11192j
    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        Iterator it = this.f26857d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC11290m) next).mo25216a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC11290m interfaceC11290m = (InterfaceC11290m) next;
        if (interfaceC11290m != null) {
            interfaceC11290m.mo25218c(sslSocket, str, protocols);
        }
    }

    @Override // se.C11192j
    /* renamed from: f */
    public void mo24862f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        AbstractC9979u.m20294g(socket, "socket");
        AbstractC9979u.m20294g(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // se.C11192j
    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) {
        Object next;
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        Iterator it = this.f26857d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC11290m) next).mo25216a(sslSocket)) {
                break;
            }
        }
        InterfaceC11290m interfaceC11290m = (InterfaceC11290m) next;
        if (interfaceC11290m != null) {
            return interfaceC11290m.mo25217b(sslSocket);
        }
        return null;
    }

    @Override // se.C11192j
    /* renamed from: h */
    public Object mo24863h(String closer) {
        AbstractC9979u.m20294g(closer, "closer");
        return this.f26858e.m25238a(closer);
    }

    @Override // se.C11192j
    /* renamed from: i */
    public boolean mo24857i(String hostname) {
        AbstractC9979u.m20294g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // se.C11192j
    /* renamed from: l */
    public void mo24864l(String message, Object obj) {
        AbstractC9979u.m20294g(message, "message");
        if (this.f26858e.m25239b(obj)) {
            return;
        }
        C11192j.m24891k(this, message, 5, null, 4, null);
    }
}
