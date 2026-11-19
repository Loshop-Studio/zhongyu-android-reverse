package sd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC9972n;

/* renamed from: sd.x */
/* loaded from: classes6.dex */
public class C11174x {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f26836b = AtomicIntegerFieldUpdater.newUpdater(C11174x.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f26837a;

    public C11174x(Throwable th, boolean z10) {
        this.f26837a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m24814a() {
        return f26836b.get(this) == 1;
    }

    /* renamed from: c */
    public final boolean m24815c() {
        return f26836b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC11126j0.m24738a(this) + '[' + this.f26837a + ']';
    }

    public /* synthetic */ C11174x(Throwable th, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
