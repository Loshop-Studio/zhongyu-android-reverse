package p086j5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p065g5.AbstractC6427k;

/* renamed from: j5.c */
/* loaded from: classes4.dex */
public final class C6600c {

    /* renamed from: a */
    public final C6601d f8617a;

    /* renamed from: b */
    public final String f8618b;

    /* renamed from: c */
    public boolean f8619c;

    /* renamed from: d */
    public AbstractC6598a f8620d;

    /* renamed from: e */
    public final List f8621e;

    /* renamed from: f */
    public boolean f8622f;

    /* renamed from: j5.c$a */
    public static final class a extends AbstractC6598a {

        /* renamed from: e */
        public final /* synthetic */ Function0 f8623e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z6, Function0 function0) {
            super(str, z6);
            this.f8623e = function0;
        }

        @Override // p086j5.AbstractC6598a
        /* renamed from: f */
        public long mo7526f() {
            this.f8623e.invoke();
            return -1L;
        }
    }

    /* renamed from: j5.c$b */
    public static final class b extends AbstractC6598a {

        /* renamed from: e */
        public final /* synthetic */ Function0 f8624e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Function0 function0) {
            super(str, false, 2, null);
            this.f8624e = function0;
        }

        @Override // p086j5.AbstractC6598a
        /* renamed from: f */
        public long mo7526f() {
            return ((Number) this.f8624e.invoke()).longValue();
        }
    }

    public C6600c(C6601d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8617a = taskRunner;
        this.f8618b = name;
        this.f8621e = new ArrayList();
    }

    /* renamed from: d */
    public static /* synthetic */ void m7531d(C6600c c6600c, String str, long j6, boolean z6, Function0 function0, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6 = 0;
        }
        long j7 = j6;
        if ((i6 & 4) != 0) {
            z6 = true;
        }
        c6600c.m7535c(str, j7, z6, function0);
    }

    /* renamed from: m */
    public static /* synthetic */ void m7532m(C6600c c6600c, AbstractC6598a abstractC6598a, long j6, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            j6 = 0;
        }
        c6600c.m7542k(abstractC6598a, j6);
    }

    /* renamed from: a */
    public final void m7533a() {
        C6601d c6601d = this.f8617a;
        if (AbstractC6427k.f8100b && Thread.holdsLock(c6601d)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c6601d);
        }
        synchronized (this.f8617a) {
            try {
                if (m7534b()) {
                    this.f8617a.m7557j(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final boolean m7534b() {
        AbstractC6598a abstractC6598a = this.f8620d;
        if (abstractC6598a != null) {
            Intrinsics.checkNotNull(abstractC6598a);
            if (abstractC6598a.m7521a()) {
                this.f8622f = true;
            }
        }
        boolean z6 = false;
        for (int size = this.f8621e.size() - 1; -1 < size; size--) {
            if (((AbstractC6598a) this.f8621e.get(size)).m7521a()) {
                Logger loggerM7556i = this.f8617a.m7556i();
                AbstractC6598a abstractC6598a2 = (AbstractC6598a) this.f8621e.get(size);
                if (loggerM7556i.isLoggable(Level.FINE)) {
                    AbstractC6599b.m7530c(loggerM7556i, abstractC6598a2, this, "canceled");
                }
                this.f8621e.remove(size);
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: c */
    public final void m7535c(String name, long j6, boolean z6, Function0 block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        m7542k(new a(name, z6, block), j6);
    }

    /* renamed from: e */
    public final AbstractC6598a m7536e() {
        return this.f8620d;
    }

    /* renamed from: f */
    public final boolean m7537f() {
        return this.f8622f;
    }

    /* renamed from: g */
    public final List m7538g() {
        return this.f8621e;
    }

    /* renamed from: h */
    public final String m7539h() {
        return this.f8618b;
    }

    /* renamed from: i */
    public final boolean m7540i() {
        return this.f8619c;
    }

    /* renamed from: j */
    public final C6601d m7541j() {
        return this.f8617a;
    }

    /* renamed from: k */
    public final void m7542k(AbstractC6598a task, long j6) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f8617a) {
            if (!this.f8619c) {
                if (m7544n(task, j6, false)) {
                    this.f8617a.m7557j(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.m7521a()) {
                Logger loggerM7556i = this.f8617a.m7556i();
                if (loggerM7556i.isLoggable(Level.FINE)) {
                    AbstractC6599b.m7530c(loggerM7556i, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerM7556i2 = this.f8617a.m7556i();
                if (loggerM7556i2.isLoggable(Level.FINE)) {
                    AbstractC6599b.m7530c(loggerM7556i2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* renamed from: l */
    public final void m7543l(String name, long j6, Function0 block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        m7542k(new b(name, block), j6);
    }

    /* renamed from: n */
    public final boolean m7544n(AbstractC6598a task, long j6, boolean z6) {
        String str;
        Intrinsics.checkNotNullParameter(task, "task");
        task.m7525e(this);
        long jMo7564e = this.f8617a.m7555h().mo7564e();
        long j7 = jMo7564e + j6;
        int iIndexOf = this.f8621e.indexOf(task);
        if (iIndexOf != -1) {
            if (task.m7523c() <= j7) {
                Logger loggerM7556i = this.f8617a.m7556i();
                if (loggerM7556i.isLoggable(Level.FINE)) {
                    AbstractC6599b.m7530c(loggerM7556i, task, this, "already scheduled");
                }
                return false;
            }
            this.f8621e.remove(iIndexOf);
        }
        task.m7527g(j7);
        Logger loggerM7556i2 = this.f8617a.m7556i();
        if (loggerM7556i2.isLoggable(Level.FINE)) {
            if (z6) {
                str = "run again after " + AbstractC6599b.m7529b(j7 - jMo7564e);
            } else {
                str = "scheduled after " + AbstractC6599b.m7529b(j7 - jMo7564e);
            }
            AbstractC6599b.m7530c(loggerM7556i2, task, this, str);
        }
        Iterator it = this.f8621e.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((AbstractC6598a) it.next()).m7523c() - jMo7564e > j6) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f8621e.size();
        }
        this.f8621e.add(size, task);
        return size == 0;
    }

    /* renamed from: o */
    public final void m7545o(AbstractC6598a abstractC6598a) {
        this.f8620d = abstractC6598a;
    }

    /* renamed from: p */
    public final void m7546p(boolean z6) {
        this.f8622f = z6;
    }

    /* renamed from: q */
    public final void m7547q() {
        C6601d c6601d = this.f8617a;
        if (AbstractC6427k.f8100b && Thread.holdsLock(c6601d)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + c6601d);
        }
        synchronized (this.f8617a) {
            try {
                this.f8619c = true;
                if (m7534b()) {
                    this.f8617a.m7557j(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return this.f8618b;
    }
}
