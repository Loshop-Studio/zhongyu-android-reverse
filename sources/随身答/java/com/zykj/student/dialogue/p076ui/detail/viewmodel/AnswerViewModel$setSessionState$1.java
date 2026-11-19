package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.student.dialogue.bean.req.SetSessionStateReq;
import com.zykj.student.dialogue.network.BaseResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;
import p214p6.C9336k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$setSessionState$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {261}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,529:1\n230#2,5:530\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$setSessionState$1\n*L\n268#1:530,5\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$setSessionState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11189a;

    /* renamed from: b */
    public final /* synthetic */ AnswerViewModel f11190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$setSessionState$1(AnswerViewModel answerViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11190b = answerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$setSessionState$1(this.f11190b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11189a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287g = this.f11190b.dialogueApi;
            SetSessionStateReq setSessionStateReq = new SetSessionStateReq(this.f11190b.m10465I(), ((C9336k) this.f11190b.getViewState().getValue()).m15243r() ? 1 : 2);
            this.f11189a = 1;
            obj = interfaceC8287g.m13392h(setSessionStateReq, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        AbstractC8137c.m13043b((BaseResponse) obj);
        this.f11190b._hasChanged.setValue(Boxing.boxBoolean(true));
        MutableStateFlow mutableStateFlow = this.f11190b._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C9336k.m15226b((C9336k) value, null, 0, false, null, 0L, !r3.m15243r(), 31, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$setSessionState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
