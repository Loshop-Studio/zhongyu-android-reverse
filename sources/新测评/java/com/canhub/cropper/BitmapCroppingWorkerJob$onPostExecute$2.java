package com.canhub.cropper;

import com.canhub.cropper.BitmapCroppingWorkerJob;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 0, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", m13596f = "BitmapCroppingWorkerJob.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$onPostExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3898a;

    /* renamed from: b */
    public /* synthetic */ Object f3899b;

    /* renamed from: c */
    public final /* synthetic */ BitmapCroppingWorkerJob f3900c;

    /* renamed from: d */
    public final /* synthetic */ BitmapCroppingWorkerJob.C5408a f3901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$onPostExecute$2(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, BitmapCroppingWorkerJob.C5408a c5408a, Continuation continuation) {
        super(2, continuation);
        this.f3900c = bitmapCroppingWorkerJob;
        this.f3901d = c5408a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapCroppingWorkerJob$onPostExecute$2 bitmapCroppingWorkerJob$onPostExecute$2 = new BitmapCroppingWorkerJob$onPostExecute$2(this.f3900c, this.f3901d, continuation);
        bitmapCroppingWorkerJob$onPostExecute$2.f3899b = obj;
        return bitmapCroppingWorkerJob$onPostExecute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CropImageView cropImageView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f3898a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3899b;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (CoroutineScopeKt.isActive(coroutineScope) && (cropImageView = (CropImageView) this.f3900c.f3875b.get()) != null) {
            BitmapCroppingWorkerJob.C5408a c5408a = this.f3901d;
            booleanRef.element = true;
            cropImageView.m3842l(c5408a);
        }
        if (!booleanRef.element && this.f3901d.m3773a() != null) {
            this.f3901d.m3773a().recycle();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapCroppingWorkerJob$onPostExecute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
