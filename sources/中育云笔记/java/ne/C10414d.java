package ne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* renamed from: ne.d */
/* loaded from: classes6.dex */
public final class C10414d {

    /* renamed from: a */
    public final C10415e f24777a;

    /* renamed from: b */
    public final String f24778b;

    /* renamed from: c */
    public boolean f24779c;

    /* renamed from: d */
    public AbstractC10411a f24780d;

    /* renamed from: e */
    public final List f24781e;

    /* renamed from: f */
    public boolean f24782f;

    public C10414d(C10415e taskRunner, String name) {
        AbstractC9979u.m20294g(taskRunner, "taskRunner");
        AbstractC9979u.m20294g(name, "name");
        this.f24777a = taskRunner;
        this.f24778b = name;
        this.f24781e = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m21779j(C10414d c10414d, AbstractC10411a abstractC10411a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c10414d.m21788i(abstractC10411a, j10);
    }

    /* renamed from: a */
    public final void m21780a() {
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f24777a) {
            try {
                if (m21781b()) {
                    this.f24777a.m21800h(this);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m21781b() {
        AbstractC10411a abstractC10411a = this.f24780d;
        if (abstractC10411a != null) {
            AbstractC9979u.m20291d(abstractC10411a);
            if (abstractC10411a.m21769a()) {
                this.f24782f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f24781e.size() - 1; -1 < size; size--) {
            if (((AbstractC10411a) this.f24781e.get(size)).m21769a()) {
                AbstractC10411a abstractC10411a2 = (AbstractC10411a) this.f24781e.get(size);
                if (C10415e.f24783h.m21805a().isLoggable(Level.FINE)) {
                    AbstractC10412b.m21778c(abstractC10411a2, this, "canceled");
                }
                this.f24781e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public final AbstractC10411a m21782c() {
        return this.f24780d;
    }

    /* renamed from: d */
    public final boolean m21783d() {
        return this.f24782f;
    }

    /* renamed from: e */
    public final List m21784e() {
        return this.f24781e;
    }

    /* renamed from: f */
    public final String m21785f() {
        return this.f24778b;
    }

    /* renamed from: g */
    public final boolean m21786g() {
        return this.f24779c;
    }

    /* renamed from: h */
    public final C10415e m21787h() {
        return this.f24777a;
    }

    /* renamed from: i */
    public final void m21788i(AbstractC10411a task, long j10) {
        AbstractC9979u.m20294g(task, "task");
        synchronized (this.f24777a) {
            if (!this.f24779c) {
                if (m21789k(task, j10, false)) {
                    this.f24777a.m21800h(this);
                }
                C10786q c10786q = C10786q.f26013a;
            } else if (task.m21769a()) {
                if (C10415e.f24783h.m21805a().isLoggable(Level.FINE)) {
                    AbstractC10412b.m21778c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C10415e.f24783h.m21805a().isLoggable(Level.FINE)) {
                    AbstractC10412b.m21778c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m21789k(AbstractC10411a task, long j10, boolean z10) {
        String str;
        AbstractC9979u.m20294g(task, "task");
        task.m21773e(this);
        long jNanoTime = this.f24777a.m21799g().nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.f24781e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m21771c() <= j11) {
                if (C10415e.f24783h.m21805a().isLoggable(Level.FINE)) {
                    AbstractC10412b.m21778c(task, this, "already scheduled");
                }
                return false;
            }
            this.f24781e.remove(iIndexOf);
        }
        task.m21775g(j11);
        if (C10415e.f24783h.m21805a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + AbstractC10412b.m21777b(j11 - jNanoTime);
            } else {
                str = "scheduled after " + AbstractC10412b.m21777b(j11 - jNanoTime);
            }
            AbstractC10412b.m21778c(task, this, str);
        }
        Iterator it = this.f24781e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC10411a) it.next()).m21771c() - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f24781e.size();
        }
        this.f24781e.add(size, task);
        return size == 0;
    }

    /* renamed from: l */
    public final void m21790l(AbstractC10411a abstractC10411a) {
        this.f24780d = abstractC10411a;
    }

    /* renamed from: m */
    public final void m21791m(boolean z10) {
        this.f24782f = z10;
    }

    /* renamed from: n */
    public final void m21792n() {
        if (AbstractC9920d.f23248h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f24777a) {
            try {
                this.f24779c = true;
                if (m21781b()) {
                    this.f24777a.m21800h(this);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f24778b;
    }
}
