package com.zykj.evaluation.p057ui.detail.toCorrect;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel$initData$1", m13596f = "ToCorrectDetailViewModel.kt", m13597i = {2, 2}, m13598l = {81, 84, 87}, m13599m = "invokeSuspend", m13600n = {"it", "$i$a$-let-ToCorrectDetailViewModel$initData$1$1"}, m13601s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nToCorrectDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToCorrectDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1099:1\n1#2:1100\n*E\n"})
/* loaded from: classes4.dex */
public final class ToCorrectDetailViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9424a;

    /* renamed from: b */
    public int f9425b;

    /* renamed from: c */
    public int f9426c;

    /* renamed from: d */
    public final /* synthetic */ ToCorrectDetailViewModel f9427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToCorrectDetailViewModel$initData$1(ToCorrectDetailViewModel toCorrectDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9427d = toCorrectDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToCorrectDetailViewModel$initData$1(this.f9427d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r1.m9275R(r6, r5) != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f9426c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r5.f9424a
            com.zykj.evaluation.ui.detail.GuideQuestion r0 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r0
            kotlin.ResultKt.throwOnFailure(r6)
            goto L6c
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L21:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L25:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L37
        L29:
            kotlin.ResultKt.throwOnFailure(r6)
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r6 = r5.f9427d
            r5.f9426c = r4
            java.lang.Object r6 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9649C0(r6, r5)
            if (r6 != r0) goto L37
            goto L6b
        L37:
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r6 = r5.f9427d
            r5.f9426c = r3
            java.lang.Object r6 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9655I0(r6, r5)
            if (r6 != r0) goto L42
            goto L6b
        L42:
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r6 = r5.f9427d
            java.util.List r6 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9651E0(r6)
            if (r6 == 0) goto L6c
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r1 = r5.f9427d
            int r1 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9650D0(r1)
            java.lang.Object r6 = kotlin.collections.CollectionsKt.getOrNull(r6, r1)
            com.zykj.evaluation.ui.detail.GuideQuestion r6 = (com.zykj.evaluation.p057ui.detail.GuideQuestion) r6
            if (r6 == 0) goto L6c
            com.zykj.evaluation.ui.detail.toCorrect.ToCorrectDetailViewModel r1 = r5.f9427d
            java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r5.f9424a = r3
            r3 = 0
            r5.f9425b = r3
            r5.f9426c = r2
            java.lang.Object r6 = com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel.m9652F0(r1, r6, r5)
            if (r6 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel$initData$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/toCorrect/ToCorrectDetailViewModel$initData$1.smali:152
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ToCorrectDetailViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
