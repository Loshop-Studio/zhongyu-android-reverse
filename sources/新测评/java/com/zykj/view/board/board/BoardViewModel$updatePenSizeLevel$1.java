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
@DebugMetadata(m13595c = "com.zykj.view.board.board.BoardViewModel$updatePenSizeLevel$1", m13596f = "BoardViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updatePenSizeLevel$1\n*L\n955#1:1495,5\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel$updatePenSizeLevel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10996a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f10997b;

    /* renamed from: c */
    public final /* synthetic */ int f10998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updatePenSizeLevel$1(BoardViewModel boardViewModel, int i10, Continuation continuation) {
        super(2, continuation);
        this.f10997b = boardViewModel;
        this.f10998c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardViewModel$updatePenSizeLevel$1(this.f10997b, this.f10998c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f10996a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f10997b._penToolState;
        int i10 = this.f10998c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, C7230q.m11023b((C7230q) value, false, false, null, i10, null, 0, false, 119, null)));
        this.f10997b.m10928a1();
        this.f10997b.m10922X0();
        AbstractC5065v.m2597p(Boxing.boxInt(this.f10998c));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$updatePenSizeLevel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
