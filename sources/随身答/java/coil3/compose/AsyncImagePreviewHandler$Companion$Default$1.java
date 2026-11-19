package coil3.compose;

/* loaded from: classes3.dex */
public final class AsyncImagePreviewHandler$Companion$Default$1 implements AsyncImagePreviewHandler {

    /* renamed from: c */
    public static final AsyncImagePreviewHandler$Companion$Default$1 f2797c = new AsyncImagePreviewHandler$Companion$Default$1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil3.compose.AsyncImagePreviewHandler
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2657a(coil3.InterfaceC5328e r5, p297y.C9924e r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1
            if (r0 == 0) goto L13
            r0 = r7
            coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 r0 = (coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1) r0
            int r1 = r0.f2801d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2801d = r1
            goto L18
        L13:
            coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1 r0 = new coil3.compose.AsyncImagePreviewHandler$Companion$Default$1$handle$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f2799b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f2801d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.f2798a
            r6 = r5
            y.e r6 = (p297y.C9924e) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L44
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f2798a = r6
            r0.f2801d = r3
            java.lang.Object r7 = r5.mo2547c(r6, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            y.j r7 = (p297y.InterfaceC9929j) r7
            boolean r5 = r7 instanceof p297y.C9936q
            r0 = 2
            r1 = 0
            r2 = 0
            if (r5 == 0) goto L61
            coil3.compose.AsyncImagePainter$c$d r5 = new coil3.compose.AsyncImagePainter$c$d
            y.q r7 = (p297y.C9936q) r7
            k.j r3 = r7.m17120c()
            android.content.Context r6 = r6.m17019c()
            androidx.compose.ui.graphics.painter.Painter r6 = p163l.AbstractC8859e.m13713b(r3, r6, r1, r0, r2)
            r5.<init>(r6, r7)
            return r5
        L61:
            boolean r5 = r7 instanceof p297y.C9923d
            if (r5 == 0) goto L7b
            coil3.compose.AsyncImagePainter$c$b r5 = new coil3.compose.AsyncImagePainter$c$b
            y.d r7 = (p297y.C9923d) r7
            k.j r3 = r7.m17013b()
            if (r3 == 0) goto L77
            android.content.Context r6 = r6.m17019c()
            androidx.compose.ui.graphics.painter.Painter r2 = p163l.AbstractC8859e.m13713b(r3, r6, r1, r0, r2)
        L77:
            r5.<init>(r2, r7)
            return r5
        L7b:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePreviewHandler$Companion$Default$1.mo2657a(coil3.e, y.e, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
