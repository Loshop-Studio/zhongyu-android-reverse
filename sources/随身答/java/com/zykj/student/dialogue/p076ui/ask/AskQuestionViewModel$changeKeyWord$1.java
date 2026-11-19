package com.zykj.student.dialogue.p076ui.ask;

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
import p180m6.C8993e0;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.ask.AskQuestionViewModel$changeKeyWord$1", m13451f = "AskQuestionViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nAskQuestionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,61:1\n230#2,5:62\n*S KotlinDebug\n*F\n+ 1 AskQuestionViewModel.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionViewModel$changeKeyWord$1\n*L\n38#1:62,5\n*E\n"})
/* loaded from: classes5.dex */
public final class AskQuestionViewModel$changeKeyWord$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10657a;

    /* renamed from: b */
    public final /* synthetic */ AskQuestionViewModel f10658b;

    /* renamed from: c */
    public final /* synthetic */ String f10659c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskQuestionViewModel$changeKeyWord$1(AskQuestionViewModel askQuestionViewModel, String str, Continuation continuation) {
        super(2, continuation);
        this.f10658b = askQuestionViewModel;
        this.f10659c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskQuestionViewModel$changeKeyWord$1(this.f10658b, this.f10659c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10657a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f10658b._uiState;
        String str = this.f10659c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C8993e0.m14371b((C8993e0) value, null, false, str, null, 11, null)));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((AskQuestionViewModel$changeKeyWord$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
