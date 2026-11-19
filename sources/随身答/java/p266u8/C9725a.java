package p266u8;

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
import p276v8.C9775c;
import p276v8.C9776d;
import p276v8.C9780h;
import p276v8.C9781i;
import p276v8.C9783k;
import p276v8.C9784l;
import p276v8.InterfaceC9785m;
import p296x8.AbstractC9917c;

/* renamed from: u8.a */
/* loaded from: classes5.dex */
public final class C9725a extends C9734j {

    /* renamed from: e */
    public static final a f17170e = new a(null);

    /* renamed from: f */
    public static final boolean f17171f;

    /* renamed from: d */
    public final List f17172d;

    /* renamed from: u8.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9734j m16230a() {
            if (m16231b()) {
                return new C9725a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m16231b() {
            return C9725a.f17171f;
        }

        public a() {
        }
    }

    static {
        f17171f = C9734j.f17200a.m16272h() && Build.VERSION.SDK_INT >= 29;
    }

    public C9725a() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new InterfaceC9785m[]{C9775c.f17384a.m16562a(), new C9784l(C9780h.f17392f.m16576d()), new C9784l(C9783k.f17406a.m16585a()), new C9784l(C9781i.f17400a.m16580a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC9785m) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f17172d = arrayList;
    }

    @Override // p266u8.C9734j
    /* renamed from: c */
    public AbstractC9917c mo16226c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        C9776d c9776dM16565a = C9776d.f17385d.m16565a(trustManager);
        return c9776dM16565a != null ? c9776dM16565a : super.mo16226c(trustManager);
    }

    @Override // p266u8.C9734j
    /* renamed from: e */
    public void mo16227e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f17172d.iterator();
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
    /* renamed from: g */
    public String mo16228g(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f17172d.iterator();
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
    /* renamed from: i */
    public boolean mo16229i(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
