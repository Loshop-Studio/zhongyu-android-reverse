package p087f3;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p077d3.C2461h;
import p077d3.C2463j;
import p142q2.InterfaceC3015g;

/* renamed from: f3.f0 */
/* loaded from: classes.dex */
public final class C2549f0 {

    /* renamed from: a */
    @NotNull
    private static final List<CoroutineExceptionHandler> f10241a = C2463j.m8219j(C2461h.m8210a(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final void m8553a(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Throwable th) {
        Iterator<CoroutineExceptionHandler> it = f10241a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(interfaceC3015g, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, C2553g0.m8562b(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
