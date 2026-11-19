package com.zykj.view.board.board;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import p027b8.AbstractC5065v;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.board.BoardViewModel$updatePenType$1", m13596f = "BoardViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenType$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenType$1\n*L\n944#1:1495,5\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel$updatePenType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10999a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f11000b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC7231r f11001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updatePenType$1(BoardViewModel boardViewModel, AbstractC7231r abstractC7231r, Continuation continuation) {
        super(2, continuation);
        this.f11000b = boardViewModel;
        this.f11001c = abstractC7231r;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardViewModel$updatePenType$1(this.f11000b, this.f11001c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10999a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f11000b._penToolState;
        AbstractC7231r abstractC7231r = this.f11001c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7230q.m11023b((C7230q) value, false, false, abstractC7231r, 0, null, 0, false, 123, null)));
        this.f11000b.m10928a1();
        AbstractC5065v.m2598q(Boxing.boxInt(this.f11001c.m11033b()));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$updatePenType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
