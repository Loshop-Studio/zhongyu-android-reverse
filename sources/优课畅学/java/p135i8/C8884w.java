package p135i8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC9126n;

/* renamed from: i8.w */
/* loaded from: classes5.dex */
public class C8884w {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f16544b = AtomicIntegerFieldUpdater.newUpdater(C8884w.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a */
    public final Throwable f16545a;

    public C8884w(Throwable th, boolean z10) {
        this.f16545a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    /* renamed from: a */
    public final boolean m14927a() {
        return f16544b.get(this) != 0;
    }

    /* renamed from: c */
    public final boolean m14928c() {
        return f16544b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return AbstractC8825c0.m14820a(this) + '[' + this.f16545a + ']';
    }

    public /* synthetic */ C8884w(Throwable th, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }
}
