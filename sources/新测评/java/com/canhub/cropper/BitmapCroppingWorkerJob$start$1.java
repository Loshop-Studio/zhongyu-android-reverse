package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.C5435a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", m13596f = "BitmapCroppingWorkerJob.kt", m13597i = {}, m13598l = {76, 115}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$start$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3902a;

    /* renamed from: b */
    public /* synthetic */ Object f3903b;

    /* renamed from: c */
    public final /* synthetic */ BitmapCroppingWorkerJob f3904c;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", m13596f = "BitmapCroppingWorkerJob.kt", m13597i = {}, m13598l = {104}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1 */
    public static final class C54091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f3905a;

        /* renamed from: b */
        public final /* synthetic */ BitmapCroppingWorkerJob f3906b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f3907c;

        /* renamed from: d */
        public final /* synthetic */ C5435a.a f3908d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C54091(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, Bitmap bitmap, C5435a.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f3906b = bitmapCroppingWorkerJob;
            this.f3907c = bitmap;
            this.f3908d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C54091(this.f3906b, this.f3907c, this.f3908d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f3905a;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Uri uriM3920J = C5435a.f4159a.m3920J(this.f3906b.f3874a, this.f3907c, this.f3906b.f3890q, this.f3906b.f3891r, this.f3906b.f3892s);
                BitmapCroppingWorkerJob bitmapCroppingWorkerJob = this.f3906b;
                BitmapCroppingWorkerJob.C5408a c5408a = new BitmapCroppingWorkerJob.C5408a(this.f3907c, uriM3920J, null, this.f3908d.m3949b());
                this.f3905a = 1;
                if (bitmapCroppingWorkerJob.m3771v(c5408a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C54091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$start$1(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, Continuation continuation) {
        super(2, continuation);
        this.f3904c = bitmapCroppingWorkerJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapCroppingWorkerJob$start$1 bitmapCroppingWorkerJob$start$1 = new BitmapCroppingWorkerJob$start$1(this.f3904c, continuation);
        bitmapCroppingWorkerJob$start$1.f3903b = obj;
        return bitmapCroppingWorkerJob$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
    
        if (r6.m3771v(r7, r21) != r2) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.BitmapCroppingWorkerJob$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapCroppingWorkerJob$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
