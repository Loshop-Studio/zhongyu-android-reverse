package p087f3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;

/* renamed from: f3.o */
/* loaded from: classes.dex */
public final class C2583o extends C2613y {

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10274c = AtomicIntegerFieldUpdater.newUpdater(C2583o.class, "_resumed");

    @NotNull
    private volatile /* synthetic */ int _resumed;

    public C2583o(@NotNull InterfaceC3012d<?> interfaceC3012d, @Nullable Throwable th, boolean z3) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC3012d + " was cancelled normally");
        }
        super(th, z3);
        this._resumed = 0;
    }

    /* renamed from: c */
    public final boolean m8641c() {
        return f10274c.compareAndSet(this, 0, 1);
    }
}
