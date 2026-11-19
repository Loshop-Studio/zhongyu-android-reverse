package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.http.exception.RemoteCodeException;
import com.zykj.student.dialogue.bean.req.CollectReq;
import com.zykj.student.dialogue.network.BaseResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p128h6.AbstractC8103b;
import p138i6.AbstractC8137c;
import p158k6.InterfaceC8287g;
import p214p6.C9336k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$updateCollectState$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {276}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateCollectState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,529:1\n230#2,5:530\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateCollectState$1\n*L\n283#1:530,5\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$updateCollectState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11191a;

    /* renamed from: b */
    public final /* synthetic */ AnswerViewModel f11192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$updateCollectState$1(AnswerViewModel answerViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11192b = answerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$updateCollectState$1(this.f11192b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws RemoteCodeException {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f11191a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC8287g interfaceC8287g = this.f11192b.dialogueApi;
            CollectReq collectReq = new CollectReq(this.f11192b.m10465I(), !((C9336k) this.f11192b.getViewState().getValue()).m15243r());
            this.f11191a = 1;
            obj = interfaceC8287g.m13390f(collectReq, this);
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
        MutableStateFlow mutableStateFlow = this.f11192b._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C9336k.m15226b((C9336k) value, null, 0, false, null, 0L, !r3.m15243r(), 31, null)));
        this.f11192b.m9922g(new AbstractC8103b.a.b(((C9336k) this.f11192b.getViewState().getValue()).m15243r() ? "收藏成功" : "取消收藏成功"));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$updateCollectState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
