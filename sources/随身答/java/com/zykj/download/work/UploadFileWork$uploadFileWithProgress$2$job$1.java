package com.zykj.download.work;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.download.work.UploadFileWork$uploadFileWithProgress$2$job$1", m13451f = "UploadFileWork.kt", m13452i = {}, m13453l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes4.dex */
public final class UploadFileWork$uploadFileWithProgress$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9972a;

    /* renamed from: b */
    public /* synthetic */ Object f9973b;

    /* renamed from: c */
    public final /* synthetic */ UploadFileWork f9974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadFileWork$uploadFileWithProgress$2$job$1(UploadFileWork uploadFileWork, Continuation continuation) {
        super(2, continuation);
        this.f9974c = uploadFileWork;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UploadFileWork$uploadFileWithProgress$2$job$1 uploadFileWork$uploadFileWithProgress$2$job$1 = new UploadFileWork$uploadFileWithProgress$2$job$1(this.f9974c, continuation);
        uploadFileWork$uploadFileWithProgress$2$job$1.f9973b = obj;
        return uploadFileWork$uploadFileWithProgress$2$job$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f9972a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f9973b;
            UploadFileWork uploadFileWork = this.f9974c;
            this.f9972a = 1;
            if (uploadFileWork.sendSpeedAndProgress(coroutineScope, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((UploadFileWork$uploadFileWithProgress$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
