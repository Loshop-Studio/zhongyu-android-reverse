package p136j9;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p147k9.C7905c;
import p147k9.C7906d;
import p147k9.C7910h;
import p147k9.C7911i;
import p147k9.C7913k;
import p147k9.C7914l;
import p147k9.InterfaceC7915m;
import p171m9.AbstractC8573c;

/* renamed from: j9.a */
/* loaded from: classes5.dex */
public final class C7819a extends C7828j {

    /* renamed from: e */
    public static final a f13530e = new a(null);

    /* renamed from: f */
    public static final boolean f13531f;

    /* renamed from: d */
    public final List f13532d;

    /* renamed from: j9.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7828j m13250a() {
            if (m13251b()) {
                return new C7819a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m13251b() {
            return C7819a.f13531f;
        }

        public a() {
        }
    }

    static {
        f13531f = C7828j.f13560a.m13292h() && Build.VERSION.SDK_INT >= 29;
    }

    public C7819a() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new InterfaceC7915m[]{C7905c.f13777a.m13529a(), new C7914l(C7910h.f13785f.m13543d()), new C7914l(C7913k.f13799a.m13552a()), new C7914l(C7911i.f13793a.m13547a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC7915m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f13532d = arrayList;
    }

    @Override // p136j9.C7828j
    /* renamed from: c */
    public AbstractC8573c mo13246c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C7906d c7906dM13532a = C7906d.f13778d.m13532a(trustManager);
        return c7906dM13532a != null ? c7906dM13532a : super.mo13246c(trustManager);
    }

    @Override // p136j9.C7828j
    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f13532d.iterator();
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
    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f13532d.iterator();
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
    /* renamed from: i */
    public boolean mo13249i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
