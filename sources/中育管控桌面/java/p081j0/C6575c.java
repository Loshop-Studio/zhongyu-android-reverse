package p081j0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p016b1.AbstractC4408j;

/* renamed from: j0.c */
/* loaded from: classes3.dex */
public final class C6575c {

    /* renamed from: a */
    public final Map f8516a = new HashMap();

    /* renamed from: b */
    public final b f8517b = new b();

    /* renamed from: j0.c$a */
    public static class a {

        /* renamed from: a */
        public final Lock f8518a = new ReentrantLock();

        /* renamed from: b */
        public int f8519b;
    }

    /* renamed from: j0.c$b */
    public static class b {

        /* renamed from: a */
        public final Queue f8520a = new ArrayDeque();

        /* renamed from: a */
        public a m7443a() {
            a aVar;
            synchronized (this.f8520a) {
                aVar = (a) this.f8520a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: b */
        public void m7444b(a aVar) {
            synchronized (this.f8520a) {
                try {
                    if (this.f8520a.size() < 10) {
                        this.f8520a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void m7441a(String str) {
        a aVarM7443a;
        synchronized (this) {
            try {
                aVarM7443a = (a) this.f8516a.get(str);
                if (aVarM7443a == null) {
                    aVarM7443a = this.f8517b.m7443a();
                    this.f8516a.put(str, aVarM7443a);
                }
                aVarM7443a.f8519b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarM7443a.f8518a.lock();
    }

    /* renamed from: b */
    public void m7442b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC4408j.m1438d(this.f8516a.get(str));
                int i6 = aVar.f8519b;
                if (i6 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f8519b);
                }
                int i7 = i6 - 1;
                aVar.f8519b = i7;
                if (i7 == 0) {
                    a aVar2 = (a) this.f8516a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f8517b.m7444b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f8518a.unlock();
    }
}
