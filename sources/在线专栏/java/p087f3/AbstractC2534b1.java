package p087f3;

import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import p087f3.AbstractC2530a1;

/* renamed from: f3.b1 */
/* loaded from: classes.dex */
public abstract class AbstractC2534b1 extends AbstractC2617z0 {
    @NotNull
    /* renamed from: X */
    protected abstract Thread mo8526X();

    /* renamed from: Y */
    protected final void m8527Y(long j4, @NotNull AbstractC2530a1.b bVar) {
        RunnableC2577m0.f10266g.m8517j0(j4, bVar);
    }

    /* renamed from: Z */
    protected final void m8528Z() {
        Thread threadMo8526X = mo8526X();
        if (Thread.currentThread() != threadMo8526X) {
            C2536c.m8530a();
            LockSupport.unpark(threadMo8526X);
        }
    }
}
