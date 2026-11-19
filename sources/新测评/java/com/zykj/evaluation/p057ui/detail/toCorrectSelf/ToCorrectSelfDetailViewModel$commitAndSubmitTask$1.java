package com.zykj.evaluation.p057ui.detail.toCorrectSelf;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel$commitAndSubmitTask$1", m13596f = "ToCorrectSelfDetailViewModel.kt", m13597i = {}, m13598l = {397, 398}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectSelfDetailViewModel$commitAndSubmitTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9453a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectSelfDetailViewModel f9454b;

    /* renamed from: c */
    public final /* synthetic */ Function0 f9455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectSelfDetailViewModel$commitAndSubmitTask$1(ToCorrectSelfDetailViewModel toCorrectSelfDetailViewModel, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f9454b = toCorrectSelfDetailViewModel;
        this.f9455c = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectSelfDetailViewModel$commitAndSubmitTask$1(this.f9454b, this.f9455c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (com.zykj.evaluation.submit.SubmitTaskManger.m8798l(r3, r4, r6, r8, null, null, r11, 24, null) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f9453a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.throwOnFailure(r15)
            r11 = r14
            goto L68
        L13:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1b:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L2e
        L1f:
            kotlin.ResultKt.throwOnFailure(r15)
            com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel r15 = r14.f9454b
            r14.f9453a = r3
            java.lang.Object r15 = com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel.m9694B0(r15, r14)
            if (r15 != r0) goto L2e
            r11 = r14
            goto L67
        L2e:
            com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel r15 = r14.f9454b
            com.zykj.evaluation.submit.SubmitTaskManger r3 = com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel.m9701I0(r15)
            com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel r15 = r14.f9454b
            kotlinx.coroutines.flow.MutableStateFlow r15 = com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel.m9702J0(r15)
            java.lang.Object r15 = r15.getValue()
            com.zykj.message.server.bean.UserInfo r15 = (com.zykj.message.server.bean.UserInfo) r15
            java.lang.Long r15 = r15.m10602a()
            java.lang.String r1 = "getId(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r1)
            long r4 = r15.longValue()
            com.zykj.evaluation.ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel r15 = r14.f9454b
            long r6 = r15.m9271N()
            com.zykj.evaluation.bean.TaskState$ToCorrect r15 = com.zykj.evaluation.bean.TaskState.ToCorrect.INSTANCE
            int r8 = r15.getState()
            r14.f9453a = r2
            r9 = 0
            r10 = 0
            r12 = 24
            r13 = 0
            r11 = r14
            java.lang.Object r15 = com.zykj.evaluation.submit.SubmitTaskManger.m8798l(r3, r4, r6, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L68
        L67:
            return r0
        L68:
            kotlin.jvm.functions.Function0 r15 = r11.f9455c
            r15.invoke()
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel$commitAndSubmitTask$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrectSelf/ToCorrectSelfDetailViewModel$commitAndSubmitTask$1.smali:138
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ToCorrectSelfDetailViewModel$commitAndSubmitTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
