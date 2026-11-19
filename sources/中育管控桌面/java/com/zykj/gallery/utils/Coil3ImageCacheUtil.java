package com.zykj.gallery.utils;

import android.content.Context;
import coil3.C4584l;
import coil3.InterfaceC4574e;
import coil3.disk.InterfaceC4571a;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import p187y.C7872e;

/* loaded from: classes4.dex */
public final class Coil3ImageCacheUtil {

    /* renamed from: a */
    public static final Coil3ImageCacheUtil f5942a = new Coil3ImageCacheUtil();

    /* renamed from: a */
    public final File m5202a(Context context, Object data) {
        InterfaceC4571a interfaceC4571aMo1650a;
        InterfaceC4571a.c cVarMo1864b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC4574e interfaceC4574eM1929a = C4584l.m1929a(context);
        String strM9580i = new C7872e.a(context).m9600c(data).m9598a().m9580i();
        if (strM9580i == null || (interfaceC4571aMo1650a = interfaceC4574eM1929a.mo1650a()) == null || (cVarMo1864b = interfaceC4571aMo1650a.mo1864b(strM9580i)) == null) {
            return null;
        }
        try {
            File file = cVarMo1864b.getData().toFile();
            AutoCloseableKt.closeFinally(cVarMo1864b, null);
            return file;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5203b(android.content.Context r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.zykj.gallery.utils.Coil3ImageCacheUtil$getOrDownloadImageFile$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.gallery.utils.Coil3ImageCacheUtil$getOrDownloadImageFile$1 r0 = (com.zykj.gallery.utils.Coil3ImageCacheUtil$getOrDownloadImageFile$1) r0
            int r1 = r0.f5949g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5949g = r1
            goto L18
        L13:
            com.zykj.gallery.utils.Coil3ImageCacheUtil$getOrDownloadImageFile$1 r0 = new com.zykj.gallery.utils.Coil3ImageCacheUtil$getOrDownloadImageFile$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f5947e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5949g
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f5946d
            y.e r6 = (p187y.C7872e) r6
            java.lang.Object r6 = r0.f5945c
            coil3.e r6 = (coil3.InterfaceC4574e) r6
            java.lang.Object r7 = r0.f5943a
            android.content.Context r7 = (android.content.Context) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L78
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            kotlin.ResultKt.throwOnFailure(r8)
            coil3.e r8 = coil3.C4584l.m1929a(r6)
            java.io.File r2 = r5.m5202a(r6, r7)
            if (r2 == 0) goto L4b
            return r2
        L4b:
            y.e$a r2 = new y.e$a
            r2.<init>(r6)
            y.e$a r2 = r2.m9600c(r7)
            y.e r2 = r2.m9598a()
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.f5943a = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
            r0.f5944b = r6
            r0.f5945c = r8
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r0.f5946d = r6
            r0.f5949g = r3
            java.lang.Object r6 = r8.mo1652c(r2, r0)
            if (r6 != r1) goto L75
            return r1
        L75:
            r4 = r8
            r8 = r6
            r6 = r4
        L78:
            y.j r8 = (p187y.InterfaceC7877j) r8
            boolean r7 = r8 instanceof p187y.C7884q
            r0 = 0
            if (r7 == 0) goto La7
            y.q r8 = (p187y.C7884q) r8
            java.lang.String r7 = r8.m9673c()
            if (r7 != 0) goto L88
            return r0
        L88:
            coil3.disk.a r6 = r6.mo1650a()
            if (r6 == 0) goto La7
            coil3.disk.a$c r6 = r6.mo1864b(r7)
            if (r6 == 0) goto La7
            okio.Path r7 = r6.getData()     // Catch: java.lang.Throwable -> La0
            java.io.File r7 = r7.toFile()     // Catch: java.lang.Throwable -> La0
            kotlin.jdk7.AutoCloseableKt.closeFinally(r6, r0)
            return r7
        La0:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> La2
        La2:
            r8 = move-exception
            kotlin.jdk7.AutoCloseableKt.closeFinally(r6, r7)
            throw r8
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.gallery.utils.Coil3ImageCacheUtil.m5203b(android.content.Context, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/gallery/utils/Coil3ImageCacheUtil.smali:188
    }

    /* renamed from: c */
    public final void m5204c(Context context, List urls) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(urls, "urls");
        InterfaceC4571a interfaceC4571aMo1650a = C4584l.m1929a(context).mo1650a();
        if (interfaceC4571aMo1650a == null) {
            return;
        }
        Iterator it = urls.iterator();
        while (it.hasNext()) {
            String strM9580i = new C7872e.a(context).m9600c((String) it.next()).m9598a().m9580i();
            if (strM9580i != null) {
                interfaceC4571aMo1650a.remove(strM9580i);
            }
        }
    }
}
