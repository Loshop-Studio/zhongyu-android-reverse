package coil3.intercept;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import coil3.util.Logger;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.InterfaceC0027x;
import p212k.InterfaceC9756j;
import p312r.C10826e;
import p380w.InterfaceC11636p;

/* loaded from: classes3.dex */
public final class EngineInterceptor implements InterfaceC5477a {

    /* renamed from: e */
    public static final C5475a f3695e = new C5475a(null);

    /* renamed from: a */
    public final InterfaceC5470e f3696a;

    /* renamed from: b */
    public final InterfaceC0027x f3697b;

    /* renamed from: c */
    public final InterfaceC11636p f3698c;

    /* renamed from: d */
    public final C10826e f3699d;

    /* renamed from: coil3.intercept.EngineInterceptor$a */
    public static final class C5475a {
        public /* synthetic */ C5475a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C5475a() {
        }
    }

    /* renamed from: coil3.intercept.EngineInterceptor$b */
    public static final class C5476b {

        /* renamed from: a */
        public final InterfaceC9756j f3700a;

        /* renamed from: b */
        public final boolean f3701b;

        /* renamed from: c */
        public final DataSource f3702c;

        /* renamed from: d */
        public final String f3703d;

        public C5476b(InterfaceC9756j interfaceC9756j, boolean z10, DataSource dataSource, String str) {
            this.f3700a = interfaceC9756j;
            this.f3701b = z10;
            this.f3702c = dataSource;
            this.f3703d = str;
        }

        /* renamed from: b */
        public static /* synthetic */ C5476b m3178b(C5476b c5476b, InterfaceC9756j interfaceC9756j, boolean z10, DataSource dataSource, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC9756j = c5476b.f3700a;
            }
            if ((i10 & 2) != 0) {
                z10 = c5476b.f3701b;
            }
            if ((i10 & 4) != 0) {
                dataSource = c5476b.f3702c;
            }
            if ((i10 & 8) != 0) {
                str = c5476b.f3703d;
            }
            return c5476b.m3179a(interfaceC9756j, z10, dataSource, str);
        }

        /* renamed from: a */
        public final C5476b m3179a(InterfaceC9756j interfaceC9756j, boolean z10, DataSource dataSource, String str) {
            return new C5476b(interfaceC9756j, z10, dataSource, str);
        }

        /* renamed from: c */
        public final DataSource m3180c() {
            return this.f3702c;
        }

        /* renamed from: d */
        public final String m3181d() {
            return this.f3703d;
        }

        /* renamed from: e */
        public final InterfaceC9756j m3182e() {
            return this.f3700a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5476b)) {
                return false;
            }
            C5476b c5476b = (C5476b) obj;
            return AbstractC9979u.m20289b(this.f3700a, c5476b.f3700a) && this.f3701b == c5476b.f3701b && this.f3702c == c5476b.f3702c && AbstractC9979u.m20289b(this.f3703d, c5476b.f3703d);
        }

        /* renamed from: f */
        public final boolean m3183f() {
            return this.f3701b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f3700a.hashCode() * 31) + Boolean.hashCode(this.f3701b)) * 31) + this.f3702c.hashCode()) * 31;
            String str = this.f3703d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.f3700a + ", isSampled=" + this.f3701b + ", dataSource=" + this.f3702c + ", diskCacheKey=" + this.f3703d + ')';
        }
    }

    public EngineInterceptor(InterfaceC5470e interfaceC5470e, InterfaceC0027x interfaceC0027x, InterfaceC11636p interfaceC11636p, Logger logger) {
        this.f3696a = interfaceC5470e;
        this.f3697b = interfaceC0027x;
        this.f3698c = interfaceC11636p;
        this.f3699d = new C10826e(interfaceC5470e, interfaceC11636p, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // coil3.intercept.InterfaceC5477a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3174a(coil3.intercept.InterfaceC5477a.a r19, vc.InterfaceC11588c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.mo3174a(coil3.intercept.a$a, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0099 -> B:21:0x009c). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3175g(p253n.C10286p r7, coil3.C5452a r8, p380w.C11627g r9, java.lang.Object r10, p380w.C11634n r11, coil3.AbstractC5453b r12, vc.InterfaceC11588c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m3175g(n.p, coil3.a, w.g, java.lang.Object, w.n, coil3.b, vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x021a, code lost:
    
        if (r0 == r9) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #2 {all -> 0x00a8, blocks: (B:23:0x009c, B:42:0x0143, B:44:0x014e, B:48:0x015f, B:57:0x019f, B:59:0x01a3, B:73:0x0227, B:74:0x022c), top: B:87:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3176h(p380w.C11627g r18, java.lang.Object r19, p380w.C11634n r20, coil3.AbstractC5453b r21, vc.InterfaceC11588c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m3176h(w.g, java.lang.Object, w.n, coil3.b, vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0090 -> B:20:0x0093). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3177i(coil3.C5452a r7, p380w.C11627g r8, java.lang.Object r9, p380w.C11634n r10, coil3.AbstractC5453b r11, vc.InterfaceC11588c r12) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r12 instanceof coil3.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.EngineInterceptor$fetch$1 r0 = (coil3.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.f3745m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3745m = r1
            goto L18
        L13:
            coil3.intercept.EngineInterceptor$fetch$1 r0 = new coil3.intercept.EngineInterceptor$fetch$1
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.f3743k
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.f3745m
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            int r7 = r0.f3742j
            java.lang.Object r8 = r0.f3741i
            n.k r8 = (p253n.InterfaceC10281k) r8
            java.lang.Object r9 = r0.f3740h
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r0.f3739g
            coil3.b r9 = (coil3.AbstractC5453b) r9
            java.lang.Object r10 = r0.f3738f
            w.n r10 = (p380w.C11634n) r10
            java.lang.Object r11 = r0.f3737e
            java.lang.Object r2 = r0.f3736d
            w.g r2 = (p380w.C11627g) r2
            java.lang.Object r4 = r0.f3735c
            coil3.a r4 = (coil3.C5452a) r4
            kotlin.AbstractC9924b.m20071b(r12)
            r5 = r4
            r4 = r7
            r7 = r5
            r5 = r2
            r2 = r8
            r8 = r5
            r5 = r11
            r11 = r9
            r9 = r5
            goto L93
        L4e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L56:
            kotlin.AbstractC9924b.m20071b(r12)
            r12 = 0
        L5a:
            coil3.e r2 = r6.f3696a
            kotlin.Pair r12 = r7.m3006m(r9, r10, r2, r12)
            if (r12 == 0) goto Lb2
            java.lang.Object r2 = r12.m20051f()
            n.k r2 = (p253n.InterfaceC10281k) r2
            java.lang.Object r4 = r12.m20052g()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r3
            r11.m3032h(r8, r2, r10)
            r0.f3735c = r7
            r0.f3736d = r8
            r0.f3737e = r9
            r0.f3738f = r10
            r0.f3739g = r11
            java.lang.Object r12 = p409xc.AbstractC11833h.m26224a(r12)
            r0.f3740h = r12
            r0.f3741i = r2
            r0.f3742j = r4
            r0.f3745m = r3
            java.lang.Object r12 = r2.mo3208a(r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            n.j r12 = (p253n.InterfaceC10280j) r12
            r11.m3031g(r8, r2, r10, r12)     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r12 = r4
            goto L5a
        L9d:
            r7 = move-exception
            boolean r8 = r12 instanceof p253n.C10286p
            if (r8 == 0) goto La5
            n.p r12 = (p253n.C10286p) r12
            goto La6
        La5:
            r12 = 0
        La6:
            if (r12 == 0) goto Lb1
            l.r r8 = r12.m21419b()
            if (r8 == 0) goto Lb1
            coil3.util.AbstractC5490c.m3309i(r8)
        Lb1:
            throw r7
        Lb2:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unable to create a fetcher that supports: "
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m3177i(coil3.a, w.g, java.lang.Object, w.n, coil3.b, vc.c):java.lang.Object");
    }
}
