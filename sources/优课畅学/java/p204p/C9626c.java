package p204p;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p116h0.AbstractC8706j;

/* renamed from: p.c */
/* loaded from: classes3.dex */
public final class C9626c {

    /* renamed from: a */
    public final Map f19244a = new HashMap();

    /* renamed from: b */
    public final b f19245b = new b();

    /* renamed from: p.c$a */
    public static class a {

        /* renamed from: a */
        public final Lock f19246a = new ReentrantLock();

        /* renamed from: b */
        public int f19247b;
    }

    /* renamed from: p.c$b */
    public static class b {

        /* renamed from: a */
        public final Queue f19248a = new ArrayDeque();

        /* renamed from: a */
        public a m18174a() {
            a aVar;
            synchronized (this.f19248a) {
                aVar = (a) this.f19248a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: b */
        public void m18175b(a aVar) {
            synchronized (this.f19248a) {
                try {
                    if (this.f19248a.size() < 10) {
                        this.f19248a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void m18172a(String str) {
        a aVarM18174a;
        synchronized (this) {
            try {
                aVarM18174a = (a) this.f19244a.get(str);
                if (aVarM18174a == null) {
                    aVarM18174a = this.f19245b.m18174a();
                    this.f19244a.put(str, aVarM18174a);
                }
                aVarM18174a.f19247b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarM18174a.f19246a.lock();
    }

    /* renamed from: b */
    public void m18173b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC8706j.m14181d(this.f19244a.get(str));
                int i10 = aVar.f19247b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f19247b);
                }
                int i11 = i10 - 1;
                aVar.f19247b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f19244a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f19245b.m18175b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f19246a.unlock();
    }
}
