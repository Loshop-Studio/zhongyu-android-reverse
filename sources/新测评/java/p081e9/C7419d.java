package p081e9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p028b9.AbstractC5070d;

/* renamed from: e9.d */
/* loaded from: classes5.dex */
public final class C7419d {

    /* renamed from: a */
    public final C7420e f12098a;

    /* renamed from: b */
    public final String f12099b;

    /* renamed from: c */
    public boolean f12100c;

    /* renamed from: d */
    public AbstractC7416a f12101d;

    /* renamed from: e */
    public final List f12102e;

    /* renamed from: f */
    public boolean f12103f;

    public C7419d(C7420e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f12098a = taskRunner;
        this.f12099b = name;
        this.f12102e = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m11921j(C7419d c7419d, AbstractC7416a abstractC7416a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c7419d.m11930i(abstractC7416a, j10);
    }

    /* renamed from: a */
    public final void m11922a() {
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f12098a) {
            try {
                if (m11923b()) {
                    this.f12098a.m11942h(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m11923b() {
        AbstractC7416a abstractC7416a = this.f12101d;
        if (abstractC7416a != null) {
            Intrinsics.checkNotNull(abstractC7416a);
            if (abstractC7416a.m11911a()) {
                this.f12103f = true;
            }
        }
        boolean z9 = false;
        for (int size = this.f12102e.size() - 1; -1 < size; size--) {
            if (((AbstractC7416a) this.f12102e.get(size)).m11911a()) {
                AbstractC7416a abstractC7416a2 = (AbstractC7416a) this.f12102e.get(size);
                if (C7420e.f12104h.m11948a().isLoggable(Level.FINE)) {
                    AbstractC7417b.m11920c(abstractC7416a2, this, "canceled");
                }
                this.f12102e.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    /* renamed from: c */
    public final AbstractC7416a m11924c() {
        return this.f12101d;
    }

    /* renamed from: d */
    public final boolean m11925d() {
        return this.f12103f;
    }

    /* renamed from: e */
    public final List m11926e() {
        return this.f12102e;
    }

    /* renamed from: f */
    public final String m11927f() {
        return this.f12099b;
    }

    /* renamed from: g */
    public final boolean m11928g() {
        return this.f12100c;
    }

    /* renamed from: h */
    public final C7420e m11929h() {
        return this.f12098a;
    }

    /* renamed from: i */
    public final void m11930i(AbstractC7416a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f12098a) {
            if (!this.f12100c) {
                if (m11931k(task, j10, false)) {
                    this.f12098a.m11942h(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.m11911a()) {
                if (C7420e.f12104h.m11948a().isLoggable(Level.FINE)) {
                    AbstractC7417b.m11920c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C7420e.f12104h.m11948a().isLoggable(Level.FINE)) {
                    AbstractC7417b.m11920c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m11931k(AbstractC7416a task, long j10, boolean z9) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.m11915e(this);
        long jMo11947c = this.f12098a.m11941g().mo11947c();
        long j11 = jMo11947c + j10;
        int iIndexOf = this.f12102e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m11913c() <= j11) {
                if (C7420e.f12104h.m11948a().isLoggable(Level.FINE)) {
                    AbstractC7417b.m11920c(task, this, "already scheduled");
                }
                return false;
            }
            this.f12102e.remove(iIndexOf);
        }
        task.m11917g(j11);
        if (C7420e.f12104h.m11948a().isLoggable(Level.FINE)) {
            if (z9) {
                str = "run again after " + AbstractC7417b.m11919b(j11 - jMo11947c);
            } else {
                str = "scheduled after " + AbstractC7417b.m11919b(j11 - jMo11947c);
            }
            AbstractC7417b.m11920c(task, this, str);
        }
        Iterator it = this.f12102e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC7416a) it.next()).m11913c() - jMo11947c > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f12102e.size();
        }
        this.f12102e.add(size, task);
        return size == 0;
    }

    /* renamed from: l */
    public final void m11932l(AbstractC7416a abstractC7416a) {
        this.f12101d = abstractC7416a;
    }

    /* renamed from: m */
    public final void m11933m(boolean z9) {
        this.f12103f = z9;
    }

    /* renamed from: n */
    public final void m11934n() {
        if (AbstractC5070d.f2640h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f12098a) {
            try {
                this.f12100c = true;
                if (m11923b()) {
                    this.f12098a.m11942h(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f12099b;
    }
}
