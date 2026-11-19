package p174m0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p091e1.AbstractC7837i;

/* renamed from: m0.c */
/* loaded from: classes3.dex */
public final class C8941c {

    /* renamed from: a */
    public final Map f14975a = new HashMap();

    /* renamed from: b */
    public final b f14976b = new b();

    /* renamed from: m0.c$a */
    public static class a {

        /* renamed from: a */
        public final Lock f14977a = new ReentrantLock();

        /* renamed from: b */
        public int f14978b;
    }

    /* renamed from: m0.c$b */
    public static class b {

        /* renamed from: a */
        public final Queue f14979a = new ArrayDeque();

        /* renamed from: a */
        public a m14254a() {
            a aVar;
            synchronized (this.f14979a) {
                aVar = (a) this.f14979a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: b */
        public void m14255b(a aVar) {
            synchronized (this.f14979a) {
                try {
                    if (this.f14979a.size() < 10) {
                        this.f14979a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void m14252a(String str) {
        a aVarM14254a;
        synchronized (this) {
            try {
                aVarM14254a = (a) this.f14975a.get(str);
                if (aVarM14254a == null) {
                    aVarM14254a = this.f14976b.m14254a();
                    this.f14975a.put(str, aVarM14254a);
                }
                aVarM14254a.f14978b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarM14254a.f14977a.lock();
    }

    /* renamed from: b */
    public void m14253b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC7837i.m12256d(this.f14975a.get(str));
                int i9 = aVar.f14978b;
                if (i9 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f14978b);
                }
                int i10 = i9 - 1;
                aVar.f14978b = i10;
                if (i10 == 0) {
                    a aVar2 = (a) this.f14975a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f14976b.m14255b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f14977a.unlock();
    }
}
