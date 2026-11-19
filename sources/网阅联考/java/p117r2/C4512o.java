package p117r2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p121s2.AbstractC4550b;
import p137w2.C4645e;

/* renamed from: r2.o */
/* loaded from: classes2.dex */
public final class C4512o {

    /* renamed from: c */
    public Runnable f5516c;

    /* renamed from: d */
    public ExecutorService f5517d;

    /* renamed from: a */
    public int f5514a = 64;

    /* renamed from: b */
    public int f5515b = 5;

    /* renamed from: e */
    public final ArrayDeque f5518e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f5519f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f5520g = new ArrayDeque();

    /* renamed from: a */
    public final void m5917a(C4645e.a call) {
        C4645e.a aVarM5919c;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            this.f5518e.add(call);
            if (!call.m6530b().m6516n() && (aVarM5919c = m5919c(call.m6532d())) != null) {
                call.m6533e(aVarM5919c);
            }
            Unit unit = Unit.INSTANCE;
        }
        m5922f();
    }

    /* renamed from: b */
    public final synchronized ExecutorService m5918b() {
        ExecutorService executorService;
        if (this.f5517d == null) {
            this.f5517d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC4550b.m6206I(AbstractC4550b.f5709i + " Dispatcher", false));
        }
        executorService = this.f5517d;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    /* renamed from: c */
    public final C4645e.a m5919c(String str) {
        Iterator it = this.f5519f.iterator();
        while (it.hasNext()) {
            C4645e.a aVar = (C4645e.a) it.next();
            if (Intrinsics.areEqual(aVar.m6532d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f5518e.iterator();
        while (it2.hasNext()) {
            C4645e.a aVar2 = (C4645e.a) it2.next();
            if (Intrinsics.areEqual(aVar2.m6532d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m5920d(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f5516c;
            Unit unit = Unit.INSTANCE;
        }
        if (m5922f() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: e */
    public final void m5921e(C4645e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.m6531c().decrementAndGet();
        m5920d(this.f5519f, call);
    }

    /* renamed from: f */
    public final boolean m5922f() {
        int i4;
        boolean z3;
        if (AbstractC4550b.f5708h && Thread.holdsLock(this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(threadCurrentThread, "Thread.currentThread()");
            sb.append(threadCurrentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f5518e.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                C4645e.a asyncCall = (C4645e.a) it.next();
                if (this.f5519f.size() >= this.f5514a) {
                    break;
                }
                if (asyncCall.m6531c().get() < this.f5515b) {
                    it.remove();
                    asyncCall.m6531c().incrementAndGet();
                    Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f5519f.add(asyncCall);
                }
            }
            z3 = m5923g() > 0;
            Unit unit = Unit.INSTANCE;
        }
        int size = arrayList.size();
        for (i4 = 0; i4 < size; i4++) {
            ((C4645e.a) arrayList.get(i4)).m6529a(m5918b());
        }
        return z3;
    }

    /* renamed from: g */
    public final synchronized int m5923g() {
        return this.f5519f.size() + this.f5520g.size();
    }
}
