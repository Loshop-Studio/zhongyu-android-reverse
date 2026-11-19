package com.zykj.view.board.simple;

import com.zykj.view.board.simple.AbstractC7261b;
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

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleViewModel$updatePenType$1", m13596f = "SimpleViewModel.kt", m13597i = {}, m13598l = {83}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updatePenType$1\n*L\n82#1:243,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$updatePenType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11273a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f11274b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7263d f11275c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updatePenType$1(SimpleViewModel simpleViewModel, AbstractC7263d abstractC7263d, Continuation continuation) {
        super(2, continuation);
        this.f11274b = simpleViewModel;
        this.f11275c = abstractC7263d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$updatePenType$1(this.f11274b, this.f11275c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f11273a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = this.f11274b._uiState;
            AbstractC7263d abstractC7263d = this.f11275c;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, C7264e.m11376b((C7264e) value, false, null, null, abstractC7263d, null, null, null, null, 247, null)));
            MutableSharedFlow mutableSharedFlow = this.f11274b._event;
            AbstractC7261b.f fVar = new AbstractC7261b.f(this.f11275c.m11373a(), this.f11275c.m11375c());
            this.f11273a = 1;
            if (mutableSharedFlow.emit(fVar, this) == coroutine_suspended) {
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleViewModel$updatePenType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
