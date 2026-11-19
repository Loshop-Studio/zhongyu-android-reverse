package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C0829d;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.C2752h;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2545e0;
import p087f3.C2560i;
import p087f3.C2561i0;
import p087f3.C2576m;
import p087f3.C2594r1;
import p087f3.C2605v0;
import p087f3.InterfaceC2557h0;
import p087f3.InterfaceC2578m1;
import p087f3.InterfaceC2607w;
import p095h1.InterfaceC2654a;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3032c;
import p146r2.C3033d;
import p169x0.C3440i;
import p169x0.EnumC3438g;
import p169x0.RunnableC3436e;
import p169x0.RunnableC3437f;
import p171x2.InterfaceC3474p;

/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    @NotNull
    private final AbstractC2545e0 coroutineContext;

    @NotNull
    private final C0829d<ListenableWorker.AbstractC0807a> future;

    @NotNull
    private final InterfaceC2607w job;

    /* renamed from: androidx.work.CoroutineWorker$a */
    static final class RunnableC0805a implements Runnable {
        RunnableC0805a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                InterfaceC2578m1.a.m8633a(CoroutineWorker.this.getJob$work_runtime_ktx_release(), null, 1, null);
            }
        }
    }

    @InterfaceC2750f(m9206c = "androidx.work.CoroutineWorker$startWork$1", m9207f = "CoroutineWorker.kt", m9208l = {69}, m9209m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$b */
    static final class C0806b extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f4733b;

        C0806b(InterfaceC3012d interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> completion) {
            C2769l.m9241e(completion, "completion");
            return CoroutineWorker.this.new C0806b(completion);
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public final Object mo2812d(InterfaceC2557h0 interfaceC2557h0, InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((C0806b) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f4733b;
            try {
                if (i4 == 0) {
                    C2920m.m9994b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f4733b = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == objM10175c) {
                        return objM10175c;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2920m.m9994b(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().mo4268o((ListenableWorker.AbstractC0807a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().mo4269p(th);
            }
            return C2925r.f11415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        C2769l.m9241e(appContext, "appContext");
        C2769l.m9241e(params, "params");
        this.job = C2594r1.m8657b(null, 1, null);
        C0829d<ListenableWorker.AbstractC0807a> c0829dM4279s = C0829d.m4279s();
        C2769l.m9240d(c0829dM4279s, "SettableFuture.create()");
        this.future = c0829dM4279s;
        RunnableC0805a runnableC0805a = new RunnableC0805a();
        InterfaceC2654a taskExecutor = getTaskExecutor();
        C2769l.m9240d(taskExecutor, "taskExecutor");
        c0829dM4279s.addListener(runnableC0805a, taskExecutor.mo8915c());
        this.coroutineContext = C2605v0.m8750a();
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    @Nullable
    public abstract Object doWork(@NotNull InterfaceC3012d<? super ListenableWorker.AbstractC0807a> interfaceC3012d);

    @NotNull
    public AbstractC2545e0 getCoroutineContext() {
        return this.coroutineContext;
    }

    @NotNull
    public final C0829d<ListenableWorker.AbstractC0807a> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    @NotNull
    public final InterfaceC2607w getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Nullable
    public final Object setForeground(@NotNull C3440i c3440i, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) throws Throwable {
        Object objM8621s;
        ListenableFuture<Void> foregroundAsync = setForegroundAsync(c3440i);
        C2769l.m9240d(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objM8621s = foregroundAsync.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e4;
            }
        } else {
            C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
            c2576m.m8623v();
            foregroundAsync.addListener(new RunnableC3437f(c2576m, foregroundAsync), EnumC3438g.INSTANCE);
            objM8621s = c2576m.m8621s();
            if (objM8621s == C3033d.m10175c()) {
                C2752h.m9217c(interfaceC3012d);
            }
        }
        return objM8621s == C3033d.m10175c() ? objM8621s : C2925r.f11415a;
    }

    @Nullable
    public final Object setProgress(@NotNull C0810a c0810a, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) throws Throwable {
        Object objM8621s;
        ListenableFuture<Void> progressAsync = setProgressAsync(c0810a);
        C2769l.m9240d(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objM8621s = progressAsync.get();
            } catch (ExecutionException e4) {
                Throwable cause = e4.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e4;
            }
        } else {
            C2576m c2576m = new C2576m(C3032c.m10174b(interfaceC3012d), 1);
            c2576m.m8623v();
            progressAsync.addListener(new RunnableC3436e(c2576m, progressAsync), EnumC3438g.INSTANCE);
            objM8621s = c2576m.m8621s();
            if (objM8621s == C3033d.m10175c()) {
                C2752h.m9217c(interfaceC3012d);
            }
        }
        return objM8621s == C3033d.m10175c() ? objM8621s : C2925r.f11415a;
    }

    @Override // androidx.work.ListenableWorker
    @NotNull
    public final ListenableFuture<ListenableWorker.AbstractC0807a> startWork() {
        C2560i.m8574d(C2561i0.m8576a(getCoroutineContext().plus(this.job)), null, null, new C0806b(null), 3, null);
        return this.future;
    }
}
