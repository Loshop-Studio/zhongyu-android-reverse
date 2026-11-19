package com.zykj.view.board.board;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
@DebugMetadata(m5302c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$2$1", m5303f = "BoardViewModel.kt", m5304i = {0, 0, 0}, m5305l = {1450}, m5306m = "invokeSuspend", m5307n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-BoardViewModel$getSavePath$3$2$1$1"}, m5308s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
public final class BoardViewModel$getSavePath$3$2$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6473e $callback;
    final /* synthetic */ String $it;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3$2$1(InterfaceC6473e interfaceC6473e, String str, InterfaceC5631c<? super BoardViewModel$getSavePath$3$2$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$callback = interfaceC6473e;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        BoardViewModel$getSavePath$3$2$1 boardViewModel$getSavePath$3$2$1 = new BoardViewModel$getSavePath$3$2$1(this.$callback, this.$it, interfaceC5631c);
        boardViewModel$getSavePath$3$2$1.L$0 = obj;
        return boardViewModel$getSavePath$3$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM13956constructorimpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5443s c5443s = C5443s.f8405a;
        try {
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                InterfaceC6473e interfaceC6473e = this.$callback;
                String str = this.$it;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC6473e.invoke(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            objM13956constructorimpl = Result.m13956constructorimpl(c5443s);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(objM13956constructorimpl);
        if (thM13959exceptionOrNullimpl != null) {
            thM13959exceptionOrNullimpl.printStackTrace();
        }
        return c5443s;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((BoardViewModel$getSavePath$3$2$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
