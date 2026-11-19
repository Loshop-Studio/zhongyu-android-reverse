package p070d9;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import p011a9.AbstractC0040c;
import p011a9.AbstractC0052o;
import p011a9.AbstractC0063z;
import p011a9.C0054q;
import p011a9.C0060w;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p011a9.InterfaceC0056s;
import p028b9.AbstractC5070d;
import p070d9.C7314b;
import p092f9.C7501e;

/* renamed from: d9.a */
/* loaded from: classes5.dex */
public final class C7313a implements InterfaceC0056s {

    /* renamed from: a */
    public static final a f11824a = new a(null);

    /* renamed from: d9.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C0054q m11597c(C0054q c0054q, C0054q c0054q2) {
            C0054q.a aVar = new C0054q.a();
            int size = c0054q.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strM181b = c0054q.m181b(i10);
                String strM184f = c0054q.m184f(i10);
                if ((!StringsKt.equals("Warning", strM181b, true) || !StringsKt.startsWith$default(strM184f, "1", false, 2, (Object) null)) && (m11598d(strM181b) || !m11599e(strM181b) || c0054q2.m180a(strM181b) == null)) {
                    aVar.m189d(strM181b, strM184f);
                }
            }
            int size2 = c0054q2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strM181b2 = c0054q2.m181b(i11);
                if (!m11598d(strM181b2) && m11599e(strM181b2)) {
                    aVar.m189d(strM181b2, c0054q2.m184f(i11));
                }
            }
            return aVar.m191f();
        }

        /* renamed from: d */
        public final boolean m11598d(String str) {
            return StringsKt.equals(HttpHeaders.CONTENT_LENGTH, str, true) || StringsKt.equals("Content-Encoding", str, true) || StringsKt.equals(HttpHeaders.CONTENT_TYPE, str, true);
        }

        /* renamed from: e */
        public final boolean m11599e(String str) {
            return (StringsKt.equals("Connection", str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals("Proxy-Authenticate", str, true) || StringsKt.equals("Proxy-Authorization", str, true) || StringsKt.equals("TE", str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals("Transfer-Encoding", str, true) || StringsKt.equals("Upgrade", str, true)) ? false : true;
        }

        /* renamed from: f */
        public final C0062y m11600f(C0062y c0062y) {
            return (c0062y != null ? c0062y.m414a() : null) != null ? c0062y.m427s().m434b(null).m435c() : c0062y;
        }

        public a() {
        }
    }

    public C7313a(AbstractC0040c abstractC0040c) {
    }

    @Override // p011a9.InterfaceC0056s
    public C0062y intercept(InterfaceC0056s.a chain) throws IOException {
        AbstractC0052o abstractC0052oM12175n;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC0042e interfaceC0042eCall = chain.call();
        C7314b c7314bM11605b = new C7314b.b(System.currentTimeMillis(), chain.mo268a(), null).m11605b();
        C0060w c0060wM11602b = c7314bM11605b.m11602b();
        C0062y c0062yM11601a = c7314bM11605b.m11601a();
        C7501e c7501e = interfaceC0042eCall instanceof C7501e ? (C7501e) interfaceC0042eCall : null;
        if (c7501e == null || (abstractC0052oM12175n = c7501e.m12175n()) == null) {
            abstractC0052oM12175n = AbstractC0052o.f157b;
        }
        if (c0060wM11602b == null && c0062yM11601a == null) {
            C0062y c0062yM435c = new C0062y.a().m450r(chain.mo268a()).m448p(Protocol.HTTP_1_1).m439g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).m445m("Unsatisfiable Request (only-if-cached)").m434b(AbstractC5070d.f2635c).m451s(-1L).m449q(System.currentTimeMillis()).m435c();
            abstractC0052oM12175n.m173z(interfaceC0042eCall, c0062yM435c);
            return c0062yM435c;
        }
        if (c0060wM11602b == null) {
            Intrinsics.checkNotNull(c0062yM11601a);
            C0062y c0062yM435c2 = c0062yM11601a.m427s().m436d(f11824a.m11600f(c0062yM11601a)).m435c();
            abstractC0052oM12175n.m149b(interfaceC0042eCall, c0062yM435c2);
            return c0062yM435c2;
        }
        if (c0062yM11601a != null) {
            abstractC0052oM12175n.m148a(interfaceC0042eCall, c0062yM11601a);
        }
        C0062y c0062yMo269b = chain.mo269b(c0060wM11602b);
        if (c0062yM11601a != null) {
            if (c0062yMo269b != null && c0062yMo269b.m418i() == 304) {
                C0062y.a aVarM427s = c0062yM11601a.m427s();
                a aVar = f11824a;
                aVarM427s.m443k(aVar.m11597c(c0062yM11601a.m423o(), c0062yMo269b.m423o())).m451s(c0062yMo269b.m432x()).m449q(c0062yMo269b.m430v()).m436d(aVar.m11600f(c0062yM11601a)).m446n(aVar.m11600f(c0062yMo269b)).m435c();
                AbstractC0063z abstractC0063zM414a = c0062yMo269b.m414a();
                Intrinsics.checkNotNull(abstractC0063zM414a);
                abstractC0063zM414a.close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            AbstractC0063z abstractC0063zM414a2 = c0062yM11601a.m414a();
            if (abstractC0063zM414a2 != null) {
                AbstractC5070d.m2648m(abstractC0063zM414a2);
            }
        }
        Intrinsics.checkNotNull(c0062yMo269b);
        C0062y.a aVarM427s2 = c0062yMo269b.m427s();
        a aVar2 = f11824a;
        return aVarM427s2.m436d(aVar2.m11600f(c0062yM11601a)).m446n(aVar2.m11600f(c0062yMo269b)).m435c();
    }
}
