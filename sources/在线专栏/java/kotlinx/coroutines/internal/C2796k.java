package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.k */
/* loaded from: classes.dex */
public class C2796k {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f10764a = AtomicReferenceFieldUpdater.newUpdater(C2796k.class, Object.class, "_next");

    /* renamed from: b */
    static final /* synthetic */ AtomicReferenceFieldUpdater f10765b = AtomicReferenceFieldUpdater.newUpdater(C2796k.class, Object.class, "_prev");

    /* renamed from: c */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10766c = AtomicReferenceFieldUpdater.newUpdater(C2796k.class, Object.class, "_removedRef");

    @NotNull
    volatile /* synthetic */ Object _next = this;

    @NotNull
    volatile /* synthetic */ Object _prev = this;

    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.k$a */
    public static abstract class a extends AbstractC2788c<C2796k> {

        /* renamed from: b */
        @NotNull
        public final C2796k f10767b;

        /* renamed from: c */
        @Nullable
        public C2796k f10768c;

        public a(@NotNull C2796k c2796k) {
            this.f10767b = c2796k;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2788c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo9279d(@NotNull C2796k c2796k, @Nullable Object obj) {
            boolean z3 = obj == null;
            C2796k c2796k2 = z3 ? this.f10767b : this.f10768c;
            if (c2796k2 != null && C0827b.m4278a(C2796k.f10764a, c2796k, this, c2796k2) && z3) {
                C2796k c2796k3 = this.f10767b;
                C2796k c2796k4 = this.f10768c;
                C2769l.m9239c(c2796k4);
                c2796k3.m9304j(c2796k4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (androidx.work.impl.utils.futures.C0827b.m4278a(kotlinx.coroutines.internal.C2796k.f10764a, r3, r2, ((kotlinx.coroutines.internal.C2803r) r4).f10785a) != false) goto L30;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.internal.C2796k m9302h(kotlinx.coroutines.internal.AbstractC2802q r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.k r0 = (kotlinx.coroutines.internal.C2796k) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.C2796k.f10765b
            boolean r0 = androidx.work.impl.utils.futures.C0827b.m4278a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.mo9298n()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.AbstractC2802q
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            kotlinx.coroutines.internal.q r0 = (kotlinx.coroutines.internal.AbstractC2802q) r0
            boolean r0 = r8.m9341b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            kotlinx.coroutines.internal.q r4 = (kotlinx.coroutines.internal.AbstractC2802q) r4
            r4.mo9278c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C2803r
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.C2796k.f10764a
            kotlinx.coroutines.internal.r r4 = (kotlinx.coroutines.internal.C2803r) r4
            kotlinx.coroutines.internal.k r4 = r4.f10785a
            boolean r2 = androidx.work.impl.utils.futures.C0827b.m4278a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.k r2 = (kotlinx.coroutines.internal.C2796k) r2
            goto L7
        L52:
            r3 = r4
            kotlinx.coroutines.internal.k r3 = (kotlinx.coroutines.internal.C2796k) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C2796k.m9302h(kotlinx.coroutines.internal.q):kotlinx.coroutines.internal.k");
    }

    /* renamed from: i */
    private final C2796k m9303i(C2796k c2796k) {
        while (c2796k.mo9298n()) {
            c2796k = (C2796k) c2796k._prev;
        }
        return c2796k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m9304j(C2796k c2796k) {
        C2796k c2796k2;
        do {
            c2796k2 = (C2796k) c2796k._prev;
            if (m9307k() != c2796k) {
                return;
            }
        } while (!C0827b.m4278a(f10765b, c2796k, c2796k2, this));
        if (mo9298n()) {
            c2796k.m9302h(null);
        }
    }

    /* renamed from: q */
    private final C2803r m9305q() {
        C2803r c2803r = (C2803r) this._removedRef;
        if (c2803r != null) {
            return c2803r;
        }
        C2803r c2803r2 = new C2803r(this);
        f10766c.lazySet(this, c2803r2);
        return c2803r2;
    }

    /* renamed from: g */
    public final boolean m9306g(@NotNull C2796k c2796k) {
        f10765b.lazySet(c2796k, this);
        f10764a.lazySet(c2796k, this);
        while (m9307k() == this) {
            if (C0827b.m4278a(f10764a, this, this, c2796k)) {
                c2796k.m9304j(this);
                return true;
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: k */
    public final Object m9307k() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC2802q)) {
                return obj;
            }
            ((AbstractC2802q) obj).mo9278c(this);
        }
    }

    @NotNull
    /* renamed from: l */
    public final C2796k m9308l() {
        return C2795j.m9300b(m9307k());
    }

    @NotNull
    /* renamed from: m */
    public final C2796k m9309m() {
        C2796k c2796kM9302h = m9302h(null);
        return c2796kM9302h == null ? m9303i((C2796k) this._prev) : c2796kM9302h;
    }

    /* renamed from: n */
    public boolean mo9298n() {
        return m9307k() instanceof C2803r;
    }

    /* renamed from: o */
    public boolean m9310o() {
        return m9311p() == null;
    }

    @Nullable
    /* renamed from: p */
    public final C2796k m9311p() {
        Object objM9307k;
        C2796k c2796k;
        do {
            objM9307k = m9307k();
            if (objM9307k instanceof C2803r) {
                return ((C2803r) objM9307k).f10785a;
            }
            if (objM9307k == this) {
                return (C2796k) objM9307k;
            }
            c2796k = (C2796k) objM9307k;
        } while (!C0827b.m4278a(f10764a, this, objM9307k, c2796k.m9305q()));
        c2796k.m9302h(null);
        return null;
    }

    /* renamed from: r */
    public final int m9312r(@NotNull C2796k c2796k, @NotNull C2796k c2796k2, @NotNull a aVar) {
        f10765b.lazySet(c2796k, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10764a;
        atomicReferenceFieldUpdater.lazySet(c2796k, c2796k2);
        aVar.f10768c = c2796k2;
        if (C0827b.m4278a(atomicReferenceFieldUpdater, this, c2796k2, aVar)) {
            return aVar.mo9278c(this) == null ? 1 : 2;
        }
        return 0;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('@');
        sb.append((Object) Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }
}
