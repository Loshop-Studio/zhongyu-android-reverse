package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: kotlinx.coroutines.p */
/* loaded from: classes4.dex */
public class C5989p {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9485b = AtomicIntegerFieldUpdater.newUpdater(C5989p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f9486a;

    public C5989p(boolean z8, Throwable th) {
        this.f9486a = th;
        this._handled$volatile = z8 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f9486a + ']';
    }
}
