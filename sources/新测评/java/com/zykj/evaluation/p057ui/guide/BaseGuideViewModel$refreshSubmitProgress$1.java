package com.zykj.evaluation.p057ui.guide;

import com.zykj.evaluation.bean.ExamProgress;
import com.zykj.evaluation.bean.GuideTaskInfo;
import com.zykj.http.bean.ApiResp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p189o5.AbstractC8711g;
import p200p5.InterfaceC8843j;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.guide.BaseGuideViewModel$refreshSubmitProgress$1", m13596f = "BaseGuideViewModel.kt", m13597i = {0, 0}, m13598l = {80}, m13599m = "invokeSuspend", m13600n = {"it", "$i$a$-let-BaseGuideViewModel$refreshSubmitProgress$1$1"}, m13601s = {"J$0", "I$0"})
/* loaded from: classes4.dex */
public final class BaseGuideViewModel$refreshSubmitProgress$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public long f9552a;

    /* renamed from: b */
    public int f9553b;

    /* renamed from: c */
    public Object f9554c;

    /* renamed from: d */
    public int f9555d;

    /* renamed from: e */
    public final /* synthetic */ BaseGuideViewModel f9556e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGuideViewModel$refreshSubmitProgress$1(BaseGuideViewModel baseGuideViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9556e = baseGuideViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseGuideViewModel$refreshSubmitProgress$1(this.f9556e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BaseGuideViewModel baseGuideViewModel;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9555d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            GuideTaskInfo guideTaskInfo = this.f9556e.getGuideTaskInfo();
            if (guideTaskInfo != null) {
                long examId = guideTaskInfo.getExamId();
                BaseGuideViewModel baseGuideViewModel2 = this.f9556e;
                InterfaceC8843j interfaceC8843j = baseGuideViewModel2.androidx.core.app.NotificationCompat.CATEGORY_SERVICE java.lang.String;
                this.f9554c = baseGuideViewModel2;
                this.f9552a = examId;
                this.f9553b = 0;
                this.f9555d = 1;
                Object objM14821c = interfaceC8843j.m14821c(examId, this);
                if (objM14821c == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseGuideViewModel = baseGuideViewModel2;
                obj = objM14821c;
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        baseGuideViewModel = (BaseGuideViewModel) this.f9554c;
        ResultKt.throwOnFailure(obj);
        baseGuideViewModel.m9771A((ExamProgress) AbstractC8711g.m14346a((ApiResp) obj));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BaseGuideViewModel$refreshSubmitProgress$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
