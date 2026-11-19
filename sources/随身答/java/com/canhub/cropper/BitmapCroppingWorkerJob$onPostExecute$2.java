package com.canhub.cropper;

import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", m13451f = "BitmapCroppingWorkerJob.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes3.dex */
public final class BitmapCroppingWorkerJob$onPostExecute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f3686a;

    /* renamed from: b */
    public /* synthetic */ Object f3687b;

    /* renamed from: c */
    public final /* synthetic */ BitmapCroppingWorkerJob f3688c;

    /* renamed from: d */
    public final /* synthetic */ BitmapCroppingWorkerJob.C5513a f3689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapCroppingWorkerJob$onPostExecute$2(BitmapCroppingWorkerJob bitmapCroppingWorkerJob, BitmapCroppingWorkerJob.C5513a c5513a, Continuation continuation) {
        super(2, continuation);
        this.f3688c = bitmapCroppingWorkerJob;
        this.f3689d = c5513a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BitmapCroppingWorkerJob$onPostExecute$2 bitmapCroppingWorkerJob$onPostExecute$2 = new BitmapCroppingWorkerJob$onPostExecute$2(this.f3688c, this.f3689d, continuation);
        bitmapCroppingWorkerJob$onPostExecute$2.f3687b = obj;
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
        if (this.f3686a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f3687b;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (CoroutineScopeKt.isActive(coroutineScope) && (cropImageView = (CropImageView) this.f3688c.f3663b.get()) != null) {
            BitmapCroppingWorkerJob.C5513a c5513a = this.f3689d;
            booleanRef.element = true;
            cropImageView.m3468l(c5513a);
        }
        if (!booleanRef.element && this.f3689d.m3399a() != null) {
            this.f3689d.m3399a().recycle();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BitmapCroppingWorkerJob$onPostExecute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
