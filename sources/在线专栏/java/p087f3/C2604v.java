package p087f3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1037f;
import p082e3.C2494t;
import p142q2.InterfaceC3015g;

/* renamed from: f3.v */
/* loaded from: classes.dex */
public final class C2604v extends AbstractC2546e1 {

    /* renamed from: c */
    @NotNull
    public static final C2604v f10300c = new C2604v();

    /* renamed from: d */
    private static final int f10301d;

    /* renamed from: e */
    private static boolean f10302e;

    @Nullable
    private static volatile Executor pool;

    static {
        String property;
        int iIntValue;
        try {
            property = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            property = null;
        }
        if (property == null) {
            iIntValue = -1;
        } else {
            Integer numM8334i = C2494t.m8334i(property);
            if (numM8334i == null || numM8334i.intValue() < 1) {
                throw new IllegalStateException(C2769l.m9248l("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", property).toString());
            }
            iIntValue = numM8334i.intValue();
        }
        f10301d = iIntValue;
    }

    private C2604v() {
    }

    /* renamed from: N */
    private final ExecutorService m8743N() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(m8747R(), new ThreadFactory() { // from class: f3.u
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return C2604v.m8744O(atomicInteger, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final Thread m8744O(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, C2769l.m9248l("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* renamed from: P */
    private final ExecutorService m8745P() {
        Class<?> cls;
        Object objInvoke;
        if (System.getSecurityManager() != null) {
            return m8743N();
        }
        ExecutorService executorService = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return m8743N();
        }
        if (!f10302e && f10301d < 0) {
            try {
                objInvoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused2) {
            }
            ExecutorService executorService2 = objInvoke instanceof ExecutorService ? (ExecutorService) objInvoke : null;
            if (executorService2 != null) {
                if (!f10300c.m8749S(cls, executorService2)) {
                    executorService2 = null;
                }
                if (executorService2 != null) {
                    return executorService2;
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f10300c.m8747R()));
            if (objNewInstance instanceof ExecutorService) {
                executorService = (ExecutorService) objNewInstance;
            }
        } catch (Throwable unused3) {
        }
        return executorService == null ? m8743N() : executorService;
    }

    /* renamed from: Q */
    private final synchronized Executor m8746Q() {
        Executor executorM8745P;
        executorM8745P = pool;
        if (executorM8745P == null) {
            executorM8745P = m8745P();
            pool = executorM8745P;
        }
        return executorM8745P;
    }

    /* renamed from: R */
    private final int m8747R() {
        Integer numValueOf = Integer.valueOf(f10301d);
        if (!(numValueOf.intValue() > 0)) {
            numValueOf = null;
        }
        return numValueOf == null ? C1037f.m4821b(Runtime.getRuntime().availableProcessors() - 1, 1) : numValueOf.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m8748T() {
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        try {
            Executor executorM8746Q = pool;
            if (executorM8746Q == null) {
                executorM8746Q = m8746Q();
            }
            C2536c.m8530a();
            executorM8746Q.execute(runnable);
        } catch (RejectedExecutionException unused) {
            C2536c.m8530a();
            RunnableC2577m0.f10266g.m8514d0(runnable);
        }
    }

    /* renamed from: S */
    public final boolean m8749S(@NotNull Class<?> cls, @NotNull ExecutorService executorService) {
        executorService.submit(new Runnable() { // from class: f3.t
            @Override // java.lang.Runnable
            public final void run() {
                C2604v.m8748T();
            }
        });
        Integer num = null;
        try {
            Object objInvoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (objInvoke instanceof Integer) {
                num = (Integer) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // p087f3.AbstractC2545e0
    @NotNull
    public String toString() {
        return "CommonPool";
    }
}
