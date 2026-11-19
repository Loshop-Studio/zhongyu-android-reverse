package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class PausingDispatcherKt {

    @InterfaceC11829d(m26210c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m26211f = "PausingDispatcher.jvm.kt", m26212l = {213}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    public static final class C39212 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39212(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C39212> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39212 c39212 = new C39212(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC11588c);
            c39212.L$0 = obj;
            return c39212;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    AbstractC9924b.m20071b(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            AbstractC9924b.m20071b(obj);
            InterfaceC10045g interfaceC10045g = (InterfaceC10045g) ((InterfaceC11122i0) this.L$0).getCoroutineContext().get(InterfaceC10045g.f23976b0);
            if (interfaceC10045g == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC10045g);
            try {
                InterfaceC9544p interfaceC9544p = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = AbstractC11109f.m24709g(pausingDispatcher, interfaceC9544p, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super T> interfaceC11588c) {
            return ((C39212) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC10770a
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC9544p, interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC9544p, interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC9544p, interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return AbstractC11109f.m24709g(C11157r0.m24800c().mo25209k(), new C39212(lifecycle, state, interfaceC9544p, null), interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC9544p, interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC9544p, interfaceC11588c);
    }

    @InterfaceC10770a
    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super T> interfaceC11588c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC9544p, interfaceC11588c);
    }
}
