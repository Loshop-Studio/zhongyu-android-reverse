package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.C0633o;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p093h.C2650a;

/* renamed from: androidx.room.j0 */
/* loaded from: classes.dex */
class C0625j0<T> extends LiveData<T> {

    /* renamed from: a */
    final AbstractC0621h0 f4021a;

    /* renamed from: b */
    final boolean f4022b;

    /* renamed from: c */
    final Callable<T> f4023c;

    /* renamed from: d */
    private final C0630m f4024d;

    /* renamed from: e */
    final C0633o.c f4025e;

    /* renamed from: f */
    final AtomicBoolean f4026f = new AtomicBoolean(true);

    /* renamed from: g */
    final AtomicBoolean f4027g = new AtomicBoolean(false);

    /* renamed from: h */
    final AtomicBoolean f4028h = new AtomicBoolean(false);

    /* renamed from: i */
    final Runnable f4029i = new a();

    /* renamed from: j */
    final Runnable f4030j = new b();

    /* renamed from: androidx.room.j0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z3;
            if (C0625j0.this.f4028h.compareAndSet(false, true)) {
                C0625j0.this.f4021a.m3548k().m3617b(C0625j0.this.f4025e);
            }
            do {
                if (C0625j0.this.f4027g.compareAndSet(false, true)) {
                    T tCall = null;
                    z3 = false;
                    while (C0625j0.this.f4026f.compareAndSet(true, false)) {
                        try {
                            try {
                                tCall = C0625j0.this.f4023c.call();
                                z3 = true;
                            } catch (Exception e4) {
                                throw new RuntimeException("Exception while computing database live data.", e4);
                            }
                        } finally {
                            C0625j0.this.f4027g.set(false);
                        }
                    }
                    if (z3) {
                        C0625j0.this.postValue(tCall);
                    }
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return;
                }
            } while (C0625j0.this.f4026f.get());
        }
    }

    /* renamed from: androidx.room.j0$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zHasActiveObservers = C0625j0.this.hasActiveObservers();
            if (C0625j0.this.f4026f.compareAndSet(false, true) && zHasActiveObservers) {
                C0625j0.this.m3595b().execute(C0625j0.this.f4029i);
            }
        }
    }

    /* renamed from: androidx.room.j0$c */
    class c extends C0633o.c {
        c(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C0633o.c
        /* renamed from: b */
        public void mo3596b(Set<String> set) {
            C2650a.m8861f().m8866b(C0625j0.this.f4030j);
        }
    }

    @SuppressLint({"RestrictedApi"})
    C0625j0(AbstractC0621h0 abstractC0621h0, C0630m c0630m, boolean z3, Callable<T> callable, String[] strArr) {
        this.f4021a = abstractC0621h0;
        this.f4022b = z3;
        this.f4023c = callable;
        this.f4024d = c0630m;
        this.f4025e = new c(strArr);
    }

    /* renamed from: b */
    Executor m3595b() {
        return this.f4022b ? this.f4021a.m3552o() : this.f4021a.m3550m();
    }

    @Override // androidx.lifecycle.LiveData
    protected void onActive() {
        super.onActive();
        this.f4024d.m3607b(this);
        m3595b().execute(this.f4029i);
    }

    @Override // androidx.lifecycle.LiveData
    protected void onInactive() {
        super.onInactive();
        this.f4024d.m3608c(this);
    }
}
