package coil3.network;

import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import coil3.AbstractC3330o;
import coil3.decode.C3274o;
import coil3.disk.C3286d;
import coil3.disk.C3291i;
import coil3.disk.C3292j;
import coil3.disk.InterfaceC3283a;
import coil3.network.okhttp.internal.C3326a;
import coil3.request.CachePolicy;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import p045d6.InterfaceC5429e;
import p073h4.AbstractC5625a;
import p075h6.InterfaceC5631c;
import p119n.InterfaceC6202g;
import p129o2.C6268a;
import p152r6.InterfaceC6473e;
import p154s.C6538l;

/* renamed from: coil3.network.j */
/* loaded from: classes2.dex */
public final class C3321j implements InterfaceC6202g {

    /* renamed from: a */
    public final String f2012a;

    /* renamed from: b */
    public final C6538l f2013b;

    /* renamed from: c */
    public final InterfaceC5429e f2014c;

    /* renamed from: d */
    public final InterfaceC5429e f2015d;

    /* renamed from: e */
    public final InterfaceC5429e f2016e;

    /* renamed from: f */
    public final InterfaceC3313e f2017f;

    public C3321j(String str, C6538l c6538l, InterfaceC5429e interfaceC5429e, InterfaceC5429e interfaceC5429e2, InterfaceC5429e interfaceC5429e3, InterfaceC3313e interfaceC3313e) {
        this.f2012a = str;
        this.f2013b = c6538l;
        this.f2014c = interfaceC5429e;
        this.f2015d = interfaceC5429e2;
        this.f2016e = interfaceC5429e3;
        this.f2017f = interfaceC3313e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2250b(coil3.network.C3321j r4, coil3.network.C3325n r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof coil3.network.NetworkFetcher$toImageSource$1
            if (r0 == 0) goto L16
            r0 = r6
            coil3.network.NetworkFetcher$toImageSource$1 r0 = (coil3.network.NetworkFetcher$toImageSource$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            coil3.network.NetworkFetcher$toImageSource$1 r0 = new coil3.network.NetworkFetcher$toImageSource$1
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            okio.Buffer r5 = (okio.Buffer) r5
            kotlin.AbstractC5774b.m5119b(r6)
            goto L4d
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.AbstractC5774b.m5119b(r6)
            okio.Buffer r6 = new okio.Buffer
            r6.<init>()
            r0.L$0 = r6
            r0.label = r3
            okio.BufferedSource r5 = r5.f2030a
            r5.readAll(r6)
            d6.s r5 = p045d6.C5443s.f8405a
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r6
        L4d:
            okio.FileSystem r4 = r4.m2255e()
            coil3.decode.r r6 = new coil3.decode.r
            r0 = 0
            r6.<init>(r5, r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.C3321j.m2250b(coil3.network.j, coil3.network.n, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020c A[Catch: Exception -> 0x01c0, TryCatch #5 {Exception -> 0x01c0, blocks: (B:67:0x0196, B:84:0x01c7, B:86:0x01cb, B:104:0x020c, B:107:0x0211, B:101:0x0206, B:120:0x0239, B:79:0x01bc, B:98:0x0201, B:68:0x01a8, B:76:0x01b7, B:87:0x01e7), top: B:142:0x0196, inners: #0, #8, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0211 A[Catch: Exception -> 0x01c0, TRY_LEAVE, TryCatch #5 {Exception -> 0x01c0, blocks: (B:67:0x0196, B:84:0x01c7, B:86:0x01cb, B:104:0x020c, B:107:0x0211, B:101:0x0206, B:120:0x0239, B:79:0x01bc, B:98:0x0201, B:68:0x01a8, B:76:0x01b7, B:87:0x01e7), top: B:142:0x0196, inners: #0, #8, #13, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0196 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2251c(coil3.network.C3321j r22, coil3.disk.C3291i r23, coil3.network.C3324m r24, coil3.network.C3324m r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.C3321j.m2251c(coil3.network.j, coil3.disk.i, coil3.network.m, coil3.network.m, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m2252f(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Ld
            java.lang.String r1 = "text/plain"
            r2 = 0
            boolean r1 = kotlin.text.AbstractC5862w.m5409C(r4, r1, r2)
            if (r1 == 0) goto L57
        Ld:
            boolean r1 = kotlin.text.AbstractC5855p.m5382P(r3)
            if (r1 == 0) goto L15
        L13:
            r1 = r0
            goto L54
        L15:
            r1 = 35
            java.lang.String r3 = kotlin.text.AbstractC5855p.m5400h0(r3, r1)
            r1 = 63
            java.lang.String r3 = kotlin.text.AbstractC5855p.m5400h0(r3, r1)
            r1 = 47
            java.lang.String r3 = kotlin.text.AbstractC5855p.m5397e0(r1, r3, r3)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r3 = kotlin.text.AbstractC5855p.m5397e0(r1, r3, r2)
            boolean r1 = kotlin.text.AbstractC5855p.m5382P(r3)
            if (r1 == 0) goto L36
            goto L13
        L36:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r3, r1)
            java.util.Map r1 = coil3.util.AbstractC3345i.f2079a
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L54
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getMimeTypeFromExtension(r3)
        L54:
            if (r1 == 0) goto L57
            return r1
        L57:
            if (r4 == 0) goto L60
            r3 = 59
            java.lang.String r3 = kotlin.text.AbstractC5855p.m5398f0(r4, r3)
            return r3
        L60:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.C3321j.m2252f(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (r0 == r7) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae A[Catch: Exception -> 0x003b, TryCatch #2 {Exception -> 0x003b, blocks: (B:15:0x0036, B:74:0x017e, B:22:0x004a, B:69:0x0166, B:71:0x016a, B:58:0x0121, B:60:0x0127, B:66:0x014f, B:41:0x00a5, B:43:0x00ae, B:45:0x00bc, B:52:0x00f0, B:54:0x00fc, B:48:0x00d2, B:50:0x00dc, B:63:0x0145, B:64:0x014d), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166 A[Catch: Exception -> 0x003b, PHI: r0 r1
      0x0166: PHI (r0v25 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:67:0x0163, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r1v10 kotlin.jvm.internal.Ref$ObjectRef) = (r1v8 kotlin.jvm.internal.Ref$ObjectRef), (r1v16 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:67:0x0163, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x003b, blocks: (B:15:0x0036, B:74:0x017e, B:22:0x004a, B:69:0x0166, B:71:0x016a, B:58:0x0121, B:60:0x0127, B:66:0x014f, B:41:0x00a5, B:43:0x00ae, B:45:0x00bc, B:52:0x00f0, B:54:0x00fc, B:48:0x00d2, B:50:0x00dc, B:63:0x0145, B:64:0x014d), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a A[Catch: Exception -> 0x003b, TryCatch #2 {Exception -> 0x003b, blocks: (B:15:0x0036, B:74:0x017e, B:22:0x004a, B:69:0x0166, B:71:0x016a, B:58:0x0121, B:60:0x0127, B:66:0x014f, B:41:0x00a5, B:43:0x00ae, B:45:0x00bc, B:52:0x00f0, B:54:0x00fc, B:48:0x00d2, B:50:0x00dc, B:63:0x0145, B:64:0x014d), top: B:86:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12, types: [T, coil3.network.m] */
    @Override // p119n.InterfaceC6202g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2253a(p075h6.InterfaceC5631c r17) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.C3321j.mo2253a(h6.c):java.lang.Object");
    }

    /* renamed from: d */
    public final Object m2254d(C3323l c3323l, InterfaceC6473e interfaceC6473e, InterfaceC5631c interfaceC5631c) {
        if (this.f2013b.f10902i.getReadEnabled() && AbstractC5830k.m5325b(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
        C3326a c3326a = (C3326a) this.f2014c.getValue();
        return C3326a.m2260a(c3326a.f2031a, c3323l, new NetworkFetcher$executeNetworkRequest$2(interfaceC6473e, null), (ContinuationImpl) interfaceC5631c);
    }

    /* renamed from: e */
    public final FileSystem m2255e() {
        FileSystem fileSystem;
        InterfaceC3283a interfaceC3283a = (InterfaceC3283a) this.f2015d.getValue();
        return (interfaceC3283a == null || (fileSystem = ((C3292j) interfaceC3283a).f1973a) == null) ? this.f2013b.f10899f : fileSystem;
    }

    /* renamed from: g */
    public final C3323l m2256g() {
        C6268a c6268a = AbstractC3316h.f2006b;
        C6538l c6538l = this.f2013b;
        C3322k c3322k = (C3322k) AbstractC3330o.m2268f(c6538l, c6268a);
        c3322k.getClass();
        C6268a c6268a2 = new C6268a(c3322k);
        CachePolicy cachePolicy = c6538l.f10901h;
        boolean readEnabled = cachePolicy.getReadEnabled();
        boolean z8 = c6538l.f10902i.getReadEnabled() && this.f2017f.mo2232a();
        if (!z8 && readEnabled) {
            c6268a2.m5867B("only-if-cached, max-stale=2147483647");
        } else if (!z8 || readEnabled) {
            if (!z8 && !readEnabled) {
                c6268a2.m5867B("no-cache, only-if-cached");
            }
        } else if (cachePolicy.getWriteEnabled()) {
            c6268a2.m5867B("no-cache");
        } else {
            c6268a2.m5867B("no-cache, no-store");
        }
        String str = (String) AbstractC3330o.m2268f(c6538l, AbstractC3316h.f2005a);
        C3322k c3322k2 = new C3322k(AbstractC5785e0.m5156J((LinkedHashMap) c6268a2.f10022b));
        if (AbstractC3330o.m2268f(c6538l, AbstractC3316h.f2007c) == null) {
            return new C3323l(this.f2012a, str, c3322k2, c6538l.f10903j);
        }
        throw new ClassCastException();
    }

    /* renamed from: h */
    public final C3274o m2257h(C3291i c3291i) {
        C3286d c3286d = c3291i.f1972a;
        if (c3286d.f1947b) {
            throw new IllegalStateException("snapshot is closed");
        }
        Path path = (Path) c3286d.f1946a.f1939c.get(1);
        FileSystem fileSystemM2255e = m2255e();
        String str = this.f2013b.f10898e;
        if (str == null) {
            str = this.f2012a;
        }
        return AbstractC3315g.m2233a(path, fileSystemM2255e, str, c3291i, 16);
    }

    /* renamed from: i */
    public final C3324m m2258i(C3291i c3291i) throws Throwable {
        Throwable th;
        C3324m c3324mM4953m;
        try {
            FileSystem fileSystemM2255e = m2255e();
            C3286d c3286d = c3291i.f1972a;
            if (c3286d.f1947b) {
                throw new IllegalStateException("snapshot is closed");
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileSystemM2255e.source((Path) c3286d.f1946a.f1939c.get(0)));
            try {
                c3324mM4953m = AbstractC5625a.m4953m(bufferedSourceBuffer);
                try {
                    bufferedSourceBuffer.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (Throwable th4) {
                        AbstractC5806u.m5266e(th3, th4);
                    }
                }
                th = th3;
                c3324mM4953m = null;
            }
            if (th == null) {
                return c3324mM4953m;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }
}
