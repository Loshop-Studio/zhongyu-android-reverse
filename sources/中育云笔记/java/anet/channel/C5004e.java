package anet.channel;

import anet.channel.entity.C5014c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: anet.channel.e */
/* loaded from: classes3.dex */
class C5004e {

    /* renamed from: a */
    private final Map<SessionRequest, List<Session>> f2398a = new HashMap();

    /* renamed from: b */
    private final ReentrantReadWriteLock f2399b;

    /* renamed from: c */
    private final ReentrantReadWriteLock.ReadLock f2400c;

    /* renamed from: d */
    private final ReentrantReadWriteLock.WriteLock f2401d;

    public C5004e() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f2399b = reentrantReadWriteLock;
        this.f2400c = reentrantReadWriteLock.readLock();
        this.f2401d = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: a */
    public void m2316a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest == null || sessionRequest.m2258a() == null || session == null) {
            return;
        }
        this.f2401d.lock();
        try {
            List<Session> arrayList = this.f2398a.get(sessionRequest);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f2398a.put(sessionRequest, arrayList);
            }
            if (arrayList.indexOf(session) == -1) {
                arrayList.add(session);
                Collections.sort(arrayList);
            }
            this.f2401d.unlock();
        } catch (Throwable th) {
            this.f2401d.unlock();
            throw th;
        }
    }

    /* renamed from: b */
    public void m2317b(SessionRequest sessionRequest, Session session) {
        this.f2401d.lock();
        try {
            List<Session> list = this.f2398a.get(sessionRequest);
            if (list != null) {
                list.remove(session);
                if (list.size() == 0) {
                    this.f2398a.remove(sessionRequest);
                }
            }
        } finally {
            this.f2401d.unlock();
        }
    }

    /* renamed from: c */
    public boolean m2318c(SessionRequest sessionRequest, Session session) {
        this.f2400c.lock();
        try {
            List<Session> list = this.f2398a.get(sessionRequest);
            boolean z10 = false;
            if (list != null) {
                if (list.indexOf(session) != -1) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            this.f2400c.unlock();
        }
    }

    /* renamed from: a */
    public List<Session> m2315a(SessionRequest sessionRequest) {
        this.f2400c.lock();
        try {
            List<Session> list = this.f2398a.get(sessionRequest);
            if (list != null) {
                return new ArrayList(list);
            }
            return Collections.EMPTY_LIST;
        } finally {
            this.f2400c.unlock();
        }
    }

    /* renamed from: a */
    public Session m2313a(SessionRequest sessionRequest, int i10) {
        this.f2400c.lock();
        try {
            List<Session> list = this.f2398a.get(sessionRequest);
            Session session = null;
            if (list != null && !list.isEmpty()) {
                for (Session session2 : list) {
                    if (session2 != null && session2.isAvailable() && (i10 == C5014c.f2430c || session2.f2277j.getType() == i10)) {
                        session = session2;
                        break;
                    }
                }
            }
            return session;
        } finally {
            this.f2400c.unlock();
        }
    }

    /* renamed from: a */
    public List<SessionRequest> m2314a() {
        List<SessionRequest> arrayList = Collections.EMPTY_LIST;
        this.f2400c.lock();
        try {
            if (!this.f2398a.isEmpty()) {
                arrayList = new ArrayList<>(this.f2398a.keySet());
            }
            return arrayList;
        } finally {
            this.f2400c.unlock();
        }
    }
}
