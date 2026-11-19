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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;
import p258t9.AbstractC10126b;
import p258t9.AbstractC10127c;
import p258t9.InterfaceC10129e;
import p269u9.C10225e;
import p269u9.C10226f;
import p269u9.C10230j;
import p269u9.C10231k;
import p269u9.C10232l;
import p269u9.C10233m;
import p269u9.InterfaceC10234n;
import p302x9.AbstractC10588c;
import p302x9.InterfaceC10590e;

/* renamed from: okhttp3.internal.platform.a */
/* loaded from: classes5.dex */
public final class C9568a extends AbstractC9570c implements InterfaceC10129e {

    /* renamed from: f */
    public static final a f19205f = new a(null);

    /* renamed from: g */
    public static final boolean f19206g;

    /* renamed from: d */
    public Context f19207d;

    /* renamed from: e */
    public final List f19208e;

    /* renamed from: okhttp3.internal.platform.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AbstractC9570c m18096a() {
            if (m18097b()) {
                return new C9568a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m18097b() {
            return C9568a.f19206g;
        }

        public a() {
        }
    }

    static {
        f19206g = AbstractC9570c.f19216a.m18113f() && Build.VERSION.SDK_INT >= 29;
    }

    public C9568a() {
        List listM14775r = AbstractC8809v.m14775r(C10225e.f20399a.m19120a(), new C10233m(C10230j.f20407f.m19134d()), new C10233m(C10232l.f20418a.m19144b()), new C10233m(C10231k.f20415a.m19139a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM14775r) {
            if (((InterfaceC10234n) obj).isSupported()) {
                arrayList.add(obj);
            }
        }
        this.f19208e = arrayList;
    }

    @Override // p258t9.InterfaceC10129e
    /* renamed from: a */
    public Context mo18086a() {
        return this.f19207d;
    }

    @Override // p258t9.InterfaceC10129e
    /* renamed from: b */
    public void mo18087b(Context context) {
        this.f19207d = context;
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: e */
    public AbstractC10588c mo18088e(X509TrustManager trustManager) {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        C10226f c10226fM19123a = C10226f.f20400d.m19123a(trustManager);
        return c10226fM19123a != null ? c10226fM19123a : super.mo18088e(trustManager);
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: f */
    public InterfaceC10590e mo18089f(X509TrustManager trustManager) {
        AbstractC9133u.m16133g(trustManager, "trustManager");
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.mo18089f(trustManager);
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: g */
    public void mo18090g(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        Iterator it = this.f19208e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC10234n) next).mo19117a(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC10234n interfaceC10234n = (InterfaceC10234n) next;
        if (interfaceC10234n != null) {
            interfaceC10234n.mo19119c(sslSocket, str, protocols);
        }
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: i */
    public String mo18091i(SSLSocket sslSocket) {
        Object next;
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        Iterator it = this.f19208e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC10234n) next).mo19117a(sslSocket)) {
                break;
            }
        }
        InterfaceC10234n interfaceC10234n = (InterfaceC10234n) next;
        if (interfaceC10234n != null) {
            return interfaceC10234n.mo19118b(sslSocket);
        }
        return null;
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: j */
    public Object mo18092j(String closer) {
        AbstractC9133u.m16133g(closer, "closer");
        if (Build.VERSION.SDK_INT < 30) {
            return super.mo18092j(closer);
        }
        CloseGuard closeGuardM18916a = AbstractC10126b.m18916a();
        closeGuardM18916a.open(closer);
        return closeGuardM18916a;
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: k */
    public boolean mo18093k(String hostname) {
        AbstractC9133u.m16133g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: m */
    public void mo18094m(String message, Object obj) {
        AbstractC9133u.m16133g(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.mo18094m(message, obj);
        } else {
            AbstractC9133u.m16131e(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            AbstractC10127c.m18917a(obj).warnIfOpen();
        }
    }

    @Override // okhttp3.internal.platform.AbstractC9570c
    /* renamed from: n */
    public SSLContext mo18095n() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.mo18095n();
    }
}
