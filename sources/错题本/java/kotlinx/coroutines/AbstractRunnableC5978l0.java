package kotlinx.coroutines;

import org.jetbrains.annotations.Nullable;
import p054e7.C5486r;
import p054e7.C5489u;

/* renamed from: kotlinx.coroutines.l0 */
/* loaded from: classes4.dex */
public abstract class AbstractRunnableC5978l0 implements Runnable, Comparable, InterfaceC5962g0 {

    @Nullable
    private volatile Object _heap;

    /* renamed from: a */
    public long f9468a;

    /* renamed from: b */
    public int f9469b = -1;

    public AbstractRunnableC5978l0(long j7) {
        this.f9468a = j7;
    }

    /* renamed from: b */
    public final int m5594b(long j7, C5981m0 c5981m0, AbstractC5984n0 abstractC5984n0) {
        synchronized (this) {
            if (this._heap == AbstractC6014x.f9518b) {
                return 2;
            }
            synchronized (c5981m0) {
                try {
                    AbstractRunnableC5978l0[] abstractRunnableC5978l0Arr = c5981m0.f8485a;
                    AbstractRunnableC5978l0 abstractRunnableC5978l0 = abstractRunnableC5978l0Arr != null ? abstractRunnableC5978l0Arr[0] : null;
                    if (AbstractC5984n0.f9474g.get(abstractC5984n0) == 1) {
                        return 1;
                    }
                    if (abstractRunnableC5978l0 == null) {
                        c5981m0.f9471c = j7;
                    } else {
                        long j8 = abstractRunnableC5978l0.f9468a;
                        if (j8 - j7 < 0) {
                            j7 = j8;
                        }
                        if (j7 - c5981m0.f9471c > 0) {
                            c5981m0.f9471c = j7;
                        }
                    }
                    long j9 = this.f9468a;
                    long j10 = c5981m0.f9471c;
                    if (j9 - j10 < 0) {
                        this.f9468a = j10;
                    }
                    c5981m0.m4867a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public final void m5595c(C5981m0 c5981m0) {
        if (this._heap == AbstractC6014x.f9518b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c5981m0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j7 = this.f9468a - ((AbstractRunnableC5978l0) obj).f9468a;
        if (j7 > 0) {
            return 1;
        }
        return j7 < 0 ? -1 : 0;
    }

    @Override // kotlinx.coroutines.InterfaceC5962g0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                C5486r c5486r = AbstractC6014x.f9518b;
                if (obj == c5486r) {
                    return;
                }
                C5981m0 c5981m0 = obj instanceof C5981m0 ? (C5981m0) obj : null;
                if (c5981m0 != null) {
                    synchronized (c5981m0) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof C5489u ? (C5489u) obj2 : null) != null) {
                            c5981m0.m4868b(this.f9469b);
                        }
                    }
                }
                this._heap = c5486r;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f9468a + ']';
    }
}
