package coil3.network.okhttp.internal;

import coil3.network.C5209c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import okio.BufferedSource;
import p011a9.AbstractC0063z;
import p011a9.C0054q;
import p011a9.C0062y;
import p249u.AbstractC9521g;
import p249u.C9526l;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: c */
    public static final C0054q m3171c(C5209c c5209c) {
        C0054q.a aVar = new C0054q.a();
        for (Map.Entry entry : c5209c.m3148b().entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                aVar.m190e(str, (String) it.next());
            }
        }
        return aVar.m191f();
    }

    /* renamed from: d */
    public static final C5209c m3172d(C0054q c0054q) {
        C5209c.a aVar = new C5209c.a();
        Iterator it = c0054q.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.m3151a((String) pair.component1(), (String) pair.component2());
        }
        return aVar.m3152b();
    }

    /* renamed from: e */
    public static final C9526l m3173e(C0062y c0062y) {
        BufferedSource bufferedSourceSource;
        int iM418i = c0062y.m418i();
        long jM432x = c0062y.m432x();
        long jM430v = c0062y.m430v();
        C5209c c5209cM3172d = m3172d(c0062y.m423o());
        AbstractC0063z abstractC0063zM414a = c0062y.m414a();
        return new C9526l(iM418i, jM432x, jM430v, c5209cM3172d, (abstractC0063zM414a == null || (bufferedSourceSource = abstractC0063zM414a.source()) == null) ? null : AbstractC9521g.m15884a(bufferedSourceSource), c0062y);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3174f(p249u.C9524j r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.f3208f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3208f = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3207e
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f3208f
            r2 = 0
            if (r1 == 0) goto L4d
            r6 = 1
            if (r1 != r6) goto L45
            java.lang.Object r1 = r0.f3206d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.f3205c
            a9.w$a r3 = (p011a9.C0060w.a) r3
            java.lang.Object r4 = r0.f3204b
            a9.w$a r4 = (p011a9.C0060w.a) r4
            java.lang.Object r0 = r0.f3203a
            u.j r0 = (p249u.C9524j) r0
            kotlin.ResultKt.throwOnFailure(r7)
            okio.ByteString r7 = (okio.ByteString) r7
            if (r7 == 0) goto L43
            a9.x$a r5 = p011a9.AbstractC0061x.Companion
            a9.x r2 = p011a9.AbstractC0061x.a.m398o(r5, r7, r2, r6, r2)
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
            a9.w$a r3 = new a9.w$a
            r3.<init>()
            java.lang.String r7 = r6.m15888d()
            r3.m396o(r7)
            java.lang.String r1 = r6.m15887c()
            r6.m15885a()
            r4 = r3
        L64:
            r0 = r6
        L65:
            r3.m391j(r1, r2)
            coil3.network.c r6 = r0.m15886b()
            a9.q r6 = m3171c(r6)
            r4.m390i(r6)
            a9.w r6 = r4.m384b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.UtilsKt.m3174f(u.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
