package p293x0;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p002a1.C0021b;
import p070d1.AbstractC8274a;

/* renamed from: x0.b */
/* loaded from: classes3.dex */
public class C10483b {

    /* renamed from: a */
    public final PriorityQueue f20833a;

    /* renamed from: b */
    public final PriorityQueue f20834b;

    /* renamed from: c */
    public final List f20835c;

    /* renamed from: d */
    public final Object f20836d = new Object();

    /* renamed from: e */
    public final a f20837e;

    /* renamed from: x0.b$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0021b c0021b, C0021b c0021b2) {
            if (c0021b.m45a() == c0021b2.m45a()) {
                return 0;
            }
            return c0021b.m45a() > c0021b2.m45a() ? 1 : -1;
        }
    }

    public C10483b() {
        a aVar = new a();
        this.f20837e = aVar;
        this.f20834b = new PriorityQueue(AbstractC8274a.a.f15669a, aVar);
        this.f20833a = new PriorityQueue(AbstractC8274a.a.f15669a, aVar);
        this.f20835c = new ArrayList();
    }

    /* renamed from: e */
    public static C0021b m19620e(PriorityQueue priorityQueue, C0021b c0021b) {
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C0021b c0021b2 = (C0021b) it.next();
            if (c0021b2.equals(c0021b)) {
                return c0021b2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m19621a(Collection collection, C0021b c0021b) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((C0021b) it.next()).equals(c0021b)) {
                c0021b.m48d().recycle();
                return;
            }
        }
        collection.add(c0021b);
    }

    /* renamed from: b */
    public void m19622b(C0021b c0021b) {
        synchronized (this.f20836d) {
            m19627h();
            this.f20834b.offer(c0021b);
        }
    }

    /* renamed from: c */
    public void m19623c(C0021b c0021b) {
        synchronized (this.f20835c) {
            while (this.f20835c.size() >= AbstractC8274a.a.f15670b) {
                try {
                    ((C0021b) this.f20835c.remove(0)).m48d().recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            m19621a(this.f20835c, c0021b);
        }
    }

    /* renamed from: d */
    public boolean m19624d(int i10, RectF rectF) {
        C0021b c0021b = new C0021b(i10, null, rectF, true, 0);
        synchronized (this.f20835c) {
            try {
                Iterator it = this.f20835c.iterator();
                while (it.hasNext()) {
                    if (((C0021b) it.next()).equals(c0021b)) {
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
    public List m19625f() {
        ArrayList arrayList;
        synchronized (this.f20836d) {
            arrayList = new ArrayList(this.f20833a);
            arrayList.addAll(this.f20834b);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m19626g() {
        List list;
        synchronized (this.f20835c) {
            list = this.f20835c;
        }
        return list;
    }

    /* renamed from: h */
    public final void m19627h() {
        synchronized (this.f20836d) {
            while (this.f20834b.size() + this.f20833a.size() >= AbstractC8274a.a.f15669a && !this.f20833a.isEmpty()) {
                try {
                    ((C0021b) this.f20833a.poll()).m48d().recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (this.f20834b.size() + this.f20833a.size() >= AbstractC8274a.a.f15669a && !this.f20834b.isEmpty()) {
                ((C0021b) this.f20834b.poll()).m48d().recycle();
            }
        }
    }

    /* renamed from: i */
    public void m19628i() {
        synchronized (this.f20836d) {
            this.f20833a.addAll(this.f20834b);
            this.f20834b.clear();
        }
    }

    /* renamed from: j */
    public void m19629j() {
        synchronized (this.f20836d) {
            try {
                Iterator it = this.f20833a.iterator();
                while (it.hasNext()) {
                    ((C0021b) it.next()).m48d().recycle();
                }
                this.f20833a.clear();
                Iterator it2 = this.f20834b.iterator();
                while (it2.hasNext()) {
                    ((C0021b) it2.next()).m48d().recycle();
                }
                this.f20834b.clear();
            } finally {
            }
        }
        synchronized (this.f20835c) {
            try {
                Iterator it3 = this.f20835c.iterator();
                while (it3.hasNext()) {
                    ((C0021b) it3.next()).m48d().recycle();
                }
                this.f20835c.clear();
            } finally {
            }
        }
    }

    /* renamed from: k */
    public boolean m19630k(int i10, RectF rectF, int i11) {
        C0021b c0021b = new C0021b(i10, null, rectF, false, 0);
        synchronized (this.f20836d) {
            try {
                C0021b c0021bM19620e = m19620e(this.f20833a, c0021b);
                boolean z10 = true;
                if (c0021bM19620e == null) {
                    if (m19620e(this.f20834b, c0021b) == null) {
                        z10 = false;
                    }
                    return z10;
                }
                this.f20833a.remove(c0021bM19620e);
                c0021bM19620e.m50f(i11);
                this.f20834b.offer(c0021bM19620e);
                return true;
            } finally {
            }
        }
    }
}
