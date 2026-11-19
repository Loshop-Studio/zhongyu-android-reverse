package p172l8;

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
import p182m8.AbstractC9045d;
import p226q8.C9382e;

/* renamed from: l8.m */
/* loaded from: classes5.dex */
public final class C8914m {

    /* renamed from: c */
    public Runnable f14776c;

    /* renamed from: d */
    public ExecutorService f14777d;

    /* renamed from: a */
    public int f14774a = 64;

    /* renamed from: b */
    public int f14775b = 5;

    /* renamed from: e */
    public final ArrayDeque f14778e = new ArrayDeque();

    /* renamed from: f */
    public final ArrayDeque f14779f = new ArrayDeque();

    /* renamed from: g */
    public final ArrayDeque f14780g = new ArrayDeque();

    /* renamed from: a */
    public final void m13891a(C9382e.a call) {
        C9382e.a aVarM13894d;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.f14778e.add(call);
                if (!call.m15420b().m15408p() && (aVarM13894d = m13894d(call.m15422d())) != null) {
                    call.m15423e(aVarM13894d);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        m13898h();
    }

    /* renamed from: b */
    public final synchronized void m13892b(C9382e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f14780g.add(call);
    }

    /* renamed from: c */
    public final synchronized ExecutorService m13893c() {
        ExecutorService executorService;
        try {
            if (this.f14777d == null) {
                this.f14777d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9045d.m14471M(AbstractC9045d.f15232i + " Dispatcher", false));
            }
            executorService = this.f14777d;
            Intrinsics.checkNotNull(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    /* renamed from: d */
    public final C9382e.a m13894d(String str) {
        Iterator it = this.f14779f.iterator();
        while (it.hasNext()) {
            C9382e.a aVar = (C9382e.a) it.next();
            if (Intrinsics.areEqual(aVar.m15422d(), str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f14778e.iterator();
        while (it2.hasNext()) {
            C9382e.a aVar2 = (C9382e.a) it2.next();
            if (Intrinsics.areEqual(aVar2.m15422d(), str)) {
                return aVar2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m13895e(Deque deque, Object obj) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f14776c;
            Unit unit = Unit.INSTANCE;
        }
        if (m13898h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: f */
    public final void m13896f(C9382e.a call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.m15421c().decrementAndGet();
        m13895e(this.f14779f, call);
    }

    /* renamed from: g */
    public final void m13897g(C9382e call) {
        Intrinsics.checkNotNullParameter(call, "call");
        m13895e(this.f14780g, call);
    }

    /* renamed from: h */
    public final boolean m13898h() {
        int i9;
        boolean z9;
        if (AbstractC9045d.f15231h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.f14778e.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    C9382e.a asyncCall = (C9382e.a) it.next();
                    if (this.f14779f.size() >= this.f14774a) {
                        break;
                    }
                    if (asyncCall.m15421c().get() < this.f14775b) {
                        it.remove();
                        asyncCall.m15421c().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.f14779f.add(asyncCall);
                    }
                }
                z9 = m13899i() > 0;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i9 = 0; i9 < size; i9++) {
            ((C9382e.a) arrayList.get(i9)).m15419a(m13893c());
        }
        return z9;
    }

    /* renamed from: i */
    public final synchronized int m13899i() {
        return this.f14779f.size() + this.f14780g.size();
    }

    /* renamed from: j */
    public final void m13900j(int i9) {
        if (i9 < 1) {
            throw new IllegalArgumentException(("max < 1: " + i9).toString());
        }
        synchronized (this) {
            this.f14774a = i9;
            Unit unit = Unit.INSTANCE;
        }
        m13898h();
    }
}
