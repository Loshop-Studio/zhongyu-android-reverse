package sd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p181hd.InterfaceC9540l;

/* renamed from: sd.l1 */
/* loaded from: classes6.dex */
public final class C11135l1 extends AbstractC11151p1 {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26801h = AtomicIntegerFieldUpdater.newUpdater(C11135l1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: g */
    public final InterfaceC9540l f26802g;

    public C11135l1(InterfaceC9540l interfaceC9540l) {
        this.f26802g = interfaceC9540l;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: u */
    public boolean mo20468u() {
        return true;
    }

    @Override // sd.AbstractC11151p1
    /* renamed from: v */
    public void mo20469v(Throwable th) {
        if (f26801h.compareAndSet(this, 0, 1)) {
            this.f26802g.invoke(th);
        }
    }
}
