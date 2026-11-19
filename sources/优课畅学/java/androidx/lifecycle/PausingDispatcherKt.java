package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class PausingDispatcherKt {

    @InterfaceC9539d(m17800c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m17801f = "PausingDispatcher.jvm.kt", m17802l = {TbsListener.ErrorCode.COPY_SRCDIR_ERROR}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    public static final class C40472 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40472(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C40472> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40472 c40472 = new C40472(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC9324c);
            c40472.L$0 = obj;
            return c40472;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super T> interfaceC9324c) {
            return ((C40472) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    AbstractC9079b.m15926b(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            AbstractC9079b.m15926b(obj);
            InterfaceC9212n interfaceC9212n = (InterfaceC9212n) ((InterfaceC8822b0) this.L$0).getCoroutineContext().get(InterfaceC9212n.f18095c0);
            if (interfaceC9212n == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC9212n);
            try {
                InterfaceC10574p interfaceC10574p = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = AbstractC8833f.m14848g(pausingDispatcher, interfaceC10574p, this);
                if (obj == objM17291f) {
                    return objM17291f;
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
    }

    @InterfaceC8721a
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC10574p, interfaceC9324c);
    }

    @InterfaceC8721a
    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC10574p, interfaceC9324c);
    }

    @InterfaceC8721a
    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC10574p, interfaceC9324c);
    }

    @InterfaceC8721a
    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return AbstractC8833f.m14848g(C8843i0.m14868c().mo15693o(), new C40472(lifecycle, state, interfaceC10574p, null), interfaceC9324c);
    }

    @InterfaceC8721a
    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC10574p, interfaceC9324c);
    }

    @InterfaceC8721a
    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC10574p, interfaceC9324c);
    }

    @InterfaceC8721a
    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super T> interfaceC9324c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC10574p, interfaceC9324c);
    }
}
