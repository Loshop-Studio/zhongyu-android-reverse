package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC7222i;
import com.zykj.view.board.board.AbstractC7228o;
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

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1", m13596f = "SimpleViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n226#2,5:248\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel$updateExpandState$1\n*L\n216#1:243,5\n225#1:248,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$updateExpandState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11262a;

    /* renamed from: b */
    public final /* synthetic */ SimpleViewModel f11263b;

    /* renamed from: c */
    public final /* synthetic */ boolean f11264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateExpandState$1(SimpleViewModel simpleViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f11263b = simpleViewModel;
        this.f11264c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$updateExpandState$1(this.f11263b, this.f11264c, continuation);
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
        if (this.f11262a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f11263b._uiState;
        boolean z9 = this.f11264c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7264e.m11376b((C7264e) value, false, null, null, null, null, null, null, z9 ? AbstractC7222i.b.f11034b : AbstractC7222i.a.f11033b, 127, null)));
        if (!this.f11264c) {
            MutableStateFlow mutableStateFlow2 = this.f11263b._uiState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7264e.m11376b((C7264e) value2, false, null, AbstractC7228o.d.f11079f, null, null, null, null, null, 251, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleViewModel$updateExpandState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
