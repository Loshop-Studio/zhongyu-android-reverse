package p206q0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p117i1.AbstractC7651j;

/* renamed from: q0.c */
/* loaded from: classes3.dex */
public final class C8868c {

    /* renamed from: a */
    public final Map f15071a = new HashMap();

    /* renamed from: b */
    public final b f15072b = new b();

    /* renamed from: q0.c$a */
    public static class a {

        /* renamed from: a */
        public final Lock f15073a = new ReentrantLock();

        /* renamed from: b */
        public int f15074b;
    }

    /* renamed from: q0.c$b */
    public static class b {

        /* renamed from: a */
        public final Queue f15075a = new ArrayDeque();

        /* renamed from: a */
        public a m14872a() {
            a aVar;
            synchronized (this.f15075a) {
                aVar = (a) this.f15075a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: b */
        public void m14873b(a aVar) {
            synchronized (this.f15075a) {
                try {
                    if (this.f15075a.size() < 10) {
                        this.f15075a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void m14870a(String str) {
        a aVarM14872a;
        synchronized (this) {
            try {
                aVarM14872a = (a) this.f15071a.get(str);
                if (aVarM14872a == null) {
                    aVarM14872a = this.f15072b.m14872a();
                    this.f15071a.put(str, aVarM14872a);
                }
                aVarM14872a.f15074b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarM14872a.f15073a.lock();
    }

    /* renamed from: b */
    public void m14871b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC7651j.m12683d(this.f15071a.get(str));
                int i10 = aVar.f15074b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f15074b);
                }
                int i11 = i10 - 1;
                aVar.f15074b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f15071a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f15072b.m14873b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f15073a.unlock();
    }
}
