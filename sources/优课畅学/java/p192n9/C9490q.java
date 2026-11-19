package p192n9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.C9560b;
import okhttp3.Protocol;
import okhttp3.internal.platform.AbstractC9570c;
import p134i7.C8791m;
import p136i9.C8896a;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8907f0;
import p136i9.C8925w;
import p147j9.AbstractC9041k;
import p181m9.C9346d;
import p192n9.C9495v;
import p192n9.InterfaceC9494u;

/* renamed from: n9.q */
/* loaded from: classes5.dex */
public final class C9490q implements InterfaceC9494u {

    /* renamed from: a */
    public final C9346d f18814a;

    /* renamed from: b */
    public final C9489p f18815b;

    /* renamed from: c */
    public final int f18816c;

    /* renamed from: d */
    public final int f18817d;

    /* renamed from: e */
    public final int f18818e;

    /* renamed from: f */
    public final int f18819f;

    /* renamed from: g */
    public final int f18820g;

    /* renamed from: h */
    public final boolean f18821h;

    /* renamed from: i */
    public final boolean f18822i;

    /* renamed from: j */
    public final C8896a f18823j;

    /* renamed from: k */
    public final C9493t f18824k;

    /* renamed from: l */
    public final InterfaceC9480g f18825l;

    /* renamed from: m */
    public C9495v.b f18826m;

    /* renamed from: n */
    public C9495v f18827n;

    /* renamed from: o */
    public C8907f0 f18828o;

    /* renamed from: p */
    public final C8791m f18829p;

    public C9490q(C9346d taskRunner, C9489p connectionPool, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11, C8896a address, C9493t routeDatabase, InterfaceC9480g connectionUser) {
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        AbstractC9133u.m16133g(connectionPool, "connectionPool");
        AbstractC9133u.m16133g(address, "address");
        AbstractC9133u.m16133g(routeDatabase, "routeDatabase");
        AbstractC9133u.m16133g(connectionUser, "connectionUser");
        this.f18814a = taskRunner;
        this.f18815b = connectionPool;
        this.f18816c = i10;
        this.f18817d = i11;
        this.f18818e = i12;
        this.f18819f = i13;
        this.f18820g = i14;
        this.f18821h = z10;
        this.f18822i = z11;
        this.f18823j = address;
        this.f18824k = routeDatabase;
        this.f18825l = connectionUser;
        this.f18829p = new C8791m();
    }

    /* renamed from: j */
    public static /* synthetic */ C9478e m17576j(C9490q c9490q, C8907f0 c8907f0, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list = null;
        }
        return c9490q.m17580i(c8907f0, list);
    }

    /* renamed from: m */
    public static /* synthetic */ C9492s m17577m(C9490q c9490q, C9478e c9478e, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c9478e = null;
        }
        if ((i10 & 2) != 0) {
            list = null;
        }
        return c9490q.m17582l(c9478e, list);
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: a */
    public C8896a mo17503a() {
        return this.f18823j;
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: b */
    public boolean mo17504b(C8925w url) {
        AbstractC9133u.m16133g(url, "url");
        C8925w c8925wM14950l = mo17503a().m14950l();
        return url.m15289m() == c8925wM14950l.m15289m() && AbstractC9133u.m16128b(url.m15284h(), c8925wM14950l.m15284h());
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: c */
    public C8791m mo17505c() {
        return this.f18829p;
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: d */
    public InterfaceC9494u.b mo17506d() throws IOException {
        C9492s c9492sM17581k = m17581k();
        if (c9492sM17581k != null) {
            return c9492sM17581k;
        }
        C9492s c9492sM17577m = m17577m(this, null, null, 3, null);
        if (c9492sM17577m != null) {
            return c9492sM17577m;
        }
        if (!mo17505c().isEmpty()) {
            return (InterfaceC9494u.b) mo17505c().removeFirst();
        }
        C9478e c9478eM17579h = m17579h();
        C9492s c9492sM17582l = m17582l(c9478eM17579h, c9478eM17579h.m17455r());
        return c9492sM17582l != null ? c9492sM17582l : c9478eM17579h;
    }

    @Override // p192n9.InterfaceC9494u
    /* renamed from: e */
    public boolean mo17507e(C9488o c9488o) {
        C9495v c9495v;
        C8907f0 c8907f0M17583n;
        if (!mo17505c().isEmpty() || this.f18828o != null) {
            return true;
        }
        if (c9488o != null && (c8907f0M17583n = m17583n(c9488o)) != null) {
            this.f18828o = c8907f0M17583n;
            return true;
        }
        C9495v.b bVar = this.f18826m;
        if ((bVar == null || !bVar.m17609b()) && (c9495v = this.f18827n) != null) {
            return c9495v.m17601a();
        }
        return true;
    }

    /* renamed from: g */
    public final C8899b0 m17578g(C8907f0 c8907f0) {
        C8899b0 c8899b0M15055b = new C8899b0.a().m15073u(c8907f0.m15174a().m14950l()).m15069q("CONNECT", null).m15067o(HttpHeaders.HOST, AbstractC9041k.m15790t(c8907f0.m15174a().m14950l(), true)).m15067o("Proxy-Connection", "Keep-Alive").m15067o(HttpHeaders.USER_AGENT, "okhttp/5.1.0").m15055b();
        C8899b0 c8899b0Mo15040a = c8907f0.m15174a().m14946h().mo15040a(c8907f0, new C8903d0.a().m15159q(c8899b0M15055b).m15157o(Protocol.f18939d).m15148f(TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5).m15154l("Preemptive Authenticate").m15160r(-1L).m15158p(-1L).m15151i("Proxy-Authenticate", "OkHttp-Preemptive").m15145c());
        return c8899b0Mo15040a == null ? c8899b0M15055b : c8899b0Mo15040a;
    }

    /* renamed from: h */
    public final C9478e m17579h() throws IOException {
        C8907f0 c8907f0 = this.f18828o;
        if (c8907f0 != null) {
            this.f18828o = null;
            return m17576j(this, c8907f0, null, 2, null);
        }
        C9495v.b bVar = this.f18826m;
        if (bVar != null && bVar.m17609b()) {
            return m17576j(this, bVar.m17610c(), null, 2, null);
        }
        C9495v c9495v = this.f18827n;
        if (c9495v == null) {
            c9495v = new C9495v(mo17503a(), this.f18824k, this.f18825l, this.f18822i);
            this.f18827n = c9495v;
        }
        if (!c9495v.m17601a()) {
            throw new IOException("exhausted all routes");
        }
        C9495v.b bVarM17603c = c9495v.m17603c();
        this.f18826m = bVarM17603c;
        if (isCanceled()) {
            throw new IOException("Canceled");
        }
        return m17580i(bVarM17603c.m17610c(), bVarM17603c.m17608a());
    }

    /* renamed from: i */
    public final C9478e m17580i(C8907f0 route, List list) throws UnknownServiceException {
        AbstractC9133u.m16133g(route, "route");
        if (route.m15174a().m14949k() == null) {
            if (!route.m15174a().m14940b().contains(C9560b.f19086k)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String strM15284h = route.m15174a().m14950l().m15284h();
            if (!AbstractC9570c.f19216a.m18112e().mo18093k(strM15284h)) {
                throw new UnknownServiceException("CLEARTEXT communication to " + strM15284h + " not permitted by network security policy");
            }
        } else if (route.m15174a().m14944f().contains(Protocol.f18942g)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        return new C9478e(this.f18814a, this.f18815b, this.f18816c, this.f18817d, this.f18818e, this.f18819f, this.f18820g, this.f18821h, this.f18825l, this, route, list, 0, route.m15176c() ? m17578g(route) : null, -1, false);
    }

    @Override // p192n9.InterfaceC9494u
    public boolean isCanceled() {
        return this.f18825l.isCanceled();
    }

    /* renamed from: k */
    public final C9492s m17581k() throws IOException {
        Socket socketMo17432s;
        boolean z10;
        C9488o c9488oMo17434u = this.f18825l.mo17434u();
        if (c9488oMo17434u == null) {
            return null;
        }
        boolean zM17556p = c9488oMo17434u.m17556p(this.f18825l.mo17425l());
        synchronized (c9488oMo17434u) {
            try {
                if (!zM17556p) {
                    z10 = !c9488oMo17434u.m17551k();
                    c9488oMo17434u.m17563w(true);
                    socketMo17432s = this.f18825l.mo17432s();
                } else if (c9488oMo17434u.m17551k() || !mo17504b(c9488oMo17434u.m17560t().m15174a().m14950l())) {
                    socketMo17432s = this.f18825l.mo17432s();
                    z10 = false;
                } else {
                    z10 = false;
                    socketMo17432s = null;
                }
            } finally {
            }
        }
        if (this.f18825l.mo17434u() != null) {
            if (socketMo17432s == null) {
                return new C9492s(c9488oMo17434u);
            }
            throw new IllegalStateException("Check failed.");
        }
        if (socketMo17432s != null) {
            AbstractC9041k.m15778h(socketMo17432s);
        }
        this.f18825l.mo17421h(c9488oMo17434u);
        this.f18825l.mo17435v(c9488oMo17434u);
        if (socketMo17432s != null) {
            this.f18825l.mo17433t(c9488oMo17434u);
        } else if (z10) {
            this.f18825l.mo17415b(c9488oMo17434u);
        }
        return null;
    }

    /* renamed from: l */
    public final C9492s m17582l(C9478e c9478e, List list) throws IOException {
        C9488o c9488oM17567a = this.f18815b.m17567a(this.f18825l.mo17425l(), mo17503a(), this.f18825l, list, c9478e != null && c9478e.isReady());
        if (c9488oM17567a == null) {
            return null;
        }
        if (c9478e != null) {
            this.f18828o = c9478e.mo17446d();
            c9478e.m17449i();
        }
        this.f18825l.mo17436w(c9488oM17567a);
        this.f18825l.mo17423j(c9488oM17567a);
        return new C9492s(c9488oM17567a);
    }

    /* renamed from: n */
    public final C8907f0 m17583n(C9488o c9488o) {
        C8907f0 c8907f0M17560t;
        synchronized (c9488o) {
            c8907f0M17560t = null;
            if (c9488o.m17552l() == 0 && c9488o.m17551k() && AbstractC9041k.m15776f(c9488o.m17560t().m15174a().m14950l(), mo17503a().m14950l())) {
                c8907f0M17560t = c9488o.m17560t();
            }
        }
        return c8907f0M17560t;
    }
}
