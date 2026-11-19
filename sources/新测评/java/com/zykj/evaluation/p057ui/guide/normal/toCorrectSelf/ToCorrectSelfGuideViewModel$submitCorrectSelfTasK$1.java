package com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf;

import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.message.server.bean.UserInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1", m13596f = "ToCorrectSelfGuideViewModel.kt", m13597i = {0, 0, 0}, m13598l = {116}, m13599m = "invokeSuspend", m13600n = {"userId", "taskId", "taskState"}, m13601s = {"L$0", "J$0", "I$0"})
/* loaded from: classes4.dex */
public final class ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9688a;

    /* renamed from: b */
    public long f9689b;

    /* renamed from: c */
    public int f9690c;

    /* renamed from: d */
    public int f9691d;

    /* renamed from: e */
    public final /* synthetic */ ToCorrectSelfGuideViewModel f9692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1(ToCorrectSelfGuideViewModel toCorrectSelfGuideViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9692e = toCorrectSelfGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1(this.f9692e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9691d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Long lM10602a = ((UserInfo) this.f9692e.userInfo.getValue()).m10602a();
            long jM9776q = this.f9692e.m9776q();
            GuideTaskInfo guideTaskInfo = this.f9692e.getGuideTaskInfo();
            int state = guideTaskInfo != null ? guideTaskInfo.getState() : -1;
            SubmitTaskManger submitTaskManger = this.f9692e.submitTaskManger;
            Intrinsics.checkNotNull(lM10602a);
            long jLongValue = lM10602a.longValue();
            this.f9688a = SpillingKt.nullOutSpilledVariable(lM10602a);
            this.f9689b = jM9776q;
            this.f9690c = state;
            this.f9691d = 1;
            if (SubmitTaskManger.m8796h(submitTaskManger, jLongValue, jM9776q, state, null, null, this, 24, null) == coroutine_suspended) {
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
        return ((ToCorrectSelfGuideViewModel$submitCorrectSelfTasK$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
