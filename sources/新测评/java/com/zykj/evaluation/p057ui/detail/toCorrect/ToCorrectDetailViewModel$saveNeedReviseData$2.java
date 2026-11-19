package com.zykj.evaluation.p057ui.detail.toCorrect;

import com.zykj.evaluation.utils.CorrectCommitManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p101g7.C7589e;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$saveNeedReviseData$2", m13596f = "ToCorrectDetailViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectDetailViewModel$saveNeedReviseData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9430a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectDetailViewModel f9431b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectDetailViewModel$saveNeedReviseData$2(ToCorrectDetailViewModel toCorrectDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9431b = toCorrectDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectDetailViewModel$saveNeedReviseData$2(this.f9431b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f9430a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        CorrectCommitManager.f10538a.m10523b(this.f9431b.isQuestionNeedReviseList, this.f9431b.m9268K().m12467m(C7589e.f12717d.m12473a()));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ToCorrectDetailViewModel$saveNeedReviseData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
