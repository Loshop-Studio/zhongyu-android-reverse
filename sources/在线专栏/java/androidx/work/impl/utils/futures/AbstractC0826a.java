package androidx.work.impl.utils.futures;

import anetwork.channel.util.RequestConstant;
import com.google.common.util.concurrent.ListenableFuture;
import com.umeng.analytics.pro.C1851ai;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.work.impl.utils.futures.a */
/* loaded from: classes.dex */
public abstract class AbstractC0826a<V> implements ListenableFuture<V> {

    /* renamed from: d */
    static final boolean f4862d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", RequestConstant.FALSE));

    /* renamed from: e */
    private static final Logger f4863e = Logger.getLogger(AbstractC0826a.class.getName());

    /* renamed from: f */
    static final b f4864f;

    /* renamed from: g */
    private static final Object f4865g;

    /* renamed from: a */
    volatile Object f4866a;

    /* renamed from: b */
    volatile e f4867b;

    /* renamed from: c */
    volatile i f4868c;

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    private static abstract class b {
        private b() {
        }

        /* renamed from: a */
        abstract boolean mo4271a(AbstractC0826a<?> abstractC0826a, e eVar, e eVar2);

        /* renamed from: b */
        abstract boolean mo4272b(AbstractC0826a<?> abstractC0826a, Object obj, Object obj2);

        /* renamed from: c */
        abstract boolean mo4273c(AbstractC0826a<?> abstractC0826a, i iVar, i iVar2);

        /* renamed from: d */
        abstract void mo4274d(i iVar, i iVar2);

        /* renamed from: e */
        abstract void mo4275e(i iVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    private static final class c {

        /* renamed from: c */
        static final c f4869c;

        /* renamed from: d */
        static final c f4870d;

        /* renamed from: a */
        final boolean f4871a;

        /* renamed from: b */
        final Throwable f4872b;

        static {
            if (AbstractC0826a.f4862d) {
                f4870d = null;
                f4869c = null;
            } else {
                f4870d = new c(false, null);
                f4869c = new c(true, null);
            }
        }

        c(boolean z3, Throwable th) {
            this.f4871a = z3;
            this.f4872b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    private static final class d {

        /* renamed from: b */
        static final d f4873b = new d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f4874a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        class a extends Throwable {
            a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f4874a = (Throwable) AbstractC0826a.m4255d(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    private static final class e {

        /* renamed from: d */
        static final e f4875d = new e(null, null);

        /* renamed from: a */
        final Runnable f4876a;

        /* renamed from: b */
        final Executor f4877b;

        /* renamed from: c */
        e f4878c;

        e(Runnable runnable, Executor executor) {
            this.f4876a = runnable;
            this.f4877b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    private static final class f extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<i, Thread> f4879a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<i, i> f4880b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<AbstractC0826a, i> f4881c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<AbstractC0826a, e> f4882d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<AbstractC0826a, Object> f4883e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractC0826a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractC0826a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractC0826a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4879a = atomicReferenceFieldUpdater;
            this.f4880b = atomicReferenceFieldUpdater2;
            this.f4881c = atomicReferenceFieldUpdater3;
            this.f4882d = atomicReferenceFieldUpdater4;
            this.f4883e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: a */
        boolean mo4271a(AbstractC0826a<?> abstractC0826a, e eVar, e eVar2) {
            return C0827b.m4278a(this.f4882d, abstractC0826a, eVar, eVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: b */
        boolean mo4272b(AbstractC0826a<?> abstractC0826a, Object obj, Object obj2) {
            return C0827b.m4278a(this.f4883e, abstractC0826a, obj, obj2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: c */
        boolean mo4273c(AbstractC0826a<?> abstractC0826a, i iVar, i iVar2) {
            return C0827b.m4278a(this.f4881c, abstractC0826a, iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: d */
        void mo4274d(i iVar, i iVar2) {
            this.f4880b.lazySet(iVar, iVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: e */
        void mo4275e(i iVar, Thread thread) {
            this.f4879a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    private static final class g<V> implements Runnable {

        /* renamed from: a */
        final AbstractC0826a<V> f4884a;

        /* renamed from: b */
        final ListenableFuture<? extends V> f4885b;

        g(AbstractC0826a<V> abstractC0826a, ListenableFuture<? extends V> listenableFuture) {
            this.f4884a = abstractC0826a;
            this.f4885b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4884a.f4866a != this) {
                return;
            }
            if (AbstractC0826a.f4864f.mo4272b(this.f4884a, this, AbstractC0826a.m4260i(this.f4885b))) {
                AbstractC0826a.m4257f(this.f4884a);
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    private static final class h extends b {
        h() {
            super();
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: a */
        boolean mo4271a(AbstractC0826a<?> abstractC0826a, e eVar, e eVar2) {
            synchronized (abstractC0826a) {
                if (abstractC0826a.f4867b != eVar) {
                    return false;
                }
                abstractC0826a.f4867b = eVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: b */
        boolean mo4272b(AbstractC0826a<?> abstractC0826a, Object obj, Object obj2) {
            synchronized (abstractC0826a) {
                if (abstractC0826a.f4866a != obj) {
                    return false;
                }
                abstractC0826a.f4866a = obj2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: c */
        boolean mo4273c(AbstractC0826a<?> abstractC0826a, i iVar, i iVar2) {
            synchronized (abstractC0826a) {
                if (abstractC0826a.f4868c != iVar) {
                    return false;
                }
                abstractC0826a.f4868c = iVar2;
                return true;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: d */
        void mo4274d(i iVar, i iVar2) {
            iVar.f4888b = iVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractC0826a.b
        /* renamed from: e */
        void mo4275e(i iVar, Thread thread) {
            iVar.f4887a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$i */
    private static final class i {

        /* renamed from: c */
        static final i f4886c = new i(false);

        /* renamed from: a */
        volatile Thread f4887a;

        /* renamed from: b */
        volatile i f4888b;

        i(boolean z3) {
        }

        /* renamed from: a */
        void m4276a(i iVar) {
            AbstractC0826a.f4864f.mo4274d(this, iVar);
        }

        /* renamed from: b */
        void m4277b() {
            Thread thread = this.f4887a;
            if (thread != null) {
                this.f4887a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            AbstractC0826a.f4864f.mo4275e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, C1851ai.f8297at), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0826a.class, i.class, C1851ai.f8255aD), AtomicReferenceFieldUpdater.newUpdater(AbstractC0826a.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC0826a.class, Object.class, C1851ai.f8297at));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f4864f = hVar;
        if (th != null) {
            f4863e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4865g = new Object();
    }

    protected AbstractC0826a() {
    }

    /* renamed from: a */
    private void m4253a(StringBuilder sb) {
        try {
            Object objM4261j = m4261j(this);
            sb.append("SUCCESS, result=[");
            sb.append(m4264r(objM4261j));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    /* renamed from: c */
    private static CancellationException m4254c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: d */
    static <T> T m4255d(T t3) {
        Objects.requireNonNull(t3);
        return t3;
    }

    /* renamed from: e */
    private e m4256e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f4867b;
        } while (!f4864f.mo4271a(this, eVar2, e.f4875d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f4878c;
            eVar4.f4878c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* renamed from: f */
    static void m4257f(AbstractC0826a<?> abstractC0826a) {
        e eVar = null;
        while (true) {
            abstractC0826a.m4262m();
            abstractC0826a.m4265b();
            e eVarM4256e = abstractC0826a.m4256e(eVar);
            while (eVarM4256e != null) {
                eVar = eVarM4256e.f4878c;
                Runnable runnable = eVarM4256e.f4876a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC0826a = gVar.f4884a;
                    if (abstractC0826a.f4866a == gVar) {
                        if (f4864f.mo4272b(abstractC0826a, gVar, m4260i(gVar.f4885b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m4258g(runnable, eVarM4256e.f4877b);
                }
                eVarM4256e = eVar;
            }
            return;
        }
    }

    /* renamed from: g */
    private static void m4258g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f4863e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    private V m4259h(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw m4254c("Task was cancelled.", ((c) obj).f4872b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f4874a);
        }
        if (obj == f4865g) {
            return null;
        }
        return obj;
    }

    /* renamed from: i */
    static Object m4260i(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractC0826a) {
            Object obj = ((AbstractC0826a) listenableFuture).f4866a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f4871a ? cVar.f4872b != null ? new c(false, cVar.f4872b) : c.f4870d : obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f4862d) && zIsCancelled) {
            return c.f4870d;
        }
        try {
            Object objM4261j = m4261j(listenableFuture);
            return objM4261j == null ? f4865g : objM4261j;
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new c(false, e4);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e4));
        } catch (ExecutionException e5) {
            return new d(e5.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* renamed from: j */
    private static <V> V m4261j(Future<V> future) throws ExecutionException {
        V v3;
        boolean z3 = false;
        while (true) {
            try {
                v3 = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return v3;
    }

    /* renamed from: m */
    private void m4262m() {
        i iVar;
        do {
            iVar = this.f4868c;
        } while (!f4864f.mo4273c(this, iVar, i.f4886c));
        while (iVar != null) {
            iVar.m4277b();
            iVar = iVar.f4888b;
        }
    }

    /* renamed from: n */
    private void m4263n(i iVar) {
        iVar.f4887a = null;
        while (true) {
            i iVar2 = this.f4868c;
            if (iVar2 == i.f4886c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f4888b;
                if (iVar2.f4887a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f4888b = iVar4;
                    if (iVar3.f4887a == null) {
                        break;
                    }
                } else if (!f4864f.mo4273c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* renamed from: r */
    private String m4264r(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        m4255d(runnable);
        m4255d(executor);
        e eVar = this.f4867b;
        if (eVar != e.f4875d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f4878c = eVar;
                if (f4864f.mo4271a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f4867b;
                }
            } while (eVar != e.f4875d);
        }
        m4258g(runnable, executor);
    }

    /* renamed from: b */
    protected void m4265b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f4866a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f4862d ? new c(z3, new CancellationException("Future.cancel() was called.")) : z3 ? c.f4869c : c.f4870d;
        boolean z4 = false;
        AbstractC0826a<V> abstractC0826a = this;
        while (true) {
            if (f4864f.mo4272b(abstractC0826a, obj, cVar)) {
                if (z3) {
                    abstractC0826a.m4266k();
                }
                m4257f(abstractC0826a);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f4885b;
                if (!(listenableFuture instanceof AbstractC0826a)) {
                    listenableFuture.cancel(z3);
                    return true;
                }
                abstractC0826a = (AbstractC0826a) listenableFuture;
                obj = abstractC0826a.f4866a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z4 = true;
            } else {
                obj = abstractC0826a.f4866a;
                if (!(obj instanceof g)) {
                    return z4;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j4, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f4866a;
        if ((obj != null) && (!(obj instanceof g))) {
            return m4259h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f4868c;
            if (iVar != i.f4886c) {
                i iVar2 = new i();
                do {
                    iVar2.m4276a(iVar);
                    if (f4864f.mo4273c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4263n(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f4866a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m4259h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4263n(iVar2);
                    } else {
                        iVar = this.f4868c;
                    }
                } while (iVar != i.f4886c);
            }
            return m4259h(this.f4866a);
        }
        while (nanos > 0) {
            Object obj3 = this.f4866a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m4259h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z3 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4866a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f4866a != null);
    }

    /* renamed from: k */
    protected void m4266k() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    protected String m4267l() {
        Object obj = this.f4866a;
        if (obj instanceof g) {
            return "setFuture=[" + m4264r(((g) obj).f4885b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: o */
    protected boolean mo4268o(V v3) {
        if (v3 == null) {
            v3 = (V) f4865g;
        }
        if (!f4864f.mo4272b(this, null, v3)) {
            return false;
        }
        m4257f(this);
        return true;
    }

    /* renamed from: p */
    protected boolean mo4269p(Throwable th) {
        if (!f4864f.mo4272b(this, null, new d((Throwable) m4255d(th)))) {
            return false;
        }
        m4257f(this);
        return true;
    }

    /* renamed from: q */
    protected boolean mo4270q(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        m4255d(listenableFuture);
        Object obj = this.f4866a;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!f4864f.mo4272b(this, null, m4260i(listenableFuture))) {
                    return false;
                }
                m4257f(this);
                return true;
            }
            g gVar = new g(this, listenableFuture);
            if (f4864f.mo4272b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, EnumC0828c.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f4873b;
                    }
                    f4864f.mo4272b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f4866a;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f4871a);
        }
        return false;
    }

    public String toString() {
        String strM4267l;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4253a(sb);
        } else {
            try {
                strM4267l = m4267l();
            } catch (RuntimeException e4) {
                strM4267l = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strM4267l != null && !strM4267l.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM4267l);
                sb.append("]");
            } else if (isDone()) {
                m4253a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4866a;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m4259h(obj2);
            }
            i iVar = this.f4868c;
            if (iVar != i.f4886c) {
                i iVar2 = new i();
                do {
                    iVar2.m4276a(iVar);
                    if (f4864f.mo4273c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4866a;
                            } else {
                                m4263n(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m4259h(obj);
                    }
                    iVar = this.f4868c;
                } while (iVar != i.f4886c);
            }
            return m4259h(this.f4866a);
        }
        throw new InterruptedException();
    }
}
