package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;
import p087f3.C2573l0;

/* renamed from: kotlinx.coroutines.scheduling.k */
/* loaded from: classes.dex */
public final class C2822k extends AbstractRunnableC2820i {

    /* renamed from: c */
    @NotNull
    public final Runnable f10842c;

    public C2822k(@NotNull Runnable runnable, long j4, @NotNull InterfaceC2821j interfaceC2821j) {
        super(j4, interfaceC2821j);
        this.f10842c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f10842c.run();
        } finally {
            this.f10841b.mo9420q();
        }
    }

    @NotNull
    public String toString() {
        return "Task[" + C2573l0.m8591a(this.f10842c) + '@' + C2573l0.m8592b(this.f10842c) + ", " + this.f10840a + ", " + this.f10841b + ']';
    }
}
