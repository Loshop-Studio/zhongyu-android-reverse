package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p137q5.AbstractC7627b;
import p137q5.AbstractC7628c;
import p137q5.InterfaceC7630e;
import p144r5.C7655e;
import p144r5.C7656f;
import p144r5.C7660j;
import p144r5.C7661k;
import p144r5.C7662l;
import p144r5.C7663m;
import p144r5.InterfaceC7664n;
import p165u5.AbstractC7777c;
import p165u5.InterfaceC7779e;

/* renamed from: okhttp3.internal.platform.a */
/* loaded from: classes4.dex */
public final class C7534a extends AbstractC7536c implements InterfaceC7630e {

    /* renamed from: f */
    public static final a f9983f = new a(null);

    /* renamed from: g */
    public static final boolean f9984g;

    /* renamed from: d */
    public Context f9985d;

    /* renamed from: e */
    public final List f9986e;

    /* renamed from: okhttp3.internal.platform.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7536c m8915a() {
            if (m8916b()) {
                return new C7534a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m8916b() {
            return C7534a.f9984g;
        }

        public a() {
        }
    }

    static {
        f9984g = AbstractC7536c.f9994a.m8932f() && Build.VERSION.SDK_INT >= 29;
    }

    public C7534a() {
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new InterfaceC7664n[]{C7655e.f10092a.m9084a(), new C7663m(C7660j.f10100f.m9098d()), new C7663m(C7662l.f10111a.m9108b()), new C7663m(C7661k.f10108a.m9103a())});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((InterfaceC7664n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f9986e = arrayList;
    }

    @Override // p137q5.InterfaceC7630e
    /* renamed from: a */
    public Context mo8905a() {
        return this.f9985d;
    }

    @Override // p137q5.InterfaceC7630e
    /* renamed from: b */
    public void mo8906b(Context context) {
        this.f9985d = context;
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
    public InterfaceC7779e mo8908f(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.mo8908f(trustManager);
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: g */
    public void mo8909g(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f9986e.iterator();
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
    /* renamed from: i */
    public String mo8910i(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f9986e.iterator();
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
    /* renamed from: j */
    public Object mo8911j(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo8911j(closer);
        }
        CloseGuard closeGuardM9067a = AbstractC7627b.m9067a();
        closeGuardM9067a.open(closer);
        return closeGuardM9067a;
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: k */
    public boolean mo8912k(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: m */
    public void mo8913m(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.mo8913m(message, obj);
        } else {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            AbstractC7628c.m9068a(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.AbstractC7536c
    /* renamed from: n */
    public SSLContext mo8914n() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo8914n();
    }
}
