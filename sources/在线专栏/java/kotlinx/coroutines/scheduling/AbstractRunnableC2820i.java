package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.i */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC2820i implements Runnable {

    /* renamed from: a */
    public long f10840a;

    /* renamed from: b */
    @NotNull
    public InterfaceC2821j f10841b;

    public AbstractRunnableC2820i(long j4, @NotNull InterfaceC2821j interfaceC2821j) {
        this.f10840a = j4;
        this.f10841b = interfaceC2821j;
    }

    public AbstractRunnableC2820i() {
        this(0L, C2818g.f10838a);
    }
}
