package com.canhub.cropper;

import com.canhub.cropper.BitmapLoadingWorkerJob;
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
@DebugMetadata(m13595c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", m13596f = "BitmapLoadingWorkerJob.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob$onPostExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3922a;

    /* renamed from: b */
    public /* synthetic */ Object f3923b;

    /* renamed from: c */
    public final /* synthetic */ BitmapLoadingWorkerJob f3924c;

    /* renamed from: d */
    public final /* synthetic */ BitmapLoadingWorkerJob.C5410a f3925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$onPostExecute$2(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, BitmapLoadingWorkerJob.C5410a c5410a, Continuation continuation) {
        super(2, continuation);
        this.f3924c = bitmapLoadingWorkerJob;
        this.f3925d = c5410a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapLoadingWorkerJob$onPostExecute$2 bitmapLoadingWorkerJob$onPostExecute$2 = new BitmapLoadingWorkerJob$onPostExecute$2(this.f3924c, this.f3925d, continuation);
        bitmapLoadingWorkerJob$onPostExecute$2.f3923b = obj;
        return bitmapLoadingWorkerJob$onPostExecute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CropImageView cropImageView;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f3922a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3923b;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (CoroutineScopeKt.isActive(coroutineScope) && (cropImageView = (CropImageView) this.f3924c.f3913e.get()) != null) {
            BitmapLoadingWorkerJob.C5410a c5410a = this.f3925d;
            booleanRef.element = true;
            cropImageView.m3843m(c5410a);
        }
        if (!booleanRef.element && this.f3925d.m3786a() != null) {
            this.f3925d.m3786a().recycle();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapLoadingWorkerJob$onPostExecute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
