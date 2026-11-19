package coil3.intercept;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import coil3.util.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p090e0.InterfaceC7825w;
import p151k.InterfaceC8239j;
import p247t.C9596e;
import p297y.InterfaceC9934o;

/* loaded from: classes3.dex */
public final class EngineInterceptor implements InterfaceC5335a {

    /* renamed from: e */
    public static final C5333a f2946e = new C5333a(null);

    /* renamed from: a */
    public final InterfaceC5328e f2947a;

    /* renamed from: b */
    public final InterfaceC7825w f2948b;

    /* renamed from: c */
    public final InterfaceC9934o f2949c;

    /* renamed from: d */
    public final C9596e f2950d;

    /* renamed from: coil3.intercept.EngineInterceptor$a */
    public static final class C5333a {
        public /* synthetic */ C5333a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5333a() {
        }
    }

    /* renamed from: coil3.intercept.EngineInterceptor$b */
    public static final class C5334b {

        /* renamed from: a */
        public final InterfaceC8239j f2951a;

        /* renamed from: b */
        public final boolean f2952b;

        /* renamed from: c */
        public final DataSource f2953c;

        /* renamed from: d */
        public final String f2954d;

        public C5334b(InterfaceC8239j interfaceC8239j, boolean z9, DataSource dataSource, String str) {
            this.f2951a = interfaceC8239j;
            this.f2952b = z9;
            this.f2953c = dataSource;
            this.f2954d = str;
        }

        /* renamed from: b */
        public static /* synthetic */ C5334b m2807b(C5334b c5334b, InterfaceC8239j interfaceC8239j, boolean z9, DataSource dataSource, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                interfaceC8239j = c5334b.f2951a;
            }
            if ((i9 & 2) != 0) {
                z9 = c5334b.f2952b;
            }
            if ((i9 & 4) != 0) {
                dataSource = c5334b.f2953c;
            }
            if ((i9 & 8) != 0) {
                str = c5334b.f2954d;
            }
            return c5334b.m2808a(interfaceC8239j, z9, dataSource, str);
        }

        /* renamed from: a */
        public final C5334b m2808a(InterfaceC8239j interfaceC8239j, boolean z9, DataSource dataSource, String str) {
            return new C5334b(interfaceC8239j, z9, dataSource, str);
        }

        /* renamed from: c */
        public final DataSource m2809c() {
            return this.f2953c;
        }

        /* renamed from: d */
        public final String m2810d() {
            return this.f2954d;
        }

        /* renamed from: e */
        public final InterfaceC8239j m2811e() {
            return this.f2951a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5334b)) {
                return false;
            }
            C5334b c5334b = (C5334b) obj;
            return Intrinsics.areEqual(this.f2951a, c5334b.f2951a) && this.f2952b == c5334b.f2952b && this.f2953c == c5334b.f2953c && Intrinsics.areEqual(this.f2954d, c5334b.f2954d);
        }

        /* renamed from: f */
        public final boolean m2812f() {
            return this.f2952b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f2951a.hashCode() * 31) + Boolean.hashCode(this.f2952b)) * 31) + this.f2953c.hashCode()) * 31;
            String str = this.f2954d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.f2951a + ", isSampled=" + this.f2952b + ", dataSource=" + this.f2953c + ", diskCacheKey=" + this.f2954d + ')';
        }
    }

    public EngineInterceptor(InterfaceC5328e interfaceC5328e, InterfaceC7825w interfaceC7825w, InterfaceC9934o interfaceC9934o, Logger logger) {
        this.f2947a = interfaceC5328e;
        this.f2948b = interfaceC7825w;
        this.f2949c = interfaceC9934o;
        this.f2950d = new C9596e(interfaceC5328e, interfaceC9934o, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.intercept.InterfaceC5335a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2803a(coil3.intercept.InterfaceC5335a.a r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof coil3.intercept.EngineInterceptor$intercept$1
            if (r0 == 0) goto L13
            r0 = r15
            coil3.intercept.EngineInterceptor$intercept$1 r0 = (coil3.intercept.EngineInterceptor$intercept$1) r0
            int r1 = r0.f2997d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2997d = r1
            goto L18
        L13:
            coil3.intercept.EngineInterceptor$intercept$1 r0 = new coil3.intercept.EngineInterceptor$intercept$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f2995b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2997d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r14 = r0.f2994a
            coil3.intercept.a$a r14 = (coil3.intercept.InterfaceC5335a.a) r14
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L2d
            return r15
        L2d:
            r0 = move-exception
        L2e:
            r15 = r0
            goto L9e
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            kotlin.ResultKt.throwOnFailure(r15)
            y.e r6 = r14.mo2815a()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r15 = r6.m17020d()     // Catch: java.lang.Throwable -> L9b
            z.e r2 = r14.getSize()     // Catch: java.lang.Throwable -> L9b
            coil3.b r9 = coil3.util.AbstractC5348c.m2935l(r14)     // Catch: java.lang.Throwable -> L9b
            y.o r4 = r13.f2949c     // Catch: java.lang.Throwable -> L9b
            y.m r8 = r4.mo16994c(r6, r2)     // Catch: java.lang.Throwable -> L9b
            coil3.size.Scale r4 = r8.m17115j()     // Catch: java.lang.Throwable -> L9b
            r9.m2605l(r6, r15)     // Catch: java.lang.Throwable -> L9b
            coil3.e r5 = r13.f2947a     // Catch: java.lang.Throwable -> L9b
            coil3.a r5 = r5.mo2549e()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r7 = r5.m2572j(r15, r8)     // Catch: java.lang.Throwable -> L9b
            r9.m2604k(r6, r7)     // Catch: java.lang.Throwable -> L9b
            t.e r15 = r13.f2950d     // Catch: java.lang.Throwable -> L9b
            t.d$b r10 = r15.m15810f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9b
            if (r10 == 0) goto L75
            t.e r15 = r13.f2950d     // Catch: java.lang.Throwable -> L2d
            t.d$c r15 = r15.m15805a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L75:
            r15 = 0
        L76:
            if (r15 == 0) goto L7f
            t.e r0 = r13.f2950d     // Catch: java.lang.Throwable -> L2d
            y.q r14 = r0.m15811g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L2d
            return r14
        L7f:
            kotlin.coroutines.CoroutineContext r15 = r6.m17028l()     // Catch: java.lang.Throwable -> L9b
            coil3.intercept.EngineInterceptor$intercept$2 r4 = new coil3.intercept.EngineInterceptor$intercept$2     // Catch: java.lang.Throwable -> L9b
            r12 = 0
            r5 = r13
            r11 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L97
            r0.f2994a = r11     // Catch: java.lang.Throwable -> L97
            r0.f2997d = r3     // Catch: java.lang.Throwable -> L97
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r15, r4, r0)     // Catch: java.lang.Throwable -> L97
            if (r14 != r1) goto L96
            return r1
        L96:
            return r14
        L97:
            r0 = move-exception
            r15 = r0
            r14 = r11
            goto L9e
        L9b:
            r0 = move-exception
            r11 = r14
            goto L2e
        L9e:
            boolean r0 = r15 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lab
            y.e r14 = r14.mo2815a()
            y.d r14 = coil3.util.AbstractC5348c.m2926c(r14, r15)
            return r14
        Lab:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.mo2803a(coil3.intercept.a$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0097). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2804g(p207p.C9303p r7, coil3.C5302a r8, p297y.C9924e r9, java.lang.Object r10, p297y.C9932m r11, coil3.AbstractC5303b r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m2804g(p.p, coil3.a, y.e, java.lang.Object, y.m, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x019a, code lost:
    
        if (r0 == r9) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, y.m] */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, coil3.a] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, coil3.a] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2805h(p297y.C9924e r16, java.lang.Object r17, p297y.C9932m r18, coil3.AbstractC5303b r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m2805h(y.e, java.lang.Object, y.m, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008a -> B:21:0x008e). Please report as a decompilation issue!!! */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2806i(coil3.C5302a r7, p297y.C9924e r8, java.lang.Object r9, p297y.C9932m r10, coil3.AbstractC5303b r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m2806i(coil3.a, y.e, java.lang.Object, y.m, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
