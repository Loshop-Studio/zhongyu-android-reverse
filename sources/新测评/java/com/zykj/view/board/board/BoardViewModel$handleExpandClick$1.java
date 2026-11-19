package com.zykj.view.board.board;

import com.zykj.view.board.board.AbstractC7216c;
import com.zykj.view.board.board.AbstractC7222i;
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
@DebugMetadata(m13595c = "com.zykj.view.board.board.BoardViewModel$handleExpandClick$1", m13596f = "BoardViewModel.kt", m13597i = {0}, m13598l = {862}, m13599m = "invokeSuspend", m13600n = {"isOpen"}, m13601s = {"Z$0"})
/* loaded from: classes5.dex */
public final class BoardViewModel$handleExpandClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public boolean f10990a;

    /* renamed from: b */
    public int f10991b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f10992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$handleExpandClick$1(BoardViewModel boardViewModel, Continuation continuation) {
        super(2, continuation);
        this.f10992c = boardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardViewModel$handleExpandClick$1(this.f10992c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10991b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zAreEqual = Intrinsics.areEqual(((C7221h) this.f10992c._expandState.getValue()).m10980b(), AbstractC7222i.a.f11033b);
            MutableSharedFlow mutableSharedFlow = this.f10992c._event;
            AbstractC7216c.a aVar = new AbstractC7216c.a(zAreEqual);
            this.f10990a = zAreEqual;
            this.f10991b = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
        return ((BoardViewModel$handleExpandClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
