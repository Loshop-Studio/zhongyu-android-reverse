package p249t1;

import com.liulishuo.okdownload.C6593a;
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
import p209p1.C9315d;
import p219q1.AbstractC9351a;
import p219q1.AbstractC9353c;
import p229r1.InterfaceC9425i;
import p259u1.C9663e;

/* renamed from: t1.b */
/* loaded from: classes4.dex */
public class C9608b {

    /* renamed from: a */
    public int f16871a;

    /* renamed from: b */
    public final List f16872b;

    /* renamed from: c */
    public final List f16873c;

    /* renamed from: d */
    public final List f16874d;

    /* renamed from: e */
    public final List f16875e;

    /* renamed from: f */
    public final AtomicInteger f16876f;

    /* renamed from: g */
    public volatile ExecutorService f16877g;

    /* renamed from: h */
    public final AtomicInteger f16878h;

    /* renamed from: i */
    public InterfaceC9425i f16879i;

    public C9608b() {
        this(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
    }

    /* renamed from: a */
    public boolean m15848a(AbstractC9351a abstractC9351a) {
        this.f16878h.incrementAndGet();
        boolean zM15849b = m15849b(abstractC9351a);
        this.f16878h.decrementAndGet();
        m15865r();
        return zM15849b;
    }

    /* renamed from: b */
    public synchronized boolean m15849b(AbstractC9351a abstractC9351a) {
        ArrayList arrayList;
        ArrayList arrayList2;
        AbstractC9353c.m15306i("DownloadDispatcher", "cancel manually: " + abstractC9351a.mo4589c());
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        try {
            m15853f(abstractC9351a, arrayList, arrayList2);
            m15858k(arrayList, arrayList2);
        } catch (Throwable th) {
            m15858k(arrayList, arrayList2);
            throw th;
        }
        return arrayList.size() > 0 || arrayList2.size() > 0;
    }

    /* renamed from: c */
    public void m15850c(C6593a c6593a) {
        this.f16878h.incrementAndGet();
        m15852e(c6593a);
        this.f16878h.decrementAndGet();
    }

    /* renamed from: d */
    public final synchronized void m15851d(C6593a c6593a) {
        try {
            C9663e c9663eM16059g = C9663e.m16059g(c6593a, true, this.f16879i);
            if (m15866s() < this.f16871a) {
                this.f16873c.add(c9663eM16059g);
                m15857j().execute(c9663eM16059g);
            } else {
                this.f16872b.add(c9663eM16059g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: e */
    public final synchronized void m15852e(C6593a c6593a) {
        AbstractC9353c.m15306i("DownloadDispatcher", "enqueueLocked for single task: " + c6593a);
        if (m15859l(c6593a)) {
            return;
        }
        if (m15861n(c6593a)) {
            return;
        }
        int size = this.f16872b.size();
        m15851d(c6593a);
        if (size != this.f16872b.size()) {
            Collections.sort(this.f16872b);
        }
    }

    /* renamed from: f */
    public final synchronized void m15853f(AbstractC9351a abstractC9351a, List list, List list2) {
        try {
            Iterator it = this.f16872b.iterator();
            while (it.hasNext()) {
                C9663e c9663e = (C9663e) it.next();
                C6593a c6593a = c9663e.f17035b;
                if (c6593a != abstractC9351a && c6593a.mo4589c() != abstractC9351a.mo4589c()) {
                }
                if (!c9663e.m16071p() && !c9663e.m16072q()) {
                    it.remove();
                    list.add(c9663e);
                    return;
                }
                return;
            }
            for (C9663e c9663e2 : this.f16873c) {
                C6593a c6593a2 = c9663e2.f17035b;
                if (c6593a2 == abstractC9351a || c6593a2.mo4589c() == abstractC9351a.mo4589c()) {
                    list.add(c9663e2);
                    list2.add(c9663e2);
                    return;
                }
            }
            for (C9663e c9663e3 : this.f16874d) {
                C6593a c6593a3 = c9663e3.f17035b;
                if (c6593a3 == abstractC9351a || c6593a3.mo4589c() == abstractC9351a.mo4589c()) {
                    list.add(c9663e3);
                    list2.add(c9663e3);
                    return;
                }
            }
        } finally {
        }
    }

    /* renamed from: g */
    public synchronized C6593a m15854g(C6593a c6593a) {
        AbstractC9353c.m15306i("DownloadDispatcher", "findSameTask: " + c6593a.mo4589c());
        for (C9663e c9663e : this.f16872b) {
            if (!c9663e.m16071p() && c9663e.m16066k(c6593a)) {
                return c9663e.f17035b;
            }
        }
        for (C9663e c9663e2 : this.f16873c) {
            if (!c9663e2.m16071p() && c9663e2.m16066k(c6593a)) {
                return c9663e2.f17035b;
            }
        }
        for (C9663e c9663e3 : this.f16874d) {
            if (!c9663e3.m16071p() && c9663e3.m16066k(c6593a)) {
                return c9663e3.f17035b;
            }
        }
        return null;
    }

    /* renamed from: h */
    public synchronized void m15855h(C9663e c9663e) {
        try {
            boolean z9 = c9663e.f17036c;
            if (!(this.f16875e.contains(c9663e) ? this.f16875e : z9 ? this.f16873c : this.f16874d).remove(c9663e)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (z9 && c9663e.m16071p()) {
                this.f16876f.decrementAndGet();
            }
            if (z9) {
                m15865r();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i */
    public synchronized void m15856i(C9663e c9663e) {
        AbstractC9353c.m15306i("DownloadDispatcher", "flying canceled: " + c9663e.f17035b.mo4589c());
        if (c9663e.f17036c) {
            this.f16876f.incrementAndGet();
        }
    }

    /* renamed from: j */
    public synchronized ExecutorService m15857j() {
        try {
            if (this.f16877g == null) {
                this.f16877g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), AbstractC9353c.m15322y("OkDownload Download", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f16877g;
    }

    /* renamed from: k */
    public final synchronized void m15858k(List list, List list2) {
        try {
            AbstractC9353c.m15306i("DownloadDispatcher", "handle cancel calls, cancel calls: " + list2.size());
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    C9663e c9663e = (C9663e) it.next();
                    if (!c9663e.m16061e()) {
                        list.remove(c9663e);
                    }
                }
            }
            AbstractC9353c.m15306i("DownloadDispatcher", "handle cancel calls, callback cancel event: " + list.size());
            if (!list.isEmpty()) {
                if (list.size() <= 1) {
                    C9315d.m15182k().m15184b().m15841a().mo15175i(((C9663e) list.get(0)).f17035b, EndCause.CANCELED, null);
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C9663e) it2.next()).f17035b);
                    }
                    C9315d.m15182k().m15184b().m15842b(arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: l */
    public boolean m15859l(C6593a c6593a) {
        return m15860m(c6593a, null);
    }

    /* renamed from: m */
    public boolean m15860m(C6593a c6593a, Collection collection) {
        if (!c6593a.m4582D() || !StatusUtil.m4574a(c6593a)) {
            return false;
        }
        if (c6593a.mo4588b() == null && !C9315d.m15182k().m15188f().m16109l(c6593a)) {
            return false;
        }
        C9315d.m15182k().m15188f().m16110m(c6593a, this.f16879i);
        if (collection != null) {
            collection.add(c6593a);
            return true;
        }
        C9315d.m15182k().m15184b().m15841a().mo15175i(c6593a, EndCause.COMPLETED, null);
        return true;
    }

    /* renamed from: n */
    public final boolean m15861n(C6593a c6593a) {
        return m15862o(c6593a, null, null);
    }

    /* renamed from: o */
    public final boolean m15862o(C6593a c6593a, Collection collection, Collection collection2) {
        return m15863p(c6593a, this.f16872b, collection, collection2) || m15863p(c6593a, this.f16873c, collection, collection2) || m15863p(c6593a, this.f16874d, collection, collection2);
    }

    /* renamed from: p */
    public boolean m15863p(C6593a c6593a, Collection collection, Collection collection2, Collection collection3) {
        C9607a c9607aM15184b = C9315d.m15182k().m15184b();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C9663e c9663e = (C9663e) it.next();
            if (!c9663e.m16071p()) {
                if (c9663e.m16066k(c6593a)) {
                    if (!c9663e.m16072q()) {
                        if (collection2 != null) {
                            collection2.add(c6593a);
                        } else {
                            c9607aM15184b.m15841a().mo15175i(c6593a, EndCause.SAME_TASK_BUSY, null);
                        }
                        return true;
                    }
                    AbstractC9353c.m15306i("DownloadDispatcher", "task: " + c6593a.mo4589c() + " is finishing, move it to finishing list");
                    this.f16875e.add(c9663e);
                    it.remove();
                    return false;
                }
                File fileM16067l = c9663e.m16067l();
                File fileM4596l = c6593a.m4596l();
                if (fileM16067l != null && fileM4596l != null && fileM16067l.equals(fileM4596l)) {
                    if (collection3 != null) {
                        collection3.add(c6593a);
                    } else {
                        c9607aM15184b.m15841a().mo15175i(c6593a, EndCause.FILE_BUSY, null);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public synchronized boolean m15864q(C6593a c6593a) {
        C6593a c6593a2;
        File fileM4596l;
        C6593a c6593a3;
        File fileM4596l2;
        AbstractC9353c.m15306i("DownloadDispatcher", "is file conflict after run: " + c6593a.mo4589c());
        File fileM4596l3 = c6593a.m4596l();
        if (fileM4596l3 == null) {
            return false;
        }
        for (C9663e c9663e : this.f16874d) {
            if (!c9663e.m16071p() && (c6593a3 = c9663e.f17035b) != c6593a && (fileM4596l2 = c6593a3.m4596l()) != null && fileM4596l3.equals(fileM4596l2)) {
                return true;
            }
        }
        for (C9663e c9663e2 : this.f16873c) {
            if (!c9663e2.m16071p() && (c6593a2 = c9663e2.f17035b) != c6593a && (fileM4596l = c6593a2.m4596l()) != null && fileM4596l3.equals(fileM4596l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final synchronized void m15865r() {
        try {
            if (this.f16878h.get() > 0) {
                return;
            }
            if (m15866s() >= this.f16871a) {
                return;
            }
            if (this.f16872b.isEmpty()) {
                return;
            }
            Iterator it = this.f16872b.iterator();
            while (it.hasNext()) {
                C9663e c9663e = (C9663e) it.next();
                it.remove();
                C6593a c6593a = c9663e.f17035b;
                if (m15864q(c6593a)) {
                    C9315d.m15182k().m15184b().m15841a().mo15175i(c6593a, EndCause.FILE_BUSY, null);
                } else {
                    this.f16873c.add(c9663e);
                    m15857j().execute(c9663e);
                    if (m15866s() >= this.f16871a) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: s */
    public final int m15866s() {
        return this.f16873c.size() - this.f16876f.get();
    }

    /* renamed from: t */
    public void m15867t(InterfaceC9425i interfaceC9425i) {
        this.f16879i = interfaceC9425i;
    }

    public C9608b(List list, List list2, List list3, List list4) {
        this.f16871a = 5;
        this.f16876f = new AtomicInteger();
        this.f16878h = new AtomicInteger();
        this.f16872b = list;
        this.f16873c = list2;
        this.f16874d = list3;
        this.f16875e = list4;
    }
}
