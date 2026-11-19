package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.platform.AbstractC2274h;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.Profiling;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5883l;
import kotlinx.coroutines.channels.InterfaceC5884m;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5910f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\u0004\u0010\u000b\u001a%\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m5110d2 = {"Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/f;", "Landroid/os/ProfilingResult;", "registerForAllProfilingResults", "(Landroid/content/Context;)Lkotlinx/coroutines/flow/f;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/Consumer;", "listener", "Ld6/s;", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "unregisterForAllProfilingResults", "(Landroid/content/Context;Ljava/util/function/Consumer;)V", "Landroidx/core/os/ProfilingRequest;", "profilingRequest", "requestProfiling", "(Landroid/content/Context;Landroidx/core/os/ProfilingRequest;Ljava/util/concurrent/Executor;Ljava/util/function/Consumer;)V", "", Profiling.KEY_DURATION_MS, "Ljava/lang/String;", Profiling.KEY_SAMPLING_INTERVAL_BYTES, Profiling.KEY_TRACK_JAVA_ALLOCATIONS, Profiling.KEY_FREQUENCY_HZ, Profiling.KEY_SIZE_KB, Profiling.KEY_BUFFER_FILL_POLICY, "", "VALUE_BUFFER_FILL_POLICY_DISCARD", "I", "VALUE_BUFFER_FILL_POLICY_RING_BUFFER", "core_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "Profiling")
/* loaded from: classes2.dex */
public final class Profiling {

    @NotNull
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";

    @NotNull
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";

    @NotNull
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";

    @NotNull
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";

    @NotNull
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";

    @NotNull
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/channels/m;", "Landroid/os/ProfilingResult;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/channels/m;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
    @DebugMetadata(m5302c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m5303f = "Profiling.kt", m5304i = {}, m5305l = {79}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    public static final class C24491 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24491(Context context, InterfaceC5631c<? super C24491> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC5884m interfaceC5884m, ProfilingResult result) {
            AbstractC5830k.m5329f(result, "result");
            ((C5883l) interfaceC5884m).mo5481a(result);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C24491 c24491 = new C24491(this.$context, interfaceC5631c);
            c24491.L$0 = obj;
            return c24491;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.a, java.util.function.Consumer] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                final InterfaceC5884m interfaceC5884m = (InterfaceC5884m) this.L$0;
                final ?? r1 = new Consumer() { // from class: androidx.core.os.a
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C24491.invokeSuspend$lambda$0(interfaceC5884m, (ProfilingResult) obj2);
                    }
                };
                final ProfilingManager profilingManagerM1366a = AbstractC2274h.m1366a(this.$context.getSystemService(AbstractC2274h.m1367b()));
                profilingManagerM1366a.registerForAllProfilingResults(new ExecutorC2451b(), r1);
                InterfaceC6469a interfaceC6469a = new InterfaceC6469a() { // from class: androidx.core.os.Profiling.registerForAllProfilingResults.1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p152r6.InterfaceC6469a
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m13581invoke();
                        return C5443s.f8405a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m13581invoke() {
                        profilingManagerM1366a.unregisterForAllProfilingResults(r1);
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
            return ((C24491) create(interfaceC5884m, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    @RequiresApi(api = 35)
    @NotNull
    public static final InterfaceC5910f registerForAllProfilingResults(@NotNull Context context) {
        AbstractC5830k.m5330g(context, "context");
        return AbstractC5914h.m5551g(new C24491(context, null));
    }

    @RequiresApi(api = 35)
    public static final void requestProfiling(@NotNull Context context, @NotNull ProfilingRequest profilingRequest, @Nullable Executor executor, @Nullable Consumer<ProfilingResult> consumer) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(profilingRequest, "profilingRequest");
        AbstractC2274h.m1366a(context.getSystemService(AbstractC2274h.m1367b())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    @RequiresApi(api = 35)
    public static final void unregisterForAllProfilingResults(@NotNull Context context, @NotNull Consumer<ProfilingResult> listener) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(listener, "listener");
        AbstractC2274h.m1366a(context.getSystemService(AbstractC2274h.m1367b())).unregisterForAllProfilingResults(listener);
    }

    @RequiresApi(api = 35)
    public static final void registerForAllProfilingResults(@NotNull Context context, @NotNull Executor executor, @NotNull Consumer<ProfilingResult> listener) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(executor, "executor");
        AbstractC5830k.m5330g(listener, "listener");
        AbstractC2274h.m1366a(context.getSystemService(AbstractC2274h.m1367b())).registerForAllProfilingResults(executor, listener);
    }
}
