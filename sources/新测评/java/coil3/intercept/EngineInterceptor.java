package coil3.intercept;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import coil3.util.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p030c0.InterfaceC5099x;
import p137k.InterfaceC7838j;
import p238t.C9364e;
import p290y.InterfaceC9894m;

/* loaded from: classes3.dex */
public final class EngineInterceptor implements InterfaceC5200a {

    /* renamed from: e */
    public static final C5198a f3020e = new C5198a(null);

    /* renamed from: a */
    public final InterfaceC5193e f3021a;

    /* renamed from: b */
    public final InterfaceC5099x f3022b;

    /* renamed from: c */
    public final InterfaceC9894m f3023c;

    /* renamed from: d */
    public final C9364e f3024d;

    /* renamed from: coil3.intercept.EngineInterceptor$a */
    public static final class C5198a {
        public /* synthetic */ C5198a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5198a() {
        }
    }

    /* renamed from: coil3.intercept.EngineInterceptor$b */
    public static final class C5199b {

        /* renamed from: a */
        public final InterfaceC7838j f3025a;

        /* renamed from: b */
        public final boolean f3026b;

        /* renamed from: c */
        public final DataSource f3027c;

        /* renamed from: d */
        public final String f3028d;

        public C5199b(InterfaceC7838j interfaceC7838j, boolean z9, DataSource dataSource, String str) {
            this.f3025a = interfaceC7838j;
            this.f3026b = z9;
            this.f3027c = dataSource;
            this.f3028d = str;
        }

        /* renamed from: b */
        public static /* synthetic */ C5199b m3087b(C5199b c5199b, InterfaceC7838j interfaceC7838j, boolean z9, DataSource dataSource, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                interfaceC7838j = c5199b.f3025a;
            }
            if ((i10 & 2) != 0) {
                z9 = c5199b.f3026b;
            }
            if ((i10 & 4) != 0) {
                dataSource = c5199b.f3027c;
            }
            if ((i10 & 8) != 0) {
                str = c5199b.f3028d;
            }
            return c5199b.m3088a(interfaceC7838j, z9, dataSource, str);
        }

        /* renamed from: a */
        public final C5199b m3088a(InterfaceC7838j interfaceC7838j, boolean z9, DataSource dataSource, String str) {
            return new C5199b(interfaceC7838j, z9, dataSource, str);
        }

        /* renamed from: c */
        public final DataSource m3089c() {
            return this.f3027c;
        }

        /* renamed from: d */
        public final String m3090d() {
            return this.f3028d;
        }

        /* renamed from: e */
        public final InterfaceC7838j m3091e() {
            return this.f3025a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5199b)) {
                return false;
            }
            C5199b c5199b = (C5199b) obj;
            return Intrinsics.areEqual(this.f3025a, c5199b.f3025a) && this.f3026b == c5199b.f3026b && this.f3027c == c5199b.f3027c && Intrinsics.areEqual(this.f3028d, c5199b.f3028d);
        }

        /* renamed from: f */
        public final boolean m3092f() {
            return this.f3026b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f3025a.hashCode() * 31) + Boolean.hashCode(this.f3026b)) * 31) + this.f3027c.hashCode()) * 31;
            String str = this.f3028d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.f3025a + ", isSampled=" + this.f3026b + ", dataSource=" + this.f3027c + ", diskCacheKey=" + this.f3028d + ')';
        }
    }

    public EngineInterceptor(InterfaceC5193e interfaceC5193e, InterfaceC5099x interfaceC5099x, InterfaceC9894m interfaceC9894m, Logger logger) {
        this.f3021a = interfaceC5193e;
        this.f3022b = interfaceC5099x;
        this.f3023c = interfaceC9894m;
        this.f3024d = new C9364e(interfaceC5193e, interfaceC9894m, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // coil3.intercept.InterfaceC5200a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3083a(coil3.intercept.InterfaceC5200a.a r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.mo3083a(coil3.intercept.a$a, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object m3084g(p194p.C8800p r7, coil3.C5167a r8, p290y.C9886e r9, java.lang.Object r10, p290y.C9892k r11, coil3.AbstractC5168b r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m3084g(p.p, coil3.a, y.e, java.lang.Object, y.k, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x021a, code lost:
    
        if (r0 == r9) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e A[Catch: all -> 0x00a8, TRY_LEAVE, TryCatch #2 {all -> 0x00a8, blocks: (B:23:0x009c, B:42:0x0143, B:44:0x014e, B:48:0x015f, B:57:0x019f, B:59:0x01a3, B:73:0x0227, B:74:0x022c), top: B:87:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, coil3.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, coil3.a] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, y.k] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3085h(p290y.C9886e r18, java.lang.Object r19, p290y.C9892k r20, coil3.AbstractC5168b r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m3085h(y.e, java.lang.Object, y.k, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object m3086i(coil3.C5167a r7, p290y.C9886e r8, java.lang.Object r9, p290y.C9892k r10, coil3.AbstractC5168b r11, kotlin.coroutines.Continuation r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof coil3.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.EngineInterceptor$fetch$1 r0 = (coil3.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.f3070k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3070k = r1
            goto L18
        L13:
            coil3.intercept.EngineInterceptor$fetch$1 r0 = new coil3.intercept.EngineInterceptor$fetch$1
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.f3068i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3070k
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            int r7 = r0.f3067h
            java.lang.Object r8 = r0.f3066g
            p.k r8 = (p194p.InterfaceC8795k) r8
            java.lang.Object r9 = r0.f3065f
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r0.f3064e
            coil3.b r9 = (coil3.AbstractC5168b) r9
            java.lang.Object r10 = r0.f3063d
            y.k r10 = (p290y.C9892k) r10
            java.lang.Object r11 = r0.f3062c
            java.lang.Object r2 = r0.f3061b
            y.e r2 = (p290y.C9886e) r2
            java.lang.Object r4 = r0.f3060a
            coil3.a r4 = (coil3.C5167a) r4
            kotlin.ResultKt.throwOnFailure(r12)
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
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = 0
        L5a:
            coil3.e r2 = r6.f3021a
            kotlin.Pair r12 = r7.m2847m(r9, r10, r2, r12)
            if (r12 == 0) goto Lb2
            java.lang.Object r2 = r12.getFirst()
            p.k r2 = (p194p.InterfaceC8795k) r2
            java.lang.Object r4 = r12.getSecond()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r3
            r11.m2873h(r8, r2, r10)
            r0.f3060a = r7
            r0.f3061b = r8
            r0.f3062c = r9
            r0.f3063d = r10
            r0.f3064e = r11
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r0.f3065f = r12
            r0.f3066g = r2
            r0.f3067h = r4
            r0.f3070k = r3
            java.lang.Object r12 = r2.mo3117a(r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            p.j r12 = (p194p.InterfaceC8794j) r12
            r11.m2872g(r8, r2, r10, r12)     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r12 = r4
            goto L5a
        L9d:
            r7 = move-exception
            boolean r8 = r12 instanceof p194p.C8800p
            if (r8 == 0) goto La5
            p.p r12 = (p194p.C8800p) r12
            goto La6
        La5:
            r12 = 0
        La6:
            if (r12 == 0) goto Lb1
            n.r r8 = r12.m14700b()
            if (r8 == 0) goto Lb1
            coil3.util.AbstractC5213c.m3215i(r8)
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m3086i(coil3.a, y.e, java.lang.Object, y.k, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
