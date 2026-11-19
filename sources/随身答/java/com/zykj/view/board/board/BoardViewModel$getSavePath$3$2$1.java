package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$2$1", m13451f = "BoardViewModel.kt", m13452i = {0, 0, 0}, m13453l = {1450}, m13454m = "invokeSuspend", m13455n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-BoardViewModel$getSavePath$3$2$1$1"}, m13456s = {"L$0", "L$1", "I$0"})
/* loaded from: classes5.dex */
public final class BoardViewModel$getSavePath$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public Object f12183a;

    /* renamed from: b */
    public int f12184b;

    /* renamed from: c */
    public int f12185c;

    /* renamed from: d */
    public /* synthetic */ Object f12186d;

    /* renamed from: e */
    public final /* synthetic */ Function2 f12187e;

    /* renamed from: f */
    public final /* synthetic */ String f12188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3$2$1(Function2 function2, String str, Continuation continuation) {
        super(2, continuation);
        this.f12187e = function2;
        this.f12188f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BoardViewModel$getSavePath$3$2$1 boardViewModel$getSavePath$3$2$1 = new BoardViewModel$getSavePath$3$2$1(this.f12187e, this.f12188f, continuation);
        boardViewModel$getSavePath$3$2$1.f12186d = obj;
        return boardViewModel$getSavePath$3$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM24758constructorimpl;
        CoroutineScope coroutineScope = (CoroutineScope) this.f12186d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12185c;
        try {
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                Function2 function2 = this.f12187e;
                String str = this.f12188f;
                Result.Companion companion = Result.INSTANCE;
                this.f12186d = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.f12183a = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.f12184b = 0;
                this.f12185c = 1;
                if (function2.invoke(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            objM24758constructorimpl = Result.m24758constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM24761exceptionOrNullimpl = Result.m24761exceptionOrNullimpl(objM24758constructorimpl);
        if (thM24761exceptionOrNullimpl != null) {
            thM24761exceptionOrNullimpl.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((BoardViewModel$getSavePath$3$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
