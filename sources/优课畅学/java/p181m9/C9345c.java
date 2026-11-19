package p181m9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p147j9.AbstractC9041k;
import p300x7.InterfaceC10559a;

/* renamed from: m9.c */
/* loaded from: classes5.dex */
public final class C9345c {

    /* renamed from: a */
    public final C9346d f18405a;

    /* renamed from: b */
    public final String f18406b;

    /* renamed from: c */
    public boolean f18407c;

    /* renamed from: d */
    public AbstractC9343a f18408d;

    /* renamed from: e */
    public final List f18409e;

    /* renamed from: f */
    public boolean f18410f;

    /* renamed from: m9.c$a */
    public static final class a extends AbstractC9343a {

        /* renamed from: e */
        public final /* synthetic */ InterfaceC10559a f18411e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, InterfaceC10559a interfaceC10559a) {
            super(str, z10);
            this.f18411e = interfaceC10559a;
        }

        @Override // p181m9.AbstractC9343a
        /* renamed from: f */
        public long mo17176f() {
            this.f18411e.invoke();
            return -1L;
        }
    }

    /* renamed from: m9.c$b */
    public static final class b extends AbstractC9343a {

        /* renamed from: e */
        public final /* synthetic */ InterfaceC10559a f18412e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC10559a interfaceC10559a) {
            super(str, false, 2, null);
            this.f18412e = interfaceC10559a;
        }

        @Override // p181m9.AbstractC9343a
        /* renamed from: f */
        public long mo17176f() {
            return ((Number) this.f18412e.invoke()).longValue();
        }
    }

    public C9345c(C9346d taskRunner, String name) {
        AbstractC9133u.m16133g(taskRunner, "taskRunner");
        AbstractC9133u.m16133g(name, "name");
        this.f18405a = taskRunner;
        this.f18406b = name;
        this.f18409e = new ArrayList();
    }

    /* renamed from: d */
    public static /* synthetic */ void m17181d(C9345c c9345c, String str, long j10, boolean z10, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        c9345c.m17185c(str, j11, z10, interfaceC10559a);
    }

    /* renamed from: m */
    public static /* synthetic */ void m17182m(C9345c c9345c, AbstractC9343a abstractC9343a, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c9345c.m17193l(abstractC9343a, j10);
    }

    /* renamed from: a */
    public final void m17183a() {
        C9346d c9346d = this.f18405a;
        if (AbstractC9041k.f17265b && Thread.holdsLock(c9346d)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9346d);
        }
        synchronized (this.f18405a) {
            try {
                if (m17184b()) {
                    this.f18405a.m17207j(this);
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m17184b() {
        AbstractC9343a abstractC9343a = this.f18408d;
        if (abstractC9343a != null) {
            AbstractC9133u.m16130d(abstractC9343a);
            if (abstractC9343a.m17171a()) {
                this.f18410f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f18409e.size() - 1; -1 < size; size--) {
            if (((AbstractC9343a) this.f18409e.get(size)).m17171a()) {
                Logger loggerM17206i = this.f18405a.m17206i();
                AbstractC9343a abstractC9343a2 = (AbstractC9343a) this.f18409e.get(size);
                if (loggerM17206i.isLoggable(Level.FINE)) {
                    AbstractC9344b.m17180c(loggerM17206i, abstractC9343a2, this, "canceled");
                }
                this.f18409e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c */
    public final void m17185c(String name, long j10, boolean z10, InterfaceC10559a block) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(block, "block");
        m17193l(new a(name, z10, block), j10);
    }

    /* renamed from: e */
    public final AbstractC9343a m17186e() {
        return this.f18408d;
    }

    /* renamed from: f */
    public final boolean m17187f() {
        return this.f18410f;
    }

    /* renamed from: g */
    public final List m17188g() {
        return this.f18409e;
    }

    /* renamed from: h */
    public final String m17189h() {
        return this.f18406b;
    }

    /* renamed from: i */
    public final boolean m17190i() {
        return this.f18407c;
    }

    /* renamed from: j */
    public final C9346d m17191j() {
        return this.f18405a;
    }

    /* renamed from: k */
    public final void m17192k(String name, long j10, InterfaceC10559a block) {
        AbstractC9133u.m16133g(name, "name");
        AbstractC9133u.m16133g(block, "block");
        m17193l(new b(name, block), j10);
    }

    /* renamed from: l */
    public final void m17193l(AbstractC9343a task, long j10) {
        AbstractC9133u.m16133g(task, "task");
        synchronized (this.f18405a) {
            if (!this.f18407c) {
                if (m17194n(task, j10, false)) {
                    this.f18405a.m17207j(this);
                }
                C8736p c8736p = C8736p.f16368a;
            } else if (task.m17171a()) {
                Logger loggerM17206i = this.f18405a.m17206i();
                if (loggerM17206i.isLoggable(Level.FINE)) {
                    AbstractC9344b.m17180c(loggerM17206i, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerM17206i2 = this.f18405a.m17206i();
                if (loggerM17206i2.isLoggable(Level.FINE)) {
                    AbstractC9344b.m17180c(loggerM17206i2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: n */
    public final boolean m17194n(AbstractC9343a task, long j10, boolean z10) {
        String str;
        AbstractC9133u.m16133g(task, "task");
        task.m17175e(this);
        long jMo17214e = this.f18405a.m17205h().mo17214e();
        long j11 = jMo17214e + j10;
        int iIndexOf = this.f18409e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m17173c() <= j11) {
                Logger loggerM17206i = this.f18405a.m17206i();
                if (loggerM17206i.isLoggable(Level.FINE)) {
                    AbstractC9344b.m17180c(loggerM17206i, task, this, "already scheduled");
                }
                return false;
            }
            this.f18409e.remove(iIndexOf);
        }
        task.m17177g(j11);
        Logger loggerM17206i2 = this.f18405a.m17206i();
        if (loggerM17206i2.isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + AbstractC9344b.m17179b(j11 - jMo17214e);
            } else {
                str = "scheduled after " + AbstractC9344b.m17179b(j11 - jMo17214e);
            }
            AbstractC9344b.m17180c(loggerM17206i2, task, this, str);
        }
        Iterator it = this.f18409e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC9343a) it.next()).m17173c() - jMo17214e > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f18409e.size();
        }
        this.f18409e.add(size, task);
        return size == 0;
    }

    /* renamed from: o */
    public final void m17195o(AbstractC9343a abstractC9343a) {
        this.f18408d = abstractC9343a;
    }

    /* renamed from: p */
    public final void m17196p(boolean z10) {
        this.f18410f = z10;
    }

    /* renamed from: q */
    public final void m17197q() {
        C9346d c9346d = this.f18405a;
        if (AbstractC9041k.f17265b && Thread.holdsLock(c9346d)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c9346d);
        }
        synchronized (this.f18405a) {
            try {
                this.f18407c = true;
                if (m17184b()) {
                    this.f18405a.m17207j(this);
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f18406b;
    }
}
