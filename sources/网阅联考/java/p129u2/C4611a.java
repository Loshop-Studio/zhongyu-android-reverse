package p129u2;

import com.umeng.commonsdk.statistics.SdkVersion;
import com.zykj.http.interceptor.GzipInterceptor;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import p117r2.AbstractC4498b0;
import p117r2.AbstractC4499c;
import p117r2.AbstractC4514q;
import p117r2.C4496a0;
import p117r2.C4516s;
import p117r2.C4522y;
import p117r2.InterfaceC4502e;
import p117r2.InterfaceC4518u;
import p121s2.AbstractC4550b;
import p129u2.C4612b;
import p137w2.C4645e;

/* renamed from: u2.a */
/* loaded from: classes2.dex */
public final class C4611a implements InterfaceC4518u {

    /* renamed from: a */
    public static final a f5808a = new a(null);

    /* renamed from: u2.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public final C4516s m6360c(C4516s c4516s, C4516s c4516s2) {
            C4516s.a aVar = new C4516s.a();
            int size = c4516s.size();
            for (int i4 = 0; i4 < size; i4++) {
                String strM5960b = c4516s.m5960b(i4);
                String strM5962e = c4516s.m5962e(i4);
                if ((!StringsKt__StringsJVMKt.equals("Warning", strM5960b, true) || !StringsKt__StringsJVMKt.startsWith$default(strM5962e, SdkVersion.MINI_VERSION, false, 2, null)) && (m6361d(strM5960b) || !m6362e(strM5960b) || c4516s2.m5959a(strM5960b) == null)) {
                    aVar.m5967d(strM5960b, strM5962e);
                }
            }
            int size2 = c4516s2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String strM5960b2 = c4516s2.m5960b(i5);
                if (!m6361d(strM5960b2) && m6362e(strM5960b2)) {
                    aVar.m5967d(strM5960b2, c4516s2.m5962e(i5));
                }
            }
            return aVar.m5968e();
        }

        /* renamed from: d */
        public final boolean m6361d(String str) {
            return StringsKt__StringsJVMKt.equals("Content-Length", str, true) || StringsKt__StringsJVMKt.equals(GzipInterceptor.CONTENT_ENCODING, str, true) || StringsKt__StringsJVMKt.equals("Content-Type", str, true);
        }

        /* renamed from: e */
        public final boolean m6362e(String str) {
            return (StringsKt__StringsJVMKt.equals("Connection", str, true) || StringsKt__StringsJVMKt.equals("Keep-Alive", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authenticate", str, true) || StringsKt__StringsJVMKt.equals("Proxy-Authorization", str, true) || StringsKt__StringsJVMKt.equals("TE", str, true) || StringsKt__StringsJVMKt.equals("Trailers", str, true) || StringsKt__StringsJVMKt.equals("Transfer-Encoding", str, true) || StringsKt__StringsJVMKt.equals("Upgrade", str, true)) ? false : true;
        }

        /* renamed from: f */
        public final C4496a0 m6363f(C4496a0 c4496a0) {
            return (c4496a0 != null ? c4496a0.m5800a() : null) != null ? c4496a0.m5812n().m5819b(null).m5820c() : c4496a0;
        }
    }

    public C4611a(AbstractC4499c abstractC4499c) {
    }

    @Override // p117r2.InterfaceC4518u
    public C4496a0 intercept(InterfaceC4518u.a chain) throws IOException {
        AbstractC4514q abstractC4514qM6515m;
        Intrinsics.checkNotNullParameter(chain, "chain");
        InterfaceC4502e interfaceC4502eCall = chain.call();
        C4612b c4612bM6368b = new C4612b.b(System.currentTimeMillis(), chain.mo6045S(), null).m6368b();
        C4522y c4522yM6365b = c4612bM6368b.m6365b();
        C4496a0 c4496a0M6364a = c4612bM6368b.m6364a();
        C4645e c4645e = (C4645e) (!(interfaceC4502eCall instanceof C4645e) ? null : interfaceC4502eCall);
        if (c4645e == null || (abstractC4514qM6515m = c4645e.m6515m()) == null) {
            abstractC4514qM6515m = AbstractC4514q.f5523a;
        }
        if (c4522yM6365b == null && c4496a0M6364a == null) {
            C4496a0 c4496a0M5820c = new C4496a0.a().m5835r(chain.mo6045S()).m5833p(Protocol.HTTP_1_1).m5824g(504).m5830m("Unsatisfiable Request (only-if-cached)").m5819b(AbstractC4550b.f5703c).m5836s(-1L).m5834q(System.currentTimeMillis()).m5820c();
            abstractC4514qM6515m.m5952z(interfaceC4502eCall, c4496a0M5820c);
            return c4496a0M5820c;
        }
        if (c4522yM6365b == null) {
            Intrinsics.checkNotNull(c4496a0M6364a);
            C4496a0 c4496a0M5820c2 = c4496a0M6364a.m5812n().m5821d(f5808a.m6363f(c4496a0M6364a)).m5820c();
            abstractC4514qM6515m.m5928b(interfaceC4502eCall, c4496a0M5820c2);
            return c4496a0M5820c2;
        }
        if (c4496a0M6364a != null) {
            abstractC4514qM6515m.m5927a(interfaceC4502eCall, c4496a0M6364a);
        }
        C4496a0 c4496a0Mo6046a = chain.mo6046a(c4522yM6365b);
        if (c4496a0M6364a != null) {
            if (c4496a0Mo6046a != null && c4496a0Mo6046a.m5804e() == 304) {
                C4496a0.a aVarM5812n = c4496a0M6364a.m5812n();
                a aVar = f5808a;
                aVarM5812n.m5828k(aVar.m6360c(c4496a0M6364a.m5808j(), c4496a0Mo6046a.m5808j())).m5836s(c4496a0Mo6046a.m5817s()).m5834q(c4496a0Mo6046a.m5815q()).m5821d(aVar.m6363f(c4496a0M6364a)).m5831n(aVar.m6363f(c4496a0Mo6046a)).m5820c();
                AbstractC4498b0 abstractC4498b0M5800a = c4496a0Mo6046a.m5800a();
                Intrinsics.checkNotNull(abstractC4498b0M5800a);
                abstractC4498b0M5800a.close();
                Intrinsics.checkNotNull(null);
                throw null;
            }
            AbstractC4498b0 abstractC4498b0M5800a2 = c4496a0M6364a.m5800a();
            if (abstractC4498b0M5800a2 != null) {
                AbstractC4550b.m6228j(abstractC4498b0M5800a2);
            }
        }
        Intrinsics.checkNotNull(c4496a0Mo6046a);
        C4496a0.a aVarM5812n2 = c4496a0Mo6046a.m5812n();
        a aVar2 = f5808a;
        return aVarM5812n2.m5821d(aVar2.m6363f(c4496a0M6364a)).m5831n(aVar2.m6363f(c4496a0Mo6046a)).m5820c();
    }
}
