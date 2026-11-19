package p170l9;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.Protocol;
import p113g8.AbstractC8687z;
import p136i9.AbstractC8900c;
import p136i9.AbstractC8920r;
import p136i9.C8899b0;
import p136i9.C8903d0;
import p136i9.C8924v;
import p136i9.InterfaceC8904e;
import p136i9.InterfaceC8926x;
import p147j9.AbstractC9033c;
import p147j9.AbstractC9038h;
import p170l9.C9285b;
import p192n9.C9487n;

/* renamed from: l9.a */
/* loaded from: classes5.dex */
public final class C9284a implements InterfaceC8926x {

    /* renamed from: a */
    public static final a f18284a = new a(null);

    /* renamed from: l9.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public final C8924v m17065b(C8924v c8924v, C8924v c8924v2) {
            C8924v.a aVar = new C8924v.a();
            int size = c8924v.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strM15262c = c8924v.m15262c(i10);
                String strM15265g = c8924v.m15265g(i10);
                if ((!AbstractC8687z.m14093A("Warning", strM15262c, true) || !AbstractC8687z.m14105M(strM15265g, "1", false, 2, null)) && (m17066c(strM15262c) || !m17067d(strM15262c) || c8924v2.m15260a(strM15262c) == null)) {
                    aVar.m15270d(strM15262c, strM15265g);
                }
            }
            int size2 = c8924v2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strM15262c2 = c8924v2.m15262c(i11);
                if (!m17066c(strM15262c2) && m17067d(strM15262c2)) {
                    aVar.m15270d(strM15262c2, c8924v2.m15265g(i11));
                }
            }
            return aVar.m15272f();
        }

        /* renamed from: c */
        public final boolean m17066c(String str) {
            return AbstractC8687z.m14093A(HttpHeaders.CONTENT_LENGTH, str, true) || AbstractC8687z.m14093A("Content-Encoding", str, true) || AbstractC8687z.m14093A(HttpHeaders.CONTENT_TYPE, str, true);
        }

        /* renamed from: d */
        public final boolean m17067d(String str) {
            return (AbstractC8687z.m14093A("Connection", str, true) || AbstractC8687z.m14093A("Keep-Alive", str, true) || AbstractC8687z.m14093A("Proxy-Authenticate", str, true) || AbstractC8687z.m14093A("Proxy-Authorization", str, true) || AbstractC8687z.m14093A("TE", str, true) || AbstractC8687z.m14093A("Trailers", str, true) || AbstractC8687z.m14093A("Transfer-Encoding", str, true) || AbstractC8687z.m14093A("Upgrade", str, true)) ? false : true;
        }

        public a() {
        }
    }

    public C9284a(AbstractC8900c abstractC8900c) {
    }

    @Override // p136i9.InterfaceC8926x
    public C8903d0 intercept(InterfaceC8926x.a chain) throws IOException {
        AbstractC8920r abstractC8920rM17523n;
        AbstractC9133u.m16133g(chain, "chain");
        InterfaceC8904e interfaceC8904eCall = chain.call();
        C9285b c9285bM17072b = new C9285b.b(System.currentTimeMillis(), chain.mo15332a(), null).m17072b();
        C8899b0 c8899b0M17069b = c9285bM17072b.m17069b();
        C8903d0 c8903d0M17068a = c9285bM17072b.m17068a();
        C9487n c9487n = interfaceC8904eCall instanceof C9487n ? (C9487n) interfaceC8904eCall : null;
        if (c9487n == null || (abstractC8920rM17523n = c9487n.m17523n()) == null) {
            abstractC8920rM17523n = AbstractC8920r.f16783b;
        }
        if (c8899b0M17069b == null && c8903d0M17068a == null) {
            C8903d0 c8903d0M15145c = new C8903d0.a().m15159q(chain.mo15332a()).m15157o(Protocol.f18939d).m15148f(504).m15154l("Unsatisfiable Request (only-if-cached)").m15160r(-1L).m15158p(System.currentTimeMillis()).m15145c();
            abstractC8920rM17523n.m15225B(interfaceC8904eCall, c8903d0M15145c);
            return c8903d0M15145c;
        }
        if (c8899b0M17069b == null) {
            AbstractC9133u.m16130d(c8903d0M17068a);
            C8903d0 c8903d0M15145c2 = c8903d0M17068a.m15137p().m15146d(AbstractC9033c.m15699a(c8903d0M17068a)).m15145c();
            abstractC8920rM17523n.m15229b(interfaceC8904eCall, c8903d0M15145c2);
            return c8903d0M15145c2;
        }
        if (c8903d0M17068a != null) {
            abstractC8920rM17523n.m15228a(interfaceC8904eCall, c8903d0M17068a);
        }
        C8903d0 c8903d0Mo15333b = chain.mo15333b(c8899b0M17069b);
        if (c8903d0M17068a != null) {
            if (c8903d0Mo15333b != null && c8903d0Mo15333b.m15128f() == 304) {
                c8903d0M17068a.m15137p().m15152j(f18284a.m17065b(c8903d0M17068a.m15133l(), c8903d0Mo15333b.m15133l())).m15160r(c8903d0Mo15333b.m15142u()).m15158p(c8903d0Mo15333b.m15140s()).m15146d(AbstractC9033c.m15699a(c8903d0M17068a)).m15155m(AbstractC9033c.m15699a(c8903d0Mo15333b)).m15145c();
                c8903d0Mo15333b.m15124b().close();
                AbstractC9133u.m16130d(null);
                throw null;
            }
            AbstractC9038h.m15750f(c8903d0M17068a.m15124b());
        }
        AbstractC9133u.m16130d(c8903d0Mo15333b);
        return c8903d0Mo15333b.m15137p().m15146d(c8903d0M17068a != null ? AbstractC9033c.m15699a(c8903d0M17068a) : null).m15155m(AbstractC9033c.m15699a(c8903d0Mo15333b)).m15145c();
    }
}
