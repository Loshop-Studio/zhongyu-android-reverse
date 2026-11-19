package p087f3;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;

/* renamed from: f3.e */
/* loaded from: classes.dex */
final class C2544e<T> extends AbstractC2528a<T> {

    /* renamed from: c */
    @NotNull
    private final Thread f10234c;

    /* renamed from: d */
    @Nullable
    private final AbstractC2617z0 f10235d;

    public C2544e(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Thread thread, @Nullable AbstractC2617z0 abstractC2617z0) {
        super(interfaceC3015g, true, true);
        this.f10234c = thread;
        this.f10235d = abstractC2617z0;
    }

    @Override // p087f3.C2600t1
    /* renamed from: U */
    protected boolean mo8545U() {
        return true;
    }

    @Override // p087f3.C2600t1
    /* renamed from: l */
    protected void mo8546l(@Nullable Object obj) {
        if (C2769l.m9237a(Thread.currentThread(), this.f10234c)) {
            return;
        }
        Thread thread = this.f10234c;
        C2536c.m8530a();
        LockSupport.unpark(thread);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x0 */
    public final T m8547x0() throws Throwable {
        C2536c.m8530a();
        try {
            AbstractC2617z0 abstractC2617z0 = this.f10235d;
            if (abstractC2617z0 != null) {
                AbstractC2617z0.m8763R(abstractC2617z0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC2617z0 abstractC2617z02 = this.f10235d;
                    long jMo8513U = abstractC2617z02 == null ? Long.MAX_VALUE : abstractC2617z02.mo8513U();
                    if (m8703T()) {
                        AbstractC2617z0 abstractC2617z03 = this.f10235d;
                        if (abstractC2617z03 != null) {
                            AbstractC2617z0.m8761M(abstractC2617z03, false, 1, null);
                        }
                        C2536c.m8530a();
                        T t3 = (T) C2603u1.m8740h(m8700O());
                        C2613y c2613y = t3 instanceof C2613y ? (C2613y) t3 : null;
                        if (c2613y == null) {
                            return t3;
                        }
                        throw c2613y.f10316a;
                    }
                    C2536c.m8530a();
                    LockSupport.parkNanos(this, jMo8513U);
                } catch (Throwable th) {
                    AbstractC2617z0 abstractC2617z04 = this.f10235d;
                    if (abstractC2617z04 != null) {
                        AbstractC2617z0.m8761M(abstractC2617z04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m8712v(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            C2536c.m8530a();
            throw th2;
        }
    }
}
