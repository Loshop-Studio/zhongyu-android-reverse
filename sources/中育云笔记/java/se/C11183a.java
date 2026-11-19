package se;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;
import p351te.C11280c;
import p351te.C11281d;
import p351te.C11285h;
import p351te.C11286i;
import p351te.C11288k;
import p351te.C11289l;
import p351te.InterfaceC11290m;
import ve.AbstractC11618c;

/* renamed from: se.a */
/* loaded from: classes6.dex */
public final class C11183a extends C11192j {

    /* renamed from: e */
    public static final a f26852e = new a(null);

    /* renamed from: f */
    public static final boolean f26853f;

    /* renamed from: d */
    public final List f26854d;

    /* renamed from: se.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11192j m24858a() {
            if (m24859b()) {
                return new C11183a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m24859b() {
            return C11183a.f26853f;
        }

        public a() {
        }
    }

    static {
        f26853f = C11192j.f26882a.m24900h() && Build.VERSION.SDK_INT >= 29;
    }

    public C11183a() {
        List listM24140r = AbstractC10978w.m24140r(C11280c.f27088a.m25219a(), new C11289l(C11285h.f27096f.m25233d()), new C11289l(C11288k.f27110a.m25242a()), new C11289l(C11286i.f27104a.m25237a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM24140r) {
            if (((InterfaceC11290m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f26854d = arrayList;
    }

    @Override // se.C11192j
    /* renamed from: c */
    public AbstractC11618c mo24854c(X509TrustManager trustManager) {
        AbstractC9979u.m20294g(trustManager, "trustManager");
        C11281d c11281dM25222a = C11281d.f27089d.m25222a(trustManager);
        return c11281dM25222a != null ? c11281dM25222a : super.mo24854c(trustManager);
    }

    @Override // se.C11192j
    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        Iterator it = this.f26854d.iterator();
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
    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) {
        Object next;
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        Iterator it = this.f26854d.iterator();
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
    /* renamed from: i */
    public boolean mo24857i(String hostname) {
        AbstractC9979u.m20294g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
