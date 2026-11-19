package com.zykj.evaluation.p057ui.detail;

import java.util.List;
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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$refreshData$1", m13596f = "BaseDetailViewModel.kt", m13597i = {}, m13598l = {562}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class BaseDetailViewModel$refreshData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9125a;

    /* renamed from: b */
    public final /* synthetic */ BaseDetailViewModel f9126b;

    /* renamed from: c */
    public final /* synthetic */ List f9127c;

    /* renamed from: d */
    public final /* synthetic */ GuideQuestion f9128d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDetailViewModel$refreshData$1(BaseDetailViewModel baseDetailViewModel, List list, GuideQuestion guideQuestion, Continuation continuation) {
        super(2, continuation);
        this.f9126b = baseDetailViewModel;
        this.f9127c = list;
        this.f9128d = guideQuestion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseDetailViewModel$refreshData$1(this.f9126b, this.f9127c, this.f9128d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9125a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            BaseDetailViewModel baseDetailViewModel = this.f9126b;
            baseDetailViewModel.mo9317y0(this.f9127c, baseDetailViewModel.getMCurrentIndex());
            BaseDetailViewModel baseDetailViewModel2 = this.f9126b;
            GuideQuestion guideQuestion = this.f9128d;
            this.f9125a = 1;
            if (baseDetailViewModel2.m9275R(guideQuestion, this) == coroutine_suspended) {
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
        return ((BaseDetailViewModel$refreshData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
