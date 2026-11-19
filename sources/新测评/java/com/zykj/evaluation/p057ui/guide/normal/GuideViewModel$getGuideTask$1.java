package com.zykj.evaluation.p057ui.guide.normal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.normal.GuideViewModel$getGuideTask$1", m13596f = "GuideViewModel.kt", m13597i = {1, 1}, m13598l = {117, 121, 128}, m13599m = "invokeSuspend", m13600n = {"it", "$i$a$-let-GuideViewModel$getGuideTask$1$1"}, m13601s = {"L$1", "I$0"})
/* loaded from: classes4.dex */
public final class GuideViewModel$getGuideTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9628a;

    /* renamed from: b */
    public Object f9629b;

    /* renamed from: c */
    public int f9630c;

    /* renamed from: d */
    public int f9631d;

    /* renamed from: e */
    public final /* synthetic */ GuideViewModel f9632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideViewModel$getGuideTask$1(GuideViewModel guideViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9632e = guideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GuideViewModel$getGuideTask$1(this.f9632e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws com.zykj.http.exception.RemoteCodeException {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f9631d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L36
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.lang.Object r0 = r6.f9628a
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r0 = (com.zykj.evaluation.p057ui.guide.normal.GuideViewModel) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L9d
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            java.lang.Object r1 = r6.f9629b
            com.zykj.evaluation.bean.GuideTaskInfo r1 = (com.zykj.evaluation.bean.GuideTaskInfo) r1
            java.lang.Object r3 = r6.f9628a
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r3 = (com.zykj.evaluation.p057ui.guide.normal.GuideViewModel) r3
            kotlin.ResultKt.throwOnFailure(r7)
            goto L69
        L2e:
            java.lang.Object r1 = r6.f9628a
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r1 = (com.zykj.evaluation.p057ui.guide.normal.GuideViewModel) r1
            kotlin.ResultKt.throwOnFailure(r7)
            goto L46
        L36:
            kotlin.ResultKt.throwOnFailure(r7)
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r1 = r6.f9632e
            r6.f9628a = r1
            r6.f9631d = r4
            java.lang.Object r7 = r1.mo9863S(r6)
            if (r7 != r0) goto L46
            goto L9a
        L46:
            com.zykj.evaluation.bean.GuideTaskInfo r7 = (com.zykj.evaluation.bean.GuideTaskInfo) r7
            com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9851G(r1, r7)
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r7 = r6.f9632e
            com.zykj.evaluation.bean.GuideTaskInfo r1 = com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9847C(r7)
            if (r1 == 0) goto L6c
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r7 = r6.f9632e
            com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9855K(r7, r1)
            r6.f9628a = r7
            r6.f9629b = r1
            r5 = 0
            r6.f9630c = r5
            r6.f9631d = r3
            java.lang.Object r3 = r7.mo9869Y(r1, r6)
            if (r3 != r0) goto L68
            goto L9a
        L68:
            r3 = r7
        L69:
            com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9853I(r3, r1)
        L6c:
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r7 = r6.f9632e
            com.zykj.evaluation.bean.GuideTaskInfo r7 = com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9847C(r7)
            if (r7 == 0) goto Lad
            boolean r7 = r7.isRepresentative()
            if (r7 != r4) goto Lad
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r7 = r6.f9632e
            p5.j r1 = com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9848D(r7)
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r3 = r6.f9632e
            com.zykj.evaluation.bean.GuideTaskInfo r3 = com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9847C(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            long r3 = r3.getExamId()
            r6.f9628a = r7
            r5 = 0
            r6.f9629b = r5
            r6.f9631d = r2
            java.lang.Object r1 = r1.m14821c(r3, r6)
            if (r1 != r0) goto L9b
        L9a:
            return r0
        L9b:
            r0 = r7
            r7 = r1
        L9d:
            com.zykj.http.bean.ApiResp r7 = (com.zykj.http.bean.ApiResp) r7
            java.lang.Object r7 = p189o5.AbstractC8711g.m14346a(r7)
            com.zykj.evaluation.ui.guide.normal.GuideViewModel r1 = r6.f9632e
            com.zykj.evaluation.bean.ExamProgress r7 = (com.zykj.evaluation.bean.ExamProgress) r7
            com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9854J(r1, r7)
            com.zykj.evaluation.p057ui.guide.normal.GuideViewModel.m9852H(r0, r7)
        Lad:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.guide.normal.GuideViewModel$getGuideTask$1.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/guide/normal/GuideViewModel$getGuideTask$1.smali:148
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((GuideViewModel$getGuideTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
