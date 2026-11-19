package com.zykj.evaluation.p057ui.detail.revising;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.revising.RevisingDetailViewModel$commitAndChangeQuestionToNext$1", m13596f = "RevisingDetailViewModel.kt", m13597i = {}, m13598l = {458}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class RevisingDetailViewModel$commitAndChangeQuestionToNext$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9344a;

    /* renamed from: b */
    public final /* synthetic */ RevisingDetailViewModel f9345b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f9346c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevisingDetailViewModel$commitAndChangeQuestionToNext$1(RevisingDetailViewModel revisingDetailViewModel, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f9345b = revisingDetailViewModel;
        this.f9346c = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RevisingDetailViewModel$commitAndChangeQuestionToNext$1(this.f9345b, this.f9346c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9344a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            RevisingDetailViewModel revisingDetailViewModel = this.f9345b;
            Function0 function0 = this.f9346c;
            this.f9344a = 1;
            if (revisingDetailViewModel.m9298p(function0, this) == coroutine_suspended) {
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
        return ((RevisingDetailViewModel$commitAndChangeQuestionToNext$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
