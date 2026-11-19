package com.zykj.evaluation.p057ui.detail.correcting;

import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.correcting.CorrectingDetailViewModel$initData$1", m13596f = "CorrectingDetailViewModel.kt", m13597i = {0, 0}, m13598l = {40}, m13599m = "invokeSuspend", m13600n = {"it", "$i$a$-let-CorrectingDetailViewModel$initData$1$1"}, m13601s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nCorrectingDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorrectingDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/correcting/CorrectingDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
/* loaded from: classes4.dex */
public final class CorrectingDetailViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9239a;

    /* renamed from: b */
    public int f9240b;

    /* renamed from: c */
    public int f9241c;

    /* renamed from: d */
    public final /* synthetic */ CorrectingDetailViewModel f9242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorrectingDetailViewModel$initData$1(CorrectingDetailViewModel correctingDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9242d = correctingDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorrectingDetailViewModel$initData$1(this.f9242d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GuideQuestion guideQuestion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9241c;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            List mQuestionList = this.f9242d.getMQuestionList();
            if (mQuestionList != null && (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(mQuestionList, this.f9242d.getMCurrentIndex())) != null) {
                CorrectingDetailViewModel correctingDetailViewModel = this.f9242d;
                this.f9239a = SpillingKt.nullOutSpilledVariable(guideQuestion);
                this.f9240b = 0;
                this.f9241c = 1;
                if (correctingDetailViewModel.m9275R(guideQuestion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
        return ((CorrectingDetailViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
