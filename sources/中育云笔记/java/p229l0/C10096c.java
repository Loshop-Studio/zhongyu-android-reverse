package p229l0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p109d1.AbstractC8909j;

/* renamed from: l0.c */
/* loaded from: classes3.dex */
public final class C10096c {

    /* renamed from: a */
    public final Map f24115a = new HashMap();

    /* renamed from: b */
    public final b f24116b = new b();

    /* renamed from: l0.c$a */
    public static class a {

        /* renamed from: a */
        public final Lock f24117a = new ReentrantLock();

        /* renamed from: b */
        public int f24118b;
    }

    /* renamed from: l0.c$b */
    public static class b {

        /* renamed from: a */
        public final Queue f24119a = new ArrayDeque();

        /* renamed from: a */
        public a m21110a() {
            a aVar;
            synchronized (this.f24119a) {
                aVar = (a) this.f24119a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        /* renamed from: b */
        public void m21111b(a aVar) {
            synchronized (this.f24119a) {
                try {
                    if (this.f24119a.size() < 10) {
                        this.f24119a.offer(aVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public void m21108a(String str) {
        a aVarM21110a;
        synchronized (this) {
            try {
                aVarM21110a = (a) this.f24115a.get(str);
                if (aVarM21110a == null) {
                    aVarM21110a = this.f24116b.m21110a();
                    this.f24115a.put(str, aVarM21110a);
                }
                aVarM21110a.f24118b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarM21110a.f24117a.lock();
    }

    /* renamed from: b */
    public void m21109b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) AbstractC8909j.m17468d(this.f24115a.get(str));
                int i10 = aVar.f24118b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f24118b);
                }
                int i11 = i10 - 1;
                aVar.f24118b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f24115a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f24116b.m21111b(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVar.f24117a.unlock();
    }
}
