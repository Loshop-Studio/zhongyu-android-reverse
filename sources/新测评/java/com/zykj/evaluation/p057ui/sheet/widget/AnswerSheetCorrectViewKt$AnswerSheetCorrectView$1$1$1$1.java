package com.zykj.evaluation.p057ui.sheet.widget;

import com.zykj.evaluation.p057ui.widget.AnswerSheetCorrectView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import p287x6.C9867j;

@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m13558d2 = {"Lx6/j;", "pageQuestionAnswerData", "", "", "idList", "", "<anonymous>", "(Lx6/j;Ljava/util/Set;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
@DebugMetadata(m13595c = "com.zykj.evaluation.ui.sheet.widget.AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1", m13596f = "AnswerSheetCorrectView.kt", m13597i = {0, 0}, m13598l = {35}, m13599m = "invokeSuspend", m13600n = {"pageQuestionAnswerData", "idList"}, m13601s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1 extends SuspendLambda implements Function3<C9867j, Set<? extends String>, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10152a;

    /* renamed from: b */
    public /* synthetic */ Object f10153b;

    /* renamed from: c */
    public /* synthetic */ Object f10154c;

    /* renamed from: d */
    public final /* synthetic */ AnswerSheetCorrectView f10155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1(AnswerSheetCorrectView answerSheetCorrectView, Continuation continuation) {
        super(3, continuation);
        this.f10155d = answerSheetCorrectView;
    }

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(C9867j c9867j, Set set, Continuation continuation) {
        AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1 answerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1 = new AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1(this.f10155d, continuation);
        answerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1.f10153b = c9867j;
        answerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1.f10154c = set;
        return answerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C9867j c9867j = (C9867j) this.f10153b;
        Set set = (Set) this.f10154c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10152a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AnswerSheetCorrectView answerSheetCorrectView = this.f10155d;
            this.f10153b = SpillingKt.nullOutSpilledVariable(c9867j);
            this.f10154c = SpillingKt.nullOutSpilledVariable(set);
            this.f10152a = 1;
            if (answerSheetCorrectView.m10443p(c9867j, set, this) == coroutine_suspended) {
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
}
