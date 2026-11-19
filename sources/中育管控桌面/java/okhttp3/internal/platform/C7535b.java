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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p137q5.InterfaceC7630e;
import p144r5.C7656f;
import p144r5.C7660j;
import p144r5.C7661k;
import p144r5.C7662l;
import p144r5.C7663m;
import p144r5.C7665o;
import p144r5.InterfaceC7664n;
import p165u5.AbstractC7777c;
import p165u5.InterfaceC7779e;

/* renamed from: okhttp3.internal.platform.b */
/* loaded from: classes4.dex */
public final class C7535b extends AbstractC7536c implements InterfaceC7630e {

    /* renamed from: f */
    public static final a f9987f = new a(null);

    /* renamed from: g */
    public static final String f9988g = "OkHttp";

    /* renamed from: h */
    public static final boolean f9989h;

    /* renamed from: d */
    public Context f9990d;

    /* renamed from: e */
    public final List f9991e;

    /* renamed from: okhttp3.internal.platform.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7536c m8920a() {
            if (m8921b()) {
                return new C7535b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m8921b() {
            return C7535b.f9989h;
        }

        public a() {
        }
    }

    /* renamed from: okhttp3.internal.platform.b$b */
    public static final class b implements InterfaceC7779e {

        /* renamed from: a */
        public final X509TrustManager f9992a;

        /* renamed from: b */
        public final Method f9993b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f9992a = trustManager;
            this.f9993b = findByIssuerAndSignatureMethod;
        }

        @Override // p165u5.InterfaceC7779e
        /* renamed from: a */
        public X509Certificate mo8922a(X509Certificate cert) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f9993b.invoke(this.f9992a, cert);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e6) {
                throw new AssertionError("unable to get issues and signature", e6);
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
            return Intrinsics.areEqual(this.f9992a, bVar.f9992a) && Intrinsics.areEqual(this.f9993b, bVar.f9993b);
        }

        public int hashCode() {
            return (this.f9992a.hashCode() * 31) + this.f9993b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f9992a + ", findByIssuerAndSignatureMethod=" + this.f9993b + ')';
        }
    }

    static {
        f9989h = AbstractC7536c.f9994a.m8932f() && Build.VERSION.SDK_INT < 29;
    }

    public C7535b() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new InterfaceC7664n[]{C7665o.a.m9111b(C7665o.f10116j, null, 1, null), new C7663m(C7660j.f10100f.m9098d()), new C7663m(C7662l.f10111a.m9108b()), new C7663m(C7661k.f10108a.m9103a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC7664n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f9991e = arrayList;
    }

    @Override // p137q5.InterfaceC7630e
    /* renamed from: a */
    public Context mo8905a() {
        return this.f9990d;
    }

    @Override // p137q5.InterfaceC7630e
    /* renamed from: b */
    public void mo8906b(Context context) {
        this.f9990d = context;
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: e */
    public AbstractC7777c mo8907e(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C7656f c7656fM9087a = C7656f.f10093d.m9087a(trustManager);
        return c7656fM9087a != null ? c7656fM9087a : super.mo8907e(trustManager);
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: f */
    public InterfaceC7779e mo8908f(X509TrustManager trustManager) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNull(declaredMethod);
            return new b(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo8908f(trustManager);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: g */
    public void mo8909g(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f9991e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC7664n) next).mo9081a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC7664n interfaceC7664n = (InterfaceC7664n) next;
        if (interfaceC7664n != null) {
            interfaceC7664n.mo9083c(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: h */
    public void mo8918h(Socket socket, InetSocketAddress address, int i6) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i6);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e6;
            }
            throw new IOException("Exception in connect", e6);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: i */
    public String mo8910i(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f9991e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC7664n) next).mo9081a(sslSocket)) {
                break;
            }
        }
        InterfaceC7664n interfaceC7664n = (InterfaceC7664n) next;
        if (interfaceC7664n != null) {
            return interfaceC7664n.mo9082b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: k */
    public boolean mo8912k(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: l */
    public void mo8919l(String message, int i6, Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (i6 == 5) {
            Log.w(f9988g, message, th);
        } else {
            Log.i(f9988g, message, th);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: n */
    public SSLContext mo8914n() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo8914n();
    }
}
