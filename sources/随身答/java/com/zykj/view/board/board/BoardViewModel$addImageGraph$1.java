package com.zykj.view.board.board;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.board.board.AbstractC7676s;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import p084d5.InterfaceC7751k;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1", m13451f = "BoardViewModel.kt", m13452i = {0}, m13453l = {1207}, m13454m = "invokeSuspend", m13455n = {"$this$launch"}, m13456s = {"L$0"})
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n*L\n1242#1:1495,5\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel$addImageGraph$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12161a;

    /* renamed from: b */
    public /* synthetic */ Object f12162b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f12163c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f12164d;

    /* renamed from: e */
    public final /* synthetic */ String f12165e;

    /* renamed from: f */
    public final /* synthetic */ EzyScaleTypeEnum.ScaleTypeEnum f12166f;

    /* renamed from: g */
    public final /* synthetic */ String f12167g;

    /* renamed from: h */
    public final /* synthetic */ Function1 f12168h;

    /* renamed from: i */
    public final /* synthetic */ boolean f12169i;

    @Metadata(m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13413d2 = {"<anonymous>", "", "it"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1", m13451f = "BoardViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1 */
    public static final class C76551 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f12170a;

        /* renamed from: b */
        public /* synthetic */ boolean f12171b;

        public C76551(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C76551 c76551 = new C76551(continuation);
            c76551.f12171b = ((Boolean) obj).booleanValue();
            return c76551;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z9 = this.f12171b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(z9);
        }

        public final Object invoke(boolean z9, Continuation continuation) {
            return ((C76551) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$addImageGraph$1(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, String str2, Function1 function1, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f12163c = boardViewModel;
        this.f12164d = bitmap;
        this.f12165e = str;
        this.f12166f = scaleTypeEnum;
        this.f12167g = str2;
        this.f12168h = function1;
        this.f12169i = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BoardViewModel$addImageGraph$1 boardViewModel$addImageGraph$1 = new BoardViewModel$addImageGraph$1(this.f12163c, this.f12164d, this.f12165e, this.f12166f, this.f12167g, this.f12168h, this.f12169i, continuation);
        boardViewModel$addImageGraph$1.f12162b = obj;
        return boardViewModel$addImageGraph$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24758constructorimpl;
        Object value;
        CoroutineScope coroutineScope = (CoroutineScope) this.f12162b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12161a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow loadFinished = this.f12163c.getLoadFinished();
            C76551 c76551 = new C76551(null);
            this.f12162b = coroutineScope;
            this.f12161a = 1;
            if (FlowKt.first(loadFinished, c76551, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC7751k interfaceC7751kM11330a0 = this.f12163c.m11330a0();
        if (interfaceC7751kM11330a0 == null) {
            return Unit.INSTANCE;
        }
        if (this.f12163c.m11309P0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return Unit.INSTANCE;
        }
        Bitmap bitmap = this.f12164d;
        String str = this.f12165e;
        EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum = this.f12166f;
        String str2 = this.f12167g;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(bitmap != null ? InterfaceC7751k.a.m12097a(interfaceC7751kM11330a0, bitmap, str, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, false, 48, null) : str2 != null ? InterfaceC7751k.a.m12098b(interfaceC7751kM11330a0, str2, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, 8, null) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
            ToastUtils.showShort("图片数量超过上限", new Object[0]);
        }
        ImageGraph imageGraph = (ImageGraph) (Result.m24764isFailureimpl(objM24758constructorimpl) ? null : objM24758constructorimpl);
        if (imageGraph != null) {
            Function1 function1 = this.f12168h;
            boolean z9 = this.f12169i;
            BoardViewModel boardViewModel = this.f12163c;
            if (function1 != null) {
                function1.invoke(imageGraph.m12932H());
            }
            if (z9) {
                MutableStateFlow mutableStateFlow = boardViewModel._mainToolState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C7675r.m11434b((C7675r) value, false, false, false, false, false, AbstractC7676s.d.f12289e, 31, null)));
                interfaceC7751kM11330a0.mo7818F(CollectionsKt.listOf(imageGraph.getId()));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$addImageGraph$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
