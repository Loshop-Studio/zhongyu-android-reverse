package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.network.BaseResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$getSessionById$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {294}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class AnswerViewModel$getSessionById$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11171a;

    /* renamed from: b */
    public final /* synthetic */ AnswerViewModel f11172b;

    /* renamed from: c */
    public final /* synthetic */ String f11173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$getSessionById$1(AnswerViewModel answerViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f11172b = answerViewModel;
        this.f11173c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$getSessionById$1(this.f11172b, this.f11173c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11171a;
        try {
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC8287g interfaceC8287g = this.f11172b.dialogueApi;
                String str = this.f11173c;
                this.f11171a = 1;
                obj = interfaceC8287g.m13385a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            QuestionResp questionResp = (QuestionResp) AbstractC8137c.m13042a((BaseResponse) obj);
            this.f11172b._questionBean.setValue(questionResp);
            if (questionResp.getPrimaryUnRead() > 0) {
                this.f11172b.m10472P(this.f11173c);
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$getSessionById$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
