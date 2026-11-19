package com.zykj.view.board.board;

import android.graphics.Bitmap;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import com.zykj.view.board.board.AbstractC7227n;
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
import p177n4.InterfaceC8629i;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1", m13596f = "BoardViewModel.kt", m13597i = {0}, m13598l = {1207}, m13599m = "invokeSuspend", m13600n = {"$this$launch"}, m13601s = {"L$0"})
@SourceDebugExtension({"SMAP\nBoardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1494:1\n226#2,5:1495\n*S KotlinDebug\n*F\n+ 1 BoardViewModel.kt\ncom/zykj/view/board/board/BoardViewModel$addImageGraph$1\n*L\n1242#1:1495,5\n*E\n"})
/* loaded from: classes5.dex */
public final class BoardViewModel$addImageGraph$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10978a;

    /* renamed from: b */
    public /* synthetic */ Object f10979b;

    /* renamed from: c */
    public final /* synthetic */ BoardViewModel f10980c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f10981d;

    /* renamed from: e */
    public final /* synthetic */ String f10982e;

    /* renamed from: f */
    public final /* synthetic */ EzyScaleTypeEnum.ScaleTypeEnum f10983f;

    /* renamed from: g */
    public final /* synthetic */ String f10984g;

    /* renamed from: h */
    public final /* synthetic */ Function1 f10985h;

    /* renamed from: i */
    public final /* synthetic */ boolean f10986i;

    @Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13558d2 = {"<anonymous>", "", "it"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1", m13596f = "BoardViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$addImageGraph$1$1 */
    public static final class C72121 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f10987a;

        /* renamed from: b */
        public /* synthetic */ boolean f10988b;

        public C72121(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C72121 c72121 = new C72121(continuation);
            c72121.f10988b = ((Boolean) obj).booleanValue();
            return c72121;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z9 = this.f10988b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10987a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(z9);
        }

        public final Object invoke(boolean z9, Continuation continuation) {
            return ((C72121) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$addImageGraph$1(BoardViewModel boardViewModel, Bitmap bitmap, String str, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, String str2, Function1 function1, boolean z9, Continuation continuation) {
        super(2, continuation);
        this.f10980c = boardViewModel;
        this.f10981d = bitmap;
        this.f10982e = str;
        this.f10983f = scaleTypeEnum;
        this.f10984g = str2;
        this.f10985h = function1;
        this.f10986i = z9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BoardViewModel$addImageGraph$1 boardViewModel$addImageGraph$1 = new BoardViewModel$addImageGraph$1(this.f10980c, this.f10981d, this.f10982e, this.f10983f, this.f10984g, this.f10985h, this.f10986i, continuation);
        boardViewModel$addImageGraph$1.f10979b = obj;
        return boardViewModel$addImageGraph$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24299constructorimpl;
        Object value;
        CoroutineScope coroutineScope = (CoroutineScope) this.f10979b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10978a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow loadFinished = this.f10980c.getLoadFinished();
            C72121 c72121 = new C72121(null);
            this.f10979b = coroutineScope;
            this.f10978a = 1;
            if (FlowKt.first(loadFinished, c72121, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC8629i interfaceC8629iM10923Y = this.f10980c.m10923Y();
        if (interfaceC8629iM10923Y == null) {
            return Unit.INSTANCE;
        }
        if (this.f10980c.m10893I0()) {
            ToastUtils.showShort("图片数量已达上限，不可继续插入", new Object[0]);
            return Unit.INSTANCE;
        }
        Bitmap bitmap = this.f10981d;
        String str = this.f10982e;
        EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum = this.f10983f;
        String str2 = this.f10984g;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(bitmap != null ? InterfaceC8629i.a.m14205a(interfaceC8629iM10923Y, bitmap, str, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, false, 48, null) : str2 != null ? InterfaceC8629i.a.m14206b(interfaceC8629iM10923Y, str2, EzyPositionEnum.PositionEnum.CENTER, scaleTypeEnum, false, 8, null) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m24302exceptionOrNullimpl(objM24299constructorimpl) != null) {
            ToastUtils.showShort("图片数量超过上限", new Object[0]);
        }
        ImageGraph imageGraph = (ImageGraph) (Result.m24305isFailureimpl(objM24299constructorimpl) ? null : objM24299constructorimpl);
        if (imageGraph != null) {
            Function1 function1 = this.f10985h;
            boolean z9 = this.f10986i;
            BoardViewModel boardViewModel = this.f10980c;
            if (function1 != null) {
                function1.invoke(imageGraph.m15149I());
            }
            if (z9) {
                MutableStateFlow mutableStateFlow = boardViewModel._mainToolState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, C7226m.m11004b((C7226m) value, false, false, false, false, false, AbstractC7227n.d.f11070e, 31, null)));
                interfaceC8629iM10923Y.mo6708E(CollectionsKt.listOf(imageGraph.getId()));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$addImageGraph$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
