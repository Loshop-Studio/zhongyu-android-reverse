package p266u8;

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
import p276v8.C9776d;
import p276v8.C9780h;
import p276v8.C9781i;
import p276v8.C9782j;
import p276v8.C9783k;
import p276v8.C9784l;
import p276v8.C9786n;
import p276v8.InterfaceC9785m;
import p296x8.AbstractC9917c;
import p296x8.InterfaceC9919e;

/* renamed from: u8.b */
/* loaded from: classes5.dex */
public final class C9726b extends C9734j {

    /* renamed from: f */
    public static final a f17173f = new a(null);

    /* renamed from: g */
    public static final boolean f17174g;

    /* renamed from: d */
    public final List f17175d;

    /* renamed from: e */
    public final C9782j f17176e;

    /* renamed from: u8.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9734j m16237a() {
            if (m16238b()) {
                return new C9726b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16238b() {
            return C9726b.f17174g;
        }

        public a() {
        }
    }

    /* renamed from: u8.b$b */
    public static final class b implements InterfaceC9919e {

        /* renamed from: a */
        public final X509TrustManager f17177a;

        /* renamed from: b */
        public final Method f17178b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f17177a = trustManager;
            this.f17178b = findByIssuerAndSignatureMethod;
        }

        @Override // p296x8.InterfaceC9919e
        /* renamed from: a */
        public X509Certificate mo16239a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f17178b.invoke(this.f17177a, cert);
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
            return Intrinsics.areEqual(this.f17177a, bVar.f17177a) && Intrinsics.areEqual(this.f17178b, bVar.f17178b);
        }

        public int hashCode() {
            return (this.f17177a.hashCode() * 31) + this.f17178b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f17177a + ", findByIssuerAndSignatureMethod=" + this.f17178b + ')';
        }
    }

    static {
        boolean z9 = false;
        if (C9734j.f17200a.m16272h() && Build.VERSION.SDK_INT < 30) {
            z9 = true;
        }
        f17174g = z9;
    }

    public C9726b() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new InterfaceC9785m[]{C9786n.a.m16587b(C9786n.f17410j, null, 1, null), new C9784l(C9780h.f17392f.m16576d()), new C9784l(C9783k.f17406a.m16585a()), new C9784l(C9781i.f17400a.m16580a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC9785m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f17175d = arrayList;
        this.f17176e = C9782j.f17402d.m16583a();
    }

    @Override // p266u8.C9734j
    /* renamed from: c */
    public AbstractC9917c mo16226c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C9776d c9776dM16565a = C9776d.f17385d.m16565a(trustManager);
        return c9776dM16565a != null ? c9776dM16565a : super.mo16226c(trustManager);
    }

    @Override // p266u8.C9734j
    /* renamed from: d */
    public InterfaceC9919e mo16233d(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo16233d(trustManager);
        }
    }

    @Override // p266u8.C9734j
    /* renamed from: e */
    public void mo16227e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f17175d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC9785m) next).mo16559a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC9785m interfaceC9785m = (InterfaceC9785m) next;
        if (interfaceC9785m != null) {
            interfaceC9785m.mo16561c(sslSocket, str, protocols);
        }
    }

    @Override // p266u8.C9734j
    /* renamed from: f */
    public void mo16234f(Socket socket, InetSocketAddress address, int i9) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i9);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p266u8.C9734j
    /* renamed from: g */
    public String mo16228g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f17175d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC9785m) next).mo16559a(sslSocket)) {
                break;
            }
        }
        InterfaceC9785m interfaceC9785m = (InterfaceC9785m) next;
        if (interfaceC9785m != null) {
            return interfaceC9785m.mo16560b(sslSocket);
        }
        return null;
    }

    @Override // p266u8.C9734j
    /* renamed from: h */
    public Object mo16235h(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        return this.f17176e.m16581a(closer);
    }

    @Override // p266u8.C9734j
    /* renamed from: i */
    public boolean mo16229i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // p266u8.C9734j
    /* renamed from: l */
    public void mo16236l(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f17176e.m16582b(obj)) {
            return;
        }
        C9734j.m16263k(this, message, 5, null, 4, null);
    }
}
