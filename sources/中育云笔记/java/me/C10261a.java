package me;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import je.AbstractC9723c;
import je.AbstractC9735o;
import je.AbstractC9746z;
import je.C9737q;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9739s;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import me.C10262b;
import okhttp3.Protocol;
import p281oe.C10487e;
import p310qd.AbstractC10819z;

/* renamed from: me.a */
/* loaded from: classes6.dex */
public final class C10261a implements InterfaceC9739s {

    /* renamed from: a */
    public static final a f24378a = new a(null);

    /* renamed from: me.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: c */
        public final C9737q m21364c(C9737q c9737q, C9737q c9737q2) {
            C9737q.a aVar = new C9737q.a();
            int size = c9737q.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strM19390b = c9737q.m19390b(i10);
                String strM19393f = c9737q.m19393f(i10);
                if ((!AbstractC10819z.m23230C("Warning", strM19390b, true) || !AbstractC10819z.m23242O(strM19393f, "1", false, 2, null)) && (m21365d(strM19390b) || !m21366e(strM19390b) || c9737q2.m19389a(strM19390b) == null)) {
                    aVar.m19398d(strM19390b, strM19393f);
                }
            }
            int size2 = c9737q2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strM19390b2 = c9737q2.m19390b(i11);
                if (!m21365d(strM19390b2) && m21366e(strM19390b2)) {
                    aVar.m19398d(strM19390b2, c9737q2.m19393f(i11));
                }
            }
            return aVar.m19400f();
        }

        /* renamed from: d */
        public final boolean m21365d(String str) {
            return AbstractC10819z.m23230C("Content-Length", str, true) || AbstractC10819z.m23230C("Content-Encoding", str, true) || AbstractC10819z.m23230C("Content-Type", str, true);
        }

        /* renamed from: e */
        public final boolean m21366e(String str) {
            return (AbstractC10819z.m23230C("Connection", str, true) || AbstractC10819z.m23230C("Keep-Alive", str, true) || AbstractC10819z.m23230C("Proxy-Authenticate", str, true) || AbstractC10819z.m23230C("Proxy-Authorization", str, true) || AbstractC10819z.m23230C("TE", str, true) || AbstractC10819z.m23230C("Trailers", str, true) || AbstractC10819z.m23230C("Transfer-Encoding", str, true) || AbstractC10819z.m23230C("Upgrade", str, true)) ? false : true;
        }

        /* renamed from: f */
        public final C9745y m21367f(C9745y c9745y) {
            return (c9745y != null ? c9745y.m19628e() : null) != null ? c9745y.m19641v().m19647b(null).m19648c() : c9745y;
        }

        public a() {
        }
    }

    public C10261a(AbstractC9723c abstractC9723c) {
    }

    @Override // je.InterfaceC9739s
    public C9745y intercept(InterfaceC9739s.a chain) throws IOException {
        AbstractC9735o abstractC9735oM21900n;
        AbstractC9979u.m20294g(chain, "chain");
        InterfaceC9725e interfaceC9725eCall = chain.call();
        C10262b c10262bM21372b = new C10262b.b(System.currentTimeMillis(), chain.request(), null).m21372b();
        C9743w c9743wM21369b = c10262bM21372b.m21369b();
        C9745y c9745yM21368a = c10262bM21372b.m21368a();
        C10487e c10487e = interfaceC9725eCall instanceof C10487e ? (C10487e) interfaceC9725eCall : null;
        if (c10487e == null || (abstractC9735oM21900n = c10487e.m21900n()) == null) {
            abstractC9735oM21900n = AbstractC9735o.f22738b;
        }
        if (c9743wM21369b == null && c9745yM21368a == null) {
            C9745y c9745yM19648c = new C9745y.a().m19663r(chain.request()).m19661p(Protocol.HTTP_1_1).m19652g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).m19658m("Unsatisfiable Request (only-if-cached)").m19647b(AbstractC9920d.f23243c).m19664s(-1L).m19662q(System.currentTimeMillis()).m19648c();
            abstractC9735oM21900n.m19382z(interfaceC9725eCall, c9745yM19648c);
            return c9745yM19648c;
        }
        if (c9743wM21369b == null) {
            AbstractC9979u.m20291d(c9745yM21368a);
            C9745y c9745yM19648c2 = c9745yM21368a.m19641v().m19649d(f24378a.m21367f(c9745yM21368a)).m19648c();
            abstractC9735oM21900n.m19358b(interfaceC9725eCall, c9745yM19648c2);
            return c9745yM19648c2;
        }
        if (c9745yM21368a != null) {
            abstractC9735oM21900n.m19357a(interfaceC9725eCall, c9745yM21368a);
        }
        C9745y c9745yMo19477a = chain.mo19477a(c9743wM21369b);
        if (c9745yM21368a != null) {
            if (c9745yMo19477a != null && c9745yMo19477a.m19632j() == 304) {
                C9745y.a aVarM19641v = c9745yM21368a.m19641v();
                a aVar = f24378a;
                aVarM19641v.m19656k(aVar.m21364c(c9745yM21368a.m19637r(), c9745yMo19477a.m19637r())).m19664s(c9745yMo19477a.m19627A()).m19662q(c9745yMo19477a.m19644y()).m19649d(aVar.m21367f(c9745yM21368a)).m19659n(aVar.m21367f(c9745yMo19477a)).m19648c();
                AbstractC9746z abstractC9746zM19628e = c9745yMo19477a.m19628e();
                AbstractC9979u.m20291d(abstractC9746zM19628e);
                abstractC9746zM19628e.close();
                AbstractC9979u.m20291d(null);
                throw null;
            }
            AbstractC9746z abstractC9746zM19628e2 = c9745yM21368a.m19628e();
            if (abstractC9746zM19628e2 != null) {
                AbstractC9920d.m20031m(abstractC9746zM19628e2);
            }
        }
        AbstractC9979u.m20291d(c9745yMo19477a);
        C9745y.a aVarM19641v2 = c9745yMo19477a.m19641v();
        a aVar2 = f24378a;
        return aVarM19641v2.m19649d(aVar2.m21367f(c9745yM21368a)).m19659n(aVar2.m21367f(c9745yMo19477a)).m19648c();
    }
}
