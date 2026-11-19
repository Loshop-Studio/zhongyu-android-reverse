package com.canhub.cropper;

import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", m13451f = "BitmapLoadingWorkerJob.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class BitmapLoadingWorkerJob$onPostExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3710a;

    /* renamed from: b */
    public /* synthetic */ Object f3711b;

    /* renamed from: c */
    public final /* synthetic */ BitmapLoadingWorkerJob f3712c;

    /* renamed from: d */
    public final /* synthetic */ BitmapLoadingWorkerJob.C5515a f3713d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapLoadingWorkerJob$onPostExecute$2(BitmapLoadingWorkerJob bitmapLoadingWorkerJob, BitmapLoadingWorkerJob.C5515a c5515a, Continuation continuation) {
        super(2, continuation);
        this.f3712c = bitmapLoadingWorkerJob;
        this.f3713d = c5515a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapLoadingWorkerJob$onPostExecute$2 bitmapLoadingWorkerJob$onPostExecute$2 = new BitmapLoadingWorkerJob$onPostExecute$2(this.f3712c, this.f3713d, continuation);
        bitmapLoadingWorkerJob$onPostExecute$2.f3711b = obj;
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
        if (this.f3710a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3711b;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (CoroutineScopeKt.isActive(coroutineScope) && (cropImageView = (CropImageView) this.f3712c.f3701e.get()) != null) {
            BitmapLoadingWorkerJob.C5515a c5515a = this.f3713d;
            booleanRef.element = true;
            cropImageView.m3469m(c5515a);
        }
        if (!booleanRef.element && this.f3713d.m3412a() != null) {
            this.f3713d.m3412a().recycle();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapLoadingWorkerJob$onPostExecute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
