package p102o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p062g0.AbstractC3749i;

/* renamed from: o.c */
/* loaded from: classes2.dex */
public final class C4412c {

    /* renamed from: a */
    public final Map f4947a = new HashMap();

    /* renamed from: b */
    public final b f4948b = new b();

    /* renamed from: o.c$a */
    public static class a {

        /* renamed from: a */
        public final Lock f4949a = new ReentrantLock();

        /* renamed from: b */
        public int f4950b;
    }

    /* renamed from: o.c$b */
    public static class b {

        /* renamed from: a */
        public final Queue f4951a = new ArrayDeque();

        /* renamed from: a */
        public a m5501a() {
            a aVar;
            synchronized (this.f4951a) {
                aVar = (a) this.f4951a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: b */
        public void m5502b(a aVar) {
            synchronized (this.f4951a) {
                if (this.f4951a.size() < 10) {
                    this.f4951a.offer(aVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void m5499a(String str) {
        a aVarM5501a;
        synchronized (this) {
            aVarM5501a = (a) this.f4947a.get(str);
            if (aVarM5501a == null) {
                aVarM5501a = this.f4948b.m5501a();
                this.f4947a.put(str, aVarM5501a);
            }
            aVarM5501a.f4950b++;
        }
        aVarM5501a.f4949a.lock();
    }

    /* renamed from: b */
    public void m5500b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) AbstractC3749i.m4768d(this.f4947a.get(str));
            int i4 = aVar.f4950b;
            if (i4 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f4950b);
            }
            int i5 = i4 - 1;
            aVar.f4950b = i5;
            if (i5 == 0) {
                a aVar2 = (a) this.f4947a.remove(str);
                if (!aVar2.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                }
                this.f4948b.m5502b(aVar2);
            }
        }
        aVar.f4949a.unlock();
    }
}
