package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;
import p087f3.AbstractC2546e1;
import p087f3.RunnableC2577m0;
import p142q2.InterfaceC3015g;

/* renamed from: kotlinx.coroutines.scheduling.c */
/* loaded from: classes.dex */
public class C2814c extends AbstractC2546e1 {

    /* renamed from: c */
    private final int f10826c;

    /* renamed from: d */
    private final int f10827d;

    /* renamed from: e */
    private final long f10828e;

    /* renamed from: f */
    @NotNull
    private final String f10829f;

    /* renamed from: g */
    @NotNull
    private ExecutorC2812a f10830g;

    public C2814c(int i4, int i5, long j4, @NotNull String str) {
        this.f10826c = i4;
        this.f10827d = i5;
        this.f10828e = j4;
        this.f10829f = str;
        this.f10830g = m9416L();
    }

    /* renamed from: L */
    private final ExecutorC2812a m9416L() {
        return new ExecutorC2812a(this.f10826c, this.f10827d, this.f10828e, this.f10829f);
    }

    @Override // p087f3.AbstractC2545e0
    /* renamed from: J */
    public void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable) {
        try {
            ExecutorC2812a.m9384o(this.f10830g, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            RunnableC2577m0.f10266g.mo2905J(interfaceC3015g, runnable);
        }
    }

    /* renamed from: M */
    public final void m9417M(@NotNull Runnable runnable, @NotNull InterfaceC2821j interfaceC2821j, boolean z3) {
        try {
            this.f10830g.m9389n(runnable, interfaceC2821j, z3);
        } catch (RejectedExecutionException unused) {
            RunnableC2577m0.f10266g.m8514d0(this.f10830g.m9388d(runnable, interfaceC2821j));
        }
    }

    public /* synthetic */ C2814c(int i4, int i5, String str, int i6, C2764g c2764g) {
        this((i6 & 1) != 0 ? C2823l.f10845c : i4, (i6 & 2) != 0 ? C2823l.f10846d : i5, (i6 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    public C2814c(int i4, int i5, @NotNull String str) {
        this(i4, i5, C2823l.f10847e, str);
    }
}
