package coil3.network.okhttp.internal;

import coil3.network.C5486c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import je.AbstractC9746z;
import je.C9737q;
import je.C9745y;
import kotlin.Pair;
import okio.BufferedSource;
import p327s.AbstractC11014g;
import p327s.C11019l;

/* loaded from: classes3.dex */
public abstract class UtilsKt {
    /* renamed from: c */
    public static final C9737q m3262c(C5486c c5486c) {
        C9737q.a aVar = new C9737q.a();
        for (Map.Entry entry : c5486c.m3239b().entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                aVar.m19399e(str, (String) it.next());
            }
        }
        return aVar.m19400f();
    }

    /* renamed from: d */
    public static final C5486c m3263d(C9737q c9737q) {
        C5486c.a aVar = new C5486c.a();
        Iterator it = c9737q.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.m3242a((String) pair.m20048a(), (String) pair.m20049c());
        }
        return aVar.m3243b();
    }

    /* renamed from: e */
    public static final C11019l m3264e(C9745y c9745y) {
        BufferedSource bufferedSourceSource;
        int iM19632j = c9745y.m19632j();
        long jM19627A = c9745y.m19627A();
        long jM19644y = c9745y.m19644y();
        C5486c c5486cM3263d = m3263d(c9745y.m19637r());
        AbstractC9746z abstractC9746zM19628e = c9745y.m19628e();
        return new C11019l(iM19632j, jM19627A, jM19644y, c5486cM3263d, (abstractC9746zM19628e == null || (bufferedSourceSource = abstractC9746zM19628e.source()) == null) ? null : AbstractC11014g.m24332a(bufferedSourceSource), c9745y);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m3265f(p327s.C11017j r6, vc.InterfaceC11588c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.f3883h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3883h = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3882g
            p393wc.AbstractC11725a.m25952f()
            int r1 = r0.f3883h
            r2 = 0
            if (r1 == 0) goto L4d
            r6 = 1
            if (r1 != r6) goto L45
            java.lang.Object r1 = r0.f3881f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.f3880e
            je.w$a r3 = (je.C9743w.a) r3
            java.lang.Object r4 = r0.f3879d
            je.w$a r4 = (je.C9743w.a) r4
            java.lang.Object r0 = r0.f3878c
            s.j r0 = (p327s.C11017j) r0
            kotlin.AbstractC9924b.m20071b(r7)
            okio.ByteString r7 = (okio.ByteString) r7
            if (r7 == 0) goto L43
            je.x$a r5 = je.AbstractC9744x.Companion
            je.x r2 = je.AbstractC9744x.a.m19611o(r5, r7, r2, r6, r2)
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
            kotlin.AbstractC9924b.m20071b(r7)
            je.w$a r3 = new je.w$a
            r3.<init>()
            java.lang.String r7 = r6.m24336d()
            r3.m19608p(r7)
            java.lang.String r1 = r6.m24335c()
            r6.m24333a()
            r4 = r3
        L64:
            r0 = r6
        L65:
            r3.m19602j(r1, r2)
            coil3.network.c r6 = r0.m24334b()
            je.q r6 = m3262c(r6)
            r4.m19601i(r6)
            je.w r6 = r4.m19595b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.UtilsKt.m3265f(s.j, vc.c):java.lang.Object");
    }
}
