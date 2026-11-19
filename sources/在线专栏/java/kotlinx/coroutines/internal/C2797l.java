package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes.dex */
public class C2797l<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10769a = AtomicReferenceFieldUpdater.newUpdater(C2797l.class, Object.class, "_cur");

    @NotNull
    private volatile /* synthetic */ Object _cur;

    public C2797l(boolean z3) {
        this._cur = new C2798m(8, z3);
    }

    /* renamed from: a */
    public final boolean m9314a(@NotNull E e4) {
        while (true) {
            C2798m c2798m = (C2798m) this._cur;
            int iM9323a = c2798m.m9323a(e4);
            if (iM9323a == 0) {
                return true;
            }
            if (iM9323a == 1) {
                C0827b.m4278a(f10769a, this, c2798m, c2798m.m9327i());
            } else if (iM9323a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void m9315b() {
        while (true) {
            C2798m c2798m = (C2798m) this._cur;
            if (c2798m.m9324d()) {
                return;
            } else {
                C0827b.m4278a(f10769a, this, c2798m, c2798m.m9327i());
            }
        }
    }

    /* renamed from: c */
    public final int m9316c() {
        return ((C2798m) this._cur).m9325f();
    }

    @Nullable
    /* renamed from: d */
    public final E m9317d() {
        while (true) {
            C2798m c2798m = (C2798m) this._cur;
            E e4 = (E) c2798m.m9328j();
            if (e4 != C2798m.f10773h) {
                return e4;
            }
            C0827b.m4278a(f10769a, this, c2798m, c2798m.m9327i());
        }
    }
}
