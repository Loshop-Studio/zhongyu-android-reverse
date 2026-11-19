package coil3.intercept;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import coil3.util.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p023c0.InterfaceC4479x;
import p087k.InterfaceC6611j;
import p152t.C7709e;
import p187y.InterfaceC7882o;

/* loaded from: classes3.dex */
public final class EngineInterceptor implements InterfaceC4581a {

    /* renamed from: e */
    public static final C4579a f1704e = new C4579a(null);

    /* renamed from: a */
    public final InterfaceC4574e f1705a;

    /* renamed from: b */
    public final InterfaceC4479x f1706b;

    /* renamed from: c */
    public final InterfaceC7882o f1707c;

    /* renamed from: d */
    public final C7709e f1708d;

    /* renamed from: coil3.intercept.EngineInterceptor$a */
    public static final class C4579a {
        public /* synthetic */ C4579a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C4579a() {
        }
    }

    /* renamed from: coil3.intercept.EngineInterceptor$b */
    public static final class C4580b {

        /* renamed from: a */
        public final InterfaceC6611j f1709a;

        /* renamed from: b */
        public final boolean f1710b;

        /* renamed from: c */
        public final DataSource f1711c;

        /* renamed from: d */
        public final String f1712d;

        public C4580b(InterfaceC6611j interfaceC6611j, boolean z6, DataSource dataSource, String str) {
            this.f1709a = interfaceC6611j;
            this.f1710b = z6;
            this.f1711c = dataSource;
            this.f1712d = str;
        }

        /* renamed from: b */
        public static /* synthetic */ C4580b m1913b(C4580b c4580b, InterfaceC6611j interfaceC6611j, boolean z6, DataSource dataSource, String str, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                interfaceC6611j = c4580b.f1709a;
            }
            if ((i6 & 2) != 0) {
                z6 = c4580b.f1710b;
            }
            if ((i6 & 4) != 0) {
                dataSource = c4580b.f1711c;
            }
            if ((i6 & 8) != 0) {
                str = c4580b.f1712d;
            }
            return c4580b.m1914a(interfaceC6611j, z6, dataSource, str);
        }

        /* renamed from: a */
        public final C4580b m1914a(InterfaceC6611j interfaceC6611j, boolean z6, DataSource dataSource, String str) {
            return new C4580b(interfaceC6611j, z6, dataSource, str);
        }

        /* renamed from: c */
        public final DataSource m1915c() {
            return this.f1711c;
        }

        /* renamed from: d */
        public final String m1916d() {
            return this.f1712d;
        }

        /* renamed from: e */
        public final InterfaceC6611j m1917e() {
            return this.f1709a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4580b)) {
                return false;
            }
            C4580b c4580b = (C4580b) obj;
            return Intrinsics.areEqual(this.f1709a, c4580b.f1709a) && this.f1710b == c4580b.f1710b && this.f1711c == c4580b.f1711c && Intrinsics.areEqual(this.f1712d, c4580b.f1712d);
        }

        /* renamed from: f */
        public final boolean m1918f() {
            return this.f1710b;
        }

        public int hashCode() {
            int iHashCode = ((((this.f1709a.hashCode() * 31) + Boolean.hashCode(this.f1710b)) * 31) + this.f1711c.hashCode()) * 31;
            String str = this.f1712d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "ExecuteResult(image=" + this.f1709a + ", isSampled=" + this.f1710b + ", dataSource=" + this.f1711c + ", diskCacheKey=" + this.f1712d + ')';
        }
    }

    public EngineInterceptor(InterfaceC4574e interfaceC4574e, InterfaceC4479x interfaceC4479x, InterfaceC7882o interfaceC7882o, Logger logger) {
        this.f1705a = interfaceC4574e;
        this.f1706b = interfaceC4479x;
        this.f1707c = interfaceC7882o;
        this.f1708d = new C7709e(interfaceC4574e, interfaceC7882o, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    @Override // coil3.intercept.InterfaceC4581a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo1909a(coil3.intercept.InterfaceC4581a.a r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.mo1909a(coil3.intercept.a$a, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object m1910g(p124p.C7587p r7, coil3.C4548a r8, p187y.C7872e r9, java.lang.Object r10, p187y.C7880m r11, coil3.AbstractC4549b r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m1910g(p.p, coil3.a, y.e, java.lang.Object, y.m, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
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
    /* JADX WARN: Type inference failed for: r2v8, types: [T, y.m] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1911h(p187y.C7872e r18, java.lang.Object r19, p187y.C7880m r20, coil3.AbstractC4549b r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m1911h(y.e, java.lang.Object, y.m, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
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
    public final java.lang.Object m1912i(coil3.C4548a r7, p187y.C7872e r8, java.lang.Object r9, p187y.C7880m r10, coil3.AbstractC4549b r11, kotlin.coroutines.Continuation r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof coil3.intercept.EngineInterceptor$fetch$1
            if (r0 == 0) goto L13
            r0 = r12
            coil3.intercept.EngineInterceptor$fetch$1 r0 = (coil3.intercept.EngineInterceptor$fetch$1) r0
            int r1 = r0.f1754k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1754k = r1
            goto L18
        L13:
            coil3.intercept.EngineInterceptor$fetch$1 r0 = new coil3.intercept.EngineInterceptor$fetch$1
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.f1752i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1754k
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 != r3) goto L4e
            int r7 = r0.f1751h
            java.lang.Object r8 = r0.f1750g
            p.k r8 = (p124p.InterfaceC7582k) r8
            java.lang.Object r9 = r0.f1749f
            kotlin.Pair r9 = (kotlin.Pair) r9
            java.lang.Object r9 = r0.f1748e
            coil3.b r9 = (coil3.AbstractC4549b) r9
            java.lang.Object r10 = r0.f1747d
            y.m r10 = (p187y.C7880m) r10
            java.lang.Object r11 = r0.f1746c
            java.lang.Object r2 = r0.f1745b
            y.e r2 = (p187y.C7872e) r2
            java.lang.Object r4 = r0.f1744a
            coil3.a r4 = (coil3.C4548a) r4
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
            coil3.e r2 = r6.f1705a
            kotlin.Pair r12 = r7.m1681m(r9, r10, r2, r12)
            if (r12 == 0) goto Lb2
            java.lang.Object r2 = r12.getFirst()
            p.k r2 = (p124p.InterfaceC7582k) r2
            java.lang.Object r4 = r12.getSecond()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r4 = r4 + r3
            r11.m1707h(r8, r2, r10)
            r0.f1744a = r7
            r0.f1745b = r8
            r0.f1746c = r9
            r0.f1747d = r10
            r0.f1748e = r11
            java.lang.Object r12 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r0.f1749f = r12
            r0.f1750g = r2
            r0.f1751h = r4
            r0.f1754k = r3
            java.lang.Object r12 = r2.mo1943a(r0)
            if (r12 != r1) goto L93
            return r1
        L93:
            p.j r12 = (p124p.InterfaceC7581j) r12
            r11.m1706g(r8, r2, r10, r12)     // Catch: java.lang.Throwable -> L9d
            if (r12 == 0) goto L9b
            return r12
        L9b:
            r12 = r4
            goto L5a
        L9d:
            r7 = move-exception
            boolean r8 = r12 instanceof p124p.C7587p
            if (r8 == 0) goto La5
            p.p r12 = (p124p.C7587p) r12
            goto La6
        La5:
            r12 = 0
        La6:
            if (r12 == 0) goto Lb1
            n.r r8 = r12.m8992b()
            if (r8 == 0) goto Lb1
            coil3.util.AbstractC4594c.m2041i(r8)
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
        throw new UnsupportedOperationException("Method not decompiled: coil3.intercept.EngineInterceptor.m1912i(coil3.a, y.e, java.lang.Object, y.m, coil3.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
