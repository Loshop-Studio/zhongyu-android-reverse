package p087f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p171x2.InterfaceC3470l;

/* renamed from: f3.k1 */
/* loaded from: classes.dex */
final class C2570k1 extends AbstractC2585o1 {

    /* renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10255f = AtomicIntegerFieldUpdater.newUpdater(C2570k1.class, "_invoked");

    @NotNull
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e */
    @NotNull
    private final InterfaceC3470l<Throwable, C2925r> f10256e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2570k1(@NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l) {
        this.f10256e = interfaceC3470l;
    }

    @Override // p171x2.InterfaceC3470l
    public /* bridge */ /* synthetic */ C2925r invoke(Throwable th) {
        mo8502s(th);
        return C2925r.f11415a;
    }

    @Override // p087f3.AbstractC2529a0
    /* renamed from: s */
    public void mo8502s(@Nullable Throwable th) {
        if (f10255f.compareAndSet(this, 0, 1)) {
            this.f10256e.invoke(th);
        }
    }
}
