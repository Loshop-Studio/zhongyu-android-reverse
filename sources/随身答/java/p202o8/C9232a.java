package p202o8;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import p172l8.AbstractC8904c;
import p172l8.AbstractC8916o;
import p172l8.AbstractC8927z;
import p172l8.C8918q;
import p172l8.C8924w;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8920s;
import p182m8.AbstractC9045d;
import p202o8.C9233b;
import p226q8.C9382e;

/* renamed from: o8.a */
/* loaded from: classes5.dex */
public final class C9232a implements InterfaceC8920s {

    /* renamed from: a */
    public static final a f15629a = new a(null);

    /* renamed from: o8.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C8918q m14799c(C8918q c8918q, C8918q c8918q2) {
            C8918q.a aVar = new C8918q.a();
            int size = c8918q.size();
            for (int i9 = 0; i9 < size; i9++) {
                String strM13937b = c8918q.m13937b(i9);
                String strM13940f = c8918q.m13940f(i9);
                if ((!StringsKt.equals("Warning", strM13937b, true) || !StringsKt.startsWith$default(strM13940f, "1", false, 2, (Object) null)) && (m14800d(strM13937b) || !m14801e(strM13937b) || c8918q2.m13936a(strM13937b) == null)) {
                    aVar.m13945d(strM13937b, strM13940f);
                }
            }
            int size2 = c8918q2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                String strM13937b2 = c8918q2.m13937b(i10);
                if (!m14800d(strM13937b2) && m14801e(strM13937b2)) {
                    aVar.m13945d(strM13937b2, c8918q2.m13940f(i10));
                }
            }
            return aVar.m13947f();
        }

        /* renamed from: d */
        public final boolean m14800d(String str) {
            return StringsKt.equals(HttpHeaders.CONTENT_LENGTH, str, true) || StringsKt.equals("Content-Encoding", str, true) || StringsKt.equals(HttpHeaders.CONTENT_TYPE, str, true);
        }

        /* renamed from: e */
        public final boolean m14801e(String str) {
            return (StringsKt.equals("Connection", str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals("Proxy-Authenticate", str, true) || StringsKt.equals("Proxy-Authorization", str, true) || StringsKt.equals("TE", str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals("Transfer-Encoding", str, true) || StringsKt.equals("Upgrade", str, true)) ? false : true;
        }

        /* renamed from: f */
        public final C8926y m14802f(C8926y c8926y) {
            return (c8926y != null ? c8926y.m14170a() : null) != null ? c8926y.m14183s().m14190b(null).m14191c() : c8926y;
        }

        public a() {
        }
    }

    public C9232a(AbstractC8904c abstractC8904c) {
    }

    @Override // p172l8.InterfaceC8920s
    public C8926y intercept(InterfaceC8920s.a chain) throws IOException {
        AbstractC8916o abstractC8916oM15407o;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC8906e interfaceC8906eCall = chain.call();
        C9233b c9233bM14807b = new C9233b.b(System.currentTimeMillis(), chain.mo14024a(), null).m14807b();
        C8924w c8924wM14804b = c9233bM14807b.m14804b();
        C8926y c8926yM14803a = c9233bM14807b.m14803a();
        C9382e c9382e = interfaceC8906eCall instanceof C9382e ? (C9382e) interfaceC8906eCall : null;
        if (c9382e == null || (abstractC8916oM15407o = c9382e.m15407o()) == null) {
            abstractC8916oM15407o = AbstractC8916o.f14785b;
        }
        if (c8924wM14804b == null && c8926yM14803a == null) {
            C8926y c8926yM14191c = new C8926y.a().m14206r(chain.mo14024a()).m14204p(Protocol.HTTP_1_1).m14195g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).m14201m("Unsatisfiable Request (only-if-cached)").m14190b(AbstractC9045d.f15226c).m14207s(-1L).m14205q(System.currentTimeMillis()).m14191c();
            abstractC8916oM15407o.m13929z(interfaceC8906eCall, c8926yM14191c);
            return c8926yM14191c;
        }
        if (c8924wM14804b == null) {
            Intrinsics.checkNotNull(c8926yM14803a);
            C8926y c8926yM14191c2 = c8926yM14803a.m14183s().m14192d(f15629a.m14802f(c8926yM14803a)).m14191c();
            abstractC8916oM15407o.m13905b(interfaceC8906eCall, c8926yM14191c2);
            return c8926yM14191c2;
        }
        if (c8926yM14803a != null) {
            abstractC8916oM15407o.m13904a(interfaceC8906eCall, c8926yM14803a);
        }
        C8926y c8926yMo14025b = chain.mo14025b(c8924wM14804b);
        if (c8926yM14803a != null) {
            if (c8926yMo14025b != null && c8926yMo14025b.m14174i() == 304) {
                C8926y.a aVarM14183s = c8926yM14803a.m14183s();
                a aVar = f15629a;
                aVarM14183s.m14199k(aVar.m14799c(c8926yM14803a.m14179o(), c8926yMo14025b.m14179o())).m14207s(c8926yMo14025b.m14188x()).m14205q(c8926yMo14025b.m14186v()).m14192d(aVar.m14802f(c8926yM14803a)).m14202n(aVar.m14802f(c8926yMo14025b)).m14191c();
                AbstractC8927z abstractC8927zM14170a = c8926yMo14025b.m14170a();
                Intrinsics.checkNotNull(abstractC8927zM14170a);
                abstractC8927zM14170a.close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            AbstractC8927z abstractC8927zM14170a2 = c8926yM14803a.m14170a();
            if (abstractC8927zM14170a2 != null) {
                AbstractC9045d.m14497m(abstractC8927zM14170a2);
            }
        }
        Intrinsics.checkNotNull(c8926yMo14025b);
        C8926y.a aVarM14183s2 = c8926yMo14025b.m14183s();
        a aVar2 = f15629a;
        return aVarM14183s2.m14192d(aVar2.m14802f(c8926yM14803a)).m14202n(aVar2.m14802f(c8926yMo14025b)).m14191c();
    }
}
