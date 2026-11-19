package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.AbstractC7671n;
import com.zykj.view.board.board.AbstractC7677t;
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
import kotlinx.coroutines.scheduling.WorkQueueKt;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1", m13451f = "SimpleViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,258:1\n226#2,5:259\n226#2,5:264\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n*L\n233#1:259,5\n242#1:264,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateExpandState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12499a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f12500b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateExpandState$1(SimpleViewModel simpleViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f12500b = simpleViewModel;
        this.f12501c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$updateExpandState$1(this.f12500b, this.f12501c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f12499a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f12500b._uiState;
        boolean z9 = this.f12501c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7716e.m11865b((C7716e) value, false, null, null, null, null, null, null, z9 ? AbstractC7671n.b.f12253b : AbstractC7671n.a.f12252b, WorkQueueKt.MASK, null)));
        if (!this.f12501c) {
            MutableStateFlow mutableStateFlow2 = this.f12500b._uiState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7716e.m11865b((C7716e) value2, false, null, AbstractC7677t.d.f12298f, null, null, null, null, null, 251, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleViewModel$updateExpandState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
