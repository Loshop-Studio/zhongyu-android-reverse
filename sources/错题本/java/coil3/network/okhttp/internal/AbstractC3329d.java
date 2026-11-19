package coil3.network.okhttp.internal;

import coil3.network.C3322k;
import coil3.network.C3324m;
import coil3.network.C3325n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.AbstractC6323m0;
import okhttp3.C6301i0;
import okhttp3.C6329q;
import okio.BufferedSource;
import p045d6.C5434j;

/* renamed from: coil3.network.okhttp.internal.d */
/* loaded from: classes2.dex */
public abstract class AbstractC3329d {
    /* renamed from: a */
    public static final C3324m m2261a(C6301i0 c6301i0) {
        BufferedSource bufferedSourceSource;
        int i = c6301i0.f10107d;
        long j7 = c6301i0.f10114k;
        long j8 = c6301i0.f10115l;
        C6329q c6329q = c6301i0.f10109f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = c6329q.iterator();
        while (true) {
            C5434j c5434j = (C5434j) it;
            if (!c5434j.hasNext()) {
                break;
            }
            Pair pair = (Pair) c5434j.next();
            String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
        }
        C3322k c3322k = new C3322k(AbstractC5785e0.m5156J(linkedHashMap));
        AbstractC6323m0 abstractC6323m0 = c6301i0.f10110g;
        return new C3324m(i, j7, j8, c3322k, (abstractC6323m0 == null || (bufferedSourceSource = abstractC6323m0.source()) == null) ? null : new C3325n(bufferedSourceSource), c6301i0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okhttp3.C6289c0 m2262b(coil3.network.C3323l r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof coil3.network.okhttp.internal.UtilsKt$toRequest$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = (coil3.network.okhttp.internal.UtilsKt$toRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil3.network.okhttp.internal.UtilsKt$toRequest$1 r0 = new coil3.network.okhttp.internal.UtilsKt$toRequest$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.label
            r2 = 0
            if (r1 == 0) goto L51
            r6 = 1
            if (r1 != r6) goto L49
            java.lang.Object r1 = r0.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r0.L$2
            okhttp3.b0 r3 = (okhttp3.C6287b0) r3
            java.lang.Object r4 = r0.L$1
            okhttp3.b0 r4 = (okhttp3.C6287b0) r4
            java.lang.Object r0 = r0.L$0
            coil3.network.l r0 = (coil3.network.C3323l) r0
            kotlin.AbstractC5774b.m5119b(r7)
            okio.ByteString r7 = (okio.ByteString) r7
            if (r7 == 0) goto L47
            okhttp3.f0 r5 = okhttp3.AbstractC6297g0.Companion
            r5.getClass()
            okhttp3.d0 r5 = new okhttp3.d0
            r5.<init>(r2, r7, r6)
            r2 = r5
            goto L62
        L47:
            r6 = r0
            goto L61
        L49:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L51:
            kotlin.AbstractC5774b.m5119b(r7)
            okhttp3.b0 r3 = new okhttp3.b0
            r3.<init>()
            java.lang.String r7 = r6.f2020a
            r3.m5888f(r7)
            java.lang.String r1 = r6.f2021b
            r4 = r3
        L61:
            r0 = r6
        L62:
            r3.m5886d(r1, r2)
            coil3.network.k r6 = r0.f2022c
            kotlin.jvm.internal.o r7 = new kotlin.jvm.internal.o
            r0 = 2
            r1 = 0
            r7.<init>(r0, r1)
            java.util.Map r6 = r6.f2019a
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L78:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L94:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r7.m5347e(r1, r2)
            goto L94
        La4:
            okhttp3.q r6 = r7.m5348f()
            r4.getClass()
            kotlin.jvm.internal.o r6 = r6.m5964c()
            r4.f10058c = r6
            okhttp3.c0 r6 = r4.m5884b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.network.okhttp.internal.AbstractC3329d.m2262b(coil3.network.l, kotlin.coroutines.jvm.internal.ContinuationImpl):okhttp3.c0");
    }
}
