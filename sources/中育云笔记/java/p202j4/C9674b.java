package p202j4;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p246m4.C10199b;
import p288p4.AbstractC10627a;

/* renamed from: j4.b */
/* loaded from: classes5.dex */
public class C9674b {

    /* renamed from: a */
    public final PriorityQueue f22398a;

    /* renamed from: b */
    public final PriorityQueue f22399b;

    /* renamed from: c */
    public final List f22400c;

    /* renamed from: d */
    public final Object f22401d = new Object();

    /* renamed from: e */
    public final a f22402e;

    /* renamed from: j4.b$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C10199b c10199b, C10199b c10199b2) {
            if (c10199b.m21299a() == c10199b2.m21299a()) {
                return 0;
            }
            return c10199b.m21299a() > c10199b2.m21299a() ? 1 : -1;
        }
    }

    public C9674b() {
        a aVar = new a();
        this.f22402e = aVar;
        this.f22399b = new PriorityQueue(AbstractC10627a.a.f25606a, aVar);
        this.f22398a = new PriorityQueue(AbstractC10627a.a.f25606a, aVar);
        this.f22400c = new ArrayList();
    }

    /* renamed from: e */
    public static C10199b m19075e(PriorityQueue priorityQueue, C10199b c10199b) {
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C10199b c10199b2 = (C10199b) it.next();
            if (c10199b2.equals(c10199b)) {
                return c10199b2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m19076a(Collection collection, C10199b c10199b) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((C10199b) it.next()).equals(c10199b)) {
                c10199b.m21302d().recycle();
                return;
            }
        }
        collection.add(c10199b);
    }

    /* renamed from: b */
    public void m19077b(C10199b c10199b) {
        synchronized (this.f22401d) {
            m19082h();
            this.f22399b.offer(c10199b);
        }
    }

    /* renamed from: c */
    public void m19078c(C10199b c10199b) {
        synchronized (this.f22400c) {
            while (this.f22400c.size() >= AbstractC10627a.a.f25607b) {
                try {
                    ((C10199b) this.f22400c.remove(0)).m21302d().recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            m19076a(this.f22400c, c10199b);
        }
    }

    /* renamed from: d */
    public boolean m19079d(int i10, RectF rectF) {
        C10199b c10199b = new C10199b(i10, null, rectF, true, 0);
        synchronized (this.f22400c) {
            try {
                Iterator it = this.f22400c.iterator();
                while (it.hasNext()) {
                    if (((C10199b) it.next()).equals(c10199b)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public List m19080f() {
        ArrayList arrayList;
        synchronized (this.f22401d) {
            arrayList = new ArrayList(this.f22398a);
            arrayList.addAll(this.f22399b);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m19081g() {
        List list;
        synchronized (this.f22400c) {
            list = this.f22400c;
        }
        return list;
    }

    /* renamed from: h */
    public final void m19082h() {
        synchronized (this.f22401d) {
            while (this.f22399b.size() + this.f22398a.size() >= AbstractC10627a.a.f25606a && !this.f22398a.isEmpty()) {
                try {
                    ((C10199b) this.f22398a.poll()).m21302d().recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (this.f22399b.size() + this.f22398a.size() >= AbstractC10627a.a.f25606a && !this.f22399b.isEmpty()) {
                ((C10199b) this.f22399b.poll()).m21302d().recycle();
            }
        }
    }

    /* renamed from: i */
    public void m19083i() {
        synchronized (this.f22401d) {
            this.f22398a.addAll(this.f22399b);
            this.f22399b.clear();
        }
    }

    /* renamed from: j */
    public void m19084j() {
        synchronized (this.f22401d) {
            try {
                Iterator it = this.f22398a.iterator();
                while (it.hasNext()) {
                    ((C10199b) it.next()).m21302d().recycle();
                }
                this.f22398a.clear();
                Iterator it2 = this.f22399b.iterator();
                while (it2.hasNext()) {
                    ((C10199b) it2.next()).m21302d().recycle();
                }
                this.f22399b.clear();
            } finally {
            }
        }
        synchronized (this.f22400c) {
            try {
                Iterator it3 = this.f22400c.iterator();
                while (it3.hasNext()) {
                    ((C10199b) it3.next()).m21302d().recycle();
                }
                this.f22400c.clear();
            } finally {
            }
        }
    }

    /* renamed from: k */
    public boolean m19085k(int i10, RectF rectF, int i11) {
        C10199b c10199b = new C10199b(i10, null, rectF, false, 0);
        synchronized (this.f22401d) {
            try {
                C10199b c10199bM19075e = m19075e(this.f22398a, c10199b);
                boolean z10 = true;
                if (c10199bM19075e == null) {
                    if (m19075e(this.f22399b, c10199b) == null) {
                        z10 = false;
                    }
                    return z10;
                }
                this.f22398a.remove(c10199bM19075e);
                c10199bM19075e.m21304f(i11);
                this.f22399b.offer(c10199bM19075e);
                return true;
            } finally {
            }
        }
    }
}
