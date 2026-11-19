package coil3.network.okhttp.internal;

import coil3.network.C5344c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okio.BufferedSource;
import p172l8.AbstractC8927z;
import p172l8.C8918q;
import p172l8.C8926y;
import p257u.AbstractC9649g;
import p257u.C9654l;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: c */
    public static final C8918q m2891c(C5344c c5344c) {
        C8918q.a aVar = new C8918q.a();
        for (Map.Entry entry : c5344c.m2868b().entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                aVar.m13946e(str, (String) it.next());
            }
        }
        return aVar.m13947f();
    }

    /* renamed from: d */
    public static final C5344c m2892d(C8918q c8918q) {
        C5344c.a aVar = new C5344c.a();
        Iterator it = c8918q.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.m2871a((String) pair.component1(), (String) pair.component2());
        }
        return aVar.m2872b();
    }

    /* renamed from: e */
    public static final C9654l m2893e(C8926y c8926y) {
        BufferedSource bufferedSourceSource;
        int iM14174i = c8926y.m14174i();
        long jM14188x = c8926y.m14188x();
        long jM14186v = c8926y.m14186v();
        C5344c c5344cM2892d = m2892d(c8926y.m14179o());
        AbstractC8927z abstractC8927zM14170a = c8926y.m14170a();
        return new C9654l(iM14174i, jM14188x, jM14186v, c5344cM2892d, (abstractC8927zM14170a == null || (bufferedSourceSource = abstractC8927zM14170a.source()) == null) ? null : AbstractC9649g.m15987a(bufferedSourceSource), c8926y);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m2894f(p257u.C9652j r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.f3096f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3096f = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3095e
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f3096f
            r2 = 0
            if (r1 == 0) goto L4d
            r6 = 1
            if (r1 != r6) goto L45
            java.lang.Object r1 = r0.f3094d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.f3093c
            l8.w$a r3 = (p172l8.C8924w.a) r3
            java.lang.Object r4 = r0.f3092b
            l8.w$a r4 = (p172l8.C8924w.a) r4
            java.lang.Object r0 = r0.f3091a
            u.j r0 = (p257u.C9652j) r0
            kotlin.ResultKt.throwOnFailure(r7)
            okio.ByteString r7 = (okio.ByteString) r7
            if (r7 == 0) goto L43
            l8.x$a r5 = p172l8.AbstractC8925x.Companion
            l8.x r2 = p172l8.AbstractC8925x.a.m14154o(r5, r7, r2, r6, r2)
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
            l8.w$a r3 = new l8.w$a
            r3.<init>()
            java.lang.String r7 = r6.m15991d()
            r3.m14151n(r7)
            java.lang.String r1 = r6.m15990c()
            r6.m15988a()
            r4 = r3
        L64:
            r0 = r6
        L65:
            r3.m14147j(r1, r2)
            coil3.network.c r6 = r0.m15989b()
            l8.q r6 = m2891c(r6)
            r4.m14146i(r6)
            l8.w r6 = r4.m14140b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.UtilsKt.m2894f(u.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
