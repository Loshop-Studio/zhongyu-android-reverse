package com.canhub.cropper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", m13596f = "BitmapLoadingWorkerJob.kt", m13597i = {}, m13598l = {52, 66}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3926a;

    /* renamed from: b */
    public /* synthetic */ Object f3927b;

    /* renamed from: c */
    public final /* synthetic */ BitmapLoadingWorkerJob f3928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$start$1(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, Continuation continuation) {
        super(2, continuation);
        this.f3928c = bitmapLoadingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapLoadingWorkerJob$start$1 bitmapLoadingWorkerJob$start$1 = new BitmapLoadingWorkerJob$start$1(this.f3928c, continuation);
        bitmapLoadingWorkerJob$start$1.f3927b = obj;
        return bitmapLoadingWorkerJob$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (r0.m3784h(r5, r13) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r14.m3784h(r3, r13) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        return r1;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r13.f3926a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L24
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r14)
            goto Lab
        L13:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1b:
            kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Exception -> L20
            goto Lab
        L20:
            r0 = move-exception
            r14 = r0
            r10 = r14
            goto L92
        L24:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.f3927b
            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
            boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r14)     // Catch: java.lang.Exception -> L20
            if (r0 == 0) goto Lab
            com.canhub.cropper.a r0 = com.canhub.cropper.C5435a.f4159a     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r4 = r13.f3928c     // Catch: java.lang.Exception -> L20
            android.content.Context r4 = com.canhub.cropper.BitmapLoadingWorkerJob.m3777a(r4)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r5 = r13.f3928c     // Catch: java.lang.Exception -> L20
            android.net.Uri r5 = r5.m3783g()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r6 = r13.f3928c     // Catch: java.lang.Exception -> L20
            int r6 = com.canhub.cropper.BitmapLoadingWorkerJob.m3780d(r6)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r7 = r13.f3928c     // Catch: java.lang.Exception -> L20
            int r7 = com.canhub.cropper.BitmapLoadingWorkerJob.m3779c(r7)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.a$a r4 = r0.m3933l(r4, r5, r6, r7)     // Catch: java.lang.Exception -> L20
            boolean r14 = kotlinx.coroutines.CoroutineScopeKt.isActive(r14)     // Catch: java.lang.Exception -> L20
            if (r14 == 0) goto Lab
            android.graphics.Bitmap r14 = r4.m3948a()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r5 = r13.f3928c     // Catch: java.lang.Exception -> L20
            android.content.Context r5 = com.canhub.cropper.BitmapLoadingWorkerJob.m3777a(r5)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r6 = r13.f3928c     // Catch: java.lang.Exception -> L20
            android.net.Uri r6 = r6.m3783g()     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.a$b r14 = r0.m3915E(r14, r5, r6)     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob r0 = r13.f3928c     // Catch: java.lang.Exception -> L20
            com.canhub.cropper.BitmapLoadingWorkerJob$a r5 = new com.canhub.cropper.BitmapLoadingWorkerJob$a     // Catch: java.lang.Exception -> L20
            android.net.Uri r6 = r0.m3783g()     // Catch: java.lang.Exception -> L20
            android.graphics.Bitmap r7 = r14.m3950a()     // Catch: java.lang.Exception -> L20
            int r8 = r4.m3949b()     // Catch: java.lang.Exception -> L20
            int r9 = r14.m3951b()     // Catch: java.lang.Exception -> L20
            boolean r10 = r14.m3952c()     // Catch: java.lang.Exception -> L20
            boolean r11 = r14.m3953d()     // Catch: java.lang.Exception -> L20
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L20
            r13.f3926a = r3     // Catch: java.lang.Exception -> L20
            java.lang.Object r14 = com.canhub.cropper.BitmapLoadingWorkerJob.m3781e(r0, r5, r13)     // Catch: java.lang.Exception -> L20
            if (r14 != r1) goto Lab
            goto Laa
        L92:
            com.canhub.cropper.BitmapLoadingWorkerJob r14 = r13.f3928c
            com.canhub.cropper.BitmapLoadingWorkerJob$a r3 = new com.canhub.cropper.BitmapLoadingWorkerJob$a
            android.net.Uri r4 = r14.m3783g()
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r13.f3926a = r2
            java.lang.Object r14 = com.canhub.cropper.BitmapLoadingWorkerJob.m3781e(r14, r3, r13)
            if (r14 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapLoadingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapLoadingWorkerJob$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
