package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7539b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p214p6.C9335j;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$onEvent$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {194}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class AnswerViewModel$onEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11177a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC7539b f11178b;

    /* renamed from: c */
    public final /* synthetic */ AnswerViewModel f11179c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$onEvent$1(AbstractC7539b abstractC7539b, AnswerViewModel answerViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11178b = abstractC7539b;
        this.f11179c = answerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$onEvent$1(this.f11178b, this.f11179c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11177a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f11178b instanceof AbstractC7539b.a) {
                C9335j playInfo = this.f11179c.getPlayInfo();
                AbstractC7539b.a aVar = (AbstractC7539b.a) this.f11178b;
                playInfo.m15225g(aVar.m10503a());
                playInfo.m15223e(aVar.m10506d());
                playInfo.m15224f(aVar.m10504b());
            }
            AnswerViewModel answerViewModel = this.f11179c;
            AbstractC7539b abstractC7539b = this.f11178b;
            this.f11177a = 1;
            if (answerViewModel.m10482x(abstractC7539b, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$onEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
