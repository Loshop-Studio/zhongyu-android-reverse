package p004a3;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p014b3.C2720c;
import p014b3.C2721d;
import p014b3.C2725h;
import p014b3.C2726i;
import p014b3.C2728k;
import p014b3.C2729l;
import p014b3.InterfaceC2730m;
import p050d3.AbstractC3709c;

/* renamed from: a3.b */
/* loaded from: classes2.dex */
public final class C0012b extends C0021k {

    /* renamed from: e */
    public static final boolean f7e;

    /* renamed from: f */
    public static final a f8f = new a(null);

    /* renamed from: d */
    public final List f9d;

    /* renamed from: a3.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C0021k m30a() {
            if (m31b()) {
                return new C0012b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m31b() {
            return C0012b.f7e;
        }
    }

    static {
        f7e = C0021k.f39c.m72h() && Build.VERSION.SDK_INT >= 29;
    }

    public C0012b() {
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new InterfaceC2730m[]{C2720c.f466a.m1511a(), new C2729l(C2725h.f475g.m1525d()), new C2729l(C2728k.f489b.m1534a()), new C2729l(C2726i.f483b.m1529a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC2730m) obj).mo1508b()) {
                arrayList.add(obj);
            }
        }
        this.f9d = arrayList;
    }

    @Override // p004a3.C0021k
    /* renamed from: c */
    public AbstractC3709c mo26c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C2721d c2721dM1514a = C2721d.f467d.m1514a(trustManager);
        return c2721dM1514a != null ? c2721dM1514a : super.mo26c(trustManager);
    }

    @Override // p004a3.C0021k
    /* renamed from: e */
    public void mo27e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f9d.iterator();
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
    /* renamed from: g */
    public String mo28g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f9d.iterator();
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
    /* renamed from: i */
    public boolean mo29i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
