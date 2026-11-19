package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.zykj.blackboard.core.edit.IBoardControl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3", m13451f = "BoardViewModel.kt", m13452i = {}, m13453l = {1442}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class BoardViewModel$getSavePath$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12175a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f12176b;

    /* renamed from: c */
    public final /* synthetic */ boolean f12177c;

    /* renamed from: d */
    public final /* synthetic */ boolean f12178d;

    /* renamed from: e */
    public final /* synthetic */ Function2 f12179e;

    /* renamed from: f */
    public final /* synthetic */ Function2 f12180f;

    @Metadata(m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m13413d2 = {"<anonymous>", "", "it"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$1", m13451f = "BoardViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$3$1 */
    public static final class C76571 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {

        /* renamed from: a */
        public int f12181a;

        /* renamed from: b */
        public /* synthetic */ boolean f12182b;

        public C76571(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C76571 c76571 = new C76571(continuation);
            c76571.f12182b = ((Boolean) obj).booleanValue();
            return c76571;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z9 = this.f12182b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12181a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(z9);
        }

        public final Object invoke(boolean z9, Continuation continuation) {
            return ((C76571) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3(BoardViewModel boardViewModel, boolean z9, boolean z10, Function2 function2, Function2 function22, Continuation continuation) {
        super(2, continuation);
        this.f12176b = boardViewModel;
        this.f12177c = z9;
        this.f12178d = z10;
        this.f12179e = function2;
        this.f12180f = function22;
    }

    /* renamed from: g */
    public static final Unit m11375g(BoardViewModel boardViewModel, Function2 function2, String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(boardViewModel), Dispatchers.getMain(), null, new BoardViewModel$getSavePath$3$2$1(function2, str, null), 2, null);
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m11376k(BoardViewModel boardViewModel, Function2 function2, Throwable th) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(boardViewModel), Dispatchers.getMain(), null, new BoardViewModel$getSavePath$3$3$1(function2, th, null), 2, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardViewModel$getSavePath$3(this.f12176b, this.f12177c, this.f12178d, this.f12179e, this.f12180f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12175a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow loadFinished = this.f12176b.getLoadFinished();
            C76571 c76571 = new C76571(null);
            this.f12175a = 1;
            if (FlowKt.first(loadFinished, c76571, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        IBoardControl iBoardControl = this.f12176b.boardControl;
        if (iBoardControl != null) {
            boolean z9 = this.f12177c;
            boolean z10 = this.f12178d;
            final BoardViewModel boardViewModel = this.f12176b;
            final Function2 function2 = this.f12179e;
            Function1 function1 = new Function1() { // from class: com.zykj.view.board.board.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BoardViewModel$getSavePath$3.m11375g(boardViewModel, function2, (String) obj2);
                }
            };
            final BoardViewModel boardViewModel2 = this.f12176b;
            final Function2 function22 = this.f12180f;
            iBoardControl.mo7798e(z9, z10, function1, new Function1() { // from class: com.zykj.view.board.board.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return BoardViewModel$getSavePath$3.m11376k(boardViewModel2, function22, (Throwable) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$getSavePath$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
