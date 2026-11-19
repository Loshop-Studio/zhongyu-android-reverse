package p136j9;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p147k9.C7906d;
import p147k9.C7910h;
import p147k9.C7911i;
import p147k9.C7912j;
import p147k9.C7913k;
import p147k9.C7914l;
import p147k9.C7916n;
import p147k9.InterfaceC7915m;
import p171m9.AbstractC8573c;
import p171m9.InterfaceC8575e;

/* renamed from: j9.b */
/* loaded from: classes5.dex */
public final class C7820b extends C7828j {

    /* renamed from: f */
    public static final a f13533f = new a(null);

    /* renamed from: g */
    public static final boolean f13534g;

    /* renamed from: d */
    public final List f13535d;

    /* renamed from: e */
    public final C7912j f13536e;

    /* renamed from: j9.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7828j m13257a() {
            if (m13258b()) {
                return new C7820b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m13258b() {
            return C7820b.f13534g;
        }

        public a() {
        }
    }

    /* renamed from: j9.b$b */
    public static final class b implements InterfaceC8575e {

        /* renamed from: a */
        public final X509TrustManager f13537a;

        /* renamed from: b */
        public final Method f13538b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f13537a = trustManager;
            this.f13538b = findByIssuerAndSignatureMethod;
        }

        @Override // p171m9.InterfaceC8575e
        /* renamed from: a */
        public X509Certificate mo13259a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f13538b.invoke(this.f13537a, cert);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
            return Intrinsics.areEqual(this.f13537a, bVar.f13537a) && Intrinsics.areEqual(this.f13538b, bVar.f13538b);
        }

        public int hashCode() {
            return (this.f13537a.hashCode() * 31) + this.f13538b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f13537a + ", findByIssuerAndSignatureMethod=" + this.f13538b + ')';
        }
    }

    static {
        boolean z9 = false;
        if (C7828j.f13560a.m13292h() && Build.VERSION.SDK_INT < 30) {
            z9 = true;
        }
        f13534g = z9;
    }

    public C7820b() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new InterfaceC7915m[]{C7916n.a.m13554b(C7916n.f13803j, null, 1, null), new C7914l(C7910h.f13785f.m13543d()), new C7914l(C7913k.f13799a.m13552a()), new C7914l(C7911i.f13793a.m13547a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC7915m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f13535d = arrayList;
        this.f13536e = C7912j.f13795d.m13550a();
    }

    @Override // p136j9.C7828j
    /* renamed from: c */
    public AbstractC8573c mo13246c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C7906d c7906dM13532a = C7906d.f13778d.m13532a(trustManager);
        return c7906dM13532a != null ? c7906dM13532a : super.mo13246c(trustManager);
    }

    @Override // p136j9.C7828j
    /* renamed from: d */
    public InterfaceC8575e mo13253d(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo13253d(trustManager);
        }
    }

    @Override // p136j9.C7828j
    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f13535d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC7915m) next).mo13526a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC7915m interfaceC7915m = (InterfaceC7915m) next;
        if (interfaceC7915m != null) {
            interfaceC7915m.mo13528c(sslSocket, str, protocols);
        }
    }

    @Override // p136j9.C7828j
    /* renamed from: f */
    public void mo13254f(Socket socket, InetSocketAddress address, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p136j9.C7828j
    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f13535d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7915m) next).mo13526a(sslSocket)) {
                break;
            }
        }
        InterfaceC7915m interfaceC7915m = (InterfaceC7915m) next;
        if (interfaceC7915m != null) {
            return interfaceC7915m.mo13527b(sslSocket);
        }
        return null;
    }

    @Override // p136j9.C7828j
    /* renamed from: h */
    public Object mo13255h(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f13536e.m13548a(closer);
    }

    @Override // p136j9.C7828j
    /* renamed from: i */
    public boolean mo13249i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // p136j9.C7828j
    /* renamed from: l */
    public void mo13256l(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f13536e.m13549b(obj)) {
            return;
        }
        C7828j.m13283k(this, message, 5, null, 4, null);
    }
}
