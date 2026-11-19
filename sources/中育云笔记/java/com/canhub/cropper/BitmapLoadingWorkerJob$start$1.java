package com.canhub.cropper;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", m26211f = "BitmapLoadingWorkerJob.kt", m26212l = {52, 66}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob$start$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f5129c;

    /* renamed from: d */
    public /* synthetic */ Object f5130d;

    /* renamed from: e */
    public final /* synthetic */ BitmapLoadingWorkerJob f5131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$start$1(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f5131e = bitmapLoadingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BitmapLoadingWorkerJob$start$1 bitmapLoadingWorkerJob$start$1 = new BitmapLoadingWorkerJob$start$1(this.f5131e, interfaceC11588c);
        bitmapLoadingWorkerJob$start$1.f5130d = obj;
        return bitmapLoadingWorkerJob$start$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r0.m4430h(r5, r13) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r14.m4430h(r3, r13) != r1) goto L24;
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
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r0 = r13.f5129c
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            kotlin.AbstractC9924b.m20071b(r14)
            goto Lab
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            kotlin.AbstractC9924b.m20071b(r14)     // Catch: java.lang.Exception -> L20
            goto Lab
        L20:
            r0 = move-exception
            r14 = r0
            r10 = r14
            goto L92
        L24:
            kotlin.AbstractC9924b.m20071b(r14)
            java.lang.Object r14 = r13.f5130d
            sd.i0 r14 = (sd.InterfaceC11122i0) r14
            boolean r0 = kotlinx.coroutines.AbstractC10006d.m20749f(r14)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto Lab
            com.canhub.cropper.a r0 = com.canhub.cropper.C5903a.f5362a     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r4 = r13.f5131e     // Catch: java.lang.Exception -> L20
            android.content.Context r4 = com.canhub.cropper.BitmapLoadingWorkerJob.m4423a(r4)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r5 = r13.f5131e     // Catch: java.lang.Exception -> L20
            android.net.Uri r5 = r5.m4429g()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r6 = r13.f5131e     // Catch: java.lang.Exception -> L20
            int r6 = com.canhub.cropper.BitmapLoadingWorkerJob.m4426d(r6)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r7 = r13.f5131e     // Catch: java.lang.Exception -> L20
            int r7 = com.canhub.cropper.BitmapLoadingWorkerJob.m4425c(r7)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.a$a r4 = r0.m4579l(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L20
            boolean r14 = kotlinx.coroutines.AbstractC10006d.m20749f(r14)     // Catch: java.lang.Exception -> L20
            if (r14 == 0) goto Lab
            android.graphics.Bitmap r14 = r4.m4594a()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r5 = r13.f5131e     // Catch: java.lang.Exception -> L20
            android.content.Context r5 = com.canhub.cropper.BitmapLoadingWorkerJob.m4423a(r5)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r6 = r13.f5131e     // Catch: java.lang.Exception -> L20
            android.net.Uri r6 = r6.m4429g()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.a$b r14 = r0.m4561E(r14, r5, r6)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r0 = r13.f5131e     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob$a r5 = new com.canhub.cropper.BitmapLoadingWorkerJob$a     // Catch: java.lang.Exception -> L20
            android.net.Uri r6 = r0.m4429g()     // Catch: java.lang.Exception -> L20
            android.graphics.Bitmap r7 = r14.m4596a()     // Catch: java.lang.Exception -> L20
            int r8 = r4.m4595b()     // Catch: java.lang.Exception -> L20
            int r9 = r14.m4597b()     // Catch: java.lang.Exception -> L20
            boolean r10 = r14.m4598c()     // Catch: java.lang.Exception -> L20
            boolean r11 = r14.m4599d()     // Catch: java.lang.Exception -> L20
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L20
            r13.f5129c = r3     // Catch: java.lang.Exception -> L20
            java.lang.Object r14 = com.canhub.cropper.BitmapLoadingWorkerJob.m4427e(r0, r5, r13)     // Catch: java.lang.Exception -> L20
            if (r14 != r1) goto Lab
            goto Laa
        L92:
            com.canhub.cropper.BitmapLoadingWorkerJob r14 = r13.f5131e
            com.canhub.cropper.BitmapLoadingWorkerJob$a r3 = new com.canhub.cropper.BitmapLoadingWorkerJob$a
            android.net.Uri r4 = r14.m4429g()
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13.f5129c = r2
            java.lang.Object r14 = com.canhub.cropper.BitmapLoadingWorkerJob.m4427e(r14, r3, r13)
            if (r14 != r1) goto Lab
        Laa:
            return r1
        Lab:
            qc.q r14 = p309qc.C10786q.f26013a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapLoadingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BitmapLoadingWorkerJob$start$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
