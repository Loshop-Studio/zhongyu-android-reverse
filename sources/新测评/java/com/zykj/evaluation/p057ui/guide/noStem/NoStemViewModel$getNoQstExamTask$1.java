package com.zykj.evaluation.p057ui.guide.noStem;

import com.zykj.evaluation.bean.ExamProgress;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.http.bean.ApiResp;
import com.zykj.http.exception.RemoteCodeException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.noStem.NoStemViewModel$getNoQstExamTask$1", m13596f = "NoStemViewModel.kt", m13597i = {}, m13598l = {99, 106}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes4.dex */
public final class NoStemViewModel$getNoQstExamTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9575a;

    /* renamed from: b */
    public int f9576b;

    /* renamed from: c */
    public final /* synthetic */ NoStemViewModel f9577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoStemViewModel$getNoQstExamTask$1(NoStemViewModel noStemViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9577c = noStemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NoStemViewModel$getNoQstExamTask$1(this.f9577c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        NoStemViewModel noStemViewModel;
        NoStemViewModel noStemViewModel2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9576b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            noStemViewModel = this.f9577c;
            InterfaceC8843j interfaceC8843j = noStemViewModel.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            long jM9776q = this.f9577c.m9776q();
            this.f9575a = noStemViewModel;
            this.f9576b = 1;
            obj = interfaceC8843j.m14832n(jM9776q, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            noStemViewModel2 = (NoStemViewModel) this.f9575a;
            ResultKt.throwOnFailure(obj);
            ExamProgress examProgress = (ExamProgress) AbstractC8711g.m14346a((ApiResp) obj);
            this.f9577c.m9771A(examProgress);
            noStemViewModel2.m9784y(examProgress);
            return Unit.INSTANCE;
        }
        noStemViewModel = (NoStemViewModel) this.f9575a;
        ResultKt.throwOnFailure(obj);
        GuideTaskInfo guideTaskInfo = (GuideTaskInfo) AbstractC8711g.m14346a((ApiResp) obj);
        this.f9577c.m9835e0(guideTaskInfo);
        noStemViewModel.m9780u(guideTaskInfo);
        GuideTaskInfo guideTaskInfo2 = this.f9577c.getGuideTaskInfo();
        if (guideTaskInfo2 != null && guideTaskInfo2.isRepresentative()) {
            NoStemViewModel noStemViewModel3 = this.f9577c;
            InterfaceC8843j interfaceC8843j2 = noStemViewModel3.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
            GuideTaskInfo guideTaskInfo3 = this.f9577c.getGuideTaskInfo();
            Intrinsics.checkNotNull(guideTaskInfo3);
            long examId = guideTaskInfo3.getExamId();
            this.f9575a = noStemViewModel3;
            this.f9576b = 2;
            Object objM14821c = interfaceC8843j2.m14821c(examId, this);
            if (objM14821c != coroutine_suspended) {
                noStemViewModel2 = noStemViewModel3;
                obj = objM14821c;
                ExamProgress examProgress2 = (ExamProgress) AbstractC8711g.m14346a((ApiResp) obj);
                this.f9577c.m9771A(examProgress2);
                noStemViewModel2.m9784y(examProgress2);
            }
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((NoStemViewModel$getNoQstExamTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
