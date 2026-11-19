package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.board.board.AbstractC7676s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import p084d5.InterfaceC7751k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$addBitmapList$1", m13451f = "BoardViewModel.kt", m13452i = {0}, m13453l = {1258}, m13454m = "invokeSuspend", m13455n = {"$this$launch"}, m13456s = {"L$0"})
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addBitmapList$1\n*L\n1277#1:1495,5\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel$addBitmapList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12154a;

    /* renamed from: b */
    public /* synthetic */ Object f12155b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f12156c;

    /* renamed from: d */
    public final /* synthetic */ List f12157d;

    /* renamed from: e */
    public final /* synthetic */ boolean f12158e;

    @Metadata(m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13413d2 = {"<anonymous>", "", "it"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$addBitmapList$1$1", m13451f = "BoardViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addBitmapList$1$1 */
    public static final class C76541 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f12159a;

        /* renamed from: b */
        public /* synthetic */ boolean f12160b;

        public C76541(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C76541 c76541 = new C76541(continuation);
            c76541.f12160b = ((Boolean) obj).booleanValue();
            return c76541;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z9 = this.f12160b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12159a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(z9);
        }

        public final Object invoke(boolean z9, Continuation continuation) {
            return ((C76541) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$addBitmapList$1(BoardViewModel boardViewModel, List list, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f12156c = boardViewModel;
        this.f12157d = list;
        this.f12158e = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BoardViewModel$addBitmapList$1 boardViewModel$addBitmapList$1 = new BoardViewModel$addBitmapList$1(this.f12156c, this.f12157d, this.f12158e, continuation);
        boardViewModel$addBitmapList$1.f12155b = obj;
        return boardViewModel$addBitmapList$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24758constructorimpl;
        Object value;
        CoroutineScope coroutineScope = (CoroutineScope) this.f12155b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12154a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow loadFinished = this.f12156c.getLoadFinished();
            C76541 c76541 = new C76541(null);
            this.f12155b = coroutineScope;
            this.f12154a = 1;
            if (FlowKt.first(loadFinished, c76541, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC7751k interfaceC7751kM11330a0 = this.f12156c.m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return Unit.INSTANCE;
        }
        if (this.f12156c.m11309P0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return Unit.INSTANCE;
        }
        List list = this.f12157d;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(interfaceC7751kM11330a0.mo7813A(list, EzyPositionEnum.PositionEnum.CENTER, EzyScaleTypeEnum.ScaleTypeEnum.MODE_ADAPTER_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
            ToastUtils.showShort("图片数量超过上限", new Object[0]);
        }
        List list2 = (List) (Result.m24764isFailureimpl(objM24758constructorimpl) ? null : objM24758constructorimpl);
        if (list2 != null) {
            boolean z9 = this.f12158e;
            BoardViewModel boardViewModel = this.f12156c;
            if (z9) {
                MutableStateFlow mutableStateFlow = boardViewModel._mainToolState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, false, false, false, false, false, AbstractC7676s.d.f12289e, 31, null)));
                interfaceC7751kM11330a0.mo7818F(CollectionsKt.listOf(((ImageGraph) CollectionsKt.last(list2)).getId()));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$addBitmapList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
