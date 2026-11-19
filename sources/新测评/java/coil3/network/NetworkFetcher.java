package coil3.network;

import android.content.Context;
import coil3.InterfaceC5193e;
import coil3.disk.InterfaceC5190a;
import coil3.network.C5209c;
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
import p030c0.C5093r;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p172n.InterfaceC8603r;
import p194p.InterfaceC8795k;
import p249u.AbstractC9518d;
import p249u.AbstractC9519e;
import p249u.C9524j;
import p249u.C9526l;
import p249u.InterfaceC9516b;
import p249u.InterfaceC9520f;
import p260v.AbstractC9624c;
import p260v.AbstractC9626e;
import p260v.C9623b;
import p290y.C9892k;

/* loaded from: classes3.dex */
public final class NetworkFetcher implements InterfaceC8795k {

    /* renamed from: a */
    public final String f3128a;

    /* renamed from: b */
    public final C9892k f3129b;

    /* renamed from: c */
    public final Lazy f3130c;

    /* renamed from: d */
    public final Lazy f3131d;

    /* renamed from: e */
    public final Lazy f3132e;

    /* renamed from: f */
    public final InterfaceC9516b f3133f;

    public NetworkFetcher(String str, C9892k c9892k, Lazy lazy, Lazy lazy2, Lazy lazy3, InterfaceC9516b interfaceC9516b) {
        this.f3128a = str;
        this.f3129b = c9892k;
        this.f3130c = lazy;
        this.f3131d = lazy2;
        this.f3132e = lazy3;
        this.f3133f = interfaceC9516b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:72:0x0177, B:74:0x017b), top: B:93:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, coil3.disk.a$c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, u.l] */
    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3117a(kotlin.coroutines.Continuation r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.mo3117a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public final Object m3118h(C9524j c9524j, Function2 function2, Continuation continuation) {
        if (this.f3129b.m16705h().getReadEnabled()) {
            AbstractC9626e.m15993a();
        }
        return ((InterfaceC9520f) this.f3130c.getValue()).mo3167a(c9524j, new NetworkFetcher$executeNetworkRequest$2(function2, null), continuation);
    }

    /* renamed from: i */
    public final String m3119i() {
        String strM16701d = this.f3129b.m16701d();
        return strM16701d == null ? this.f3128a : strM16701d;
    }

    /* renamed from: j */
    public final FileSystem m3120j() {
        FileSystem fileSystem;
        InterfaceC5190a interfaceC5190a = (InterfaceC5190a) this.f3131d.getValue();
        return (interfaceC5190a == null || (fileSystem = interfaceC5190a.getFileSystem()) == null) ? this.f3129b.m16704g() : fileSystem;
    }

    /* renamed from: k */
    public final String m3121k(String str, String str2) {
        String strM2708b;
        if ((str2 == null || StringsKt.startsWith$default(str2, "text/plain", false, 2, (Object) null)) && (strM2708b = C5093r.f2659a.m2708b(str)) != null) {
            return strM2708b;
        }
        if (str2 != null) {
            return StringsKt.substringBefore$default(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    /* renamed from: l */
    public final C9524j m3122l() {
        C5209c.a aVarM3150d = AbstractC9519e.m15882b(this.f3129b).m3150d();
        boolean readEnabled = this.f3129b.m16702e().getReadEnabled();
        boolean z9 = this.f3129b.m16705h().getReadEnabled() && this.f3133f.mo15877c();
        if (!z9 && readEnabled) {
            aVarM3150d.m3153c(HttpHeaders.CACHE_CONTROL, "only-if-cached, max-stale=2147483647");
        } else if (!z9 || readEnabled) {
            if (!z9 && !readEnabled) {
                aVarM3150d.m3153c(HttpHeaders.CACHE_CONTROL, "no-cache, only-if-cached");
            }
        } else if (this.f3129b.m16702e().getWriteEnabled()) {
            aVarM3150d.m3153c(HttpHeaders.CACHE_CONTROL, "no-cache");
        } else {
            aVarM3150d.m3153c(HttpHeaders.CACHE_CONTROL, "no-cache, no-store");
        }
        String str = this.f3128a;
        String strM15883c = AbstractC9519e.m15883c(this.f3129b);
        C5209c c5209cM3152b = aVarM3150d.m3152b();
        AbstractC9519e.m15881a(this.f3129b);
        return new C9524j(str, strM15883c, c5209cM3152b, null, this.f3129b.m16703f());
    }

    /* renamed from: m */
    public final InterfaceC5190a.c m3123m() {
        InterfaceC5190a interfaceC5190a;
        if (!this.f3129b.m16702e().getReadEnabled() || (interfaceC5190a = (InterfaceC5190a) this.f3131d.getValue()) == null) {
            return null;
        }
        return interfaceC5190a.mo3036b(m3119i());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3124n(p249u.InterfaceC9527m r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.f3163e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3163e = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3161c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3163e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f3160b
            okio.Buffer r5 = (okio.Buffer) r5
            java.lang.Object r0 = r0.f3159a
            u.m r0 = (p249u.InterfaceC9527m) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L53
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r6)
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.f3159a = r2
            r0.f3160b = r6
            r0.f3163e = r3
            java.lang.Object r5 = r5.mo15896b(r6, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r6
        L53:
            n.r r5 = r4.m3126p(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m3124n(u.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: o */
    public final InterfaceC8603r m3125o(InterfaceC5190a.c cVar) {
        return AbstractC8604s.m14164d(cVar.getData(), m3120j(), m3119i(), cVar, null, 16, null);
    }

    /* renamed from: p */
    public final InterfaceC8603r m3126p(Buffer buffer) {
        return AbstractC8604s.m14163c(buffer, m3120j(), null, 4, null);
    }

    /* renamed from: q */
    public final C9526l m3127q(InterfaceC5190a.c cVar) throws Throwable {
        Throwable th;
        C9526l c9526lM3140a;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(m3120j().source(cVar.getMetadata()));
            try {
                c9526lM3140a = C5207a.f3174a.m3140a(bufferedSourceBuffer);
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
                c9526lM3140a = null;
            }
            if (th == null) {
                return c9526lM3140a;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r0.mo15897c(r3, r4, r6) == r7) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3128r(coil3.disk.InterfaceC5190a.c r11, p249u.C9526l r12, p249u.C9524j r13, p249u.C9526l r14, kotlin.coroutines.Continuation r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m3128r(coil3.disk.a$c, u.l, u.j, u.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final class Factory implements InterfaceC8795k.a {

        /* renamed from: a */
        public final Lazy f3134a;

        /* renamed from: b */
        public final Lazy f3135b;

        /* renamed from: c */
        public final C9623b f3136c;

        @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        /* renamed from: coil3.network.NetworkFetcher$Factory$2 */
        public static final /* synthetic */ class C52062 extends FunctionReferenceImpl implements Function1<Context, InterfaceC9516b> {

            /* renamed from: a */
            public static final C52062 f3137a = new C52062();

            public C52062() {
                super(1, AbstractC9518d.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC9516b invoke(Context context) {
                return AbstractC9518d.m15880a(context);
            }
        }

        public Factory(Function0 function0, Function0 function02, Function1 function1) {
            this.f3134a = LazyKt.lazy(function0);
            this.f3135b = LazyKt.lazy(function02);
            this.f3136c = AbstractC9624c.m15992a(function1);
        }

        /* renamed from: d */
        public static final InterfaceC5208b m3131d() {
            return InterfaceC5208b.f3176b;
        }

        /* renamed from: f */
        public static final InterfaceC5190a m3132f(InterfaceC5193e interfaceC5193e) {
            return interfaceC5193e.mo2816a();
        }

        /* renamed from: g */
        private final boolean m3133g(C7848t c7848t) {
            return Intrinsics.areEqual(c7848t.m13309c(), "http") || Intrinsics.areEqual(c7848t.m13309c(), "https");
        }

        @Override // p194p.InterfaceC8795k.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, final InterfaceC5193e interfaceC5193e) {
            if (m3133g(c7848t)) {
                return new NetworkFetcher(c7848t.toString(), c9892k, this.f3134a, LazyKt.lazy(new Function0() { // from class: u.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkFetcher.Factory.m3132f(interfaceC5193e);
                    }
                }), this.f3135b, (InterfaceC9516b) this.f3136c.m15991a(c9892k.m16700c()));
            }
            return null;
        }

        public /* synthetic */ Factory(Function0 function0, Function0 function02, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i10 & 2) != 0 ? new Function0() { // from class: u.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkFetcher.Factory.m3131d();
                }
            } : function02, (i10 & 4) != 0 ? C52062.f3137a : function1);
        }
    }
}
