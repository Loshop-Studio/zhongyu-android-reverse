package p093k5;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.C7526b;
import okhttp3.Protocol;
import okhttp3.internal.platform.AbstractC7536c;
import p058f5.C6355a;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6366f0;
import p058f5.C6384w;
import p065g5.AbstractC6427k;
import p086j5.C6601d;
import p093k5.C6699v;
import p093k5.InterfaceC6698u;

/* renamed from: k5.q */
/* loaded from: classes4.dex */
public final class C6694q implements InterfaceC6698u {

    /* renamed from: a */
    public final C6601d f8944a;

    /* renamed from: b */
    public final C6693p f8945b;

    /* renamed from: c */
    public final int f8946c;

    /* renamed from: d */
    public final int f8947d;

    /* renamed from: e */
    public final int f8948e;

    /* renamed from: f */
    public final int f8949f;

    /* renamed from: g */
    public final int f8950g;

    /* renamed from: h */
    public final boolean f8951h;

    /* renamed from: i */
    public final boolean f8952i;

    /* renamed from: j */
    public final C6355a f8953j;

    /* renamed from: k */
    public final C6697t f8954k;

    /* renamed from: l */
    public final InterfaceC6684g f8955l;

    /* renamed from: m */
    public C6699v.b f8956m;

    /* renamed from: n */
    public C6699v f8957n;

    /* renamed from: o */
    public C6366f0 f8958o;

    /* renamed from: p */
    public final ArrayDeque f8959p;

    public C6694q(C6601d taskRunner, C6693p connectionPool, int i6, int i7, int i8, int i9, int i10, boolean z6, boolean z7, C6355a address, C6697t routeDatabase, InterfaceC6684g connectionUser) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        this.f8944a = taskRunner;
        this.f8945b = connectionPool;
        this.f8946c = i6;
        this.f8947d = i7;
        this.f8948e = i8;
        this.f8949f = i9;
        this.f8950g = i10;
        this.f8951h = z6;
        this.f8952i = z7;
        this.f8953j = address;
        this.f8954k = routeDatabase;
        this.f8955l = connectionUser;
        this.f8959p = new ArrayDeque();
    }

    /* renamed from: j */
    public static /* synthetic */ C6682e m7843j(C6694q c6694q, C6366f0 c6366f0, List list, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            list = null;
        }
        return c6694q.m7847i(c6366f0, list);
    }

    /* renamed from: m */
    public static /* synthetic */ C6696s m7844m(C6694q c6694q, C6682e c6682e, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            c6682e = null;
        }
        if ((i6 & 2) != 0) {
            list = null;
        }
        return c6694q.m7849l(c6682e, list);
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: a */
    public C6355a mo7770a() {
        return this.f8953j;
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: b */
    public ArrayDeque mo7771b() {
        return this.f8959p;
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: c */
    public InterfaceC6698u.b mo7772c() throws IOException {
        C6696s c6696sM7848k = m7848k();
        if (c6696sM7848k != null) {
            return c6696sM7848k;
        }
        C6696s c6696sM7844m = m7844m(this, null, null, 3, null);
        if (c6696sM7844m != null) {
            return c6696sM7844m;
        }
        if (!mo7771b().isEmpty()) {
            return (InterfaceC6698u.b) mo7771b().removeFirst();
        }
        C6682e c6682eM7846h = m7846h();
        C6696s c6696sM7849l = m7849l(c6682eM7846h, c6682eM7846h.m7722r());
        return c6696sM7849l != null ? c6696sM7849l : c6682eM7846h;
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: e */
    public boolean mo7773e(C6384w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        C6384w c6384wM6486l = mo7770a().m6486l();
        return url.m6828m() == c6384wM6486l.m6828m() && Intrinsics.areEqual(url.m6823h(), c6384wM6486l.m6823h());
    }

    @Override // p093k5.InterfaceC6698u
    /* renamed from: f */
    public boolean mo7774f(C6692o c6692o) {
        C6699v c6699v;
        C6366f0 c6366f0M7850n;
        if (!mo7771b().isEmpty() || this.f8958o != null) {
            return true;
        }
        if (c6692o != null && (c6366f0M7850n = m7850n(c6692o)) != null) {
            this.f8958o = c6366f0M7850n;
            return true;
        }
        C6699v.b bVar = this.f8956m;
        if ((bVar == null || !bVar.m7876b()) && (c6699v = this.f8957n) != null) {
            return c6699v.m7868a();
        }
        return true;
    }

    /* renamed from: g */
    public final C6358b0 m7845g(C6366f0 c6366f0) {
        C6358b0 c6358b0M6591b = new C6358b0.a().m6610v(c6366f0.m6713a().m6486l()).m6605q("CONNECT", null).m6603o(HttpHeaders.HOST, AbstractC6427k.m7032t(c6366f0.m6713a().m6486l(), true)).m6603o("Proxy-Connection", "Keep-Alive").m6603o(HttpHeaders.USER_AGENT, "okhttp/5.1.0").m6591b();
        C6358b0 c6358b0Mo6576a = c6366f0.m6713a().m6482h().mo6576a(c6366f0, new C6362d0.a().m6696q(c6358b0M6591b).m6694o(Protocol.f9717d).m6685f(407).m6691l("Preemptive Authenticate").m6697r(-1L).m6695p(-1L).m6688i("Proxy-Authenticate", "OkHttp-Preemptive").m6682c());
        return c6358b0Mo6576a == null ? c6358b0M6591b : c6358b0Mo6576a;
    }

    /* renamed from: h */
    public final C6682e m7846h() throws IOException {
        C6366f0 c6366f0 = this.f8958o;
        if (c6366f0 != null) {
            this.f8958o = null;
            return m7843j(this, c6366f0, null, 2, null);
        }
        C6699v.b bVar = this.f8956m;
        if (bVar != null && bVar.m7876b()) {
            return m7843j(this, bVar.m7877c(), null, 2, null);
        }
        C6699v c6699v = this.f8957n;
        if (c6699v == null) {
            c6699v = new C6699v(mo7770a(), this.f8954k, this.f8955l, this.f8952i);
            this.f8957n = c6699v;
        }
        if (!c6699v.m7868a()) {
            throw new IOException("exhausted all routes");
        }
        C6699v.b bVarM7870c = c6699v.m7870c();
        this.f8956m = bVarM7870c;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return m7847i(bVarM7870c.m7877c(), bVarM7870c.m7875a());
    }

    /* renamed from: i */
    public final C6682e m7847i(C6366f0 route, List list) throws UnknownServiceException {
        Intrinsics.checkNotNullParameter(route, "route");
        if (route.m6713a().m6485k() == null) {
            if (!route.m6713a().m6476b().contains(C7526b.f9864k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strM6823h = route.m6713a().m6486l().m6823h();
            if (!AbstractC7536c.f9994a.m8931e().mo8912k(strM6823h)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strM6823h + " not permitted by network security policy");
            }
        } else if (route.m6713a().m6480f().contains(Protocol.f9720g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new C6682e(this.f8944a, this.f8945b, this.f8946c, this.f8947d, this.f8948e, this.f8949f, this.f8950g, this.f8951h, this.f8955l, this, route, list, 0, route.m6715c() ? m7845g(route) : null, -1, false);
    }

    @Override // p093k5.InterfaceC6698u
    public boolean isCanceled() {
        return this.f8955l.isCanceled();
    }

    /* renamed from: k */
    public final C6696s m7848k() throws IOException {
        Socket socketMo7698r;
        boolean z6;
        C6692o c6692oMo7699s = this.f8955l.mo7699s();
        if (c6692oMo7699s == null) {
            return null;
        }
        boolean zM7823p = c6692oMo7699s.m7823p(this.f8955l.mo7691k());
        synchronized (c6692oMo7699s) {
            try {
                if (!zM7823p) {
                    z6 = !c6692oMo7699s.m7818k();
                    c6692oMo7699s.m7830w(true);
                    socketMo7698r = this.f8955l.mo7698r();
                } else if (c6692oMo7699s.m7818k() || !mo7773e(c6692oMo7699s.m7827t().m6713a().m6486l())) {
                    socketMo7698r = this.f8955l.mo7698r();
                    z6 = false;
                } else {
                    z6 = false;
                    socketMo7698r = null;
                }
            } finally {
            }
        }
        if (this.f8955l.mo7699s() != null) {
            if (socketMo7698r == null) {
                return new C6696s(c6692oMo7699s);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketMo7698r != null) {
            AbstractC6427k.m7020h(socketMo7698r);
        }
        this.f8955l.mo7689i(c6692oMo7699s);
        this.f8955l.mo7685e(c6692oMo7699s);
        if (socketMo7698r != null) {
            this.f8955l.mo7694n(c6692oMo7699s);
        } else if (z6) {
            this.f8955l.mo7701u(c6692oMo7699s);
        }
        return null;
    }

    /* renamed from: l */
    public final C6696s m7849l(C6682e c6682e, List list) throws IOException {
        C6692o c6692oM7834a = this.f8945b.m7834a(this.f8955l.mo7691k(), mo7770a(), this.f8955l, list, c6682e != null && c6682e.isReady());
        if (c6692oM7834a == null) {
            return null;
        }
        if (c6682e != null) {
            this.f8958o = c6682e.mo7714e();
            c6682e.m7716i();
        }
        this.f8955l.mo7700t(c6692oM7834a);
        this.f8955l.mo7702v(c6692oM7834a);
        return new C6696s(c6692oM7834a);
    }

    /* renamed from: n */
    public final C6366f0 m7850n(C6692o c6692o) {
        C6366f0 c6366f0M7827t;
        synchronized (c6692o) {
            c6366f0M7827t = null;
            if (c6692o.m7819l() == 0 && c6692o.m7818k() && AbstractC6427k.m7018f(c6692o.m7827t().m6713a().m6486l(), mo7770a().m6486l())) {
                c6366f0M7827t = c6692o.m7827t();
            }
        }
        return c6366f0M7827t;
    }
}
