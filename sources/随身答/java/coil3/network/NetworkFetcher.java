package coil3.network;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.InterfaceC5328e;
import coil3.disk.InterfaceC5325a;
import coil3.network.C5344c;
import coil3.network.NetworkFetcher;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import p090e0.C7819q;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p183n.InterfaceC9073r;
import p207p.InterfaceC9298k;
import p257u.AbstractC9646d;
import p257u.AbstractC9647e;
import p257u.C9652j;
import p257u.C9654l;
import p257u.InterfaceC9644b;
import p257u.InterfaceC9648f;
import p267v.AbstractC9737c;
import p267v.AbstractC9739e;
import p267v.C9736b;
import p297y.C9932m;

/* loaded from: classes3.dex */
public final class NetworkFetcher implements InterfaceC9298k {

    /* renamed from: a */
    public final String f3031a;

    /* renamed from: b */
    public final C9932m f3032b;

    /* renamed from: c */
    public final Lazy f3033c;

    /* renamed from: d */
    public final Lazy f3034d;

    /* renamed from: e */
    public final Lazy f3035e;

    /* renamed from: f */
    public final InterfaceC9644b f3036f;

    public NetworkFetcher(String str, C9932m c9932m, Lazy lazy, Lazy lazy2, Lazy lazy3, InterfaceC9644b interfaceC9644b) {
        this.f3031a = str;
        this.f3032b = c9932m;
        this.f3033c = lazy;
        this.f3034d = lazy2;
        this.f3035e = lazy3;
        this.f3036f = interfaceC9644b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b A[Catch: Exception -> 0x0166, TRY_LEAVE, TryCatch #5 {Exception -> 0x0166, blocks: (B:72:0x0147, B:74:0x014b), top: B:103:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, coil3.disk.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, u.l] */
    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2837a(kotlin.coroutines.Continuation r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.mo2837a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public final Object m2838h(C9652j c9652j, Function2 function2, Continuation continuation) {
        if (this.f3032b.m17113h().getReadEnabled()) {
            AbstractC9739e.m16278a();
        }
        return ((InterfaceC9648f) this.f3033c.getValue()).mo2887a(c9652j, new NetworkFetcher$executeNetworkRequest$2(function2, null), continuation);
    }

    /* renamed from: i */
    public final String m2839i() {
        String strM17109d = this.f3032b.m17109d();
        return strM17109d == null ? this.f3031a : strM17109d;
    }

    /* renamed from: j */
    public final FileSystem m2840j() {
        FileSystem fileSystem;
        InterfaceC5325a interfaceC5325a = (InterfaceC5325a) this.f3034d.getValue();
        return (interfaceC5325a == null || (fileSystem = interfaceC5325a.getFileSystem()) == null) ? this.f3032b.m17112g() : fileSystem;
    }

    /* renamed from: k */
    public final String m2841k(String str, String str2) {
        String strM12215b;
        if ((str2 == null || StringsKt.startsWith$default(str2, "text/plain", false, 2, (Object) null)) && (strM12215b = C7819q.f13131a.m12215b(str)) != null) {
            return strM12215b;
        }
        if (str2 != null) {
            return StringsKt.substringBefore$default(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    /* renamed from: l */
    public final C9652j m2842l() {
        C5344c.a aVarM2870d = AbstractC9647e.m15985b(this.f3032b).m2870d();
        boolean readEnabled = this.f3032b.m17110e().getReadEnabled();
        boolean z9 = this.f3032b.m17113h().getReadEnabled() && this.f3036f.mo15980c();
        if (!z9 && readEnabled) {
            aVarM2870d.m2873c(HttpHeaders.CACHE_CONTROL, "only-if-cached, max-stale=2147483647");
        } else if (!z9 || readEnabled) {
            if (!z9 && !readEnabled) {
                aVarM2870d.m2873c(HttpHeaders.CACHE_CONTROL, "no-cache, only-if-cached");
            }
        } else if (this.f3032b.m17110e().getWriteEnabled()) {
            aVarM2870d.m2873c(HttpHeaders.CACHE_CONTROL, "no-cache");
        } else {
            aVarM2870d.m2873c(HttpHeaders.CACHE_CONTROL, "no-cache, no-store");
        }
        String str = this.f3031a;
        String strM15986c = AbstractC9647e.m15986c(this.f3032b);
        C5344c c5344cM2872b = aVarM2870d.m2872b();
        AbstractC9647e.m15984a(this.f3032b);
        return new C9652j(str, strM15986c, c5344cM2872b, null, this.f3032b.m17111f());
    }

    /* renamed from: m */
    public final InterfaceC5325a.c m2843m() {
        InterfaceC5325a interfaceC5325a;
        if (!this.f3032b.m17110e().getReadEnabled() || (interfaceC5325a = (InterfaceC5325a) this.f3034d.getValue()) == null) {
            return null;
        }
        return interfaceC5325a.mo2761b(m2839i());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2844n(p257u.InterfaceC9655m r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.f3062d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3062d = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3060b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3062d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f3059a
            okio.Buffer r5 = (okio.Buffer) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L49
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            r0.f3059a = r6
            r0.f3062d = r3
            java.lang.Object r5 = r5.mo15999b(r6, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r5 = r6
        L49:
            n.r r5 = r4.m2846p(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m2844n(u.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: o */
    public final InterfaceC9073r m2845o(InterfaceC5325a.c cVar) {
        return AbstractC9074s.m14555d(cVar.getData(), m2840j(), m2839i(), cVar, null, 16, null);
    }

    /* renamed from: p */
    public final InterfaceC9073r m2846p(Buffer buffer) {
        return AbstractC9074s.m14554c(buffer, m2840j(), null, 4, null);
    }

    /* renamed from: q */
    public final C9654l m2847q(InterfaceC5325a.c cVar) throws Throwable {
        Throwable th;
        C9654l c9654lM2860a;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(m2840j().source(cVar.getMetadata()));
            try {
                c9654lM2860a = C5342a.f3069a.m2860a(bufferedSourceBuffer);
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    th = null;
                }
            } catch (Throwable th3) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        ExceptionsKt.addSuppressed(th3, th4);
                    }
                }
                th = th3;
                c9654lM2860a = null;
            }
            if (th == null) {
                return c9654lM2860a;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0100, code lost:
    
        if (r0.mo16000d(r2, r3, r7) == r1) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2848r(coil3.disk.InterfaceC5325a.c r12, p257u.C9654l r13, p257u.C9652j r14, p257u.C9654l r15, kotlin.coroutines.Continuation r16) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m2848r(coil3.disk.a$c, u.l, u.j, u.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final class Factory implements InterfaceC9298k.a {

        /* renamed from: a */
        public final Lazy f3037a;

        /* renamed from: b */
        public final Lazy f3038b;

        /* renamed from: c */
        public final C9736b f3039c;

        @Metadata(m13414k = 3, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        /* renamed from: coil3.network.NetworkFetcher$Factory$2 */
        public /* synthetic */ class C53412 extends FunctionReferenceImpl implements Function1<Context, InterfaceC9644b> {

            /* renamed from: a */
            public static final C53412 f3040a = new C53412();

            public C53412() {
                super(1, AbstractC9646d.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC9644b invoke(Context context) {
                return AbstractC9646d.m15983a(context);
            }
        }

        public Factory(Function0 function0, Function0 function02, Function1 function1) {
            this.f3037a = LazyKt.lazy(function0);
            this.f3038b = LazyKt.lazy(function02);
            this.f3039c = AbstractC9737c.m16277a(function1);
        }

        /* renamed from: d */
        public static final InterfaceC5343b m2851d() {
            return InterfaceC5343b.f3071b;
        }

        /* renamed from: f */
        public static final InterfaceC5325a m2852f(InterfaceC5328e interfaceC5328e) {
            return interfaceC5328e.mo2545a();
        }

        /* renamed from: g */
        private final boolean m2853g(C8247r c8247r) {
            return Intrinsics.areEqual(c8247r.m13277c(), "http") || Intrinsics.areEqual(c8247r.m13277c(), "https");
        }

        @Override // p207p.InterfaceC9298k.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, final InterfaceC5328e interfaceC5328e) {
            if (m2853g(c8247r)) {
                return new NetworkFetcher(c8247r.toString(), c9932m, this.f3037a, LazyKt.lazy(new Function0() { // from class: u.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkFetcher.Factory.m2852f(interfaceC5328e);
                    }
                }), this.f3038b, (InterfaceC9644b) this.f3039c.m16276a(c9932m.m17108c()));
            }
            return null;
        }

        public /* synthetic */ Factory(Function0 function0, Function0 function02, Function1 function1, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i9 & 2) != 0 ? new Function0() { // from class: u.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkFetcher.Factory.m2851d();
                }
            } : function02, (i9 & 4) != 0 ? C53412.f3040a : function1);
        }
    }
}
