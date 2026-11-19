package com.zykj.evaluation.p057ui.detail;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$setRightMaskVisible$1", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$setRightMaskVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9170a;

    /* renamed from: b */
    public final /* synthetic */ BaseDetailViewModel f9171b;

    /* renamed from: c */
    public final /* synthetic */ boolean f9172c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$setRightMaskVisible$1(BaseDetailViewModel baseDetailViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f9171b = baseDetailViewModel;
        this.f9172c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDetailViewModel$setRightMaskVisible$1(this.f9171b, this.f9172c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9170a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BaseDetailViewModel baseDetailViewModel = this.f9171b;
        baseDetailViewModel.m9289h0(C6897b.m9427b(baseDetailViewModel.m9312w(), null, null, null, null, false, null, null, false, false, null, this.f9172c, null, null, null, false, false, null, null, 0L, null, 1047551, null));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseDetailViewModel$setRightMaskVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
