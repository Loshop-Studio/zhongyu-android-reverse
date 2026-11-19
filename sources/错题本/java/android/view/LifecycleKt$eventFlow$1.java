package android.view;

import android.view.Lifecycle;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5883l;
import kotlinx.coroutines.channels.InterfaceC5884m;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/channels/m;", "Landroidx/lifecycle/Lifecycle$Event;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m5111k = 3, m5112mv = {2, 0, 0})
@DebugMetadata(m5302c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m5303f = "Lifecycle.kt", m5304i = {}, m5305l = {373}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes2.dex */
public final class LifecycleKt$eventFlow$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, InterfaceC5631c<? super LifecycleKt$eventFlow$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_eventFlow = lifecycle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(InterfaceC5884m interfaceC5884m, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C5883l c5883l = (C5883l) interfaceC5884m;
        c5883l.mo5481a(event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            c5883l.mo5489l(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s invokeSuspend$lambda$1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        lifecycle.removeObserver(lifecycleEventObserver);
        return C5443s.f8405a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC5631c);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            InterfaceC5884m interfaceC5884m = (InterfaceC5884m) this.L$0;
            final C2762g c2762g = new C2762g(interfaceC5884m, 0);
            this.$this_eventFlow.addObserver(c2762g);
            final Lifecycle lifecycle = this.$this_eventFlow;
            InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.lifecycle.h
                @Override // p152r6.InterfaceC6469a
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(lifecycle, c2762g);
                }
            };
            this.label = 1;
            if (AbstractC5882k.m5512b(interfaceC5884m, interfaceC6469a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC5884m interfaceC5884m, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((LifecycleKt$eventFlow$1) create(interfaceC5884m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
