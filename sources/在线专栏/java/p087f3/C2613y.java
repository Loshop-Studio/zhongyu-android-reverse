package p087f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.y */
/* loaded from: classes.dex */
public class C2613y {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f10315b = AtomicIntegerFieldUpdater.newUpdater(C2613y.class, "_handled");

    @NotNull
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    @NotNull
    public final Throwable f10316a;

    public C2613y(@NotNull Throwable th, boolean z3) {
        this.f10316a = th;
        this._handled = z3 ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* renamed from: a */
    public final boolean m8759a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean m8760b() {
        return f10315b.compareAndSet(this, 0, 1);
    }

    @NotNull
    public String toString() {
        return C2573l0.m8591a(this) + '[' + this.f10316a + ']';
    }

    public /* synthetic */ C2613y(Throwable th, boolean z3, int i4, C2764g c2764g) {
        this(th, (i4 & 2) != 0 ? false : z3);
    }
}
