package coil3.network;

import android.content.Context;
import coil3.InterfaceC4574e;
import coil3.disk.InterfaceC4571a;
import coil3.network.C4590c;
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
import p023c0.C4473r;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p110n.InterfaceC7435r;
import p124p.InterfaceC7582k;
import p159u.AbstractC7737d;
import p159u.AbstractC7738e;
import p159u.C7743j;
import p159u.C7745l;
import p159u.InterfaceC7735b;
import p159u.InterfaceC7739f;
import p166v.AbstractC7782c;
import p166v.AbstractC7784e;
import p166v.C7781b;
import p187y.C7880m;

/* loaded from: classes3.dex */
public final class NetworkFetcher implements InterfaceC7582k {

    /* renamed from: a */
    public final String f1812a;

    /* renamed from: b */
    public final C7880m f1813b;

    /* renamed from: c */
    public final Lazy f1814c;

    /* renamed from: d */
    public final Lazy f1815d;

    /* renamed from: e */
    public final Lazy f1816e;

    /* renamed from: f */
    public final InterfaceC7735b f1817f;

    public NetworkFetcher(String str, C7880m c7880m, Lazy lazy, Lazy lazy2, Lazy lazy3, InterfaceC7735b interfaceC7735b) {
        this.f1812a = str;
        this.f1813b = c7880m;
        this.f1814c = lazy;
        this.f1815d = lazy2;
        this.f1816e = lazy3;
        this.f1817f = interfaceC7735b;
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
    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1943a(kotlin.coroutines.Continuation r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.mo1943a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: h */
    public final Object m1944h(C7743j c7743j, Function2 function2, Continuation continuation) {
        if (this.f1813b.m9666h().getReadEnabled()) {
            AbstractC7784e.m9319a();
        }
        return ((InterfaceC7739f) this.f1814c.getValue()).mo1993a(c7743j, new NetworkFetcher$executeNetworkRequest$2(function2, null), continuation);
    }

    /* renamed from: i */
    public final String m1945i() {
        String strM9662d = this.f1813b.m9662d();
        return strM9662d == null ? this.f1812a : strM9662d;
    }

    /* renamed from: j */
    public final FileSystem m1946j() {
        FileSystem fileSystem;
        InterfaceC4571a interfaceC4571a = (InterfaceC4571a) this.f1815d.getValue();
        return (interfaceC4571a == null || (fileSystem = interfaceC4571a.getFileSystem()) == null) ? this.f1813b.m9665g() : fileSystem;
    }

    /* renamed from: k */
    public final String m1947k(String str, String str2) {
        String strM1566b;
        if ((str2 == null || StringsKt.startsWith$default(str2, "text/plain", false, 2, (Object) null)) && (strM1566b = C4473r.f1339a.m1566b(str)) != null) {
            return strM1566b;
        }
        if (str2 != null) {
            return StringsKt.substringBefore$default(str2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }

    /* renamed from: l */
    public final C7743j m1948l() {
        C4590c.a aVarM1976d = AbstractC7738e.m9232b(this.f1813b).m1976d();
        boolean readEnabled = this.f1813b.m9663e().getReadEnabled();
        boolean z6 = this.f1813b.m9666h().getReadEnabled() && this.f1817f.mo9227c();
        if (!z6 && readEnabled) {
            aVarM1976d.m1979c(HttpHeaders.CACHE_CONTROL, "only-if-cached, max-stale=2147483647");
        } else if (!z6 || readEnabled) {
            if (!z6 && !readEnabled) {
                aVarM1976d.m1979c(HttpHeaders.CACHE_CONTROL, "no-cache, only-if-cached");
            }
        } else if (this.f1813b.m9663e().getWriteEnabled()) {
            aVarM1976d.m1979c(HttpHeaders.CACHE_CONTROL, "no-cache");
        } else {
            aVarM1976d.m1979c(HttpHeaders.CACHE_CONTROL, "no-cache, no-store");
        }
        String str = this.f1812a;
        String strM9233c = AbstractC7738e.m9233c(this.f1813b);
        C4590c c4590cM1978b = aVarM1976d.m1978b();
        AbstractC7738e.m9231a(this.f1813b);
        return new C7743j(str, strM9233c, c4590cM1978b, null, this.f1813b.m9664f());
    }

    /* renamed from: m */
    public final InterfaceC4571a.c m1949m() {
        InterfaceC4571a interfaceC4571a;
        if (!this.f1813b.m9663e().getReadEnabled() || (interfaceC4571a = (InterfaceC4571a) this.f1815d.getValue()) == null) {
            return null;
        }
        return interfaceC4571a.mo1864b(m1945i());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1950n(p159u.InterfaceC7746m r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.f1847e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1847e = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f1845c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1847e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f1844b
            okio.Buffer r5 = (okio.Buffer) r5
            java.lang.Object r0 = r0.f1843a
            u.m r0 = (p159u.InterfaceC7746m) r0
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
            r0.f1843a = r2
            r0.f1844b = r6
            r0.f1847e = r3
            java.lang.Object r5 = r5.mo9246b(r6, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r6
        L53:
            n.r r5 = r4.m1952p(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m1950n(u.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: o */
    public final InterfaceC7435r m1951o(InterfaceC4571a.c cVar) {
        return AbstractC7436s.m8485d(cVar.getData(), m1946j(), m1945i(), cVar, null, 16, null);
    }

    /* renamed from: p */
    public final InterfaceC7435r m1952p(Buffer buffer) {
        return AbstractC7436s.m8484c(buffer, m1946j(), null, 4, null);
    }

    /* renamed from: q */
    public final C7745l m1953q(InterfaceC4571a.c cVar) throws Throwable {
        Throwable th;
        C7745l c7745lM1966a;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(m1946j().source(cVar.getMetadata()));
            try {
                c7745lM1966a = C4588a.f1858a.m1966a(bufferedSourceBuffer);
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
                c7745lM1966a = null;
            }
            if (th == null) {
                return c7745lM1966a;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r0.mo9247d(r3, r4, r6) == r7) goto L63;
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
    public final java.lang.Object m1954r(coil3.disk.InterfaceC4571a.c r11, p159u.C7745l r12, p159u.C7743j r13, p159u.C7745l r14, kotlin.coroutines.Continuation r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m1954r(coil3.disk.a$c, u.l, u.j, u.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final class Factory implements InterfaceC7582k.a {

        /* renamed from: a */
        public final Lazy f1818a;

        /* renamed from: b */
        public final Lazy f1819b;

        /* renamed from: c */
        public final C7781b f1820c;

        @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
        /* renamed from: coil3.network.NetworkFetcher$Factory$2 */
        public static final /* synthetic */ class C45872 extends FunctionReferenceImpl implements Function1<Context, InterfaceC7735b> {

            /* renamed from: a */
            public static final C45872 f1821a = new C45872();

            public C45872() {
                super(1, AbstractC7737d.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC7735b invoke(Context context) {
                return AbstractC7737d.m9230a(context);
            }
        }

        public Factory(Function0 function0, Function0 function02, Function1 function1) {
            this.f1818a = LazyKt.lazy(function0);
            this.f1819b = LazyKt.lazy(function02);
            this.f1820c = AbstractC7782c.m9318a(function1);
        }

        /* renamed from: d */
        public static final InterfaceC4589b m1957d() {
            return InterfaceC4589b.f1860b;
        }

        /* renamed from: f */
        public static final InterfaceC4571a m1958f(InterfaceC4574e interfaceC4574e) {
            return interfaceC4574e.mo1650a();
        }

        /* renamed from: g */
        private final boolean m1959g(C6621t c6621t) {
            return Intrinsics.areEqual(c6621t.m7575c(), "http") || Intrinsics.areEqual(c6621t.m7575c(), "https");
        }

        @Override // p124p.InterfaceC7582k.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, final InterfaceC4574e interfaceC4574e) {
            if (m1959g(c6621t)) {
                return new NetworkFetcher(c6621t.toString(), c7880m, this.f1818a, LazyKt.lazy(new Function0() { // from class: u.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NetworkFetcher.Factory.m1958f(interfaceC4574e);
                    }
                }), this.f1819b, (InterfaceC7735b) this.f1820c.m9317a(c7880m.m9661c()));
            }
            return null;
        }

        public /* synthetic */ Factory(Function0 function0, Function0 function02, Function1 function1, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, (i6 & 2) != 0 ? new Function0() { // from class: u.i
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NetworkFetcher.Factory.m1957d();
                }
            } : function02, (i6 & 4) != 0 ? C45872.f1821a : function1);
        }
    }
}
