package coil3.network.okhttp.internal;

import coil3.network.C4590c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okio.BufferedSource;
import p058f5.AbstractC6364e0;
import p058f5.C6362d0;
import p058f5.C6383v;
import p159u.AbstractC7740g;
import p159u.C7745l;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: c */
    public static final C6383v m1997c(C4590c c4590c) {
        C6383v.a aVar = new C6383v.a();
        for (Map.Entry entry : c4590c.m1974b().entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                aVar.m6810e(str, (String) it.next());
            }
        }
        return aVar.m6811f();
    }

    /* renamed from: d */
    public static final C4590c m1998d(C6383v c6383v) {
        C4590c.a aVar = new C4590c.a();
        Iterator it = c6383v.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.m1977a((String) pair.component1(), (String) pair.component2());
        }
        return aVar.m1978b();
    }

    /* renamed from: e */
    public static final C7745l m1999e(C6362d0 c6362d0) {
        BufferedSource bufferedSourceSource;
        int iM6665j = c6362d0.m6665j();
        long jM6679y = c6362d0.m6679y();
        long jM6677w = c6362d0.m6677w();
        C4590c c4590cM1998d = m1998d(c6362d0.m6670p());
        AbstractC6364e0 abstractC6364e0M6661c = c6362d0.m6661c();
        return new C7745l(iM6665j, jM6679y, jM6677w, c4590cM1998d, (abstractC6364e0M6661c == null || (bufferedSourceSource = abstractC6364e0M6661c.source()) == null) ? null : AbstractC7740g.m9234a(bufferedSourceSource), c6362d0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2000f(p159u.C7743j r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.f1892f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1892f = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1891e
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f1892f
            r2 = 0
            if (r1 == 0) goto L4d
            r6 = 1
            if (r1 != r6) goto L45
            java.lang.Object r1 = r0.f1890d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.f1889c
            f5.b0$a r3 = (p058f5.C6358b0.a) r3
            java.lang.Object r4 = r0.f1888b
            f5.b0$a r4 = (p058f5.C6358b0.a) r4
            java.lang.Object r0 = r0.f1887a
            u.j r0 = (p159u.C7743j) r0
            kotlin.ResultKt.throwOnFailure(r7)
            okio.ByteString r7 = (okio.ByteString) r7
            if (r7 == 0) goto L43
            f5.c0$a r5 = p058f5.AbstractC6360c0.Companion
            f5.c0 r2 = p058f5.AbstractC6360c0.a.m6613q(r5, r7, r2, r6, r2)
            goto L65
        L43:
            r6 = r0
            goto L64
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4d:
            kotlin.ResultKt.throwOnFailure(r7)
            f5.b0$a r3 = new f5.b0$a
            r3.<init>()
            java.lang.String r7 = r6.m9238d()
            r3.m6611w(r7)
            java.lang.String r1 = r6.m9237c()
            r6.m9235a()
            r4 = r3
        L64:
            r0 = r6
        L65:
            r3.m6605q(r1, r2)
            coil3.network.c r6 = r0.m9236b()
            f5.v r6 = m1997c(r6)
            r4.m6604p(r6)
            f5.b0 r6 = r4.m6591b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.UtilsKt.m2000f(u.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
