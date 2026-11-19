package sd;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import vc.InterfaceC11588c;

/* renamed from: sd.n */
/* loaded from: classes6.dex */
public final class C11141n extends C11174x {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26806c = AtomicIntegerFieldUpdater.newUpdater(C11141n.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public C11141n(InterfaceC11588c interfaceC11588c, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC11588c + " was cancelled normally");
        }
        super(th, z10);
    }

    /* renamed from: e */
    public final boolean m24762e() {
        return f26806c.compareAndSet(this, 0, 1);
    }
}
