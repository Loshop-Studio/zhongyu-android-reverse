package p216p8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p182m8.AbstractC9045d;

/* renamed from: p8.d */
/* loaded from: classes5.dex */
public final class C9341d {

    /* renamed from: a */
    public final C9342e f16220a;

    /* renamed from: b */
    public final String f16221b;

    /* renamed from: c */
    public boolean f16222c;

    /* renamed from: d */
    public AbstractC9338a f16223d;

    /* renamed from: e */
    public final List f16224e;

    /* renamed from: f */
    public boolean f16225f;

    public C9341d(C9342e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f16220a = taskRunner;
        this.f16221b = name;
        this.f16224e = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m15257j(C9341d c9341d, AbstractC9338a abstractC9338a, long j9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            j9 = 0;
        }
        c9341d.m15266i(abstractC9338a, j9);
    }

    /* renamed from: a */
    public final void m15258a() {
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f16220a) {
            try {
                if (m15259b()) {
                    this.f16220a.m15278h(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m15259b() {
        AbstractC9338a abstractC9338a = this.f16223d;
        if (abstractC9338a != null) {
            Intrinsics.checkNotNull(abstractC9338a);
            if (abstractC9338a.m15248a()) {
                this.f16225f = true;
            }
        }
        boolean z9 = false;
        for (int size = this.f16224e.size() - 1; -1 < size; size--) {
            if (((AbstractC9338a) this.f16224e.get(size)).m15248a()) {
                AbstractC9338a abstractC9338a2 = (AbstractC9338a) this.f16224e.get(size);
                if (C9342e.f16226h.m15284a().isLoggable(Level.FINE)) {
                    AbstractC9339b.m15256c(abstractC9338a2, this, "canceled");
                }
                this.f16224e.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    /* renamed from: c */
    public final AbstractC9338a m15260c() {
        return this.f16223d;
    }

    /* renamed from: d */
    public final boolean m15261d() {
        return this.f16225f;
    }

    /* renamed from: e */
    public final List m15262e() {
        return this.f16224e;
    }

    /* renamed from: f */
    public final String m15263f() {
        return this.f16221b;
    }

    /* renamed from: g */
    public final boolean m15264g() {
        return this.f16222c;
    }

    /* renamed from: h */
    public final C9342e m15265h() {
        return this.f16220a;
    }

    /* renamed from: i */
    public final void m15266i(AbstractC9338a task, long j9) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f16220a) {
            if (!this.f16222c) {
                if (m15267k(task, j9, false)) {
                    this.f16220a.m15278h(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.m15248a()) {
                if (C9342e.f16226h.m15284a().isLoggable(Level.FINE)) {
                    AbstractC9339b.m15256c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C9342e.f16226h.m15284a().isLoggable(Level.FINE)) {
                    AbstractC9339b.m15256c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m15267k(AbstractC9338a task, long j9, boolean z9) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.m15252e(this);
        long jMo15283c = this.f16220a.m15277g().mo15283c();
        long j10 = jMo15283c + j9;
        int iIndexOf = this.f16224e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m15250c() <= j10) {
                if (C9342e.f16226h.m15284a().isLoggable(Level.FINE)) {
                    AbstractC9339b.m15256c(task, this, "already scheduled");
                }
                return false;
            }
            this.f16224e.remove(iIndexOf);
        }
        task.m15253g(j10);
        if (C9342e.f16226h.m15284a().isLoggable(Level.FINE)) {
            if (z9) {
                str = "run again after " + AbstractC9339b.m15255b(j10 - jMo15283c);
            } else {
                str = "scheduled after " + AbstractC9339b.m15255b(j10 - jMo15283c);
            }
            AbstractC9339b.m15256c(task, this, str);
        }
        Iterator it = this.f16224e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC9338a) it.next()).m15250c() - jMo15283c > j9) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f16224e.size();
        }
        this.f16224e.add(size, task);
        return size == 0;
    }

    /* renamed from: l */
    public final void m15268l(AbstractC9338a abstractC9338a) {
        this.f16223d = abstractC9338a;
    }

    /* renamed from: m */
    public final void m15269m(boolean z9) {
        this.f16225f = z9;
    }

    /* renamed from: n */
    public final void m15270n() {
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f16220a) {
            try {
                this.f16222c = true;
                if (m15259b()) {
                    this.f16220a.m15278h(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f16221b;
    }
}
