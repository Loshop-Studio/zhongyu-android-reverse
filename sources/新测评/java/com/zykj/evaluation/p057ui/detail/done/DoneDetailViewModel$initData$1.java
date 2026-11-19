package com.zykj.evaluation.p057ui.detail.done;

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
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.detail.done.DoneDetailViewModel$initData$1", m13596f = "DoneDetailViewModel.kt", m13597i = {0, 0}, m13598l = {64}, m13599m = "invokeSuspend", m13600n = {"it", "$i$a$-let-DoneDetailViewModel$initData$1$1"}, m13601s = {"L$0", "I$0"})
@SourceDebugExtension({"SMAP\nDoneDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoneDetailViewModel.kt\ncom/zykj/evaluation/ui/detail/done/DoneDetailViewModel$initData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n1#2:513\n*E\n"})
/* loaded from: classes4.dex */
public final class DoneDetailViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f9257a;

    /* renamed from: b */
    public int f9258b;

    /* renamed from: c */
    public int f9259c;

    /* renamed from: d */
    public final /* synthetic */ DoneDetailViewModel f9260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoneDetailViewModel$initData$1(DoneDetailViewModel doneDetailViewModel, Continuation continuation) {
        super(2, continuation);
        this.f9260d = doneDetailViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DoneDetailViewModel$initData$1(this.f9260d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GuideQuestion guideQuestion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f9259c;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            List mQuestionList = this.f9260d.getMQuestionList();
            if (mQuestionList != null && (guideQuestion = (GuideQuestion) CollectionsKt.getOrNull(mQuestionList, this.f9260d.getMCurrentIndex())) != null) {
                DoneDetailViewModel doneDetailViewModel = this.f9260d;
                this.f9257a = SpillingKt.nullOutSpilledVariable(guideQuestion);
                this.f9258b = 0;
                this.f9259c = 1;
                if (doneDetailViewModel.m9275R(guideQuestion, this) == coroutine_suspended) {
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
        return ((DoneDetailViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
