package coil3.network;

import android.content.Context;
import anet.channel.util.HttpConstant;
import coil3.InterfaceC5470e;
import coil3.disk.InterfaceC5467a;
import coil3.network.C5486c;
import coil3.network.NetworkFetcher;
import java.io.IOException;
import kotlin.AbstractC9923a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import okio.Buffer;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import p001a0.C0021r;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p228l.InterfaceC10085r;
import p253n.InterfaceC10281k;
import p309qc.AbstractC10771b;
import p309qc.InterfaceC10773d;
import p310qd.AbstractC10793c0;
import p310qd.AbstractC10819z;
import p327s.AbstractC11011d;
import p327s.AbstractC11012e;
import p327s.C11017j;
import p327s.C11019l;
import p327s.InterfaceC11009b;
import p327s.InterfaceC11013f;
import p338t.AbstractC11195c;
import p338t.AbstractC11197e;
import p338t.C11194b;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class NetworkFetcher implements InterfaceC10281k {

    /* renamed from: a */
    public final String f3803a;

    /* renamed from: b */
    public final C11634n f3804b;

    /* renamed from: c */
    public final InterfaceC10773d f3805c;

    /* renamed from: d */
    public final InterfaceC10773d f3806d;

    /* renamed from: e */
    public final InterfaceC10773d f3807e;

    /* renamed from: f */
    public final InterfaceC11009b f3808f;

    public NetworkFetcher(String str, C11634n c11634n, InterfaceC10773d interfaceC10773d, InterfaceC10773d interfaceC10773d2, InterfaceC10773d interfaceC10773d3, InterfaceC11009b interfaceC11009b) {
        this.f3803a = str;
        this.f3804b = c11634n;
        this.f3805c = interfaceC10773d;
        this.f3806d = interfaceC10773d2;
        this.f3807e = interfaceC10773d3;
        this.f3808f = interfaceC11009b;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:72:0x0177, B:74:0x017b), top: B:93:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3208a(vc.InterfaceC11588c r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.mo3208a(vc.c):java.lang.Object");
    }

    /* renamed from: h */
    public final Object m3209h(C11017j c11017j, InterfaceC9544p interfaceC9544p, InterfaceC11588c interfaceC11588c) {
        if (this.f3804b.m25748h().m3267c()) {
            AbstractC11197e.m24906a();
        }
        return ((InterfaceC11013f) this.f3805c.getValue()).mo3258a(c11017j, new NetworkFetcher$executeNetworkRequest$2(interfaceC9544p, null), interfaceC11588c);
    }

    /* renamed from: i */
    public final String m3210i() {
        String strM25744d = this.f3804b.m25744d();
        return strM25744d == null ? this.f3803a : strM25744d;
    }

    /* renamed from: j */
    public final FileSystem m3211j() {
        FileSystem fileSystem;
        InterfaceC5467a interfaceC5467a = (InterfaceC5467a) this.f3806d.getValue();
        return (interfaceC5467a == null || (fileSystem = interfaceC5467a.getFileSystem()) == null) ? this.f3804b.m25747g() : fileSystem;
    }

    /* renamed from: k */
    public final String m3212k(String str, String str2) {
        String strM49b;
        if ((str2 == null || AbstractC10819z.m23242O(str2, "text/plain", false, 2, null)) && (strM49b = C0021r.f9a.m49b(str)) != null) {
            return strM49b;
        }
        if (str2 != null) {
            return AbstractC10793c0.m23119Z0(str2, ';', null, 2, null);
        }
        return null;
    }

    /* renamed from: l */
    public final C11017j m3213l() {
        C5486c.a aVarM3241d = AbstractC11012e.m24330b(this.f3804b).m3241d();
        boolean zM3267c = this.f3804b.m25745e().m3267c();
        boolean z10 = this.f3804b.m25748h().m3267c() && this.f3808f.mo24325c();
        if (!z10 && zM3267c) {
            aVarM3241d.m3244c("Cache-Control", "only-if-cached, max-stale=2147483647");
        } else if (!z10 || zM3267c) {
            if (!z10 && !zM3267c) {
                aVarM3241d.m3244c("Cache-Control", "no-cache, only-if-cached");
            }
        } else if (this.f3804b.m25745e().m3268d()) {
            aVarM3241d.m3244c("Cache-Control", "no-cache");
        } else {
            aVarM3241d.m3244c("Cache-Control", "no-cache, no-store");
        }
        String str = this.f3803a;
        String strM24331c = AbstractC11012e.m24331c(this.f3804b);
        C5486c c5486cM3243b = aVarM3241d.m3243b();
        AbstractC11012e.m24329a(this.f3804b);
        return new C11017j(str, strM24331c, c5486cM3243b, null, this.f3804b.m25746f());
    }

    /* renamed from: m */
    public final InterfaceC5467a.c m3214m() {
        InterfaceC5467a interfaceC5467a;
        if (!this.f3804b.m25745e().m3267c() || (interfaceC5467a = (InterfaceC5467a) this.f3806d.getValue()) == null) {
            return null;
        }
        return interfaceC5467a.mo3130b(m3210i());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3215n(p327s.InterfaceC11020m r5, vc.InterfaceC11588c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L13
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.f3838g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3838g = r1
            goto L18
        L13:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3836e
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3838g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f3835d
            okio.Buffer r5 = (okio.Buffer) r5
            java.lang.Object r0 = r0.f3834c
            s.m r0 = (p327s.InterfaceC11020m) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L53
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.AbstractC9924b.m20071b(r6)
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            java.lang.Object r2 = p409xc.AbstractC11833h.m26224a(r5)
            r0.f3834c = r2
            r0.f3835d = r6
            r0.f3838g = r3
            java.lang.Object r5 = r5.mo24345h(r6, r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r5 = r6
        L53:
            l.r r5 = r4.m3217p(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m3215n(s.m, vc.c):java.lang.Object");
    }

    /* renamed from: o */
    public final InterfaceC10085r m3216o(InterfaceC5467a.c cVar) {
        return AbstractC10086s.m21097d(cVar.getData(), m3211j(), m3210i(), cVar, null, 16, null);
    }

    /* renamed from: p */
    public final InterfaceC10085r m3217p(Buffer buffer) {
        return AbstractC10086s.m21096c(buffer, m3211j(), null, 4, null);
    }

    /* renamed from: q */
    public final C11019l m3218q(InterfaceC5467a.c cVar) throws Throwable {
        Throwable th;
        C11019l c11019lM3231a;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(m3211j().source(cVar.getMetadata()));
            try {
                c11019lM3231a = C5484a.f3849a.m3231a(bufferedSourceBuffer);
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
                        AbstractC10771b.m22973a(th3, th4);
                    }
                }
                th = th3;
                c11019lM3231a = null;
            }
            if (th == null) {
                return c11019lM3231a;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r0.mo24344b(r3, r4, r6) == r7) goto L63;
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
    public final java.lang.Object m3219r(coil3.disk.InterfaceC5467a.c r11, p327s.C11019l r12, p327s.C11017j r13, p327s.C11019l r14, vc.InterfaceC11588c r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.NetworkFetcher.m3219r(coil3.disk.a$c, s.l, s.j, s.l, vc.c):java.lang.Object");
    }

    public static final class Factory implements InterfaceC10281k.a {

        /* renamed from: a */
        public final InterfaceC10773d f3809a;

        /* renamed from: b */
        public final InterfaceC10773d f3810b;

        /* renamed from: c */
        public final C11194b f3811c;

        /* renamed from: coil3.network.NetworkFetcher$Factory$2 */
        public static final /* synthetic */ class C54832 extends FunctionReferenceImpl implements InterfaceC9540l {

            /* renamed from: c */
            public static final C54832 f3812c = new C54832();

            public C54832() {
                super(1, AbstractC11011d.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);
            }

            @Override // p181hd.InterfaceC9540l
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final InterfaceC11009b invoke(Context context) {
                return AbstractC11011d.m24328a(context);
            }
        }

        public Factory(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9540l interfaceC9540l) {
            this.f3809a = AbstractC9923a.m20068a(interfaceC9529a);
            this.f3810b = AbstractC9923a.m20068a(interfaceC9529a2);
            this.f3811c = AbstractC11195c.m24905a(interfaceC9540l);
        }

        /* renamed from: d */
        public static final InterfaceC5485b m3222d() {
            return InterfaceC5485b.f3851b;
        }

        /* renamed from: f */
        public static final InterfaceC5467a m3223f(InterfaceC5470e interfaceC5470e) {
            return interfaceC5470e.mo2976a();
        }

        /* renamed from: g */
        private final boolean m3224g(C9766t c9766t) {
            return AbstractC9979u.m20289b(c9766t.m19685c(), HttpConstant.HTTP) || AbstractC9979u.m20289b(c9766t.m19685c(), "https");
        }

        @Override // p253n.InterfaceC10281k.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, final InterfaceC5470e interfaceC5470e) {
            if (m3224g(c9766t)) {
                return new NetworkFetcher(c9766t.toString(), c11634n, this.f3809a, AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: s.h
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return NetworkFetcher.Factory.m3223f(interfaceC5470e);
                    }
                }), this.f3810b, (InterfaceC11009b) this.f3811c.m24904a(c11634n.m25743c()));
            }
            return null;
        }

        public /* synthetic */ Factory(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
            this(interfaceC9529a, (i10 & 2) != 0 ? new InterfaceC9529a() { // from class: s.i
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return NetworkFetcher.Factory.m3222d();
                }
            } : interfaceC9529a2, (i10 & 4) != 0 ? C54832.f3812c : interfaceC9540l);
        }
    }
}
