package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.RequiresApi;
import androidx.core.os.Profiling;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.channels.ProduceKt;
import p123h7.C8736p;
import p157k8.InterfaceC9071g;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

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

    @InterfaceC9539d(m17800c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m17801f = "Profiling.kt", m17802l = {79}, m17803m = "invokeSuspend")
    /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    public static final class C34201 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34201(Context context, InterfaceC9324c<? super C34201> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC9071g interfaceC9071g, ProfilingResult result) {
            AbstractC9133u.m16132f(result, "result");
            interfaceC9071g.mo27213trySendJP2dKIU(result);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C34201 c34201 = new C34201(this.$context, interfaceC9324c);
            c34201.L$0 = obj;
            return c34201;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final InterfaceC9071g interfaceC9071g = (InterfaceC9071g) this.L$0;
                final Consumer consumer = new Consumer() { // from class: androidx.core.os.h
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C34201.invokeSuspend$lambda$0(interfaceC9071g, (ProfilingResult) obj2);
                    }
                };
                final ProfilingManager profilingManagerM1489a = AbstractC3424d.m1489a(this.$context.getSystemService(AbstractC3423c.m1488a()));
                profilingManagerM1489a.registerForAllProfilingResults(new Executor() { // from class: androidx.core.os.i
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: androidx.core.os.Profiling.registerForAllProfilingResults.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p300x7.InterfaceC10559a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m27175invoke();
                        return C8736p.f16368a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m27175invoke() {
                        profilingManagerM1489a.unregisterForAllProfilingResults(consumer);
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
            return ((C34201) create(interfaceC9071g, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    @RequiresApi(api = 35)
    public static final InterfaceC9266c registerForAllProfilingResults(Context context) {
        AbstractC9133u.m16133g(context, "context");
        return AbstractC9268e.m17015e(new C34201(context, null));
    }

    @RequiresApi(api = 35)
    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(profilingRequest, "profilingRequest");
        AbstractC3424d.m1489a(context.getSystemService(AbstractC3423c.m1488a())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    @RequiresApi(api = 35)
    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> listener) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(listener, "listener");
        AbstractC3424d.m1489a(context.getSystemService(AbstractC3423c.m1488a())).unregisterForAllProfilingResults(listener);
    }

    @RequiresApi(api = 35)
    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> listener) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(listener, "listener");
        AbstractC3424d.m1489a(context.getSystemService(AbstractC3423c.m1488a())).registerForAllProfilingResults(executor, listener);
    }
}
