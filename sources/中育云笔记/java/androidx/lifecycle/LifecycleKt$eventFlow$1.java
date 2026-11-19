package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC10005f;
import kotlinx.coroutines.channels.ProduceKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m26211f = "Lifecycle.kt", m26212l = {373}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LifecycleKt$eventFlow$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, InterfaceC11588c<? super LifecycleKt$eventFlow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_eventFlow = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(InterfaceC11395j interfaceC11395j, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        interfaceC11395j.mo33808trySendJP2dKIU(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            InterfaceC10005f.a.m20742a(interfaceC11395j, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q invokeSuspend$lambda$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.removeObserver(lifecycleEventObserver);
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC11588c);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.i
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LifecycleKt$eventFlow$1.invokeSuspend$lambda$0(interfaceC11395j, lifecycleOwner, event);
                }
            };
            this.$this_eventFlow.addObserver(lifecycleEventObserver);
            final Lifecycle lifecycle = this.$this_eventFlow;
            InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.lifecycle.j
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(lifecycle, lifecycleEventObserver);
                }
            };
            this.label = 1;
            if (ProduceKt.m20713a(interfaceC11395j, interfaceC9529a, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11395j interfaceC11395j, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((LifecycleKt$eventFlow$1) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
