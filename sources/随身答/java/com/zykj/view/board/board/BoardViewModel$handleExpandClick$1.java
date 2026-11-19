package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.AbstractC7660c;
import com.zykj.view.board.board.AbstractC7671n;
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

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$handleExpandClick$1", m13451f = "BoardViewModel.kt", m13452i = {0}, m13453l = {862}, m13454m = "invokeSuspend", m13455n = {"isOpen"}, m13456s = {"Z$0"})
/* loaded from: classes5.dex */
public final class BoardViewModel$handleExpandClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public boolean f12192a;

    /* renamed from: b */
    public int f12193b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f12194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$handleExpandClick$1(BoardViewModel boardViewModel, Continuation continuation) {
        super(2, continuation);
        this.f12194c = boardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardViewModel$handleExpandClick$1(this.f12194c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12193b;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            boolean zAreEqual = Intrinsics.areEqual(((C7670m) this.f12194c._expandState.getValue()).m11410b(), AbstractC7671n.a.f12252b);
            MutableSharedFlow mutableSharedFlow = this.f12194c._event;
            AbstractC7660c.a aVar = new AbstractC7660c.a(zAreEqual);
            this.f12192a = zAreEqual;
            this.f12193b = 1;
            if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
        return ((BoardViewModel$handleExpandClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
