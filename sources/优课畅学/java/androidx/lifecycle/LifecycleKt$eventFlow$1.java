package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC9163f;
import kotlinx.coroutines.channels.ProduceKt;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m17801f = "Lifecycle.kt", m17802l = {373}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LifecycleKt$eventFlow$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, InterfaceC9324c<? super LifecycleKt$eventFlow$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$this_eventFlow = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(InterfaceC9071g interfaceC9071g, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        interfaceC9071g.mo27213trySendJP2dKIU(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            InterfaceC9163f.a.m16549a(interfaceC9071g, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C8736p invokeSuspend$lambda$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.removeObserver(lifecycleEventObserver);
        return C8736p.f16368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC9324c);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.L$0;
            final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.i
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    LifecycleKt$eventFlow$1.invokeSuspend$lambda$0(interfaceC9071g, lifecycleOwner, event);
                }
            };
            this.$this_eventFlow.addObserver(lifecycleEventObserver);
            final Lifecycle lifecycle = this.$this_eventFlow;
            InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.lifecycle.j
                @Override // p300x7.InterfaceC10559a
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(lifecycle, lifecycleEventObserver);
                }
            };
            this.label = 1;
            if (ProduceKt.m16521a(interfaceC9071g, interfaceC10559a, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC9071g interfaceC9071g, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((LifecycleKt$eventFlow$1) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }
}
