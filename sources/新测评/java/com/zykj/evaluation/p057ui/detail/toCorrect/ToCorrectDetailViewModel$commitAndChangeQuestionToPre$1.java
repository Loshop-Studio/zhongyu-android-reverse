package com.zykj.evaluation.p057ui.detail.toCorrect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p089f6.C7459j;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1", m13596f = "ToCorrectDetailViewModel.kt", m13597i = {}, m13598l = {819, 821}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f9377a;

    /* renamed from: b */
    public final /* synthetic */ ToCorrectDetailViewModel f9378b;

    /* renamed from: c */
    public final /* synthetic */ C7459j f9379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1(ToCorrectDetailViewModel toCorrectDetailViewModel, C7459j c7459j, Continuation continuation) {
        super(2, continuation);
        this.f9378b = toCorrectDetailViewModel;
        this.f9379c = c7459j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1(this.f9378b, this.f9379c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r5.m9300q(r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f9377a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L39
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2e
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r5 = r4.f9378b
            f6.j r1 = r4.f9379c
            r4.f9377a = r3
            java.lang.Object r5 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9648B0(r5, r1, r4)
            if (r5 != r0) goto L2e
            goto L38
        L2e:
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r5 = r4.f9378b
            r4.f9377a = r2
            java.lang.Object r5 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9647A0(r5, r4)
            if (r5 != r0) goto L39
        L38:
            return r0
        L39:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1.smali:147
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ToCorrectDetailViewModel$commitAndChangeQuestionToPre$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
