package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.simple.AbstractC7713b;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1", m13451f = "SimpleViewModel.kt", m13452i = {}, m13453l = {100}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,258:1\n226#2,5:259\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n*L\n99#1:259,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$updatePenType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12510a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f12511b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7715d f12512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updatePenType$1(SimpleViewModel simpleViewModel, AbstractC7715d abstractC7715d, Continuation continuation) {
        super(2, continuation);
        this.f12511b = simpleViewModel;
        this.f12512c = abstractC7715d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$updatePenType$1(this.f12511b, this.f12512c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12510a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = this.f12511b._uiState;
            AbstractC7715d abstractC7715d = this.f12512c;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C7716e.m11865b((C7716e) value, false, null, null, abstractC7715d, null, null, null, null, 247, null)));
            MutableSharedFlow mutableSharedFlow = this.f12511b._event;
            AbstractC7713b.f fVar = new AbstractC7713b.f(this.f12512c.m11862a(), this.f12512c.m11864c());
            this.f12510a = 1;
            if (mutableSharedFlow.emit(fVar, this) == coroutine_suspended) {
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
        return ((SimpleViewModel$updatePenType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
