package com.zykj.student.dialogue.p076ui.detail.viewmodel;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import p214p6.C9336k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.viewmodel.AnswerViewModel$updateUnderstood$1", m13451f = "AnswerViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateUnderstood$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,529:1\n230#2,5:530\n*S KotlinDebug\n*F\n+ 1 AnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel$updateUnderstood$1\n*L\n306#1:530,5\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerViewModel$updateUnderstood$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11193a;

    /* renamed from: b */
    public final /* synthetic */ AnswerViewModel f11194b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnswerViewModel$updateUnderstood$1(AnswerViewModel answerViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f11194b = answerViewModel;
        this.f11195c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnswerViewModel$updateUnderstood$1(this.f11194b, this.f11195c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f11193a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f11194b._viewState;
        boolean z9 = this.f11195c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C9336k.m15226b((C9336k) value, null, 0, false, null, 0L, z9, 31, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AnswerViewModel$updateUnderstood$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
