package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p157k8.InterfaceC9071g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", m17801f = "WorkConstraintsTracker.kt", m17802l = {149}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ InterfaceC9071g $$this$callbackFlow;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$timeoutJob$1(NetworkRequestConstraintController networkRequestConstraintController, InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super NetworkRequestConstraintController$track$1$timeoutJob$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = networkRequestConstraintController;
        this.$$this$callbackFlow = interfaceC9071g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, this.$$this$callbackFlow, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((NetworkRequestConstraintController$track$1$timeoutJob$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            long j10 = this.this$0.timeoutMs;
            this.label = 1;
            if (DelayKt.m16227b(j10, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        Logger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after " + this.this$0.timeoutMs + " ms");
        this.$$this$callbackFlow.mo27213trySendJP2dKIU(new ConstraintsState.ConstraintsNotMet(7));
        return C8736p.f16368a;
    }
}
