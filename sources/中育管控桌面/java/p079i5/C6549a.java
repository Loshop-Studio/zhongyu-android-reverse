package p079i5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import p058f5.AbstractC6359c;
import p058f5.AbstractC6379r;
import p058f5.C6358b0;
import p058f5.C6362d0;
import p058f5.C6383v;
import p058f5.InterfaceC6363e;
import p058f5.InterfaceC6385x;
import p065g5.AbstractC6419c;
import p065g5.AbstractC6424h;
import p079i5.C6550b;
import p093k5.C6691n;

/* renamed from: i5.a */
/* loaded from: classes4.dex */
public final class C6549a implements InterfaceC6385x {

    /* renamed from: a */
    public static final a f8383a = new a(null);

    /* renamed from: i5.a$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final C6383v m7411b(C6383v c6383v, C6383v c6383v2) {
            C6383v.a aVar = new C6383v.a();
            int size = c6383v.size();
            for (int i6 = 0; i6 < size; i6++) {
                String strM6801c = c6383v.m6801c(i6);
                String strM6804g = c6383v.m6804g(i6);
                if ((!StringsKt.equals("Warning", strM6801c, true) || !StringsKt.startsWith$default(strM6804g, "1", false, 2, (Object) null)) && (m7412c(strM6801c) || !m7413d(strM6801c) || c6383v2.m6799a(strM6801c) == null)) {
                    aVar.m6809d(strM6801c, strM6804g);
                }
            }
            int size2 = c6383v2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                String strM6801c2 = c6383v2.m6801c(i7);
                if (!m7412c(strM6801c2) && m7413d(strM6801c2)) {
                    aVar.m6809d(strM6801c2, c6383v2.m6804g(i7));
                }
            }
            return aVar.m6811f();
        }

        /* renamed from: c */
        public final boolean m7412c(String str) {
            return StringsKt.equals(HttpHeaders.CONTENT_LENGTH, str, true) || StringsKt.equals("Content-Encoding", str, true) || StringsKt.equals(HttpHeaders.CONTENT_TYPE, str, true);
        }

        /* renamed from: d */
        public final boolean m7413d(String str) {
            return (StringsKt.equals("Connection", str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals("Proxy-Authenticate", str, true) || StringsKt.equals("Proxy-Authorization", str, true) || StringsKt.equals("TE", str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals("Transfer-Encoding", str, true) || StringsKt.equals("Upgrade", str, true)) ? false : true;
        }

        public a() {
        }
    }

    public C6549a(AbstractC6359c abstractC6359c) {
    }

    @Override // p058f5.InterfaceC6385x
    public C6362d0 intercept(InterfaceC6385x.a chain) throws IOException {
        AbstractC6379r abstractC6379rM7790n;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC6363e interfaceC6363eCall = chain.call();
        C6550b c6550bM7418b = new C6550b.b(System.currentTimeMillis(), chain.mo6871a(), null).m7418b();
        C6358b0 c6358b0M7415b = c6550bM7418b.m7415b();
        C6362d0 c6362d0M7414a = c6550bM7418b.m7414a();
        C6691n c6691n = interfaceC6363eCall instanceof C6691n ? (C6691n) interfaceC6363eCall : null;
        if (c6691n == null || (abstractC6379rM7790n = c6691n.m7790n()) == null) {
            abstractC6379rM7790n = AbstractC6379r.f7951b;
        }
        if (c6358b0M7415b == null && c6362d0M7414a == null) {
            C6362d0 c6362d0M6682c = new C6362d0.a().m6696q(chain.mo6871a()).m6694o(Protocol.f9717d).m6685f(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).m6691l("Unsatisfiable Request (only-if-cached)").m6697r(-1L).m6695p(System.currentTimeMillis()).m6682c();
            abstractC6379rM7790n.m6764B(interfaceC6363eCall, c6362d0M6682c);
            return c6362d0M6682c;
        }
        if (c6358b0M7415b == null) {
            Intrinsics.checkNotNull(c6362d0M7414a);
            C6362d0 c6362d0M6682c2 = c6362d0M7414a.m6674t().m6683d(AbstractC6419c.m6941a(c6362d0M7414a)).m6682c();
            abstractC6379rM7790n.m6768b(interfaceC6363eCall, c6362d0M6682c2);
            return c6362d0M6682c2;
        }
        if (c6362d0M7414a != null) {
            abstractC6379rM7790n.m6767a(interfaceC6363eCall, c6362d0M7414a);
        }
        C6362d0 c6362d0Mo6872b = chain.mo6872b(c6358b0M7415b);
        if (c6362d0M7414a != null) {
            if (c6362d0Mo6872b != null && c6362d0Mo6872b.m6665j() == 304) {
                c6362d0M7414a.m6674t().m6689j(f8383a.m7411b(c6362d0M7414a.m6670p(), c6362d0Mo6872b.m6670p())).m6697r(c6362d0Mo6872b.m6679y()).m6695p(c6362d0Mo6872b.m6677w()).m6683d(AbstractC6419c.m6941a(c6362d0M7414a)).m6692m(AbstractC6419c.m6941a(c6362d0Mo6872b)).m6682c();
                c6362d0Mo6872b.m6661c().close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            AbstractC6424h.m6992f(c6362d0M7414a.m6661c());
        }
        Intrinsics.checkNotNull(c6362d0Mo6872b);
        return c6362d0Mo6872b.m6674t().m6683d(c6362d0M7414a != null ? AbstractC6419c.m6941a(c6362d0M7414a) : null).m6692m(AbstractC6419c.m6941a(c6362d0Mo6872b)).m6682c();
    }
}
