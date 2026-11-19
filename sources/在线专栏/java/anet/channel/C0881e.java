package anet.channel;

import anet.channel.entity.C0891c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: anet.channel.e */
/* loaded from: classes.dex */
class C0881e {

    /* renamed from: a */
    private final Map<SessionRequest, List<Session>> f5120a = new HashMap();

    /* renamed from: b */
    private final ReentrantReadWriteLock f5121b;

    /* renamed from: c */
    private final ReentrantReadWriteLock.ReadLock f5122c;

    /* renamed from: d */
    private final ReentrantReadWriteLock.WriteLock f5123d;

    C0881e() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5121b = reentrantReadWriteLock;
        this.f5122c = reentrantReadWriteLock.readLock();
        this.f5123d = reentrantReadWriteLock.writeLock();
    }

    /* renamed from: a */
    public void m4425a(SessionRequest sessionRequest, Session session) {
        if (sessionRequest == null || sessionRequest.m4367a() == null || session == null) {
            return;
        }
        this.f5123d.lock();
        try {
            List<Session> arrayList = this.f5120a.get(sessionRequest);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f5120a.put(sessionRequest, arrayList);
            }
            if (arrayList.indexOf(session) != -1) {
                return;
            }
            arrayList.add(session);
            Collections.sort(arrayList);
        } finally {
            this.f5123d.unlock();
        }
    }

    /* renamed from: b */
    public void m4426b(SessionRequest sessionRequest, Session session) {
        this.f5123d.lock();
        try {
            List<Session> list = this.f5120a.get(sessionRequest);
            if (list == null) {
                return;
            }
            list.remove(session);
            if (list.size() == 0) {
                this.f5120a.remove(sessionRequest);
            }
        } finally {
            this.f5123d.unlock();
        }
    }

    /* renamed from: c */
    public boolean m4427c(SessionRequest sessionRequest, Session session) {
        this.f5122c.lock();
        try {
            List<Session> list = this.f5120a.get(sessionRequest);
            boolean z3 = false;
            if (list != null) {
                if (list.indexOf(session) != -1) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            this.f5122c.unlock();
        }
    }

    /* renamed from: a */
    public List<Session> m4424a(SessionRequest sessionRequest) {
        this.f5122c.lock();
        try {
            List<Session> list = this.f5120a.get(sessionRequest);
            if (list != null) {
                return new ArrayList(list);
            }
            return Collections.EMPTY_LIST;
        } finally {
            this.f5122c.unlock();
        }
    }

    /* renamed from: a */
    public Session m4422a(SessionRequest sessionRequest, int i4) {
        this.f5122c.lock();
        try {
            List<Session> list = this.f5120a.get(sessionRequest);
            Session session = null;
            if (list != null && !list.isEmpty()) {
                for (Session session2 : list) {
                    if (session2 != null && session2.isAvailable() && (i4 == C0891c.f5152c || session2.f4999j.getType() == i4)) {
                        session = session2;
                        break;
                    }
                }
                return session;
            }
            return null;
        } finally {
            this.f5122c.unlock();
        }
    }

    /* renamed from: a */
    public List<SessionRequest> m4423a() {
        List<SessionRequest> list = Collections.EMPTY_LIST;
        this.f5122c.lock();
        try {
            return this.f5120a.isEmpty() ? list : new ArrayList(this.f5120a.keySet());
        } finally {
            this.f5122c.unlock();
        }
    }
}
