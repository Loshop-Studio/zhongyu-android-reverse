package p251u1;

import com.liulishuo.okdownload.C6327a;
import com.liulishuo.okdownload.StatusUtil;
import com.liulishuo.okdownload.core.cause.EndCause;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p207q1.C8879d;
import p218r1.AbstractC8997a;
import p218r1.AbstractC8999c;
import p229s1.InterfaceC9132i;
import p262v1.C9658e;

/* renamed from: u1.b */
/* loaded from: classes4.dex */
public class C9535b {

    /* renamed from: a */
    public int f16689a;

    /* renamed from: b */
    public final List f16690b;

    /* renamed from: c */
    public final List f16691c;

    /* renamed from: d */
    public final List f16692d;

    /* renamed from: e */
    public final List f16693e;

    /* renamed from: f */
    public final AtomicInteger f16694f;

    /* renamed from: g */
    public volatile ExecutorService f16695g;

    /* renamed from: h */
    public final AtomicInteger f16696h;

    /* renamed from: i */
    public InterfaceC9132i f16697i;

    public C9535b() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    /* renamed from: a */
    public boolean m15917a(AbstractC8997a abstractC8997a) {
        this.f16696h.incrementAndGet();
        boolean zM15918b = m15918b(abstractC8997a);
        this.f16696h.decrementAndGet();
        m15933q();
        return zM15918b;
    }

    /* renamed from: b */
    public synchronized boolean m15918b(AbstractC8997a abstractC8997a) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC8999c.m15125i("DownloadDispatcher", "cancel manually: " + abstractC8997a.mo4385c());
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        try {
            m15922f(abstractC8997a, arrayList, arrayList2);
            m15926j(arrayList, arrayList2);
        } catch (Throwable th) {
            m15926j(arrayList, arrayList2);
            throw th;
        }
        return arrayList.size() > 0 || arrayList2.size() > 0;
    }

    /* renamed from: c */
    public void m15919c(C6327a c6327a) {
        this.f16696h.incrementAndGet();
        m15921e(c6327a);
        this.f16696h.decrementAndGet();
    }

    /* renamed from: d */
    public final synchronized void m15920d(C6327a c6327a) {
        try {
            C9658e c9658eM16098g = C9658e.m16098g(c6327a, true, this.f16697i);
            if (m15934r() < this.f16689a) {
                this.f16691c.add(c9658eM16098g);
                m15925i().execute(c9658eM16098g);
            } else {
                this.f16690b.add(c9658eM16098g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final synchronized void m15921e(C6327a c6327a) {
        AbstractC8999c.m15125i("DownloadDispatcher", "enqueueLocked for single task: " + c6327a);
        if (m15927k(c6327a)) {
            return;
        }
        if (m15929m(c6327a)) {
            return;
        }
        int size = this.f16690b.size();
        m15920d(c6327a);
        if (size != this.f16690b.size()) {
            Collections.sort(this.f16690b);
        }
    }

    /* renamed from: f */
    public final synchronized void m15922f(AbstractC8997a abstractC8997a, List list, List list2) {
        try {
            Iterator it = this.f16690b.iterator();
            while (it.hasNext()) {
                C9658e c9658e = (C9658e) it.next();
                C6327a c6327a = c9658e.f16883b;
                if (c6327a != abstractC8997a && c6327a.mo4385c() != abstractC8997a.mo4385c()) {
                }
                if (!c9658e.m16110p() && !c9658e.m16111q()) {
                    it.remove();
                    list.add(c9658e);
                    return;
                }
                return;
            }
            for (C9658e c9658e2 : this.f16691c) {
                C6327a c6327a2 = c9658e2.f16883b;
                if (c6327a2 == abstractC8997a || c6327a2.mo4385c() == abstractC8997a.mo4385c()) {
                    list.add(c9658e2);
                    list2.add(c9658e2);
                    return;
                }
            }
            for (C9658e c9658e3 : this.f16692d) {
                C6327a c6327a3 = c9658e3.f16883b;
                if (c6327a3 == abstractC8997a || c6327a3.mo4385c() == abstractC8997a.mo4385c()) {
                    list.add(c9658e3);
                    list2.add(c9658e3);
                    return;
                }
            }
        } finally {
        }
    }

    /* renamed from: g */
    public synchronized void m15923g(C9658e c9658e) {
        try {
            boolean z9 = c9658e.f16884c;
            if (!(this.f16693e.contains(c9658e) ? this.f16693e : z9 ? this.f16691c : this.f16692d).remove(c9658e)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z9 && c9658e.m16110p()) {
                this.f16694f.decrementAndGet();
            }
            if (z9) {
                m15933q();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: h */
    public synchronized void m15924h(C9658e c9658e) {
        AbstractC8999c.m15125i("DownloadDispatcher", "flying canceled: " + c9658e.f16883b.mo4385c());
        if (c9658e.f16884c) {
            this.f16694f.incrementAndGet();
        }
    }

    /* renamed from: i */
    public synchronized ExecutorService m15925i() {
        try {
            if (this.f16695g == null) {
                this.f16695g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC8999c.m15141y("OkDownload Download", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16695g;
    }

    /* renamed from: j */
    public final synchronized void m15926j(List list, List list2) {
        try {
            AbstractC8999c.m15125i("DownloadDispatcher", "handle cancel calls, cancel calls: " + list2.size());
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C9658e c9658e = (C9658e) it.next();
                    if (!c9658e.m16100e()) {
                        list.remove(c9658e);
                    }
                }
            }
            AbstractC8999c.m15125i("DownloadDispatcher", "handle cancel calls, callback cancel event: " + list.size());
            if (!list.isEmpty()) {
                if (list.size() <= 1) {
                    C8879d.m14905k().m14907b().m15910a().mo10427k(((C9658e) list.get(0)).f16883b, EndCause.CANCELED, null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C9658e) it2.next()).f16883b);
                    }
                    C8879d.m14905k().m14907b().m15911b(arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: k */
    public boolean m15927k(C6327a c6327a) {
        return m15928l(c6327a, null);
    }

    /* renamed from: l */
    public boolean m15928l(C6327a c6327a, Collection collection) {
        if (!c6327a.m4378D() || !StatusUtil.m4371a(c6327a)) {
            return false;
        }
        if (c6327a.mo4384b() == null && !C8879d.m14905k().m14911f().m16148l(c6327a)) {
            return false;
        }
        C8879d.m14905k().m14911f().m16149m(c6327a, this.f16697i);
        if (collection != null) {
            collection.add(c6327a);
            return true;
        }
        C8879d.m14905k().m14907b().m15910a().mo10427k(c6327a, EndCause.COMPLETED, null);
        return true;
    }

    /* renamed from: m */
    public final boolean m15929m(C6327a c6327a) {
        return m15930n(c6327a, null, null);
    }

    /* renamed from: n */
    public final boolean m15930n(C6327a c6327a, Collection collection, Collection collection2) {
        return m15931o(c6327a, this.f16690b, collection, collection2) || m15931o(c6327a, this.f16691c, collection, collection2) || m15931o(c6327a, this.f16692d, collection, collection2);
    }

    /* renamed from: o */
    public boolean m15931o(C6327a c6327a, Collection collection, Collection collection2, Collection collection3) {
        C9534a c9534aM14907b = C8879d.m14905k().m14907b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9658e c9658e = (C9658e) it.next();
            if (!c9658e.m16110p()) {
                if (c9658e.m16105k(c6327a)) {
                    if (!c9658e.m16111q()) {
                        if (collection2 != null) {
                            collection2.add(c6327a);
                        } else {
                            c9534aM14907b.m15910a().mo10427k(c6327a, EndCause.SAME_TASK_BUSY, null);
                        }
                        return true;
                    }
                    AbstractC8999c.m15125i("DownloadDispatcher", "task: " + c6327a.mo4385c() + " is finishing, move it to finishing list");
                    this.f16693e.add(c9658e);
                    it.remove();
                    return false;
                }
                File fileM16106l = c9658e.m16106l();
                File fileM4392l = c6327a.m4392l();
                if (fileM16106l != null && fileM4392l != null && fileM16106l.equals(fileM4392l)) {
                    if (collection3 != null) {
                        collection3.add(c6327a);
                    } else {
                        c9534aM14907b.m15910a().mo10427k(c6327a, EndCause.FILE_BUSY, null);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public synchronized boolean m15932p(C6327a c6327a) {
        C6327a c6327a2;
        File fileM4392l;
        C6327a c6327a3;
        File fileM4392l2;
        AbstractC8999c.m15125i("DownloadDispatcher", "is file conflict after run: " + c6327a.mo4385c());
        File fileM4392l3 = c6327a.m4392l();
        if (fileM4392l3 == null) {
            return false;
        }
        for (C9658e c9658e : this.f16692d) {
            if (!c9658e.m16110p() && (c6327a3 = c9658e.f16883b) != c6327a && (fileM4392l2 = c6327a3.m4392l()) != null && fileM4392l3.equals(fileM4392l2)) {
                return true;
            }
        }
        for (C9658e c9658e2 : this.f16691c) {
            if (!c9658e2.m16110p() && (c6327a2 = c9658e2.f16883b) != c6327a && (fileM4392l = c6327a2.m4392l()) != null && fileM4392l3.equals(fileM4392l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public final synchronized void m15933q() {
        try {
            if (this.f16696h.get() > 0) {
                return;
            }
            if (m15934r() >= this.f16689a) {
                return;
            }
            if (this.f16690b.isEmpty()) {
                return;
            }
            Iterator it = this.f16690b.iterator();
            while (it.hasNext()) {
                C9658e c9658e = (C9658e) it.next();
                it.remove();
                C6327a c6327a = c9658e.f16883b;
                if (m15932p(c6327a)) {
                    C8879d.m14905k().m14907b().m15910a().mo10427k(c6327a, EndCause.FILE_BUSY, null);
                } else {
                    this.f16691c.add(c9658e);
                    m15925i().execute(c9658e);
                    if (m15934r() >= this.f16689a) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: r */
    public final int m15934r() {
        return this.f16691c.size() - this.f16694f.get();
    }

    /* renamed from: s */
    public void m15935s(InterfaceC9132i interfaceC9132i) {
        this.f16697i = interfaceC9132i;
    }

    public C9535b(List list, List list2, List list3, List list4) {
        this.f16689a = 5;
        this.f16694f = new AtomicInteger();
        this.f16696h = new AtomicInteger();
        this.f16690b = list;
        this.f16691c = list2;
        this.f16692d = list3;
        this.f16693e = list4;
    }
}
