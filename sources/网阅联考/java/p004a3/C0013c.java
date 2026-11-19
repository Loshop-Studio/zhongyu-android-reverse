package p004a3;

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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p014b3.C2721d;
import p014b3.C2725h;
import p014b3.C2726i;
import p014b3.C2727j;
import p014b3.C2728k;
import p014b3.C2729l;
import p014b3.C2731n;
import p014b3.InterfaceC2730m;
import p050d3.AbstractC3709c;
import p050d3.InterfaceC3711e;

/* renamed from: a3.c */
/* loaded from: classes2.dex */
public final class C0013c extends C0021k {

    /* renamed from: f */
    public static final boolean f10f;

    /* renamed from: g */
    public static final a f11g = new a(null);

    /* renamed from: d */
    public final List f12d;

    /* renamed from: e */
    public final C2727j f13e;

    /* renamed from: a3.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0021k m37a() {
            if (m38b()) {
                return new C0013c();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m38b() {
            return C0013c.f10f;
        }
    }

    /* renamed from: a3.c$b */
    public static final class b implements InterfaceC3711e {

        /* renamed from: a */
        public final X509TrustManager f14a;

        /* renamed from: b */
        public final Method f15b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f14a = trustManager;
            this.f15b = findByIssuerAndSignatureMethod;
        }

        @Override // p050d3.InterfaceC3711e
        /* renamed from: a */
        public X509Certificate mo39a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f15b.invoke(this.f14a, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e4) {
                throw new AssertionError("unable to get issues and signature", e4);
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
            return Intrinsics.areEqual(this.f14a, bVar.f14a) && Intrinsics.areEqual(this.f15b, bVar.f15b);
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f14a;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f15b;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f14a + ", findByIssuerAndSignatureMethod=" + this.f15b + ")";
        }
    }

    static {
        boolean z3 = false;
        if (C0021k.f39c.m72h() && Build.VERSION.SDK_INT < 30) {
            z3 = true;
        }
        f10f = z3;
    }

    public C0013c() {
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new InterfaceC2730m[]{C2731n.a.m1536b(C2731n.f492j, null, 1, null), new C2729l(C2725h.f475g.m1525d()), new C2729l(C2728k.f489b.m1534a()), new C2729l(C2726i.f483b.m1529a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC2730m) obj).mo1508b()) {
                arrayList.add(obj);
            }
        }
        this.f12d = arrayList;
        this.f13e = C2727j.f484d.m1532a();
    }

    @Override // p004a3.C0021k
    /* renamed from: c */
    public AbstractC3709c mo26c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C2721d c2721dM1514a = C2721d.f467d.m1514a(trustManager);
        return c2721dM1514a != null ? c2721dM1514a : super.mo26c(trustManager);
    }

    @Override // p004a3.C0021k
    /* renamed from: d */
    public InterfaceC3711e mo33d(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo33d(trustManager);
        }
    }

    @Override // p004a3.C0021k
    /* renamed from: e */
    public void mo27e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f12d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC2730m) next).mo1507a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC2730m interfaceC2730m = (InterfaceC2730m) next;
        if (interfaceC2730m != null) {
            interfaceC2730m.mo1510d(sslSocket, str, protocols);
        }
    }

    @Override // p004a3.C0021k
    /* renamed from: f */
    public void mo34f(Socket socket, InetSocketAddress address, int i4) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i4);
        } catch (ClassCastException e4) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e4;
            }
            throw new IOException("Exception in connect", e4);
        }
    }

    @Override // p004a3.C0021k
    /* renamed from: g */
    public String mo28g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f12d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC2730m) next).mo1507a(sslSocket)) {
                break;
            }
        }
        InterfaceC2730m interfaceC2730m = (InterfaceC2730m) next;
        if (interfaceC2730m != null) {
            return interfaceC2730m.mo1509c(sslSocket);
        }
        return null;
    }

    @Override // p004a3.C0021k
    /* renamed from: h */
    public Object mo35h(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f13e.m1530a(closer);
    }

    @Override // p004a3.C0021k
    /* renamed from: i */
    public boolean mo29i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        if (Build.VERSION.SDK_INT >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        Intrinsics.checkNotNullExpressionValue(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override // p004a3.C0021k
    /* renamed from: l */
    public void mo36l(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f13e.m1531b(obj)) {
            return;
        }
        C0021k.m63k(this, message, 5, null, 4, null);
    }
}
