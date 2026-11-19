package p068h1;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p082j1.C6583a;
import p105m1.AbstractC7375b;

/* renamed from: h1.b */
/* loaded from: classes3.dex */
public class C6444b {

    /* renamed from: a */
    public final PriorityQueue f8153a;

    /* renamed from: b */
    public final PriorityQueue f8154b;

    /* renamed from: c */
    public final List f8155c;

    /* renamed from: d */
    public final Object f8156d = new Object();

    /* renamed from: e */
    public final a f8157e;

    /* renamed from: h1.b$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C6583a c6583a, C6583a c6583a2) {
            if (c6583a.m7467a() == c6583a2.m7467a()) {
                return 0;
            }
            return c6583a.m7467a() > c6583a2.m7467a() ? 1 : -1;
        }
    }

    public C6444b() {
        a aVar = new a();
        this.f8157e = aVar;
        this.f8154b = new PriorityQueue(AbstractC7375b.a.f9390a, aVar);
        this.f8153a = new PriorityQueue(AbstractC7375b.a.f9390a, aVar);
        this.f8155c = new ArrayList();
    }

    /* renamed from: d */
    public static C6583a m7066d(PriorityQueue priorityQueue, C6583a c6583a) {
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C6583a c6583a2 = (C6583a) it.next();
            if (c6583a2.equals(c6583a)) {
                return c6583a2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m7067a(C6583a c6583a) {
        synchronized (this.f8156d) {
            m7072g();
            this.f8154b.offer(c6583a);
        }
    }

    /* renamed from: b */
    public void m7068b(C6583a c6583a) {
        synchronized (this.f8155c) {
            try {
                if (this.f8155c.size() >= AbstractC7375b.a.f9391b) {
                    ((C6583a) this.f8155c.remove(0)).m7471e().recycle();
                }
                this.f8155c.add(c6583a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: c */
    public boolean m7069c(int i6, int i7, float f6, float f7, RectF rectF) {
        C6583a c6583a = new C6583a(i6, i7, null, f6, f7, rectF, true, 0);
        synchronized (this.f8155c) {
            try {
                Iterator it = this.f8155c.iterator();
                while (it.hasNext()) {
                    if (((C6583a) it.next()).equals(c6583a)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public List m7070e() {
        ArrayList arrayList;
        synchronized (this.f8156d) {
            arrayList = new ArrayList(this.f8153a);
            arrayList.addAll(this.f8154b);
        }
        return arrayList;
    }

    /* renamed from: f */
    public List m7071f() {
        List list;
        synchronized (this.f8155c) {
            list = this.f8155c;
        }
        return list;
    }

    /* renamed from: g */
    public final void m7072g() {
        synchronized (this.f8156d) {
            while (this.f8154b.size() + this.f8153a.size() >= AbstractC7375b.a.f9390a && !this.f8153a.isEmpty()) {
                try {
                    ((C6583a) this.f8153a.poll()).m7471e().recycle();
                } catch (Throwable th) {
                    throw th;
                }
            }
            while (this.f8154b.size() + this.f8153a.size() >= AbstractC7375b.a.f9390a && !this.f8154b.isEmpty()) {
                ((C6583a) this.f8154b.poll()).m7471e().recycle();
            }
        }
    }

    /* renamed from: h */
    public void m7073h() {
        synchronized (this.f8156d) {
            this.f8153a.addAll(this.f8154b);
            this.f8154b.clear();
        }
    }

    /* renamed from: i */
    public void m7074i() {
        synchronized (this.f8156d) {
            try {
                Iterator it = this.f8153a.iterator();
                while (it.hasNext()) {
                    ((C6583a) it.next()).m7471e().recycle();
                }
                this.f8153a.clear();
                Iterator it2 = this.f8154b.iterator();
                while (it2.hasNext()) {
                    ((C6583a) it2.next()).m7471e().recycle();
                }
                this.f8154b.clear();
            } finally {
            }
        }
        synchronized (this.f8155c) {
            try {
                Iterator it3 = this.f8155c.iterator();
                while (it3.hasNext()) {
                    ((C6583a) it3.next()).m7471e().recycle();
                }
                this.f8155c.clear();
            } finally {
            }
        }
    }

    /* renamed from: j */
    public boolean m7075j(int i6, int i7, float f6, float f7, RectF rectF, int i8) {
        C6583a c6583a = new C6583a(i6, i7, null, f6, f7, rectF, false, 0);
        synchronized (this.f8156d) {
            try {
                C6583a c6583aM7066d = m7066d(this.f8153a, c6583a);
                boolean z6 = true;
                if (c6583aM7066d == null) {
                    if (m7066d(this.f8154b, c6583a) == null) {
                        z6 = false;
                    }
                    return z6;
                }
                this.f8153a.remove(c6583aM7066d);
                c6583aM7066d.m7475i(i8);
                this.f8154b.offer(c6583aM7066d);
                return true;
            } finally {
            }
        }
    }
}
