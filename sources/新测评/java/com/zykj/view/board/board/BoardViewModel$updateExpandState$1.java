package com.zykj.view.board.board;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
@DebugMetadata(m13595c = "com.zykj.view.board.board.BoardViewModel$updateExpandState$1", m13596f = "BoardViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updateExpandState$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n226#2,5:1500\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$updateExpandState$1\n*L\n1418#1:1495,5\n1424#1:1500,5\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel$updateExpandState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10993a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f10994b;

    /* renamed from: c */
    public final /* synthetic */ boolean f10995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updateExpandState$1(BoardViewModel boardViewModel, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f10994b = boardViewModel;
        this.f10995c = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardViewModel$updateExpandState$1(this.f10994b, this.f10995c, continuation);
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
        if (this.f10993a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MutableStateFlow mutableStateFlow = this.f10994b._expandState;
        boolean z9 = this.f10995c;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((C7221h) value).m10979a(z9 ? AbstractC7222i.b.f11034b : AbstractC7222i.a.f11033b)));
        if (!this.f10995c) {
            MutableStateFlow mutableStateFlow2 = this.f10994b._extraUIState;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, C7223j.m10982b((C7223j) value2, AbstractC7228o.d.f11079f, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$updateExpandState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
