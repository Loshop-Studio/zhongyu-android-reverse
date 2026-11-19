package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.RequiresApi;
import androidx.core.os.Profiling;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.channels.ProduceKt;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p365ud.InterfaceC11395j;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    @InterfaceC11829d(m26210c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m26211f = "Profiling.kt", m26212l = {79}, m26213m = "invokeSuspend")
    /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    public static final class C34501 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34501(Context context, InterfaceC11588c<? super C34501> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC11395j interfaceC11395j, ProfilingResult result) {
            AbstractC9979u.m20293f(result, "result");
            interfaceC11395j.mo33808trySendJP2dKIU(result);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C34501 c34501 = new C34501(this.$context, interfaceC11588c);
            c34501.L$0 = obj;
            return c34501;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final InterfaceC11395j interfaceC11395j = (InterfaceC11395j) this.L$0;
                final Consumer consumer = new Consumer() { // from class: androidx.core.os.h
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C34501.invokeSuspend$lambda$0(interfaceC11395j, (ProfilingResult) obj2);
                    }
                };
                final ProfilingManager profilingManagerM1566a = AbstractC3454d.m1566a(this.$context.getSystemService(AbstractC3453c.m1565a()));
                profilingManagerM1566a.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.i
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                InterfaceC9529a interfaceC9529a = new InterfaceC9529a() { // from class: androidx.core.os.Profiling.registerForAllProfilingResults.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p181hd.InterfaceC9529a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m33777invoke();
                        return C10786q.f26013a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m33777invoke() {
                        profilingManagerM1566a.unregisterForAllProfilingResults(consumer);
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
            return ((C34501) create(interfaceC11395j, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @RequiresApi(api = 35)
    public static final InterfaceC11594c registerForAllProfilingResults(Context context) {
        AbstractC9979u.m20294g(context, "context");
        return AbstractC11596e.m25555e(new C34501(context, null));
    }

    @RequiresApi(api = 35)
    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(profilingRequest, "profilingRequest");
        AbstractC3454d.m1566a(context.getSystemService(AbstractC3453c.m1565a())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    @RequiresApi(api = 35)
    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> listener) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(listener, "listener");
        AbstractC3454d.m1566a(context.getSystemService(AbstractC3453c.m1565a())).unregisterForAllProfilingResults(listener);
    }

    @RequiresApi(api = 35)
    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> listener) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(listener, "listener");
        AbstractC3454d.m1566a(context.getSystemService(AbstractC3453c.m1565a())).registerForAllProfilingResults(executor, listener);
    }
}
