package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", m26211f = "WorkConstraintsTracker.kt", m26212l = {Opcodes.FCMPL}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC11395j $$this$callbackFlow;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$timeoutJob$1(NetworkRequestConstraintController networkRequestConstraintController, InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super NetworkRequestConstraintController$track$1$timeoutJob$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = networkRequestConstraintController;
        this.$$this$callbackFlow = interfaceC11395j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, this.$$this$callbackFlow, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            long j10 = this.this$0.timeoutMs;
            this.label = 1;
            if (DelayKt.m20376b(j10, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.this$0.timeoutMs + " ms");
        this.$$this$callbackFlow.mo33808trySendJP2dKIU(new ConstraintsState.ConstraintsNotMet(7));
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((NetworkRequestConstraintController$track$1$timeoutJob$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
