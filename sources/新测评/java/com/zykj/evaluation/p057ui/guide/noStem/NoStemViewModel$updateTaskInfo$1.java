package com.zykj.evaluation.p057ui.guide.noStem;

import com.zykj.evaluation.bean.GuideTaskInfo;
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
import p122i6.AbstractC7668a;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$updateTaskInfo$1", m13596f = "NoStemViewModel.kt", m13597i = {0, 0, 0}, m13598l = {261}, m13599m = "invokeSuspend", m13600n = {"userId", "taskId", "state"}, m13601s = {"L$0", "J$0", "I$0"})
/* loaded from: classes4.dex */
public final class NoStemViewModel$updateTaskInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9604a;

    /* renamed from: b */
    public long f9605b;

    /* renamed from: c */
    public int f9606c;

    /* renamed from: d */
    public int f9607d;

    /* renamed from: e */
    public final /* synthetic */ NoStemViewModel f9608e;

    /* renamed from: f */
    public final /* synthetic */ GuideTaskInfo f9609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel$updateTaskInfo$1(NoStemViewModel noStemViewModel, GuideTaskInfo guideTaskInfo, Continuation continuation) {
        super(2, continuation);
        this.f9608e = noStemViewModel;
        this.f9609f = guideTaskInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NoStemViewModel$updateTaskInfo$1(this.f9608e, this.f9609f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NoStemViewModel$updateTaskInfo$1 noStemViewModel$updateTaskInfo$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9607d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            this.f9608e.m9772B(this.f9609f);
            Long lM10602a = ((UserInfo) this.f9608e.userInfo.getValue()).m10602a();
            long id = this.f9609f.getId();
            int state = this.f9609f.getState();
            NoStemViewModel noStemViewModel = this.f9608e;
            Intrinsics.checkNotNull(lM10602a);
            long jLongValue = lM10602a.longValue();
            this.f9604a = SpillingKt.nullOutSpilledVariable(lM10602a);
            this.f9605b = id;
            this.f9606c = state;
            this.f9607d = 1;
            noStemViewModel$updateTaskInfo$1 = this;
            if (noStemViewModel.m9829X(jLongValue, id, state, noStemViewModel$updateTaskInfo$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            noStemViewModel$updateTaskInfo$1 = this;
        }
        NoStemViewModel noStemViewModel2 = noStemViewModel$updateTaskInfo$1.f9608e;
        noStemViewModel2.m9831Z(noStemViewModel2.m9827V().m12879a(AbstractC7668a.m12806b(noStemViewModel$updateTaskInfo$1.f9609f.getGroups(), noStemViewModel$updateTaskInfo$1.f9609f.getEnableScore(), noStemViewModel$updateTaskInfo$1.f9608e.localAnswerMap)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NoStemViewModel$updateTaskInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
