package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.AbstractC7667j;
import com.zykj.view.board.board.AbstractC7669l;
import com.zykj.view.board.simple.AbstractC7713b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleViewModel$updateEraserSizeLevel$1", m13451f = "SimpleViewModel.kt", m13452i = {0}, m13453l = {192}, m13454m = "invokeSuspend", m13455n = {"type"}, m13456s = {"L$0"})
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,258:1\n226#2,5:259\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateEraserSizeLevel$1\n*L\n191#1:259,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateEraserSizeLevel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f12495a;

    /* renamed from: b */
    public int f12496b;

    /* renamed from: c */
    public final /* synthetic */ int f12497c;

    /* renamed from: d */
    public final /* synthetic */ SimpleViewModel f12498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateEraserSizeLevel$1(int i9, SimpleViewModel simpleViewModel, Continuation continuation) {
        super(2, continuation);
        this.f12497c = i9;
        this.f12498d = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$updateEraserSizeLevel$1(this.f12497c, this.f12498d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12496b;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC7669l abstractC7669l = (AbstractC7669l) AbstractC7667j.m11400b().get(this.f12497c);
            MutableStateFlow mutableStateFlow = this.f12498d._uiState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C7716e.m11865b((C7716e) value, false, null, null, null, null, null, abstractC7669l, null, 191, null)));
            MutableSharedFlow mutableSharedFlow = this.f12498d._event;
            AbstractC7713b.c cVar = new AbstractC7713b.c(abstractC7669l.m11408b());
            this.f12495a = SpillingKt.nullOutSpilledVariable(abstractC7669l);
            this.f12496b = 1;
            if (mutableSharedFlow.emit(cVar, this) == coroutine_suspended) {
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
        return ((SimpleViewModel$updateEraserSizeLevel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
