package com.canhub.cropper;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", m17801f = "BitmapLoadingWorkerJob.kt", m17802l = {52, 66}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob$start$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f3359a;

    /* renamed from: b */
    public /* synthetic */ Object f3360b;

    /* renamed from: c */
    public final /* synthetic */ BitmapLoadingWorkerJob f3361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$start$1(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f3361c = bitmapLoadingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BitmapLoadingWorkerJob$start$1 bitmapLoadingWorkerJob$start$1 = new BitmapLoadingWorkerJob$start$1(this.f3361c, interfaceC9324c);
        bitmapLoadingWorkerJob$start$1.f3360b = obj;
        return bitmapLoadingWorkerJob$start$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BitmapLoadingWorkerJob$start$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r0.m3228h(r5, r13) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r14.m3228h(r3, r13) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r0 = r13.f3359a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            kotlin.AbstractC9079b.m15926b(r14)
            goto Lab
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            kotlin.AbstractC9079b.m15926b(r14)     // Catch: java.lang.Exception -> L20
            goto Lab
        L20:
            r0 = move-exception
            r14 = r0
            r10 = r14
            goto L92
        L24:
            kotlin.AbstractC9079b.m15926b(r14)
            java.lang.Object r14 = r13.f3360b
            i8.b0 r14 = (p135i8.InterfaceC8822b0) r14
            boolean r0 = kotlinx.coroutines.AbstractC9165e.m16558g(r14)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto Lab
            com.canhub.cropper.a r0 = com.canhub.cropper.C5484a.f3592a     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r4 = r13.f3361c     // Catch: java.lang.Exception -> L20
            android.content.Context r4 = com.canhub.cropper.BitmapLoadingWorkerJob.m3221a(r4)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r5 = r13.f3361c     // Catch: java.lang.Exception -> L20
            android.net.Uri r5 = r5.m3227g()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r6 = r13.f3361c     // Catch: java.lang.Exception -> L20
            int r6 = com.canhub.cropper.BitmapLoadingWorkerJob.m3224d(r6)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r7 = r13.f3361c     // Catch: java.lang.Exception -> L20
            int r7 = com.canhub.cropper.BitmapLoadingWorkerJob.m3223c(r7)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.a$a r4 = r0.m3377l(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L20
            boolean r14 = kotlinx.coroutines.AbstractC9165e.m16558g(r14)     // Catch: java.lang.Exception -> L20
            if (r14 == 0) goto Lab
            android.graphics.Bitmap r14 = r4.m3392a()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r5 = r13.f3361c     // Catch: java.lang.Exception -> L20
            android.content.Context r5 = com.canhub.cropper.BitmapLoadingWorkerJob.m3221a(r5)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r6 = r13.f3361c     // Catch: java.lang.Exception -> L20
            android.net.Uri r6 = r6.m3227g()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.a$b r14 = r0.m3359E(r14, r5, r6)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r0 = r13.f3361c     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob$a r5 = new com.canhub.cropper.BitmapLoadingWorkerJob$a     // Catch: java.lang.Exception -> L20
            android.net.Uri r6 = r0.m3227g()     // Catch: java.lang.Exception -> L20
            android.graphics.Bitmap r7 = r14.m3394a()     // Catch: java.lang.Exception -> L20
            int r8 = r4.m3393b()     // Catch: java.lang.Exception -> L20
            int r9 = r14.m3395b()     // Catch: java.lang.Exception -> L20
            boolean r10 = r14.m3396c()     // Catch: java.lang.Exception -> L20
            boolean r11 = r14.m3397d()     // Catch: java.lang.Exception -> L20
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L20
            r13.f3359a = r3     // Catch: java.lang.Exception -> L20
            java.lang.Object r14 = com.canhub.cropper.BitmapLoadingWorkerJob.m3225e(r0, r5, r13)     // Catch: java.lang.Exception -> L20
            if (r14 != r1) goto Lab
            goto Laa
        L92:
            com.canhub.cropper.BitmapLoadingWorkerJob r14 = r13.f3361c
            com.canhub.cropper.BitmapLoadingWorkerJob$a r3 = new com.canhub.cropper.BitmapLoadingWorkerJob$a
            android.net.Uri r4 = r14.m3227g()
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13.f3359a = r2
            java.lang.Object r14 = com.canhub.cropper.BitmapLoadingWorkerJob.m3225e(r14, r3, r13)
            if (r14 != r1) goto Lab
        Laa:
            return r1
        Lab:
            h7.p r14 = p123h7.C8736p.f16368a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapLoadingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
