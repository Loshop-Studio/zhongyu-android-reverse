package p133v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p121s2.AbstractC4550b;

/* renamed from: v2.d */
/* loaded from: classes2.dex */
public final class C4634d {

    /* renamed from: a */
    public boolean f5843a;

    /* renamed from: b */
    public AbstractC4631a f5844b;

    /* renamed from: c */
    public final List f5845c;

    /* renamed from: d */
    public boolean f5846d;

    /* renamed from: e */
    public final C4635e f5847e;

    /* renamed from: f */
    public final String f5848f;

    public C4634d(C4635e taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f5847e = taskRunner;
        this.f5848f = name;
        this.f5845c = new ArrayList();
    }

    /* renamed from: j */
    public static /* synthetic */ void m6429j(C4634d c4634d, AbstractC4631a abstractC4631a, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        c4634d.m6438i(abstractC4631a, j4);
    }

    /* renamed from: a */
    public final void m6430a() {
        if (!AbstractC4550b.f5708h || !Thread.holdsLock(this)) {
            synchronized (this.f5847e) {
                if (m6431b()) {
                    this.f5847e.m6450h(this);
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    public final boolean m6431b() {
        AbstractC4631a abstractC4631a = this.f5844b;
        if (abstractC4631a != null) {
            Intrinsics.checkNotNull(abstractC4631a);
            if (abstractC4631a.m6419a()) {
                this.f5846d = true;
            }
        }
        boolean z3 = false;
        for (int size = this.f5845c.size() - 1; size >= 0; size--) {
            if (((AbstractC4631a) this.f5845c.get(size)).m6419a()) {
                AbstractC4631a abstractC4631a2 = (AbstractC4631a) this.f5845c.get(size);
                if (C4635e.f5851j.m6456a().isLoggable(Level.FINE)) {
                    AbstractC4632b.m6428c(abstractC4631a2, this, "canceled");
                }
                this.f5845c.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: c */
    public final AbstractC4631a m6432c() {
        return this.f5844b;
    }

    /* renamed from: d */
    public final boolean m6433d() {
        return this.f5846d;
    }

    /* renamed from: e */
    public final List m6434e() {
        return this.f5845c;
    }

    /* renamed from: f */
    public final String m6435f() {
        return this.f5848f;
    }

    /* renamed from: g */
    public final boolean m6436g() {
        return this.f5843a;
    }

    /* renamed from: h */
    public final C4635e m6437h() {
        return this.f5847e;
    }

    /* renamed from: i */
    public final void m6438i(AbstractC4631a task, long j4) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f5847e) {
            if (!this.f5843a) {
                if (m6439k(task, j4, false)) {
                    this.f5847e.m6450h(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.m6419a()) {
                if (C4635e.f5851j.m6456a().isLoggable(Level.FINE)) {
                    AbstractC4632b.m6428c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (C4635e.f5851j.m6456a().isLoggable(Level.FINE)) {
                    AbstractC4632b.m6428c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: k */
    public final boolean m6439k(AbstractC4631a task, long j4, boolean z3) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.m6423e(this);
        long jMo6455c = this.f5847e.m6449g().mo6455c();
        long j5 = jMo6455c + j4;
        int iIndexOf = this.f5845c.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m6421c() <= j5) {
                if (C4635e.f5851j.m6456a().isLoggable(Level.FINE)) {
                    AbstractC4632b.m6428c(task, this, "already scheduled");
                }
                return false;
            }
            this.f5845c.remove(iIndexOf);
        }
        task.m6425g(j5);
        if (C4635e.f5851j.m6456a().isLoggable(Level.FINE)) {
            if (z3) {
                str = "run again after " + AbstractC4632b.m6427b(j5 - jMo6455c);
            } else {
                str = "scheduled after " + AbstractC4632b.m6427b(j5 - jMo6455c);
            }
            AbstractC4632b.m6428c(task, this, str);
        }
        Iterator it = this.f5845c.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC4631a) it.next()).m6421c() - jMo6455c > j4) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f5845c.size();
        }
        this.f5845c.add(size, task);
        return size == 0;
    }

    /* renamed from: l */
    public final void m6440l(AbstractC4631a abstractC4631a) {
        this.f5844b = abstractC4631a;
    }

    /* renamed from: m */
    public final void m6441m(boolean z3) {
        this.f5846d = z3;
    }

    /* renamed from: n */
    public final void m6442n() {
        if (!AbstractC4550b.f5708h || !Thread.holdsLock(this)) {
            synchronized (this.f5847e) {
                this.f5843a = true;
                if (m6431b()) {
                    this.f5847e.m6450h(this);
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
        sb.append(threadCurrentThread.getName());
        sb.append(" MUST NOT hold lock on ");
        sb.append(this);
        throw new AssertionError(sb.toString());
    }

    public String toString() {
        return this.f5848f;
    }
}
