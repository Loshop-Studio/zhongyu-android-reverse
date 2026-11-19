package androidx.lifecycle;

import androidx.annotation.MainThread;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class BlockRunner<T> {
    private final InterfaceC9544p block;
    private InterfaceC10045g cancellationJob;
    private final CoroutineLiveData<T> liveData;
    private final InterfaceC9529a onDone;
    private InterfaceC10045g runningJob;
    private final InterfaceC11122i0 scope;
    private final long timeoutInMs;

    @InterfaceC11829d(m26210c = "androidx.lifecycle.BlockRunner$cancel$1", m26211f = "CoroutineLiveData.kt", m26212l = {Opcodes.GETFIELD}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.BlockRunner$cancel$1 */
    public static final class C39051 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39051(BlockRunner<T> blockRunner, InterfaceC11588c<? super C39051> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C39051(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                long j10 = ((BlockRunner) this.this$0).timeoutInMs;
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
            if (!((BlockRunner) this.this$0).liveData.hasActiveObservers()) {
                InterfaceC10045g interfaceC10045g = ((BlockRunner) this.this$0).runningJob;
                if (interfaceC10045g != null) {
                    InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
                }
                ((BlockRunner) this.this$0).runningJob = null;
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39051) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.lifecycle.BlockRunner$maybeRun$1", m26211f = "CoroutineLiveData.kt", m26212l = {168}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.BlockRunner$maybeRun$1 */
    public static final class C39061 extends SuspendLambda implements InterfaceC9544p {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BlockRunner<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39061(BlockRunner<T> blockRunner, InterfaceC11588c<? super C39061> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = blockRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39061 c39061 = new C39061(this.this$0, interfaceC11588c);
            c39061.L$0 = obj;
            return c39061;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(((BlockRunner) this.this$0).liveData, ((InterfaceC11122i0) this.L$0).getCoroutineContext());
                InterfaceC9544p interfaceC9544p = ((BlockRunner) this.this$0).block;
                this.label = 1;
                if (interfaceC9544p.invoke(liveDataScopeImpl, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            ((BlockRunner) this.this$0).onDone.invoke();
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C39061) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public BlockRunner(CoroutineLiveData<T> liveData, InterfaceC9544p block, long j10, InterfaceC11122i0 scope, InterfaceC9529a onDone) {
        AbstractC9979u.m20294g(liveData, "liveData");
        AbstractC9979u.m20294g(block, "block");
        AbstractC9979u.m20294g(scope, "scope");
        AbstractC9979u.m20294g(onDone, "onDone");
        this.liveData = liveData;
        this.block = block;
        this.timeoutInMs = j10;
        this.scope = scope;
        this.onDone = onDone;
    }

    @MainThread
    public final void cancel() {
        if (this.cancellationJob != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.cancellationJob = AbstractC11117h.m24726d(this.scope, C11157r0.m24800c().mo25209k(), null, new C39051(this, null), 2, null);
    }

    @MainThread
    public final void maybeRun() {
        InterfaceC10045g interfaceC10045g = this.cancellationJob;
        if (interfaceC10045g != null) {
            InterfaceC10045g.a.m20900a(interfaceC10045g, null, 1, null);
        }
        this.cancellationJob = null;
        if (this.runningJob != null) {
            return;
        }
        this.runningJob = AbstractC11117h.m24726d(this.scope, null, null, new C39061(this, null), 3, null);
    }
}
