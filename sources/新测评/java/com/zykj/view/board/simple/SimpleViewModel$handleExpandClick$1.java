package com.zykj.view.board.simple;

import androidx.compose.runtime.ComposerKt;
import com.zykj.view.board.board.AbstractC7222i;
import com.zykj.view.board.simple.AbstractC7261b;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleViewModel$handleExpandClick$1", m13596f = "SimpleViewModel.kt", m13597i = {0}, m13598l = {ComposerKt.referenceKey}, m13599m = "invokeSuspend", m13600n = {"isOpen"}, m13601s = {"Z$0"})
/* loaded from: classes5.dex */
public final class SimpleViewModel$handleExpandClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public boolean f11249a;

    /* renamed from: b */
    public int f11250b;

    /* renamed from: c */
    public final /* synthetic */ SimpleViewModel f11251c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$handleExpandClick$1(SimpleViewModel simpleViewModel, Continuation continuation) {
        super(2, continuation);
        this.f11251c = simpleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleViewModel$handleExpandClick$1(this.f11251c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f11250b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zAreEqual = Intrinsics.areEqual(((C7264e) this.f11251c._uiState.getValue()).m11379d(), AbstractC7222i.a.f11033b);
            MutableSharedFlow mutableSharedFlow = this.f11251c._event;
            AbstractC7261b.b bVar = new AbstractC7261b.b(zAreEqual);
            this.f11249a = zAreEqual;
            this.f11250b = 1;
            if (mutableSharedFlow.emit(bVar, this) == coroutine_suspended) {
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
        return ((SimpleViewModel$handleExpandClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
